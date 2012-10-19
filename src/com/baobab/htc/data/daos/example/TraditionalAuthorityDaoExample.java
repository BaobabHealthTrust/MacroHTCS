package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.TraditionalAuthorityDao;
import com.baobab.htc.data.daos.dto.TraditionalAuthority;
import com.baobab.htc.data.daos.exceptions.TraditionalAuthorityDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class TraditionalAuthorityDaoExample
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
		// findByDistrict(null);
		// findWhereTraditionalAuthorityIdEquals(null);
		// findWhereNameEquals("");
		// findWhereDistrictIdEquals(null);
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
		TraditionalAuthorityDao dao = DaoFactory.createTraditionalAuthorityDao();
		List<TraditionalAuthority> _result = dao.findAll();
		for (TraditionalAuthority dto : _result) {
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
		TraditionalAuthorityDao dao = DaoFactory.createTraditionalAuthorityDao();
		List<TraditionalAuthority> _result = dao.findByDistrict(districtId);
		for (TraditionalAuthority dto : _result) {
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
		TraditionalAuthorityDao dao = DaoFactory.createTraditionalAuthorityDao();
		List<TraditionalAuthority> _result = dao.findWhereTraditionalAuthorityIdEquals(traditionalAuthorityId);
		for (TraditionalAuthority dto : _result) {
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
		TraditionalAuthorityDao dao = DaoFactory.createTraditionalAuthorityDao();
		List<TraditionalAuthority> _result = dao.findWhereNameEquals(name);
		for (TraditionalAuthority dto : _result) {
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
		TraditionalAuthorityDao dao = DaoFactory.createTraditionalAuthorityDao();
		List<TraditionalAuthority> _result = dao.findWhereDistrictIdEquals(districtId);
		for (TraditionalAuthority dto : _result) {
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
		TraditionalAuthorityDao dao = DaoFactory.createTraditionalAuthorityDao();
		List<TraditionalAuthority> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (TraditionalAuthority dto : _result) {
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
		TraditionalAuthorityDao dao = DaoFactory.createTraditionalAuthorityDao();
		List<TraditionalAuthority> _result = dao.findWhereCreatedByEquals(createdBy);
		for (TraditionalAuthority dto : _result) {
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
		TraditionalAuthorityDao dao = DaoFactory.createTraditionalAuthorityDao();
		List<TraditionalAuthority> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (TraditionalAuthority dto : _result) {
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
		TraditionalAuthorityDao dao = DaoFactory.createTraditionalAuthorityDao();
		List<TraditionalAuthority> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (TraditionalAuthority dto : _result) {
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
		TraditionalAuthorityDao dao = DaoFactory.createTraditionalAuthorityDao();
		List<TraditionalAuthority> _result = dao.findWhereStatusEquals(status);
		for (TraditionalAuthority dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(TraditionalAuthority dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getTraditionalAuthorityId() );
		buf.append( ", " );
		buf.append( dto.getName() );
		buf.append( ", " );
		buf.append( dto.getDistrictId() );
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
