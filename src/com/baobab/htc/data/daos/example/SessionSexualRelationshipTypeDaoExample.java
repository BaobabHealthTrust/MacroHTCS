package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.SessionSexualRelationshipTypeDao;
import com.baobab.htc.data.daos.dto.SessionSexualRelationshipType;
import com.baobab.htc.data.daos.exceptions.SessionSexualRelationshipTypeDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class SessionSexualRelationshipTypeDaoExample
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
		
		// findBySexualRelationShipType(null);
		// findAll();
		// findBySession("");
		// findBySexualRelationshipType(null);
		// findWhereSessionSexualRelationshipTypeIdEquals(null);
		// findWhereSessionReferenceEquals("");
		// findWhereSexualRelationshipTypeIdEquals(null);
		// findWhereDateCreatedEquals(null);
		// findWhereCreatedByEquals("");
		// findWhereDateModifiedEquals(null);
		// findWhereModifiedByEquals("");
		// findWhereStatusEquals(0);
	}

	/**
	 * Method 'findBySexualRelationShipType'
	 * 
	 * @param sexualRelationshipTypeId
	 * @throws Exception
	 */
	public static void findBySexualRelationShipType(BigDecimal sexualRelationshipTypeId) throws Exception
	{
		SessionSexualRelationshipTypeDao dao = DaoFactory.createSessionSexualRelationshipTypeDao();
		List<SessionSexualRelationshipType> _result = dao.findBySexualRelationShipType(sexualRelationshipTypeId);
		for (SessionSexualRelationshipType dto : _result) {
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
		SessionSexualRelationshipTypeDao dao = DaoFactory.createSessionSexualRelationshipTypeDao();
		List<SessionSexualRelationshipType> _result = dao.findAll();
		for (SessionSexualRelationshipType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findBySession'
	 * 
	 * @param sessionReference
	 * @throws Exception
	 */
	public static void findBySession(String sessionReference) throws Exception
	{
		SessionSexualRelationshipTypeDao dao = DaoFactory.createSessionSexualRelationshipTypeDao();
		List<SessionSexualRelationshipType> _result = dao.findBySession(sessionReference);
		for (SessionSexualRelationshipType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findBySexualRelationshipType'
	 * 
	 * @param sexualRelationshipTypeId
	 * @throws Exception
	 */
	public static void findBySexualRelationshipType(BigDecimal sexualRelationshipTypeId) throws Exception
	{
		SessionSexualRelationshipTypeDao dao = DaoFactory.createSessionSexualRelationshipTypeDao();
		List<SessionSexualRelationshipType> _result = dao.findBySexualRelationshipType(sexualRelationshipTypeId);
		for (SessionSexualRelationshipType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSessionSexualRelationshipTypeIdEquals'
	 * 
	 * @param sessionSexualRelationshipTypeId
	 * @throws Exception
	 */
	public static void findWhereSessionSexualRelationshipTypeIdEquals(BigDecimal sessionSexualRelationshipTypeId) throws Exception
	{
		SessionSexualRelationshipTypeDao dao = DaoFactory.createSessionSexualRelationshipTypeDao();
		List<SessionSexualRelationshipType> _result = dao.findWhereSessionSexualRelationshipTypeIdEquals(sessionSexualRelationshipTypeId);
		for (SessionSexualRelationshipType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSessionReferenceEquals'
	 * 
	 * @param sessionReference
	 * @throws Exception
	 */
	public static void findWhereSessionReferenceEquals(String sessionReference) throws Exception
	{
		SessionSexualRelationshipTypeDao dao = DaoFactory.createSessionSexualRelationshipTypeDao();
		List<SessionSexualRelationshipType> _result = dao.findWhereSessionReferenceEquals(sessionReference);
		for (SessionSexualRelationshipType dto : _result) {
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
		SessionSexualRelationshipTypeDao dao = DaoFactory.createSessionSexualRelationshipTypeDao();
		List<SessionSexualRelationshipType> _result = dao.findWhereSexualRelationshipTypeIdEquals(sexualRelationshipTypeId);
		for (SessionSexualRelationshipType dto : _result) {
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
		SessionSexualRelationshipTypeDao dao = DaoFactory.createSessionSexualRelationshipTypeDao();
		List<SessionSexualRelationshipType> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (SessionSexualRelationshipType dto : _result) {
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
		SessionSexualRelationshipTypeDao dao = DaoFactory.createSessionSexualRelationshipTypeDao();
		List<SessionSexualRelationshipType> _result = dao.findWhereCreatedByEquals(createdBy);
		for (SessionSexualRelationshipType dto : _result) {
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
		SessionSexualRelationshipTypeDao dao = DaoFactory.createSessionSexualRelationshipTypeDao();
		List<SessionSexualRelationshipType> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (SessionSexualRelationshipType dto : _result) {
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
		SessionSexualRelationshipTypeDao dao = DaoFactory.createSessionSexualRelationshipTypeDao();
		List<SessionSexualRelationshipType> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (SessionSexualRelationshipType dto : _result) {
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
		SessionSexualRelationshipTypeDao dao = DaoFactory.createSessionSexualRelationshipTypeDao();
		List<SessionSexualRelationshipType> _result = dao.findWhereStatusEquals(status);
		for (SessionSexualRelationshipType dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(SessionSexualRelationshipType dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getSessionSexualRelationshipTypeId() );
		buf.append( ", " );
		buf.append( dto.getSessionReference() );
		buf.append( ", " );
		buf.append( dto.getSexualRelationshipTypeId() );
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
