package com.baobab.htc.business.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.jdom.Document;
import org.jdom.input.DOMBuilder;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.dao.DataIntegrityViolationException;
import com.baobab.htc.data.daos.dao.*;
import com.baobab.htc.data.daos.dto.*;
import com.baobab.htc.data.daos.exceptions.*;
import com.baobab.htc.data.daos.helper.PeriodDaoHelper;
import com.baobab.htc.data.factoriees.HtcBeanFactory;
import com.baobab.htc.data.files.FileHandler;
import com.baobab.htc.business.beans.HtcBean;
import com.baobab.htc.business.helpers.StatusHelper;
import com.baobab.htc.business.helpers.ConstantHelper;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.io.StringReader;
import java.io.IOException;
import java.io.File;
import java.util.List;
import java.util.Date;

/**
 * This is the XML String processing service
 *
 * @author Yamiko J. Msosa
 * @version 1.0
 *          Date written: 04th May 2010
 */
public class XmlProcessingService {
    protected final Log logger = LogFactory.getLog(getClass()); // Logger for the class

    /* Daos for the service  */
    private CounsellorDao counsellorDao;
    private SessionDao sessionDao;
    private SessionTypeDao sessionTypeDao;
    private DistrictDao districtDao;
    private PlanDao planDao;
    private SymptomDao symptomDao;
    private SessionPlanDao sessionPlanDao;
    private SessionSymptomDao sessionSymptomDao;
    private SiteDao siteDao;
    private SessionSexualRelationshipTypeDao sessionSexualRelationshipTypeDao;
    private PeriodDaoHelper periodDaoHelper;
    private PeriodDao periodDao;

    private DataSourceTransactionManager htcTransactionManager; // Transaction Manager

    /* Other supplementary services */
    private SequenceGenerationService sequenceGenerationService;

    /* Directories */
    private String archiveDirectory;
    private String errorDirectory;

    /**
     * Method processes a submitted xml document
     *
     * @param xmlDocument The XML String to be processed
     * @return Processing result status
     */
    public int submitXmlDocument(String xmlDocument) {
        int status = -1;
        logger.info("XML Doc Received in service: " + xmlDocument);

        xmlDocument = xmlDocument.replaceAll("@apos;", "'"); //Replacing @apos; escape sequence in xml doc

        logger.info("Transformed XML Doc Received in service: " + xmlDocument);

        int saveStatus = saveFileToDatabase(xmlDocument);

        String fileName = new Date().getTime() + ".xml";

        FileHandler fileHandler = new FileHandler();
        try {
            if (saveStatus == StatusHelper.IN_ERROR) {
                File xmlFile = new File(getErrorDirectory() + fileName);
                fileHandler.writeToFile(xmlDocument, xmlFile);
            } else {
                File xmlFile = new File(getArchiveDirectory() + fileName);
                fileHandler.writeToFile(xmlDocument, xmlFile);
            }
            status = 0;
        } catch (IOException ex) {
            logger.error("Error writing file: " + xmlDocument + " " + ex.toString());
        }
        return status;
    }


