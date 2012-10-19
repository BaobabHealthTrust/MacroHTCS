package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.SiteTypeDao;
import com.baobab.htc.data.daos.dto.SiteType;
import com.baobab.htc.data.daos.exceptions.SiteTypeDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class SiteTypeDaoExample
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
		
		// findBySitetypecategory(null);
		// findWhereSiteTypeCategoryIdEquals(null);
		// findAll();
		// findWhereSiteTypeIdEquals(null);
		// findWhereDescriptionEquals("");
		// findWhereDateCreatedEquals(null);
		// findWhereCreatedByEquals("");
		// findWhereDateModifiedEquals(null);
		// findWhereModifiedByEquals("");
		// findWhereStatusEquals(0);
	}

	/**
	 * Method 'findBySitetypecategory'
	 * 
	 * @param siteTypeCategoryId
	 * @throws Exception
	 */
	public static void findBySitetypecategory(BigDecimal siteTypeCategoryId) throws Exception
	{
		SiteTypeDao dao = DaoFactory.createSiteTypeDao();
		List<SiteType> _result = dao.findBySitetypecategory(siteTypeCategoryId);
		for (SiteType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSiteTypeCategoryIdEquals'
	 * 
	 * @param siteTypeCategoryId
	 * @throws Exception
	 */
	public static void findWhereSiteTypeCategoryIdEquals(BigDecimal siteTypeCategoryId) throws Exception
	{
		SiteTypeDao dao = DaoFactory.createSiteTypeDao();
		List<SiteType> _result = dao.findWhereSiteTypeCategoryIdEquals(siteTypeCategoryId);
		for (SiteType dto : _result) {
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
		SiteTypeDao dao = DaoFactory.createSiteTypeDao();
		List<SiteType> _result = dao.findAll();
		for (SiteType dto : _result) {
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
		SiteTypeDao dao = DaoFactory.createSiteTypeDao();
		List<SiteType> _result = dao.findWhereSiteTypeIdEquals(siteTypeId);
		for (SiteType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereDescriptionEquals'
	 * 
	 * @param description
	 * @throws Exception
	 */
	public static void findWhereDescriptionEquals(String description) throws Exception
	{
		SiteTypeDao dao = DaoFactory.createSiteTypeDao();
		List<SiteType> _result = dao.findWhereDescriptionEquals(description);
		for (SiteType dto : _result) {
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
		SiteTypeDao dao = DaoFactory.createSiteTypeDao();
		List<SiteType> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (SiteType dto : _result) {
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
		SiteTypeDao dao = DaoFactory.createSiteTypeDao();
		List<SiteType> _result = dao.findWhereCreatedByEquals(createdBy);
		for (SiteType dto : _result) {
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
		SiteTypeDao dao = DaoFactory.createSiteTypeDao();
		List<SiteType> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (SiteType dto : _result) {
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
		SiteTypeDao dao = DaoFactory.createSiteTypeDao();
		List<SiteType> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (SiteType dto : _result) {
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
		SiteTypeDao dao = DaoFactory.createSiteTypeDao();
		List<SiteType> _result = dao.findWhereStatusEquals(status);
		for (SiteType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(SiteType dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getSiteTypeId() );
		buf.append( ", " );
		buf.append( dto.getDescription() );
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
		System.out.println( buf.toString() );
	}

}
