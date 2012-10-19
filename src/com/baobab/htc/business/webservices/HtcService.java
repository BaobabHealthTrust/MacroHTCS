package com.baobab.htc.business.webservices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebParam;

import com.baobab.htc.business.services.XmlProcessingService;
import com.baobab.htc.business.helpers.StatusHelper;

/**
 * This is the actual HtcService web service to be exposed by Axis2
 *
 * @author Yamiko J. Msosa
 * @version 1.0
 * Date written: 04th May 2010
 */
public class HtcService {
    /* Members of the class */
    protected final Log logger = LogFactory.getLog(getClass());
    private XmlProcessingService xmlProcessingService;

    /**
     * This the exposed web service that processes submitted XML documents
     *
     * @param xmlDocument The XML Document String to be processed
     * @return The processing result status
     */
    @WebResult(name = "submissionStatus")
    public int submitXmlDocument(@WebParam(name = "XmlDocument")String xmlDocument) {
        int status = StatusHelper.IN_ERROR;
        logger.debug("Received XML Document");
        status = xmlProcessingService.submitXmlDocument(xmlDocument);
        logger.info("Processed status: " + status);
        return status;
    }

    /* Getters and setters for the beans that do all the work */

    /**
     * Getter method for the xmlProcessingService attribute
     *
     * @return The XmlProcessingService object attribute to be returned
     */
    @WebMethod(exclude = true)
    public XmlProcessingService getXmlProcessingService() {
        return xmlProcessingService;
    }

    /**
     * The setter method for the xmlProcessingService attribute
     *
     * @param xmlProcessingService The XmlProcessingService object to replace the current xmlProcessingService attribute
     */
    @WebMethod(exclude = true)
    public void setXmlProcessingService(XmlProcessingService xmlProcessingService) {
        this.xmlProcessingService = xmlProcessingService;
    }

}
