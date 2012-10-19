package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.SessionTypeDao;
import com.baobab.htc.data.daos.dto.SessionType;
import com.baobab.htc.data.daos.dto.SessionTypePk;
import com.baobab.htc.data.daos.exceptions.SessionTypeDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface SessionTypeDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SessionTypePk
	 */
	public SessionTypePk insert(SessionType dto);

	/** 
	 * Updates a single row in the SessionType table.
	 */
	public void update(SessionTypePk pk, SessionType dto) throws SessionTypeDaoException;

	/** 
	 * Deletes a single row in the SessionType table.
	 */
	public void delete(SessionTypePk pk) throws SessionTypeDaoException;

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'sessionTypeId = :sessionTypeId'.
	 */
	public SessionType findByPrimaryKey(long sessionTypeId) throws SessionTypeDaoException;

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'sessionTypeCategoryId = :sessionTypeCategoryId'.
	 */
	public List<SessionType> findBySessiontypecategory(BigDecimal sessionTypeCategoryId) throws SessionTypeDaoException;

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'sessionTypeCategoryId = :sessionTypeCategoryId'.
	 */
	public List<SessionType> findWhereSessionTypeCategoryIdEquals(BigDecimal sessionTypeCategoryId) throws SessionTypeDaoException;

	/** 
	 * Returns all rows from the SessionType table that match the criteria ''.
	 */
	public List<SessionType> findAll() throws SessionTypeDaoException;

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'sessionTypeId = :sessionTypeId'.
	 */
	public List<SessionType> findWhereSessionTypeIdEquals(BigDecimal sessionTypeId) throws SessionTypeDaoException;

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'description = :description'.
	 */
	public List<SessionType> findWhereDescriptionEquals(String description) throws SessionTypeDaoException;

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<SessionType> findWhereDateCreatedEquals(Date dateCreated) throws SessionTypeDaoException;

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<SessionType> findWhereCreatedByEquals(String createdBy) throws SessionTypeDaoException;

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<SessionType> findWhereDateModifiedEquals(Date dateModified) throws SessionTypeDaoException;

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<SessionType> findWhereModifiedByEquals(String modifiedBy) throws SessionTypeDaoException;

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'status = :status'.
	 */
	public List<SessionType> findWhereStatusEquals(int status) throws SessionTypeDaoException;

	/** 
	 * Returns the rows from the SessionType table that matches the specified primary-key value.
	 */
	public SessionType findByPrimaryKey(SessionTypePk pk) throws SessionTypeDaoException;

}
