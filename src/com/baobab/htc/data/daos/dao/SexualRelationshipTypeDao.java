package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.SexualRelationshipTypeDao;
import com.baobab.htc.data.daos.dto.SexualRelationshipType;
import com.baobab.htc.data.daos.dto.SexualRelationshipTypePk;
import com.baobab.htc.data.daos.exceptions.SexualRelationshipTypeDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface SexualRelationshipTypeDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SexualRelationshipTypePk
	 */
	public SexualRelationshipTypePk insert(SexualRelationshipType dto);

	/** 
	 * Updates a single row in the SexualRelationshipType table.
	 */
	public void update(SexualRelationshipTypePk pk, SexualRelationshipType dto) throws SexualRelationshipTypeDaoException;

	/** 
	 * Deletes a single row in the SexualRelationshipType table.
	 */
	public void delete(SexualRelationshipTypePk pk) throws SexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'sexualRelationshipTypeId = :sexualRelationshipTypeId'.
	 */
	public SexualRelationshipType findByPrimaryKey(long sexualRelationshipTypeId) throws SexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria ''.
	 */
	public List<SexualRelationshipType> findAll() throws SexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'sexualRelationshipTypeId = :sexualRelationshipTypeId'.
	 */
	public List<SexualRelationshipType> findWhereSexualRelationshipTypeIdEquals(BigDecimal sexualRelationshipTypeId) throws SexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'description = :description'.
	 */
	public List<SexualRelationshipType> findWhereDescriptionEquals(String description) throws SexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<SexualRelationshipType> findWhereDateCreatedEquals(Date dateCreated) throws SexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<SexualRelationshipType> findWhereCreatedByEquals(String createdBy) throws SexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<SexualRelationshipType> findWhereDateModifiedEquals(Date dateModified) throws SexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<SexualRelationshipType> findWhereModifiedByEquals(String modifiedBy) throws SexualRelationshipTypeDaoException;

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'status = :status'.
	 */
	public List<SexualRelationshipType> findWhereStatusEquals(int status) throws SexualRelationshipTypeDaoException;

	/** 
	 * Returns the rows from the SexualRelationshipType table that matches the specified primary-key value.
	 */
	public SexualRelationshipType findByPrimaryKey(SexualRelationshipTypePk pk) throws SexualRelationshipTypeDaoException;

}
