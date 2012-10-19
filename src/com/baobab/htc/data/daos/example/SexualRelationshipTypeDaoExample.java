package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.SexualRelationshipTypeDao;
import com.baobab.htc.data.daos.dto.SexualRelationshipType;
import com.baobab.htc.data.daos.exceptions.SexualRelationshipTypeDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class SexualRelationshipTypeDaoExample
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
		// findWhereSexualRelationshipTypeIdEquals(null);
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
		SexualRelationshipTypeDao dao = DaoFactory.createSexualRelationshipTypeDao();
		List<SexualRelationshipType> _result = dao.findAll();
		for (SexualRelationshipType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSexualRelationshipTypeIdEquals'
	 * 
	 * @param sexualRelationshipTypeId
	 * @throws Exception
	 */
	public static void findWhereSexualRelationshipTypeIdEquals(BigDecimal sexualRelationshipTypeId) throws Exception
	{
		SexualRelationshipTypeDao dao = DaoFactory.createSexualRelationshipTypeDao();
		List<SexualRelationshipType> _result = dao.findWhereSexualRelationshipTypeIdEquals(sexualRelationshipTypeId);
		for (SexualRelationshipType dto : _result) {
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
		SexualRelationshipTypeDao dao = DaoFactory.createSexualRelationshipTypeDao();
		List<SexualRelationshipType> _result = dao.findWhereDescriptionEquals(description);
		for (SexualRelationshipType dto : _result) {
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
		SexualRelationshipTypeDao dao = DaoFactory.createSexualRelationshipTypeDao();
		List<SexualRelationshipType> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (SexualRelationshipType dto : _result) {
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
		SexualRelationshipTypeDao dao = DaoFactory.createSexualRelationshipTypeDao();
		List<SexualRelationshipType> _result = dao.findWhereCreatedByEquals(createdBy);
		for (SexualRelationshipType dto : _result) {
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
		SexualRelationshipTypeDao dao = DaoFactory.createSexualRelationshipTypeDao();
		List<SexualRelationshipType> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (SexualRelationshipType dto : _result) {
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
		SexualRelationshipTypeDao dao = DaoFactory.createSexualRelationshipTypeDao();
		List<SexualRelationshipType> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (SexualRelationshipType dto : _result) {
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
		SexualRelationshipTypeDao dao = DaoFactory.createSexualRelationshipTypeDao();
		List<SexualRelationshipType> _result = dao.findWhereStatusEquals(status);
		for (SexualRelationshipType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(SexualRelationshipType dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getSexualRelationshipTypeId() );
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