    /**
     * Method saves XML Document to Database
     *
     * @param xmlString The XML String to be saved to databse
     * @return The processing result status
     */
    private int saveFileToDatabase(String xmlString) {

        int status = -1;

        DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();
        defaultTransactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus transactionStatus = htcTransactionManager.getTransaction(defaultTransactionDefinition);

        try {

            Document xmlDocument = getXmlDocumentFromString(xmlString);
            HtcBeanFactory htcBeanFactory = new HtcBeanFactory(xmlDocument);
            HtcBean htcBean = htcBeanFactory.getHtcBean();

            List<Session> searchSession = sessionDao.findWhereSessionReferenceEquals(htcBean.getReference());
            if (searchSession.size() == 0) {
                long myKey = -1;
                // Updating session table
                Session session = new Session();

                /* Site and Session Details */
                session.setSessionReference(htcBean.getReference());
                session.setSiteId(htcBean.getSiteCode());
                session.setSessionTypeId(htcBean.getSessionType());
                session.setSessionDate(htcBean.getSessionDate());
                session.setTestingTypeId(htcBean.getTestingType());
                session.setTerminalId(htcBean.getTerminalId());
                session.setCounsellorId(Long.parseLong(htcBean.getCounsellorCode()));
                session.setTraditionalAuthority(htcBean.getTraditionalAuthority());
                session.setCouplesReference(htcBean.getCouplesReference());
                session.setLotNumber1(htcBean.getLotNumber1());
                session.setLotNumber2(htcBean.getLotNumber2());
                session.setLotNumber3(htcBean.getLotNumber3());
                logger.info("About to get periods!!!");
                List<Period> periods = periodDao.findAll();
                for (Period period: periods){
                    logger.info("Period ID " + period.getPeriodId());
                }

                //long periodId = periodDao.findWhereStatusEquals(1).get(0).getPeriodId();
                //session.setPeriodId(periodId);
                session.setPeriodId(periodDaoHelper.getCurrentPeriod(session.getSessionDate()).getPeriodId());

                /* Demographic Information */
                session.setSex(htcBean.getSex());
                session.setDateOfBirth(htcBean.getDateOfBirth());
                session.setCurrentOccupation(htcBean.getCurrentOccupation());
                session.setHighestEducation(htcBean.getHighestEducation());
                session.setCurrentMaritalStatus(htcBean.getMaritalStatus());
                session.setMainReason(htcBean.getMostImportantReason());

                /* History of HIV Testing and Risk */
                session.setEverHivTestedBefore(htcBean.getEverHivTestedBefore());
                session.setOftenGetTested(htcBean.getOftenGetTested());
                session.setOftenDrinksAlcohol(htcBean.getOftenDrinksAlcohol());
                session.setSexualPartners(htcBean.getSexualPartners());
                session.setStatusOfAnyPartners(htcBean.getStatusOfAnyPartners());
                session.setStatusOfAllPartners(htcBean.getStatusOfAllPartners());
                session.setFrequentlyUseCondom(htcBean.getFrequentlyUseCondom());
                session.setUseCondomWithSpouse(htcBean.getUseCondomWithSpouse());

                /* Pregnancy and Family Planning */
                session.setUsingFpMethod(htcBean.getUsingFpMethod());

                /* HIV Testing */
                session.setTestResult1(htcBean.getTestResult1());
                session.setTestResult2(htcBean.getTestResult2());
                session.setTestResult3(htcBean.getTestResult3());
                session.setFinalResult(htcBean.getFinalResult());

                /* Referrals and Risk Reduction */
                session.setMaleCondomsGiven(htcBean.getMaleCondomsGiven());
                session.setFemaleCondomsGiven(htcBean.getFemaleCondomsGiven());


                session.setCreatedBy(ConstantHelper.APPLICATION_NAME);
                session.setDateCreated(new Date());
                session.setModifiedBy(ConstantHelper.APPLICATION_NAME);
                session.setDateModified(new Date());
                session.setStatus(StatusHelper.SUBMITTED);

                logger.info("File Reference " + session.getSessionReference());
                logger.info("About to update session");
                logger.info("Session's Period ID is " + session.getPeriodId());
                logger.info("Session's Testing Type ID is " + session.getTestingTypeId());
                logger.info("Session's Session Type ID is " + session.getSessionTypeId());
                logger.info("Session's Counsellor Code is " + session.getCounsellorId());
                logger.info("Session's Site ID is " + session.getSiteId());
                sessionDao.insert(session);
                logger.info("Updated session");

                if (htcBean.getSexualRelationships() != null) {
                    for (int i = 0; i < htcBean.getSexualRelationships().length; i++) {
                        if (htcBean.getSexualRelationships()[i] == 1) {
                            SessionSexualRelationshipType sessionSexualRelationshipType = new SessionSexualRelationshipType();
                            myKey = sequenceGenerationService.getNextKey("SessionSexualRelationshipType");
                            if (myKey != StatusHelper.IN_ERROR) {
                                sessionSexualRelationshipType.setSessionSexualRelationshipTypeId(myKey);
                                sessionSexualRelationshipType.setSessionReference(session.getSessionReference());
                                sessionSexualRelationshipType.setSexualRelationshipTypeId(i);
                                sessionSexualRelationshipType.setCreatedBy(ConstantHelper.APPLICATION_NAME);
                                sessionSexualRelationshipType.setDateCreated(new Date());
                                sessionSexualRelationshipType.setModifiedBy(ConstantHelper.APPLICATION_NAME);
                                sessionSexualRelationshipType.setDateModified(new Date());
                                sessionSexualRelationshipType.setStatus(StatusHelper.SUBMITTED);
                                sessionSexualRelationshipTypeDao.insert(sessionSexualRelationshipType);
                            } else {
                                throw new SessionSymptomDaoException("Unable to generate key");
                            }
                        }
                    }
                } else {
                    throw new SessionSymptomDaoException("Unable to generate session symptoms - null array");
                }

                /* Updating Session Symptoms */
                if (htcBean.getHivSymptoms() != null) {
                    for (int i = 0; i < htcBean.getHivSymptoms().length; i++) {
                        if (htcBean.getHivSymptoms()[i] == 1) {
                            SessionSymptom sessionSymptom = new SessionSymptom();
                            myKey = sequenceGenerationService.getNextKey("SessionSymptom");
                            if (myKey != StatusHelper.IN_ERROR) {
                                sessionSymptom.setSessionSymptomId(myKey);
                                sessionSymptom.setSessionReference(session.getSessionReference());
                                sessionSymptom.setSymptomId(i);
                                sessionSymptom.setCreatedBy(ConstantHelper.APPLICATION_NAME);
                                sessionSymptom.setDateCreated(new Date());
                                sessionSymptom.setModifiedBy(ConstantHelper.APPLICATION_NAME);
                                sessionSymptom.setDateModified(new Date());
                                sessionSymptom.setStatus(StatusHelper.SUBMITTED);
                                sessionSymptomDao.insert(sessionSymptom);
                            } else {
                                throw new SessionSymptomDaoException("Unable to generate key");
                            }
                        }
                    }
                } else {
                    throw new SessionSymptomDaoException("Unable to generate session symptoms - null array");
                }

                /* Updating Session Plans */
                if (htcBean.getRiskReductionPlans() != null) {
                    for (int i = 0; i < htcBean.getRiskReductionPlans().length; i++) {
                        if (htcBean.getRiskReductionPlans()[i] == 1) {
                            SessionPlan sessionPlan = new SessionPlan();
                            myKey = sequenceGenerationService.getNextKey("SessionPlan");
                            if (myKey != StatusHelper.IN_ERROR) {
                                sessionPlan.setSessionPlanId(myKey);
                                sessionPlan.setSessionReference(session.getSessionReference());
                                sessionPlan.setPlanId(i);
                                sessionPlan.setCreatedBy(ConstantHelper.APPLICATION_NAME);
                                sessionPlan.setDateCreated(new Date());
                                sessionPlan.setModifiedBy(ConstantHelper.APPLICATION_NAME);
                                sessionPlan.setDateModified(new Date());
                                sessionPlan.setStatus(StatusHelper.SUBMITTED);
                                sessionPlanDao.insert(sessionPlan);
                            } else {
                                throw new SessionPlanDaoException("Unable to generate key");
                            }
                        }
                    }
                } else {
                    throw new SessionPlanDaoException("Unable to generate session plan records - null array");
                }

                htcTransactionManager.commit(transactionStatus);
                status = 0;
            } else {
                logger.error("XML Reference Already Processed " + htcBean.getReference());
                status = StatusHelper.IN_ERROR;
            }
        } catch (ParserConfigurationException ex) {
            logger.error("ParserConfigurationException: " + ex.toString());
            status = StatusHelper.IN_ERROR;
        } catch (SAXException ex) {
            logger.error("SAX Exception: " + ex.toString());
            status = StatusHelper.IN_ERROR;
        } catch (IOException ex) {
            logger.error("IOException: " + ex.toString());
            status = StatusHelper.IN_ERROR;
        } catch (SessionDaoException ex) {
            logger.error("SessionDaoException: " + ex.toString());
            status = StatusHelper.IN_ERROR;
        } catch (SessionSymptomDaoException ex) {
            logger.error("SessionSymptomDaoException: " + ex.toString());
            status = StatusHelper.IN_ERROR;
        } catch (SessionPlanDaoException ex) {
            logger.error("SessionPlanDaoException: " + ex.toString());
            status = StatusHelper.IN_ERROR;
        } catch (DataIntegrityViolationException ex) {
            logger.error("DataIntegrityViolationExceptionException: " + ex.toString());
            status = StatusHelper.IN_ERROR;
        } catch (PeriodDaoException ex) {
            logger.error("PeriodDaoException: " + ex.toString());
            status = StatusHelper.IN_ERROR;
        } finally {
            if (status == StatusHelper.IN_ERROR) {
                logger.error("Rolling back transaction");
                htcTransactionManager.rollback(transactionStatus);
            }
        }

        return status;
    }


