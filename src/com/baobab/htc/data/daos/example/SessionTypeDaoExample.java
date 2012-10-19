package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.SessionTypeDao;
import com.baobab.htc.data.daos.dto.SessionType;
import com.baobab.htc.data.daos.exceptions.SessionTypeDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class SessionTypeDaoExample
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
		
		// findBySessiontypecategory(null);
		// findWhereSessionTypeCategoryIdEquals(null);
		// findAll();
		// findWhereSessionTypeIdEquals(null);
		// findWhereDescriptionEquals("");
		// findWhereDateCreatedEquals(null);
		// findWhereCreatedByEquals("");
		// findWhereDateModifiedEquals(null);
		// findWhereModifiedByEquals("");
		// findWhereStatusEquals(0);
	}

	/**
	 * Method 'findBySessiontypecategory'
	 * 
	 * @param sessionTypeCategoryId
	 * @throws Exception
	 */
	public static void findBySessiontypecategory(BigDecimal sessionTypeCategoryId) throws Exception
	{
		SessionTypeDao dao = DaoFactory.createSessionTypeDao();
		List<SessionType> _result = dao.findBySessiontypecategory(sessionTypeCategoryId);
		for (SessionType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSessionTypeCategoryIdEquals'
	 * 
	 * @param sessionTypeCategoryId
	 * @throws Exception
	 */
	public static void findWhereSessionTypeCategoryIdEquals(BigDecimal sessionTypeCategoryId) throws Exception
	{
		SessionTypeDao dao = DaoFactory.createSessionTypeDao();
		List<SessionType> _result = dao.findWhereSessionTypeCategoryIdEquals(sessionTypeCategoryId);
		for (SessionType dto : _result) {
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
		SessionTypeDao dao = DaoFactory.createSessionTypeDao();
		List<SessionType> _result = dao.findAll();
		for (SessionType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSessionTypeIdEquals'
	 * 
	 * @param sessionTypeId
	 * @throws Exception
	 */
	public static void findWhereSessionTypeIdEquals(BigDecimal sessionTypeId) throws Exception
	{
		SessionTypeDao dao = DaoFactory.createSessionTypeDao();
		List<SessionType> _result = dao.findWhereSessionTypeIdEquals(sessionTypeId);
		for (SessionType dto : _result) {
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
		SessionTypeDao dao = DaoFactory.createSessionTypeDao();
		List<SessionType> _result = dao.findWhereDescriptionEquals(description);
		for (SessionType dto : _result) {
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
		SessionTypeDao dao = DaoFactory.createSessionTypeDao();
		List<SessionType> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (SessionType dto : _result) {
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
		SessionTypeDao dao = DaoFactory.createSessionTypeDao();
		List<SessionType> _result = dao.findWhereCreatedByEquals(createdBy);
		for (SessionType dto : _result) {
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
		SessionTypeDao dao = DaoFactory.createSessionTypeDao();
		List<SessionType> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (SessionType dto : _result) {
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
		SessionTypeDao dao = DaoFactory.createSessionTypeDao();
		List<SessionType> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (SessionType dto : _result) {
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
		SessionTypeDao dao = DaoFactory.createSessionTypeDao();
		List<SessionType> _result = dao.findWhereStatusEquals(status);
		for (SessionType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(SessionType dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getSessionTypeId() );
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
