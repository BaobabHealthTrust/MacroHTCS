package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.SiteDao;
import com.baobab.htc.data.daos.dto.Site;
import com.baobab.htc.data.daos.dto.SitePk;
import com.baobab.htc.data.daos.exceptions.SiteDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface SiteDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SitePk
	 */
	public SitePk insert(Site dto);

	/** 
	 * Updates a single row in the Site table.
	 */
	public void update(SitePk pk, Site dto) throws SiteDaoException;

	/** 
	 * Deletes a single row in the Site table.
	 */
	public void delete(SitePk pk) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'siteId = :siteId'.
	 */
	public Site findByPrimaryKey(long siteId) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'siteTypeId = :siteTypeId'.
	 */
	public List<Site> findBySitetype(BigDecimal siteTypeId) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'districtId = :districtId'.
	 */
	public List<Site> findByDistrict(BigDecimal districtId) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'districtId = :districtId'.
	 */
	public List<Site> findWhereDistrictIdEquals(BigDecimal districtId) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria ''.
	 */
	public List<Site> findAll() throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'siteTypeId = :siteTypeId'.
	 */
	public List<Site> findBySiteType(BigDecimal siteTypeId) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'traditionalAuthorityId = :traditionalAuthorityId'.
	 */
	public List<Site> findByTraditionalAuthority(BigDecimal traditionalAuthorityId) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'siteId = :siteId'.
	 */
	public List<Site> findWhereSiteIdEquals(BigDecimal siteId) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'name = :name'.
	 */
	public List<Site> findWhereNameEquals(String name) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'traditionalAuthorityId = :traditionalAuthorityId'.
	 */
	public List<Site> findWhereTraditionalAuthorityIdEquals(BigDecimal traditionalAuthorityId) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'siteTypeId = :siteTypeId'.
	 */
	public List<Site> findWhereSiteTypeIdEquals(BigDecimal siteTypeId) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<Site> findWhereDateCreatedEquals(Date dateCreated) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<Site> findWhereCreatedByEquals(String createdBy) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<Site> findWhereDateModifiedEquals(Date dateModified) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<Site> findWhereModifiedByEquals(String modifiedBy) throws SiteDaoException;

	/** 
	 * Returns all rows from the Site table that match the criteria 'status = :status'.
	 */
	public List<Site> findWhereStatusEquals(int status) throws SiteDaoException;

	/** 
	 * Returns the rows from the Site table that matches the specified primary-key value.
	 */
	public Site findByPrimaryKey(SitePk pk) throws SiteDaoException;

}