    /**
     * This method generates a JDOM XML Document from an XML String
     *
     * @param xmlString The XML String to be transformed
     * @return The resulting JDOM XML document
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    private Document getXmlDocumentFromString(String xmlString) throws ParserConfigurationException, SAXException, IOException {

        org.w3c.dom.Document xmlDocument = null;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setValidating(false);
        DocumentBuilder documentBuilder;

        documentBuilder = documentBuilderFactory.newDocumentBuilder();

        InputSource inputSource = new InputSource(new StringReader(xmlString));
        xmlDocument = documentBuilder.parse(inputSource);

        Document jdomDocument = new DOMBuilder().build(xmlDocument);

        return jdomDocument;
    }

    /* Getters and setters for the class */
    public CounsellorDao getCounsellorDao() {
        return counsellorDao;
    }

    public void setCounsellorDao(CounsellorDao counsellorDao) {
        this.counsellorDao = counsellorDao;
    }

    public SessionDao getSessionDao() {
        return sessionDao;
    }

    public void setSessionDao(SessionDao sessionDao) {
        this.sessionDao = sessionDao;
    }

    public SessionTypeDao getSessionTypeDao() {
        return sessionTypeDao;
    }

    public void setSessionTypeDao(SessionTypeDao sessionTypeDao) {
        this.sessionTypeDao = sessionTypeDao;
    }

