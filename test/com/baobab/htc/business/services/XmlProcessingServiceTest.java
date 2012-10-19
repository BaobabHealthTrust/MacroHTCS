package com.baobab.htc.business.services;

import junit.framework.TestCase;
import junit.framework.Assert;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.baobab.htc.business.helpers.StatusHelper;
import com.baobab.htc.data.daos.dao.*;
import com.baobab.htc.data.daos.dto.*;
import com.baobab.htc.data.daos.exceptions.SessionPlanDaoException;
import com.baobab.htc.data.daos.exceptions.SessionSymptomDaoException;
import com.baobab.htc.data.daos.exceptions.SessionDaoException;
import com.baobab.htc.data.daos.exceptions.SessionSexualRelationshipTypeDaoException;

import java.util.List;

/**
 * This is the XmlProcessingService unit test
 *
 * @author Yamiko J. Msosa
 * @version 1.0
 *          Date written: 04th May 2010
 */
public class XmlProcessingServiceTest extends TestCase {
    /* Members of the class */
    private SessionDao sessionDao;
    private SessionPlanDao sessionPlanDao;
    private SessionSymptomDao sessionSymptomDao;
    private SessionSexualRelationshipTypeDao sessionSexualRelationshipTypeDao;
    private XmlProcessingService service;
    protected final Log logger = LogFactory.getLog(getClass());

    /**
     * Method to setup the test
     */
    public void setUp() {
        DOMConfigurator.configure("service/log4j.xml"); // load log4j config
        FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("service/HtcApplicationContext.xml");
        service = (XmlProcessingService) applicationContext.getBean("xmlProcessingService");
        sessionDao = (SessionDao) applicationContext.getBean("sessionDao");
        sessionPlanDao = (SessionPlanDao) applicationContext.getBean("sessionPlanDao");
        sessionSymptomDao = (SessionSymptomDao) applicationContext.getBean("sessionSymptomDao");
        sessionSexualRelationshipTypeDao = (SessionSexualRelationshipTypeDao) applicationContext.getBean("sessionSexualRelationshipTypeDao");
    }

    /**
     *
     */
    public void testSubmitXmlDocument() {
        int status = StatusHelper.IN_ERROR;
        deleteAssociatedRecords();
        String xmlString = "<?xml version='1.0' encoding='UTF-8' ?>\n" +
                "<HtcForm>\n" +
                "    <FileReference>113930011292847266999.xml</FileReference>\n" +
                "    <SessionType>0</SessionType>\n" +
                "    <TestingType>0</TestingType>\n" +
                "    <CounsellorCode>3003</CounsellorCode>\n" +
                "    <SiteCode>3001</SiteCode>\n" +
                "    <TerminalId>MZ06</TerminalId>\n" +
                "    <SessionDate>1292847266649</SessionDate>\n" +
                "    <CouplesReference></CouplesReference>\n" +
                "    <LotNumber1>09050k100</LotNumber1>\n" +
                "    <LotNumber2>T327027</LotNumber2>\n" +
                "    <LotNumber3>023277</LotNumber3>\n" +
                "    <TraditionalAuthority>Mtwalo</TraditionalAuthority>\n" +
                "    <Sex>0</Sex>\n" +
                "    <DateOfBirth>391730400000</DateOfBirth>\n" +
                "    <CurrentOccupation>5</CurrentOccupation>\n" +
                "    <HighestEducation>3</HighestEducation>\n" +
                "    <MaritalStatus>0</MaritalStatus>\n" +
                "    <MostImportantReason>7</MostImportantReason>\n" +
                "    <EverHivTestedBefore>2</EverHivTestedBefore>\n" +
                "    <OftenGetTested>0</OftenGetTested>\n" +
                "    <OftenDrinksAlcohol>4</OftenDrinksAlcohol>\n" +
                "    <SexualPartners>0</SexualPartners>\n" +
                "    <SexualRelationships>\n" +
                "        <Flag1>1</Flag1>\n" +
                "        <Flag2>0</Flag2>\n" +
                "        <Flag3>0</Flag3>\n" +
                "        <Flag4>0</Flag4>\n" +
                "        <Flag5>0</Flag5>\n" +
                "    </SexualRelationships>\n" +
                "    <StatusOfAnyPartners>-1</StatusOfAnyPartners>\n" +
                "    <StatusOfAllPartners>-1</StatusOfAllPartners>\n" +
                "    <FrequentlyUseCondom>-1</FrequentlyUseCondom>\n" +
                "    <UseCondomWithSpouse>-1</UseCondomWithSpouse>\n" +
                "    <UsingFpMethod>-1</UsingFpMethod>\n" +
                "    <TestResult1>0</TestResult1>\n" +
                "    <TestResult2>-1</TestResult2>\n" +
                "    <TestResult3>-1</TestResult3>\n" +
                "    <FinalResult>0</FinalResult>\n" +
                "    <HivSymptoms>\n" +
                "        <Flag1>0</Flag1>\n" +
                "        <Flag2>0</Flag2>\n" +
                "        <Flag3>0</Flag3>\n" +
                "        <Flag4>0</Flag4>\n" +
                "        <Flag5>0</Flag5>\n" +
                "        <Flag6>0</Flag6>\n" +
                "        <Flag7>0</Flag7>\n" +
                "    </HivSymptoms>\n" +
                "    <RiskReductionPlans>\n" +
                "        <Flag1>0</Flag1>\n" +
                "        <Flag2>1</Flag2>\n" +
                "        <Flag3>0</Flag3>\n" +
                "        <Flag4>0</Flag4>\n" +
                "        <Flag5>0</Flag5>\n" +
                "        <Flag6>0</Flag6>\n" +
                "        <Flag7>0</Flag7>\n" +
                "        <Flag8>0</Flag8>\n" +
                "        <Flag9>0</Flag9>\n" +
                "        <Flag10>0</Flag10>\n" +
                "    </RiskReductionPlans>\n" +
                "    <MaleCondomsGiven>0</MaleCondomsGiven>\n" +
                "    <FemaleCondomsGiven>0</FemaleCondomsGiven>\n" +
                "</HtcForm>";

        status = service.submitXmlDocument(xmlString);
        Assert.assertTrue(status != StatusHelper.IN_ERROR);

        //status = service.submitXmlDocument(xmlString);
        //Assert.assertTrue(status  != StatusHelper.IN_ERROR);

        logger.info("Status is " + status);
        //logger.info(htcBean.getCondomsGiven());
    }

