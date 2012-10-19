package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.SiteDao;
import com.baobab.htc.data.daos.dto.Site;
import com.baobab.htc.data.daos.exceptions.SiteDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class SiteDaoExample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findBySitetype(null);
		// findByDistrict(null);
		// findWhereDistrictIdEquals(null);
		// findAll();
		// findBySiteType(null);
		// findByTraditionalAuthority(null);
		// findWhereSiteIdEquals(null);
		// findWhereNameEquals("");
		// findWhereTraditionalAuthorityIdEquals(null);
		// findWhereSiteTypeIdEquals(null);
		// findWhereDateCreatedEquals(null);
		// findWhereCreatedByEquals("");
		// findWhereDateModifiedEquals(null);
		// findWhereModifiedByEquals("");
		// findWhereStatusEquals(0);
	}

	/**
	 * Method 'findBySitetype'
	 * 
	 * @param siteTypeId
	 * @throws Exception
	 */
	public static void findBySitetype(BigDecimal siteTypeId) throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findBySitetype(siteTypeId);
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findByDistrict'
	 * 
	 * @param districtId
	 * @throws Exception
	 */
	public static void findByDistrict(BigDecimal districtId) throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findByDistrict(districtId);
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereDistrictIdEquals'
	 * 
	 * @param districtId
	 * @throws Exception
	 */
	public static void findWhereDistrictIdEquals(BigDecimal districtId) throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findWhereDistrictIdEquals(districtId);
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findAll'
	 * 
	 * @throws Exception
	 */
	public static void findAll() throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findAll();
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findBySiteType'
	 * 
	 * @param siteTypeId
	 * @throws Exception
	 */
	public static void findBySiteType(BigDecimal siteTypeId) throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findBySiteType(siteTypeId);
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findByTraditionalAuthority'
	 * 
	 * @param traditionalAuthorityId
	 * @throws Exception
	 */
	public static void findByTraditionalAuthority(BigDecimal traditionalAuthorityId) throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findByTraditionalAuthority(traditionalAuthorityId);
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSiteIdEquals'
	 * 
	 * @param siteId
	 * @throws Exception
	 */
	public static void findWhereSiteIdEquals(BigDecimal siteId) throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findWhereSiteIdEquals(siteId);
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereNameEquals'
	 * 
	 * @param name
	 * @throws Exception
	 */
	public static void findWhereNameEquals(String name) throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findWhereNameEquals(name);
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereTraditionalAuthorityIdEquals'
	 * 
	 * @param traditionalAuthorityId
	 * @throws Exception
	 */
	public static void findWhereTraditionalAuthorityIdEquals(BigDecimal traditionalAuthorityId) throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findWhereTraditionalAuthorityIdEquals(traditionalAuthorityId);
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSiteTypeIdEquals'
	 * 
	 * @param siteTypeId
	 * @throws Exception
	 */
	public static void findWhereSiteTypeIdEquals(BigDecimal siteTypeId) throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findWhereSiteTypeIdEquals(siteTypeId);
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereDateCreatedEquals'
	 * 
	 * @param dateCreated
	 * @throws Exception
	 */
	public static void findWhereDateCreatedEquals(Date dateCreated) throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereCreatedByEquals'
	 * 
	 * @param createdBy
	 * @throws Exception
	 */
	public static void findWhereCreatedByEquals(String createdBy) throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findWhereCreatedByEquals(createdBy);
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereDateModifiedEquals'
	 * 
	 * @param dateModified
	 * @throws Exception
	 */
	public static void findWhereDateModifiedEquals(Date dateModified) throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereModifiedByEquals'
	 * 
	 * @param modifiedBy
	 * @throws Exception
	 */
	public static void findWhereModifiedByEquals(String modifiedBy) throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereStatusEquals'
	 * 
	 * @param status
	 * @throws Exception
	 */
	public static void findWhereStatusEquals(int status) throws Exception
	{
		SiteDao dao = DaoFactory.createSiteDao();
		List<Site> _result = dao.findWhereStatusEquals(status);
		for (Site dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Site dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getSiteId() );
		buf.append( ", " );
		buf.append( dto.getName() );
		buf.append( ", " );
		buf.append( dto.getSiteTypeId() );
		buf.append( ", " );
		buf.append( dto.getDateCreated() );
		buf.append( ", " );
		buf.append( dto.getCreatedBy() );
		buf.append( ", " );
		buf.append( dto.getDateModified() );
		buf.append( ", " );
		buf.append( dto.getModifiedBy() );
		buf.append( ", " );
		buf.append( dto.getStatus() );
		buf.append( ", " );
		buf.append( dto.getTraditionalAuthorityId() );
		System.out.println( buf.toString() );
	}

}
