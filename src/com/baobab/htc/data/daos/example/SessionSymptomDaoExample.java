package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.SessionSymptomDao;
import com.baobab.htc.data.daos.dto.SessionSymptom;
import com.baobab.htc.data.daos.exceptions.SessionSymptomDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class SessionSymptomDaoExample
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
		// findBySession("");
		// findBySymptom(null);
		// findWhereSessionSymptomIdEquals(null);
		// findWhereSessionReferenceEquals("");
		// findWhereSymptomIdEquals(null);
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
		SessionSymptomDao dao = DaoFactory.createSessionSymptomDao();
		List<SessionSymptom> _result = dao.findAll();
		for (SessionSymptom dto : _result) {
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
		SessionSymptomDao dao = DaoFactory.createSessionSymptomDao();
		List<SessionSymptom> _result = dao.findBySession(sessionReference);
		for (SessionSymptom dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findBySymptom'
	 * 
	 * @param symptomId
	 * @throws Exception
	 */
	public static void findBySymptom(BigDecimal symptomId) throws Exception
	{
		SessionSymptomDao dao = DaoFactory.createSessionSymptomDao();
		List<SessionSymptom> _result = dao.findBySymptom(symptomId);
		for (SessionSymptom dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSessionSymptomIdEquals'
	 * 
	 * @param sessionSymptomId
	 * @throws Exception
	 */
	public static void findWhereSessionSymptomIdEquals(BigDecimal sessionSymptomId) throws Exception
	{
		SessionSymptomDao dao = DaoFactory.createSessionSymptomDao();
		List<SessionSymptom> _result = dao.findWhereSessionSymptomIdEquals(sessionSymptomId);
		for (SessionSymptom dto : _result) {
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
		SessionSymptomDao dao = DaoFactory.createSessionSymptomDao();
		List<SessionSymptom> _result = dao.findWhereSessionReferenceEquals(sessionReference);
		for (SessionSymptom dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSymptomIdEquals'
	 * 
	 * @param symptomId
	 * @throws Exception
	 */
	public static void findWhereSymptomIdEquals(BigDecimal symptomId) throws Exception
	{
		SessionSymptomDao dao = DaoFactory.createSessionSymptomDao();
		List<SessionSymptom> _result = dao.findWhereSymptomIdEquals(symptomId);
		for (SessionSymptom dto : _result) {
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
		SessionSymptomDao dao = DaoFactory.createSessionSymptomDao();
		List<SessionSymptom> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (SessionSymptom dto : _result) {
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
		SessionSymptomDao dao = DaoFactory.createSessionSymptomDao();
		List<SessionSymptom> _result = dao.findWhereCreatedByEquals(createdBy);
		for (SessionSymptom dto : _result) {
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
		SessionSymptomDao dao = DaoFactory.createSessionSymptomDao();
		List<SessionSymptom> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (SessionSymptom dto : _result) {
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
		SessionSymptomDao dao = DaoFactory.createSessionSymptomDao();
		List<SessionSymptom> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (SessionSymptom dto : _result) {
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
		SessionSymptomDao dao = DaoFactory.createSessionSymptomDao();
		List<SessionSymptom> _result = dao.findWhereStatusEquals(status);
		for (SessionSymptom dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(SessionSymptom dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getSessionSymptomId() );
		buf.append( ", " );
		buf.append( dto.getSessionReference() );
		buf.append( ", " );
		buf.append( dto.getSymptomId() );
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
