package com.baobab.htc.business.webservices;

import org.apache.axis2.engine.ServiceLifeCycle;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ServiceContext;
import org.apache.axis2.context.OperationContext;
import org.apache.axis2.description.AxisService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.axiom.om.OMElement;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This is the Spring Initialisation hook needed by Axis
 *
 * @author Yamiko J. Msosa
 * @version 1.0
 * Date written: 04th May 2010
 */
public class SpringInit implements ServiceLifeCycle {
    private static Log logger = LogFactory.getLog(SpringInit.class);

    /**
     * The web service
     *
     * @param ignore Parameter needed by the Interface
     * @return
     */
    public OMElement springInitialisation(OMElement ignore) {

        return null;
    }

    public void init(ServiceContext serviceContext) {

    }

    public void setOperationContext(OperationContext arg0) {

    }

    public void destroy(ServiceContext arg0) {

    }

    /**
     * This methos will be called at startup
     *
     * @param ignore ConfigurationContext object needed by this class's Interface
     * @param service The Axis Service
     */
    public void startUp(ConfigurationContext ignore, AxisService service) {

        try {
            logger.info("Starting spring init - HTC Webservice");
            ClassLoader classLoader = service.getClassLoader();
            ClassPathXmlApplicationContext appCtx = new
                    ClassPathXmlApplicationContext(new String[]{"HtcApplicationContext.xml"}, false);
            appCtx.setClassLoader(classLoader);
            appCtx.refresh();
            logger.info("Spring init complete - HTC Webservice");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This will be called during the system shut down time.
     * <p/>
     * <p> This method will be called irrespective of the service scope this method will be called </p>
     *
     * @param ctxIgnore
     * @param ignore
     */
    public void shutDown(ConfigurationContext ctxIgnore, AxisService ignore) {
    }
}


