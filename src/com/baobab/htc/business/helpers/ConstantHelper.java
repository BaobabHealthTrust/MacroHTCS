package com.baobab.htc.business.helpers;

/**
 * This Singleton helper class defines all applicable constants for the application
 *
 * @author Yamiko J. Msosa
 * @version 1.0
 * Date written: 04th May 2010
 */
public class ConstantHelper {

    /* Constants for the class */
    public static final String APPLICATION_NAME = "HTCWS";

    private static ConstantHelper constantHelper = new ConstantHelper();// The Singleton instance for the class

    /* Constant Helper */
    private ConstantHelper(){
    }

    /**
     * The method to return the same instance of this class everytime
     *
     * @return The ConstantHelper object
     */
    public static ConstantHelper getInstance(){
        return constantHelper;
    }
}
