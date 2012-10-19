package com.baobab.htc.data.daos.helper;

import com.baobab.htc.data.daos.dto.Period;
import com.baobab.htc.data.daos.exceptions.PeriodDaoException;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Yamiko
 * Date: 20-Aug-2010
 * Time: 10:40:59
 * To change this template use File | Settings | File Templates.
 */
public interface PeriodDaoHelper {

    /**
     * Returns the rows from the Period table that matches the specified primary-key value.
     */
    public Period getCurrentPeriod(Date sessionDate) throws PeriodDaoException;
}
