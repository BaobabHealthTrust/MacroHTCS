package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.DistrictDao;
import com.baobab.htc.data.daos.dto.District;
import com.baobab.htc.data.daos.exceptions.DistrictDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class DistrictDaoExample
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
		// findByRegion(null);
		// findWhereDistrictIdEquals(null);
		// findWhereNameEquals("");
		// findWhereRegionIdEquals(null);
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
		DistrictDao dao = DaoFactory.createDistrictDao();
		List<District> _result = dao.findAll();
		for (District dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findByRegion'
	 * 
	 * @param regionId
	 * @throws Exception
	 */
	public static void findByRegion(BigDecimal regionId) throws Exception
	{
		DistrictDao dao = DaoFactory.createDistrictDao();
		List<District> _result = dao.findByRegion(regionId);
		for (District dto : _result) {
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
		DistrictDao dao = DaoFactory.createDistrictDao();
		List<District> _result = dao.findWhereDistrictIdEquals(districtId);
		for (District dto : _result) {
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
		DistrictDao dao = DaoFactory.createDistrictDao();
		List<District> _result = dao.findWhereNameEquals(name);
		for (District dto : _result) {
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
		DistrictDao dao = DaoFactory.createDistrictDao();
		List<District> _result = dao.findWhereRegionIdEquals(regionId);
		for (District dto : _result) {
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
		DistrictDao dao = DaoFactory.createDistrictDao();
		List<District> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (District dto : _result) {
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
		DistrictDao dao = DaoFactory.createDistrictDao();
		List<District> _result = dao.findWhereCreatedByEquals(createdBy);
		for (District dto : _result) {
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
		DistrictDao dao = DaoFactory.createDistrictDao();
		List<District> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (District dto : _result) {
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
		DistrictDao dao = DaoFactory.createDistrictDao();
		List<District> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (District dto : _result) {
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
		DistrictDao dao = DaoFactory.createDistrictDao();
		List<District> _result = dao.findWhereStatusEquals(status);
		for (District dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(District dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getDistrictId() );
		buf.append( ", " );
		buf.append( dto.getName() );
		buf.append( ", " );
		buf.append( dto.getRegionId() );
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
