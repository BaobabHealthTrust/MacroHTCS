package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.TestingTypeCategoryDao;
import com.baobab.htc.data.daos.dto.TestingTypeCategory;
import com.baobab.htc.data.daos.exceptions.TestingTypeCategoryDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class TestingTypeCategoryDaoExample
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
		// findWhereTestingTypeCategoryIdEquals(null);
		// findWhereDescriptionEquals("");
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
		TestingTypeCategoryDao dao = DaoFactory.createTestingTypeCategoryDao();
		List<TestingTypeCategory> _result = dao.findAll();
		for (TestingTypeCategory dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereTestingTypeCategoryIdEquals'
	 * 
	 * @param testingTypeCategoryId
	 * @throws Exception
	 */
	public static void findWhereTestingTypeCategoryIdEquals(BigDecimal testingTypeCategoryId) throws Exception
	{
		TestingTypeCategoryDao dao = DaoFactory.createTestingTypeCategoryDao();
		List<TestingTypeCategory> _result = dao.findWhereTestingTypeCategoryIdEquals(testingTypeCategoryId);
		for (TestingTypeCategory dto : _result) {
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
		TestingTypeCategoryDao dao = DaoFactory.createTestingTypeCategoryDao();
		List<TestingTypeCategory> _result = dao.findWhereDescriptionEquals(description);
		for (TestingTypeCategory dto : _result) {
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
		TestingTypeCategoryDao dao = DaoFactory.createTestingTypeCategoryDao();
		List<TestingTypeCategory> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (TestingTypeCategory dto : _result) {
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
		TestingTypeCategoryDao dao = DaoFactory.createTestingTypeCategoryDao();
		List<TestingTypeCategory> _result = dao.findWhereCreatedByEquals(createdBy);
		for (TestingTypeCategory dto : _result) {
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
		TestingTypeCategoryDao dao = DaoFactory.createTestingTypeCategoryDao();
		List<TestingTypeCategory> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (TestingTypeCategory dto : _result) {
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
		TestingTypeCategoryDao dao = DaoFactory.createTestingTypeCategoryDao();
		List<TestingTypeCategory> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (TestingTypeCategory dto : _result) {
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
		TestingTypeCategoryDao dao = DaoFactory.createTestingTypeCategoryDao();
		List<TestingTypeCategory> _result = dao.findWhereStatusEquals(status);
		for (TestingTypeCategory dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(TestingTypeCategory dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getTestingTypeCategoryId() );
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