    public DistrictDao getDistrictDao() {
        return districtDao;
    }

    public void setDistrictDao(DistrictDao districtDao) {
        this.districtDao = districtDao;
    }

    public SymptomDao getSymptomDao() {
        return symptomDao;
    }

    public void setSymptomDao(SymptomDao symptomDao) {
        this.symptomDao = symptomDao;
    }

    public SiteDao getSiteDao() {
        return siteDao;
    }

    public void setSiteDao(SiteDao siteDao) {
        this.siteDao = siteDao;
    }

    public SequenceGenerationService getSequenceGenerationService() {
        return sequenceGenerationService;
    }

    public void setSequenceGenerationService(SequenceGenerationService sequenceGenerationService) {
        this.sequenceGenerationService = sequenceGenerationService;
    }

    public PlanDao getPlanDao() {
        return planDao;
    }

    public void setPlanDao(PlanDao planDao) {
        this.planDao = planDao;
    }

    public SessionPlanDao getSessionPlanDao() {
        return sessionPlanDao;
    }

    public void setSessionPlanDao(SessionPlanDao sessionPlanDao) {
        this.sessionPlanDao = sessionPlanDao;
    }

    public SessionSymptomDao getSessionSymptomDao() {
        return sessionSymptomDao;
    }

    public void setSessionSymptomDao(SessionSymptomDao sessionSymptomDao) {
        this.sessionSymptomDao = sessionSymptomDao;
    }

    public SessionSexualRelationshipTypeDao getSessionSexualRelationshipTypeDao() {
        return sessionSexualRelationshipTypeDao;
    }

    public void setSessionSexualRelationshipTypeDao(SessionSexualRelationshipTypeDao sessionSexualRelationshipTypeDao) {
        this.sessionSexualRelationshipTypeDao = sessionSexualRelationshipTypeDao;
    }

    public PeriodDaoHelper getPeriodDaoHelper() {
        return periodDaoHelper;
    }

    public void setPeriodDaoHelper(PeriodDaoHelper periodDaoHelper) {
        this.periodDaoHelper = periodDaoHelper;
    }

    public PeriodDao getPeriodDao() {
        return periodDao;
    }

    public void setPeriodDao(PeriodDao periodDao) {
        this.periodDao = periodDao;
    }

    public DataSourceTransactionManager getHtcTransactionManager() {
        return htcTransactionManager;
    }

    public void setHtcTransactionManager(DataSourceTransactionManager htcTransactionManager) {
        this.htcTransactionManager = htcTransactionManager;
    }

    public String getArchiveDirectory() {
        return archiveDirectory;
    }

    public void setArchiveDirectory(String archiveDirectory) {
        this.archiveDirectory = archiveDirectory;
    }

    public String getErrorDirectory() {
        return errorDirectory;
    }

    public void setErrorDirectory(String errorDirectory) {
        this.errorDirectory = errorDirectory;
    }
}

