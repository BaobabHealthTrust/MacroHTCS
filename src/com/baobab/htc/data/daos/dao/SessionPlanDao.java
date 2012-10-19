package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.SessionPlanDao;
import com.baobab.htc.data.daos.dto.SessionPlan;
import com.baobab.htc.data.daos.dto.SessionPlanPk;
import com.baobab.htc.data.daos.exceptions.SessionPlanDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface SessionPlanDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SessionPlanPk
	 */
	public SessionPlanPk insert(SessionPlan dto);

	/** 
	 * Updates a single row in the SessionPlan table.
	 */
	public void update(SessionPlanPk pk, SessionPlan dto) throws SessionPlanDaoException;

	/** 
	 * Deletes a single row in the SessionPlan table.
	 */
	public void delete(SessionPlanPk pk) throws SessionPlanDaoException;

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'sessionPlanId = :sessionPlanId'.
	 */
	public SessionPlan findByPrimaryKey(long sessionPlanId) throws SessionPlanDaoException;

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria ''.
	 */
	public List<SessionPlan> findAll() throws SessionPlanDaoException;

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'planId = :planId'.
	 */
	public List<SessionPlan> findByPlan(BigDecimal planId) throws SessionPlanDaoException;

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'sessionReference = :sessionReference'.
	 */
	public List<SessionPlan> findBySession(String sessionReference) throws SessionPlanDaoException;

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'sessionPlanId = :sessionPlanId'.
	 */
	public List<SessionPlan> findWhereSessionPlanIdEquals(BigDecimal sessionPlanId) throws SessionPlanDaoException;

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'sessionReference = :sessionReference'.
	 */
	public List<SessionPlan> findWhereSessionReferenceEquals(String sessionReference) throws SessionPlanDaoException;

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'planId = :planId'.
	 */
	public List<SessionPlan> findWherePlanIdEquals(BigDecimal planId) throws SessionPlanDaoException;

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<SessionPlan> findWhereDateCreatedEquals(Date dateCreated) throws SessionPlanDaoException;

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<SessionPlan> findWhereCreatedByEquals(String createdBy) throws SessionPlanDaoException;

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<SessionPlan> findWhereDateModifiedEquals(Date dateModified) throws SessionPlanDaoException;

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<SessionPlan> findWhereModifiedByEquals(String modifiedBy) throws SessionPlanDaoException;

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'status = :status'.
	 */
	public List<SessionPlan> findWhereStatusEquals(int status) throws SessionPlanDaoException;

	/** 
	 * Returns the rows from the SessionPlan table that matches the specified primary-key value.
	 */
	public SessionPlan findByPrimaryKey(SessionPlanPk pk) throws SessionPlanDaoException;

}
