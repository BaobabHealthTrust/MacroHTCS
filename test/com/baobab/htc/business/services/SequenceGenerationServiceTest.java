package com.baobab.htc.business.services;

import junit.framework.TestCase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.junit.Assert;

/**
 * This is the SequenceGenerationService unit test
 *
 * @author Yamiko J. Msosa
 * @version 1.0
 * Date written: 04th May 2010
 */
public class SequenceGenerationServiceTest extends TestCase {
    /* Members for the class */
    private SequenceGenerationService service;
    protected final Log logger = LogFactory.getLog(getClass());

    /**
     * Method to setup the test
     */
    public void setUp() {
        DOMConfigurator.configure("service/log4j.xml"); // load log4j config
        FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("service/HtcApplicationContext.xml");
        service = (SequenceGenerationService) applicationContext.getBean("sequenceGenerationService");
    }

    /**
     * This tests key generation functionality
     */
    public void testGetKey() {
        /* Test invalid key generation */
        long myKey = service.getNextKey("Invalid");
        logger.info("Key: " + myKey);
        Assert.assertTrue(myKey == -1);

        /* Test valid key generation */
        myKey = service.getNextKey("District");
        logger.info("Key: " + myKey);
        Assert.assertTrue(myKey > -1);
    }
}
