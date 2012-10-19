package com.baobab.htc.business.services;

import com.baobab.htc.data.daos.dao.SequenceDao;
import com.baobab.htc.data.daos.exceptions.SequenceDaoException;
import com.baobab.htc.data.daos.dto.Sequence;
import com.baobab.htc.data.daos.dto.SequencePk;
import com.baobab.htc.business.helpers.ConstantHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.Date;

/**
 * This Service generates an atomic primary key for the various sequence identifiers
 *
 * @author Yamiko J. Msosa
 * @version 1.0
 * Date written: 04th May 2010
 */
public class SequenceGenerationService {
    /* Members of the class */
    protected final Log logger = LogFactory.getLog(getClass());
    private SequenceDao sequenceDao;

    /**
     * Method to return a new key given a sequence identifier
     *
     * @param sequenceName The sequence identifier for the intended new key
     * @return The resulting new key
     */
    public long getNextKey(String sequenceName){
        long key = -1L;
        try {
            logger.debug("Getting Sequences");
            List<Sequence> sequences = sequenceDao.findWhereSequenceNameEquals(sequenceName);
            if(sequences.size() > 0){
                logger.debug("Got some sequences");
                Sequence sequence = sequences.get(0);
                SequencePk sequencePk = new SequencePk();
                sequencePk.setId(sequence.getId());

                key = sequence.getTableId() + sequence.getIncrement();
                
                sequence.setTableId(key);
                logger.debug("Got key");

                sequence.setModifiedBy(ConstantHelper.APPLICATION_NAME);
                sequence.setDateModified(new Date());

                logger.debug("Set updates");

                sequenceDao.update(sequencePk, sequence);
                logger.debug("Updated");

            }
        } catch(SequenceDaoException exception) {
            logger.error(exception.toString());
            key = -1L;
        }
        return key;
    }

    /**
     * Getter method for the sequenceDao attribute
     *
     * @return
     */
    public SequenceDao getSequenceDao() {
        return sequenceDao;
    }

    /**
     * The setter method for the sequenceDao attribute
     *
     * @param sequenceDao The sequenceDao to set the intended attribute
     */
    public void setSequenceDao(SequenceDao sequenceDao) {
        this.sequenceDao = sequenceDao;
    }
}
