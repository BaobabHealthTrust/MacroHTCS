package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.PeriodDao;
import com.baobab.htc.data.daos.dto.Period;
import com.baobab.htc.data.daos.dto.PeriodPk;
import com.baobab.htc.data.daos.exceptions.PeriodDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface PeriodDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return PeriodPk
	 */
	public PeriodPk insert(Period dto);

	/** 
	 * Updates a single row in the Period table.
	 */
	public void update(PeriodPk pk, Period dto) throws PeriodDaoException;

	/** 
	 * Deletes a single row in the Period table.
	 */
	public void delete(PeriodPk pk) throws PeriodDaoException;

	/** 
	 * Returns all rows from the Period table that match the criteria 'periodId = :periodId'.
	 */
	public Period findByPrimaryKey(long periodId) throws PeriodDaoException;

	/** 
	 * Returns all rows from the Period table that match the criteria 'starting = :starting'.
	 */
	public List<Period> findWhereStartingEquals(Date starting) throws PeriodDaoException;

	/** 
	 * Returns all rows from the Period table that match the criteria ''.
	 */
	public List<Period> findAll() throws PeriodDaoException;

	/** 
	 * Returns all rows from the Period table that match the criteria 'periodId = :periodId'.
	 */
	public List<Period> findWherePeriodIdEquals(BigDecimal periodId) throws PeriodDaoException;

	/** 
	 * Returns all rows from the Period table that match the criteria 'period = :period'.
	 */
	public List<Period> findWherePeriodEquals(int period) throws PeriodDaoException;

	/** 
	 * Returns all rows from the Period table that match the criteria 'beginning = :beginning'.
	 */
	public List<Period> findWhereBeginningEquals(Date beginning) throws PeriodDaoException;

	/** 
	 * Returns all rows from the Period table that match the criteria 'ending = :ending'.
	 */
	public List<Period> findWhereEndingEquals(Date ending) throws PeriodDaoException;

	/** 
	 * Returns all rows from the Period table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<Period> findWhereDateCreatedEquals(Date dateCreated) throws PeriodDaoException;

	/** 
	 * Returns all rows from the Period table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<Period> findWhereCreatedByEquals(String createdBy) throws PeriodDaoException;

	/** 
	 * Returns all rows from the Period table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<Period> findWhereDateModifiedEquals(Date dateModified) throws PeriodDaoException;

	/** 
	 * Returns all rows from the Period table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<Period> findWhereModifiedByEquals(String modifiedBy) throws PeriodDaoException;

	/** 
	 * Returns all rows from the Period table that match the criteria 'status = :status'.
	 */
	public List<Period> findWhereStatusEquals(int status) throws PeriodDaoException;

	/** 
	 * Returns the rows from the Period table that matches the specified primary-key value.
	 */
	public Period findByPrimaryKey(PeriodPk pk) throws PeriodDaoException;

}
