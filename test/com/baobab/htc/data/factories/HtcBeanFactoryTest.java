package com.baobab.htc.data.factories;

import junit.framework.TestCase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.xml.sax.InputSource;
import org.jdom.Document;
import org.jdom.input.DOMBuilder;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import java.io.StringReader;

import com.baobab.htc.business.beans.HtcBean;
import com.baobab.htc.data.factoriees.HtcBeanFactory;

/**
 * This is the HtcBeanFactory unit test
 *
 * @author Yamiko J. Msosa
 * @version 1.0
 * Date written: 04th May 2010
 */
public class HtcBeanFactoryTest extends TestCase {
    private HtcBeanFactory factory;
    protected final Log logger = LogFactory.getLog(getClass());

    /**
     * Method to setup the test
     */
    public void setUp() {
        DOMConfigurator.configure("service/log4j.xml"); // load log4j config
        String xmlString= "<?xml version='1.0' encoding='UTF-8' ?>\n" +
                "<HtcForm>\n" +
                "    <FileReference>111111111282656281707.xml</FileReference>\n" +
                "    <SessionType>0</SessionType>\n" +
                "    <TestingType>1</TestingType>\n" +
                "    <CounsellorCode>1001</CounsellorCode>\n" +
                "    <SiteCode>1111</SiteCode>\n" +
                "    <TerminalId>C101</TerminalId>\n" +
                "    <SessionDate>1282656281707</SessionDate>\n" +
                "    <ReturnVisit>1</ReturnVisit>\n" +
                "    <CouplesReference></CouplesReference>\n" +
                "    <LotNumber1>we123</LotNumber1>\n" +
                "    <LotNumber2>no124</LotNumber2>\n" +
                "    <LotNumber3>ft546</LotNumber3>\n" +
                "    <TraditionalAuthority>Changata</TraditionalAuthority>\n" +
                "    <Sex>0</Sex>\n" +
                "    <DateOfBirth>1116000000</DateOfBirth>\n" +
                "    <CurrentOccupation>5</CurrentOccupation>\n" +
                "    <HighestEducation>3</HighestEducation>\n" +
                "    <MaritalStatus>3</MaritalStatus>\n" +
                "    <MostImportantReason>0</MostImportantReason>\n" +
                "    <EverHivTestedBefore>0</EverHivTestedBefore>\n" +
                "    <OftenGetTested>-1</OftenGetTested>\n" +
                "    <OftenDrinksAlcohol>1</OftenDrinksAlcohol>\n" +
                "    <SexualPartners>2</SexualPartners>\n" +
                "    <SexualRelationships>\n" +
                "        <Flag1>0</Flag1>\n" +
                "        <Flag2>0</Flag2>\n" +
                "        <Flag3>0</Flag3>\n" +
                "        <Flag4>1</Flag4>\n" +
                "        <Flag5>0</Flag5>\n" +
                "    </SexualRelationships>\n" +
                "    <StatusOfAnyPartners>0</StatusOfAnyPartners>\n" +
                "    <StatusOfAllPartners>0</StatusOfAllPartners>\n" +
                "    <FrequentlyUseCondom>1</FrequentlyUseCondom>\n" +
                "    <UseCondomWithSpouse>-1</UseCondomWithSpouse>\n" +
                "    <UsingFpMethod>-1</UsingFpMethod>\n" +
                "    <TestResult1>0</TestResult1>\n" +
                "    <TestResult2>-1</TestResult2>\n" +
                "    <TestResult3>-1</TestResult3>\n" +
                "    <FinalResult>0</FinalResult>\n" +
                "    <HivSymptoms>\n" +
                "        <Flag1>0</Flag1>\n" +
                "        <Flag2>1</Flag2>\n" +
                "        <Flag3>1</Flag3>\n" +
                "        <Flag4>0</Flag4>\n" +
                "        <Flag5>0</Flag5>\n" +
                "        <Flag6>0</Flag6>\n" +
                "        <Flag7>0</Flag7>\n" +
                "    </HivSymptoms>\n" +
                "    <RiskReductionPlans>\n" +
                "        <Flag1>0</Flag1>\n" +
                "        <Flag2>1</Flag2>\n" +
                "        <Flag3>1</Flag3>\n" +
                "        <Flag4>0</Flag4>\n" +
                "        <Flag5>0</Flag5>\n" +
                "        <Flag6>0</Flag6>\n" +
                "        <Flag7>0</Flag7>\n" +
                "        <Flag8>0</Flag8>\n" +
                "        <Flag9>0</Flag9>\n" +
                "        <Flag10>0</Flag10>\n" +
                "    </RiskReductionPlans>\n" +
                "    <MaleCondomsGiven>3</MaleCondomsGiven>\n" +
                "    <FemaleCondomsGiven>0</FemaleCondomsGiven>\n" +
                "</HtcForm>";

        org.w3c.dom.Document xmlDocument = null;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setValidating(false);
        DocumentBuilder documentBuilder;
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            InputSource inputSource = new InputSource(new StringReader(xmlString));
            xmlDocument = documentBuilder.parse(inputSource);
        }catch(Exception ex){
            logger.error("Unable to load - " + ex.toString());
        }

