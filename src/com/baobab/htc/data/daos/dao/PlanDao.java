package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.PlanDao;
import com.baobab.htc.data.daos.dto.Plan;
import com.baobab.htc.data.daos.dto.PlanPk;
import com.baobab.htc.data.daos.exceptions.PlanDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface PlanDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return PlanPk
	 */
	public PlanPk insert(Plan dto);

	/** 
	 * Updates a single row in the Plan table.
	 */
	public void update(PlanPk pk, Plan dto) throws PlanDaoException;

	/** 
	 * Deletes a single row in the Plan table.
	 */
	public void delete(PlanPk pk) throws PlanDaoException;

	/** 
	 * Returns all rows from the Plan table that match the criteria 'planId = :planId'.
	 */
	public Plan findByPrimaryKey(long planId) throws PlanDaoException;

	/** 
	 * Returns all rows from the Plan table that match the criteria ''.
	 */
	public List<Plan> findAll() throws PlanDaoException;

	/** 
	 * Returns all rows from the Plan table that match the criteria 'planId = :planId'.
	 */
	public List<Plan> findWherePlanIdEquals(BigDecimal planId) throws PlanDaoException;

	/** 
	 * Returns all rows from the Plan table that match the criteria 'description = :description'.
	 */
	public List<Plan> findWhereDescriptionEquals(String description) throws PlanDaoException;

	/** 
	 * Returns all rows from the Plan table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<Plan> findWhereDateCreatedEquals(Date dateCreated) throws PlanDaoException;

	/** 
	 * Returns all rows from the Plan table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<Plan> findWhereCreatedByEquals(String createdBy) throws PlanDaoException;

	/** 
	 * Returns all rows from the Plan table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<Plan> findWhereDateModifiedEquals(Date dateModified) throws PlanDaoException;

	/** 
	 * Returns all rows from the Plan table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<Plan> findWhereModifiedByEquals(String modifiedBy) throws PlanDaoException;

	/** 
	 * Returns all rows from the Plan table that match the criteria 'status = :status'.
	 */
	public List<Plan> findWhereStatusEquals(int status) throws PlanDaoException;

	/** 
	 * Returns the rows from the Plan table that matches the specified primary-key value.
	 */
	public Plan findByPrimaryKey(PlanPk pk) throws PlanDaoException;

}
