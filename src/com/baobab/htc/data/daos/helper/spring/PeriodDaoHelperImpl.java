package com.baobab.htc.data.daos.helper.spring;

import com.baobab.htc.data.daos.helper.PeriodDaoHelper;
import com.baobab.htc.data.daos.dao.spring.PeriodDaoImpl;
import com.baobab.htc.data.daos.dto.Period;
import com.baobab.htc.data.daos.exceptions.PeriodDaoException;
import org.springframework.transaction.annotation.Transactional;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Yamiko
 * Date: 20-Aug-2010
 * Time: 10:50:10
 * To change this template use File | Settings | File Templates.
 */
public class PeriodDaoHelperImpl extends PeriodDaoImpl implements PeriodDaoHelper {

    protected final Log logger = LogFactory.getLog(getClass()); // Logger for the class
    /**
     * Returns all rows from the Period table that match the criteria 'modifiedBy = :modifiedBy'.
     */
    @Transactional
    public Period getCurrentPeriod(Date sessionDate) throws PeriodDaoException {
        logger.info("About to get period");
        final String CURRENT_STATUS = "1";
        Period period = null;
        try {
            period = jdbcTemplate.query("SELECT periodId, period, ending, dateCreated, createdBy, dateModified, modifiedBy, status, beginning FROM " + getTableName() + " WHERE status > -1 AND Period.beginning <= ? AND Period.ending >= ? ORDER BY modifiedBy", this, sessionDate, sessionDate).get(0);
            logger.info("Period Id is.. " + period.getPeriodId());
            if (period == null) {
                throw new PeriodDaoException("Query failed", new Exception("Null DTO"));
            }
        }
        catch (Exception e) {
            logger.info("Hmmmmm....");
            throw new PeriodDaoException("Query failed", e);
        }
        return period;
    }
}
