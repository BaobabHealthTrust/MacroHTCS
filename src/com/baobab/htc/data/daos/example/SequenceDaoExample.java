package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.SequenceDao;
import com.baobab.htc.data.daos.dto.Sequence;
import com.baobab.htc.data.daos.exceptions.SequenceDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class SequenceDaoExample
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
		// findWhereIdEquals(null);
		// findWhereSequenceNameEquals("");
		// findWhereTableIdEquals(null);
		// findWhereIncrementEquals(0);
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
		SequenceDao dao = DaoFactory.createSequenceDao();
		List<Sequence> _result = dao.findAll();
		for (Sequence dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereIdEquals'
	 * 
	 * @param id
	 * @throws Exception
	 */
	public static void findWhereIdEquals(BigDecimal id) throws Exception
	{
		SequenceDao dao = DaoFactory.createSequenceDao();
		List<Sequence> _result = dao.findWhereIdEquals(id);
		for (Sequence dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSequenceNameEquals'
	 * 
	 * @param sequenceName
	 * @throws Exception
	 */
	public static void findWhereSequenceNameEquals(String sequenceName) throws Exception
	{
		SequenceDao dao = DaoFactory.createSequenceDao();
		List<Sequence> _result = dao.findWhereSequenceNameEquals(sequenceName);
		for (Sequence dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereTableIdEquals'
	 * 
	 * @param tableId
	 * @throws Exception
	 */
	public static void findWhereTableIdEquals(BigDecimal tableId) throws Exception
	{
		SequenceDao dao = DaoFactory.createSequenceDao();
		List<Sequence> _result = dao.findWhereTableIdEquals(tableId);
		for (Sequence dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereIncrementEquals'
	 * 
	 * @param increment
	 * @throws Exception
	 */
	public static void findWhereIncrementEquals(int increment) throws Exception
	{
		SequenceDao dao = DaoFactory.createSequenceDao();
		List<Sequence> _result = dao.findWhereIncrementEquals(increment);
		for (Sequence dto : _result) {
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
		SequenceDao dao = DaoFactory.createSequenceDao();
		List<Sequence> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (Sequence dto : _result) {
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
		SequenceDao dao = DaoFactory.createSequenceDao();
		List<Sequence> _result = dao.findWhereCreatedByEquals(createdBy);
		for (Sequence dto : _result) {
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
		SequenceDao dao = DaoFactory.createSequenceDao();
		List<Sequence> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (Sequence dto : _result) {
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
		SequenceDao dao = DaoFactory.createSequenceDao();
		List<Sequence> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (Sequence dto : _result) {
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
		SequenceDao dao = DaoFactory.createSequenceDao();
		List<Sequence> _result = dao.findWhereStatusEquals(status);
		for (Sequence dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Sequence dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getId() );
		buf.append( ", " );
		buf.append( dto.getSequenceName() );
		buf.append( ", " );
		buf.append( dto.getTableId() );
		buf.append( ", " );
		buf.append( dto.getIncrement() );
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
