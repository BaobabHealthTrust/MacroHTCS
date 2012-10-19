package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.PeriodDao;
import com.baobab.htc.data.daos.dto.Period;
import com.baobab.htc.data.daos.exceptions.PeriodDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class PeriodDaoExample
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
		
		// findWhereStartingEquals(null);
		// findAll();
		// findWherePeriodIdEquals(null);
		// findWherePeriodEquals(0);
		// findWhereBeginningEquals(null);
		// findWhereEndingEquals(null);
		// findWhereDateCreatedEquals(null);
		// findWhereCreatedByEquals("");
		// findWhereDateModifiedEquals(null);
		// findWhereModifiedByEquals("");
		// findWhereStatusEquals(0);
	}

	/**
	 * Method 'findWhereStartingEquals'
	 * 
	 * @param starting
	 * @throws Exception
	 */
	public static void findWhereStartingEquals(Date starting) throws Exception
	{
		PeriodDao dao = DaoFactory.createPeriodDao();
		List<Period> _result = dao.findWhereStartingEquals(starting);
		for (Period dto : _result) {
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
		PeriodDao dao = DaoFactory.createPeriodDao();
		List<Period> _result = dao.findAll();
		for (Period dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWherePeriodIdEquals'
	 * 
	 * @param periodId
	 * @throws Exception
	 */
	public static void findWherePeriodIdEquals(BigDecimal periodId) throws Exception
	{
		PeriodDao dao = DaoFactory.createPeriodDao();
		List<Period> _result = dao.findWherePeriodIdEquals(periodId);
		for (Period dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWherePeriodEquals'
	 * 
	 * @param period
	 * @throws Exception
	 */
	public static void findWherePeriodEquals(int period) throws Exception
	{
		PeriodDao dao = DaoFactory.createPeriodDao();
		List<Period> _result = dao.findWherePeriodEquals(period);
		for (Period dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereBeginningEquals'
	 * 
	 * @param beginning
	 * @throws Exception
	 */
	public static void findWhereBeginningEquals(Date beginning) throws Exception
	{
		PeriodDao dao = DaoFactory.createPeriodDao();
		List<Period> _result = dao.findWhereBeginningEquals(beginning);
		for (Period dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereEndingEquals'
	 * 
	 * @param ending
	 * @throws Exception
	 */
	public static void findWhereEndingEquals(Date ending) throws Exception
	{
		PeriodDao dao = DaoFactory.createPeriodDao();
		List<Period> _result = dao.findWhereEndingEquals(ending);
		for (Period dto : _result) {
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
		PeriodDao dao = DaoFactory.createPeriodDao();
		List<Period> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (Period dto : _result) {
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
		PeriodDao dao = DaoFactory.createPeriodDao();
		List<Period> _result = dao.findWhereCreatedByEquals(createdBy);
		for (Period dto : _result) {
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
		PeriodDao dao = DaoFactory.createPeriodDao();
		List<Period> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (Period dto : _result) {
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
		PeriodDao dao = DaoFactory.createPeriodDao();
		List<Period> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (Period dto : _result) {
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
		PeriodDao dao = DaoFactory.createPeriodDao();
		List<Period> _result = dao.findWhereStatusEquals(status);
		for (Period dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Period dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getPeriodId() );
		buf.append( ", " );
		buf.append( dto.getPeriod() );
		buf.append( ", " );
		buf.append( dto.getEnding() );
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
		buf.append( dto.getBeginning() );
		System.out.println( buf.toString() );
	}

}
