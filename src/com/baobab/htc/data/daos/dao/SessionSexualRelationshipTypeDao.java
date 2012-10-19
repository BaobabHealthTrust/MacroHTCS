package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.SessionSexualRelationshipTypeDao;
import com.baobab.htc.data.daos.dto.SessionSexualRelationshipType;
import com.baobab.htc.data.daos.dto.SessionSexualRelationshipTypePk;
import com.baobab.htc.data.daos.exceptions.SessionSexualRelationshipTypeDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface SessionSexualRelationshipTypeDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SessionSexualRelationshipTypePk
	 */
	public SessionSexualRelationshipTypePk insert(SessionSexualRelationshipType dto);

	/** 
	 * Updates a single row in the SessionSexualRelationshipType table.
	 */
	public void update(SessionSexualRelationshipTypePk pk, SessionSexualRelationshipType dto) throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Deletes a single row in the SessionSexualRelationshipType table.
	 */
	public void delete(SessionSexualRelationshipTypePk pk) throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'sessionSexualRelationshipTypeId = :sessionSexualRelationshipTypeId'.
	 */
	public SessionSexualRelationshipType findByPrimaryKey(long sessionSexualRelationshipTypeId) throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'sexualRelationshipTypeId = :sexualRelationshipTypeId'.
	 */
	public List<SessionSexualRelationshipType> findBySexualRelationShipType(BigDecimal sexualRelationshipTypeId) throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria ''.
	 */
	public List<SessionSexualRelationshipType> findAll() throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'sessionReference = :sessionReference'.
	 */
	public List<SessionSexualRelationshipType> findBySession(String sessionReference) throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'sexualRelationshipTypeId = :sexualRelationshipTypeId'.
	 */
	public List<SessionSexualRelationshipType> findBySexualRelationshipType(BigDecimal sexualRelationshipTypeId) throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'sessionSexualRelationshipTypeId = :sessionSexualRelationshipTypeId'.
	 */
	public List<SessionSexualRelationshipType> findWhereSessionSexualRelationshipTypeIdEquals(BigDecimal sessionSexualRelationshipTypeId) throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'sessionReference = :sessionReference'.
	 */
	public List<SessionSexualRelationshipType> findWhereSessionReferenceEquals(String sessionReference) throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'sexualRelationshipTypeId = :sexualRelationshipTypeId'.
	 */
	public List<SessionSexualRelationshipType> findWhereSexualRelationshipTypeIdEquals(BigDecimal sexualRelationshipTypeId) throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<SessionSexualRelationshipType> findWhereDateCreatedEquals(Date dateCreated) throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<SessionSexualRelationshipType> findWhereCreatedByEquals(String createdBy) throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<SessionSexualRelationshipType> findWhereDateModifiedEquals(Date dateModified) throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<SessionSexualRelationshipType> findWhereModifiedByEquals(String modifiedBy) throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'status = :status'.
	 */
	public List<SessionSexualRelationshipType> findWhereStatusEquals(int status) throws SessionSexualRelationshipTypeDaoException;

	/** 
	 * Returns the rows from the SessionSexualRelationshipType table that matches the specified primary-key value.
	 */
	public SessionSexualRelationshipType findByPrimaryKey(SessionSexualRelationshipTypePk pk) throws SessionSexualRelationshipTypeDaoException;

}
