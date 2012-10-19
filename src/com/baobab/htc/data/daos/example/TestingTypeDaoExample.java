package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.TestingTypeDao;
import com.baobab.htc.data.daos.dto.TestingType;
import com.baobab.htc.data.daos.exceptions.TestingTypeDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class TestingTypeDaoExample
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
		// findByTestingTypeCategory(null);
		// findWhereTestingTypeIdEquals(null);
		// findWhereDescriptionEquals("");
		// findWhereTestingTypeCategoryIdEquals(null);
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
		TestingTypeDao dao = DaoFactory.createTestingTypeDao();
		List<TestingType> _result = dao.findAll();
		for (TestingType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findByTestingTypeCategory'
	 * 
	 * @param testingTypeCategoryId
	 * @throws Exception
	 */
	public static void findByTestingTypeCategory(BigDecimal testingTypeCategoryId) throws Exception
	{
		TestingTypeDao dao = DaoFactory.createTestingTypeDao();
		List<TestingType> _result = dao.findByTestingTypeCategory(testingTypeCategoryId);
		for (TestingType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereTestingTypeIdEquals'
	 * 
	 * @param testingTypeId
	 * @throws Exception
	 */
	public static void findWhereTestingTypeIdEquals(BigDecimal testingTypeId) throws Exception
	{
		TestingTypeDao dao = DaoFactory.createTestingTypeDao();
		List<TestingType> _result = dao.findWhereTestingTypeIdEquals(testingTypeId);
		for (TestingType dto : _result) {
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
		TestingTypeDao dao = DaoFactory.createTestingTypeDao();
		List<TestingType> _result = dao.findWhereDescriptionEquals(description);
		for (TestingType dto : _result) {
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
		TestingTypeDao dao = DaoFactory.createTestingTypeDao();
		List<TestingType> _result = dao.findWhereTestingTypeCategoryIdEquals(testingTypeCategoryId);
		for (TestingType dto : _result) {
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
		TestingTypeDao dao = DaoFactory.createTestingTypeDao();
		List<TestingType> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (TestingType dto : _result) {
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
		TestingTypeDao dao = DaoFactory.createTestingTypeDao();
		List<TestingType> _result = dao.findWhereCreatedByEquals(createdBy);
		for (TestingType dto : _result) {
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
		TestingTypeDao dao = DaoFactory.createTestingTypeDao();
		List<TestingType> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (TestingType dto : _result) {
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
		TestingTypeDao dao = DaoFactory.createTestingTypeDao();
		List<TestingType> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (TestingType dto : _result) {
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
		TestingTypeDao dao = DaoFactory.createTestingTypeDao();
		List<TestingType> _result = dao.findWhereStatusEquals(status);
		for (TestingType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(TestingType dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getTestingTypeId() );
		buf.append( ", " );
		buf.append( dto.getDescription() );
		buf.append( ", " );
		buf.append( dto.getTestingTypeCategoryId() );
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
