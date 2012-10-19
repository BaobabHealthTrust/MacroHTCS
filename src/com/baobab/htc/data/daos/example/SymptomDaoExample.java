package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.SymptomDao;
import com.baobab.htc.data.daos.dto.Symptom;
import com.baobab.htc.data.daos.exceptions.SymptomDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class SymptomDaoExample
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
		
		// findBySession("");
		// findWhereSessionReferenceEquals("");
		// findWhereSelectedValueEquals(0);
		// findAll();
		// findWhereSymptomIdEquals(null);
		// findWhereDescriptionEquals("");
		// findWhereDateCreatedEquals(null);
		// findWhereCreatedByEquals("");
		// findWhereDateModifiedEquals(null);
		// findWhereModifiedByEquals("");
		// findWhereStatusEquals(0);
	}

	/**
	 * Method 'findBySession'
	 * 
	 * @param sessionReference
	 * @throws Exception
	 */
	public static void findBySession(String sessionReference) throws Exception
	{
		SymptomDao dao = DaoFactory.createSymptomDao();
		List<Symptom> _result = dao.findBySession(sessionReference);
		for (Symptom dto : _result) {
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
		SymptomDao dao = DaoFactory.createSymptomDao();
		List<Symptom> _result = dao.findWhereSessionReferenceEquals(sessionReference);
		for (Symptom dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSelectedValueEquals'
	 * 
	 * @param selectedValue
	 * @throws Exception
	 */
	public static void findWhereSelectedValueEquals(int selectedValue) throws Exception
	{
		SymptomDao dao = DaoFactory.createSymptomDao();
		List<Symptom> _result = dao.findWhereSelectedValueEquals(selectedValue);
		for (Symptom dto : _result) {
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
		SymptomDao dao = DaoFactory.createSymptomDao();
		List<Symptom> _result = dao.findAll();
		for (Symptom dto : _result) {
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
		SymptomDao dao = DaoFactory.createSymptomDao();
		List<Symptom> _result = dao.findWhereSymptomIdEquals(symptomId);
		for (Symptom dto : _result) {
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
		SymptomDao dao = DaoFactory.createSymptomDao();
		List<Symptom> _result = dao.findWhereDescriptionEquals(description);
		for (Symptom dto : _result) {
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
		SymptomDao dao = DaoFactory.createSymptomDao();
		List<Symptom> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (Symptom dto : _result) {
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
		SymptomDao dao = DaoFactory.createSymptomDao();
		List<Symptom> _result = dao.findWhereCreatedByEquals(createdBy);
		for (Symptom dto : _result) {
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
		SymptomDao dao = DaoFactory.createSymptomDao();
		List<Symptom> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (Symptom dto : _result) {
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
		SymptomDao dao = DaoFactory.createSymptomDao();
		List<Symptom> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (Symptom dto : _result) {
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
		SymptomDao dao = DaoFactory.createSymptomDao();
		List<Symptom> _result = dao.findWhereStatusEquals(status);
		for (Symptom dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Symptom dto)
	{
		StringBuffer buf = new StringBuffer();
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
		buf.append( ", " );
		buf.append( dto.getDescription() );
		System.out.println( buf.toString() );
	}

}
