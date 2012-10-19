package com.baobab.htc.data.files;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;

/**
 * This class contains File handling methods
 *
 * @author Yamiko J. Msosa
 * @version 1.0
 * Date written: 15th April 2010
 */
public class FileHandler {

    protected final Log logger = LogFactory.getLog(getClass());

    /**
     * This method writes a given String to a File object
     *
     * @param dataLine        The String to be written to a File object
     * @param destinationFile The File Object to be written to
     * @throws IOException
     */
    public void writeToFile(String dataLine, File destinationFile) throws IOException {
        FileWriter fileWriter = new FileWriter(destinationFile);
        fileWriter.write(dataLine);
        fileWriter.close();
    }

    /**
     * This method moves a File from one location to another
     *
     * @param sourceFile      The File to be moved
     * @param destinationFile The destination File
     * @throws IOException
     */
    public void moveFile(File sourceFile, File destinationFile) throws IOException {
        if (logger.isDebugEnabled())
            logger.debug("moveFile - entry '" + sourceFile.getAbsolutePath() + "':'" + destinationFile.getAbsolutePath() + "'");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
        FileWriter fileWriter = new FileWriter(destinationFile);
        String dataLine;
        while ((dataLine = bufferedReader.readLine()) != null) {
            fileWriter.write(dataLine);
        }
        fileWriter.close();
        bufferedReader.close();
        destinationFile.setLastModified(sourceFile.lastModified());

        logger.debug("moveFile - File copied");
        if (!sourceFile.delete()) {
            logger.error("Unable to delete the file '" + sourceFile.getAbsolutePath() + "'");
        }

        logger.debug("moveFile - File deleted");
    }
}