    /**
     * Method to delete all associated records related to the insertion tests from the DB
     */
    private void deleteAssociatedRecords() {
        String sessionRef = "111111111282654317132.xml";

        logger.info("About to delete session plans");

        try {
            logger.info("About to get session plans");
            List<SessionPlan> sessionPlans = sessionPlanDao.findWhereSessionReferenceEquals(sessionRef);
            logger.info("Got session plans");
            for (SessionPlan sessionPlan : sessionPlans) {
                SessionPlanPk sessionPlanPk = new SessionPlanPk();
                sessionPlanPk.setSessionPlanId(sessionPlan.getSessionPlanId());
                sessionPlanDao.delete(sessionPlanPk);
            }
        } catch (SessionPlanDaoException ex) {
            logger.error("Data Access Error - " + ex.toString());
        }

        logger.info("About to delete session symptoms");

        try {
            List<SessionSymptom> sessionSymptoms = sessionSymptomDao.findWhereSessionReferenceEquals(sessionRef);
            for (SessionSymptom sessionSymptom : sessionSymptoms) {
                SessionSymptomPk sessionSymptomPk = new SessionSymptomPk();
                sessionSymptomPk.setSessionSymptomId(sessionSymptom.getSessionSymptomId());
                sessionSymptomDao.delete(sessionSymptomPk);
            }
        } catch (SessionSymptomDaoException ex) {
            logger.error("Data Access Error - " + ex.toString());
        }

        logger.info("About to delete session sexual relationship types");

        try {
            List<SessionSexualRelationshipType> sessionSexualRelationshipTypes = sessionSexualRelationshipTypeDao.findWhereSessionReferenceEquals(sessionRef);
            for (SessionSexualRelationshipType sessionSexualRelationshipType : sessionSexualRelationshipTypes) {
                SessionSexualRelationshipTypePk sessionSexualRelationshipTypePk = new SessionSexualRelationshipTypePk();
                sessionSexualRelationshipTypePk.setSessionSexualRelationshipTypeId(sessionSexualRelationshipType.getSessionSexualRelationshipTypeId());
                sessionSexualRelationshipTypeDao.delete(sessionSexualRelationshipTypePk);
            }
        } catch (SessionSexualRelationshipTypeDaoException ex) {
            logger.error("Data Access Error - " + ex.toString());
        }

        logger.info("About to delete session");

        try {
            SessionPk sessionPk = new SessionPk();
            sessionPk.setSessionReference(sessionRef);
            sessionDao.delete(sessionPk);
        } catch (SessionDaoException ex) {
            logger.error("Data Access Error - " + ex.toString());
        }
    }

}
