package com.baobab.htc.data.factoriees;

import com.baobab.htc.business.beans.HtcBean;
import org.jdom.Document;
import org.jdom.Element;

import java.util.Date;
import java.util.List;

/**
 * This factory class generates HtcBeans
 *
 * @author Yamiko J. Msosa
 * @version 1.0
 * Date written: 15th April 2010
 */
public class HtcBeanFactory {

    private Document xmlDocument;

    /**
     * Constructor for the class
     *
     * @param xmlDocument XML Document to be manipulated
     */
    public HtcBeanFactory(Document xmlDocument) {
        this.xmlDocument = xmlDocument;
    }

    /**
     * Method to generate an HtcBean from a given xmlDocument
     *
     * @param xmlDocument The XML Document to be used as a datasource for the HtcBean
     * @return
     */
    public HtcBean getHtcBean(Document xmlDocument) {
        this.xmlDocument = xmlDocument;
        HtcBean htcBean = getHtcBean();
        return htcBean;
    }

    /**
     * Method to generate an HtcBean from an xmlDocument
     *
     * @return
     */
    public HtcBean getHtcBean() {
        HtcBean htcBean = new HtcBean();

        /* Site and session details  */
        htcBean.setCounsellorCode(getElement("CounsellorCode"));
        htcBean.setCouplesReference(getElement("CouplesReference"));
        htcBean.setReference(getElement("FileReference"));
        htcBean.setSessionType(stringToInt(getElement("SessionType")));
        htcBean.setTestingType(stringToInt(getElement("TestingType")));
        htcBean.setSessionDate(new Date(stringToLong(getElement("SessionDate"))));
        htcBean.setLotNumber1(getElement("LotNumber1"));
        htcBean.setLotNumber2(getElement("LotNumber2"));
        htcBean.setLotNumber3(getElement("LotNumber3"));
        htcBean.setSiteCode(stringToInt(getElement("SiteCode")));
        htcBean.setTerminalId(getElement("TerminalId"));

        /* Demographic Information */
        htcBean.setCurrentOccupation(stringToInt(getElement("CurrentOccupation")));
        htcBean.setHighestEducation(stringToInt(getElement("HighestEducation")));
        htcBean.setDateOfBirth(new Date(stringToLong(getElement("DateOfBirth"))));
        htcBean.setSex(stringToInt(getElement("Sex")));
        htcBean.setMaritalStatus(stringToInt(getElement("MaritalStatus")));
        htcBean.setMostImportantReason(stringToInt(getElement("MostImportantReason")));
        htcBean.setTraditionalAuthority(getElement("TraditionalAuthority"));

        /* History of HIV Testing & Risk */
        htcBean.setEverHivTestedBefore(stringToInt(getElement("EverHivTestedBefore")));
        htcBean.setOftenDrinksAlcohol(stringToInt(getElement("OftenDrinksAlcohol")));
        htcBean.setSexualPartners(stringToInt(getElement("SexualPartners")));
        htcBean.setSexualRelationships(getElements("SexualRelationships"));
        htcBean.setOftenGetTested(stringToInt(getElement("OftenGetTested")));
        htcBean.setStatusOfAnyPartners(stringToInt(getElement("StatusOfAnyPartners")));
        htcBean.setStatusOfAllPartners(stringToInt(getElement("StatusOfAllPartners")));
        htcBean.setFrequentlyUseCondom(stringToInt(getElement("FrequentlyUseCondom")));
        htcBean.setUseCondomWithSpouse(stringToInt(getElement("UseCondomWithSpouse")));

        /* Pregnancy and Family Planning*/
        htcBean.setUsingFpMethod(stringToInt(getElement("UsingFpMethod")));

       /* HIV Testing */
        htcBean.setTestResult1(stringToInt(getElement("TestResult1")));
        htcBean.setTestResult2(stringToInt(getElement("TestResult2")));
        htcBean.setTestResult3(stringToInt(getElement("TestResult3")));
        htcBean.setFinalResult(stringToInt(getElement("FinalResult")));


       /* Referrals and Risk Reduction */
        htcBean.setHivSymptoms(getElements("HivSymptoms"));
        htcBean.setRiskReductionPlans(getElements("RiskReductionPlans"));
        htcBean.setMaleCondomsGiven(stringToInt(getElement("MaleCondomsGiven")));
        htcBean.setFemaleCondomsGiven(stringToInt(getElement("FemaleCondomsGiven")));

        return htcBean;
    }

    /**
     * Method to get value from an Element given an Element name
     *
     * @param elementName The name of the Element to extract data from
     * @return The text value of the given Element specified by elementName
     */
    private String getElement(String elementName) {
        Element element = this.xmlDocument.getRootElement().getChild(elementName);
        String elementString = "";
        if (element == null) {
            elementString = "";
        } else {
            elementString = element.getText();
        }
        return elementString;
    }

    /**
     * This method generates an integer Array from a nested set of Elements
     * <p/>
     * <p>
     * The child elements have to be in the form of FlagX where X is (0..21)
     * </p>
     *
     * @param elementName
     * @return
     */
    private int[] getElements(String elementName) {
        Element rootElement = this.xmlDocument.getRootElement().getChild(elementName);
        int elementArray[] = null;
        if (rootElement != null) {
            List<Element> elements = rootElement.getChildren();
            elementArray = new int[elements.size()];
            for (Element element : elements) {
                if (element.getName().trim().equalsIgnoreCase("Flag1")) {
                    elementArray[0] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag2")) {
                    elementArray[1] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag3")) {
                    elementArray[2] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag4")) {
                    elementArray[3] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag5")) {
                    elementArray[4] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag6")) {
                    elementArray[5] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag7")) {
                    elementArray[6] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag8")) {
                    elementArray[7] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag9")) {
                    elementArray[8] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag10")) {
                    elementArray[9] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag11")) {
                    elementArray[10] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag12")) {
                    elementArray[11] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag13")) {
                    elementArray[12] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag14")) {
                    elementArray[13] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag15")) {
                    elementArray[14] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag16")) {
                    elementArray[15] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag17")) {
                    elementArray[16] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag18")) {
                    elementArray[17] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag19")) {
                    elementArray[18] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag20")) {
                    elementArray[19] = stringToInt(element.getText());
                } else if (element.getName().trim().equalsIgnoreCase("Flag21")) {
                    elementArray[20] = stringToInt(element.getText());
                }
            }
        }
        return elementArray;
    }

    /**
     * This method converts a given String to primitive type long
     * <p/>
     * <p>
     * A value of -1 is returned from all String Values that can not be converted
     * </p>
     *
     * @param string The String to be converted
     * @return The return value
     */
    private long stringToLong(String string) {
        long returnValue = -1L;
        try {
            returnValue = Long.parseLong(string);
        } catch (Exception ex) {
            returnValue = -1L;
        }
        return returnValue;
    }

    /**
     * This method converts a given String to primitive type int
     * <p/>
     * <p>
     * A value of -1 is returned from all String Values that can not be converted
     * </p>
     *
     * @param string The String to be converted
     * @return The return value
     */
    private int stringToInt(String string) {
        int returnValue = -1;
        try {
            returnValue = Integer.parseInt(string);
        } catch (Exception ex) {
            returnValue = -1;
        }
        return returnValue;
    }
}
