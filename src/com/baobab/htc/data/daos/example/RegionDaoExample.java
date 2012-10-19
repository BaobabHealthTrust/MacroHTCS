package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.RegionDao;
import com.baobab.htc.data.daos.dto.Region;
import com.baobab.htc.data.daos.exceptions.RegionDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class RegionDaoExample
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
		
		// findAll();
		// findWhereRegionIdEquals(null);
		// findWhereNameEquals("");
		// findWhereDateCreatedEquals(null);
		// findWhereCreatedByEquals("");
		// findWhereDateModifiedEquals(null);
		// findWhereModifiedByEquals("");
		// findWhereStatusEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 * @throws Exception
	 */
	public static void findAll() throws Exception
	{
		RegionDao dao = DaoFactory.createRegionDao();
		List<Region> _result = dao.findAll();
		for (Region dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereRegionIdEquals'
	 * 
	 * @param regionId
	 * @throws Exception
	 */
	public static void findWhereRegionIdEquals(BigDecimal regionId) throws Exception
	{
		RegionDao dao = DaoFactory.createRegionDao();
		List<Region> _result = dao.findWhereRegionIdEquals(regionId);
		for (Region dto : _result) {
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
		RegionDao dao = DaoFactory.createRegionDao();
		List<Region> _result = dao.findWhereNameEquals(name);
		for (Region dto : _result) {
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
		RegionDao dao = DaoFactory.createRegionDao();
		List<Region> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (Region dto : _result) {
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
		RegionDao dao = DaoFactory.createRegionDao();
		List<Region> _result = dao.findWhereCreatedByEquals(createdBy);
		for (Region dto : _result) {
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
		RegionDao dao = DaoFactory.createRegionDao();
		List<Region> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (Region dto : _result) {
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
		RegionDao dao = DaoFactory.createRegionDao();
		List<Region> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (Region dto : _result) {
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
		RegionDao dao = DaoFactory.createRegionDao();
		List<Region> _result = dao.findWhereStatusEquals(status);
		for (Region dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Region dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getRegionId() );
		buf.append( ", " );
		buf.append( dto.getName() );
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
