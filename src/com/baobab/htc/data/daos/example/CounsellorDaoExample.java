package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.CounsellorDao;
import com.baobab.htc.data.daos.dto.Counsellor;
import com.baobab.htc.data.daos.exceptions.CounsellorDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class CounsellorDaoExample
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
		// findWhereCounsellorIdEquals(null);
		// findWhereNameEquals("");
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
		CounsellorDao dao = DaoFactory.createCounsellorDao();
		List<Counsellor> _result = dao.findAll();
		for (Counsellor dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereCounsellorIdEquals'
	 * 
	 * @param counsellorId
	 * @throws Exception
	 */
	public static void findWhereCounsellorIdEquals(BigDecimal counsellorId) throws Exception
	{
		CounsellorDao dao = DaoFactory.createCounsellorDao();
		List<Counsellor> _result = dao.findWhereCounsellorIdEquals(counsellorId);
		for (Counsellor dto : _result) {
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
		CounsellorDao dao = DaoFactory.createCounsellorDao();
		List<Counsellor> _result = dao.findWhereNameEquals(name);
		for (Counsellor dto : _result) {
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
		CounsellorDao dao = DaoFactory.createCounsellorDao();
		List<Counsellor> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (Counsellor dto : _result) {
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
		CounsellorDao dao = DaoFactory.createCounsellorDao();
		List<Counsellor> _result = dao.findWhereCreatedByEquals(createdBy);
		for (Counsellor dto : _result) {
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
		CounsellorDao dao = DaoFactory.createCounsellorDao();
		List<Counsellor> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (Counsellor dto : _result) {
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
		CounsellorDao dao = DaoFactory.createCounsellorDao();
		List<Counsellor> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (Counsellor dto : _result) {
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
		CounsellorDao dao = DaoFactory.createCounsellorDao();
		List<Counsellor> _result = dao.findWhereStatusEquals(status);
		for (Counsellor dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Counsellor dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getCounsellorId() );
		buf.append( ", " );
		buf.append( dto.getName() );
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
