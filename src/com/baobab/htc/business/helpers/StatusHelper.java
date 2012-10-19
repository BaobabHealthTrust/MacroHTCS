package com.baobab.htc.business.helpers;

/**
 * This Singleton helper class defines all applicable statuses accross the services in this suite
 *
 * @author Yamiko J. Msosa
 * @version 1.0
 * Date written: 04th May 2010
 */
public class StatusHelper {

    /* The statuses */
    public static final int SUBMITTED = 0;
    public static final int VALIDATED = 1;
    public static final int PROCESSED = 2;
    public static final int IN_ERROR = -1;

    private static StatusHelper statusHelper = new StatusHelper();// The Singleton instance

    /**
     * The Singleton instance
     */
    private StatusHelper(){
    }

    /**
     * The method to return the same instance of this class everytime
     *
     * @return The StatusHelper object
     */
    public static StatusHelper getInstance(){
        return statusHelper;
    }
}