        Document jdomDocument = new DOMBuilder().build(xmlDocument);

        factory = new HtcBeanFactory(jdomDocument);
    }

    /**
     * Unit test for the generating an HtcBean from the factory
     */
    public void testGetHtcBean() {
        /* The tests */
        HtcBean htcBean = factory.getHtcBean();
        Assert.assertNotNull(htcBean);
        
        /* Site and Session Attributes */
        Assert.assertEquals(htcBean.getReference(), new String("111111111282656281707.xml"));
        Assert.assertEquals(htcBean.getSiteCode(), 1111);
        Assert.assertEquals(htcBean.getCounsellorCode(), "1001");
        Assert.assertEquals(htcBean.getCouplesReference(), "");
        Assert.assertEquals(htcBean.getSessionType(), 0);
        Assert.assertEquals(htcBean.getSessionDate().getTime(), 1282656281707L);
        Assert.assertEquals(htcBean.getTestingType(), 1);
        Assert.assertEquals(htcBean.getTerminalId(), "C101");
        Assert.assertEquals(htcBean.getLotNumber1(), "we123");
        Assert.assertEquals(htcBean.getLotNumber2(), "no124");
        Assert.assertEquals(htcBean.getLotNumber3(), "ft546");

        /* Demographics */
        Assert.assertEquals(htcBean.getDateOfBirth().getTime(), 1116000000L);
        Assert.assertEquals(htcBean.getSex(), 0);
        Assert.assertEquals(htcBean.getHighestEducation(), 3);
        Assert.assertEquals(htcBean.getCurrentOccupation(), 5);
        Assert.assertEquals(htcBean.getMaritalStatus(), 3);
        Assert.assertEquals(htcBean.getMostImportantReason(), 0);
        Assert.assertEquals(htcBean.getTraditionalAuthority(), "Changata");

        /* History of HIV Testing and Risk */
        Assert.assertEquals(htcBean.getEverHivTestedBefore(), 0);
        Assert.assertEquals(htcBean.getOftenGetTested(), -1);
        Assert.assertEquals(htcBean.getOftenDrinksAlcohol(), 1);
        Assert.assertEquals(htcBean.getSexualPartners(), 2);
        Assert.assertArrayEquals(htcBean.getSexualRelationships(),new int[]{0, 0, 0, 1, 0});
        Assert.assertEquals(htcBean.getStatusOfAnyPartners(), 0);
        Assert.assertEquals(htcBean.getStatusOfAllPartners(), 0);
        Assert.assertEquals(htcBean.getFrequentlyUseCondom(), 1);
        Assert.assertEquals(htcBean.getUseCondomWithSpouse(), -1);

        /* Pregnancy and Family Planning */
        Assert.assertEquals(htcBean.getUsingFpMethod(), -1);

        /* HIV Testing */
        Assert.assertEquals(htcBean.getTestResult1(), 0);
        Assert.assertEquals(htcBean.getTestResult2(), -1);
        Assert.assertEquals(htcBean.getTestResult3(), -1);
        Assert.assertEquals(htcBean.getFinalResult(), 0);

        /* Referrals and Risk Reduction */
        Assert.assertArrayEquals(htcBean.getRiskReductionPlans(), new int[]{0, 1, 1, 0, 0, 0, 0, 0, 0, 0});
        Assert.assertArrayEquals(htcBean.getHivSymptoms(), new int[]{0, 1, 1, 0, 0, 0, 0});
        Assert.assertEquals(htcBean.getMaleCondomsGiven(), 3);
        Assert.assertEquals(htcBean.getFemaleCondomsGiven(), 0);

        logger.info(htcBean.getReference());
        logger.info(htcBean.getSiteCode());
        logger.info(htcBean.getUsingFpMethod());
        logger.info(htcBean.getMaleCondomsGiven());
    }
}
