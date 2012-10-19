package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.SiteTypeDao;
import com.baobab.htc.data.daos.dto.SiteType;
import com.baobab.htc.data.daos.dto.SiteTypePk;
import com.baobab.htc.data.daos.exceptions.SiteTypeDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface SiteTypeDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiteTypePk
	 */
	public SiteTypePk insert(SiteType dto);

	/** 
	 * Updates a single row in the SiteType table.
	 */
	public void update(SiteTypePk pk, SiteType dto) throws SiteTypeDaoException;

	/** 
	 * Deletes a single row in the SiteType table.
	 */
	public void delete(SiteTypePk pk) throws SiteTypeDaoException;

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'siteTypeId = :siteTypeId'.
	 */
	public SiteType findByPrimaryKey(long siteTypeId) throws SiteTypeDaoException;

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'siteTypeCategoryId = :siteTypeCategoryId'.
	 */
	public List<SiteType> findBySitetypecategory(BigDecimal siteTypeCategoryId) throws SiteTypeDaoException;

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'siteTypeCategoryId = :siteTypeCategoryId'.
	 */
	public List<SiteType> findWhereSiteTypeCategoryIdEquals(BigDecimal siteTypeCategoryId) throws SiteTypeDaoException;

	/** 
	 * Returns all rows from the SiteType table that match the criteria ''.
	 */
	public List<SiteType> findAll() throws SiteTypeDaoException;

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'siteTypeId = :siteTypeId'.
	 */
	public List<SiteType> findWhereSiteTypeIdEquals(BigDecimal siteTypeId) throws SiteTypeDaoException;

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'description = :description'.
	 */
	public List<SiteType> findWhereDescriptionEquals(String description) throws SiteTypeDaoException;

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<SiteType> findWhereDateCreatedEquals(Date dateCreated) throws SiteTypeDaoException;

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<SiteType> findWhereCreatedByEquals(String createdBy) throws SiteTypeDaoException;

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<SiteType> findWhereDateModifiedEquals(Date dateModified) throws SiteTypeDaoException;

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<SiteType> findWhereModifiedByEquals(String modifiedBy) throws SiteTypeDaoException;

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'status = :status'.
	 */
	public List<SiteType> findWhereStatusEquals(int status) throws SiteTypeDaoException;

	/** 
	 * Returns the rows from the SiteType table that matches the specified primary-key value.
	 */
	public SiteType findByPrimaryKey(SiteTypePk pk) throws SiteTypeDaoException;

}
