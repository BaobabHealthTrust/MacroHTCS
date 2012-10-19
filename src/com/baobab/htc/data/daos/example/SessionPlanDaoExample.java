package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.SessionPlanDao;
import com.baobab.htc.data.daos.dto.SessionPlan;
import com.baobab.htc.data.daos.exceptions.SessionPlanDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class SessionPlanDaoExample
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
		// findByPlan(null);
		// findBySession("");
		// findWhereSessionPlanIdEquals(null);
		// findWhereSessionReferenceEquals("");
		// findWherePlanIdEquals(null);
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
		SessionPlanDao dao = DaoFactory.createSessionPlanDao();
		List<SessionPlan> _result = dao.findAll();
		for (SessionPlan dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findByPlan'
	 * 
	 * @param planId
	 * @throws Exception
	 */
	public static void findByPlan(BigDecimal planId) throws Exception
	{
		SessionPlanDao dao = DaoFactory.createSessionPlanDao();
		List<SessionPlan> _result = dao.findByPlan(planId);
		for (SessionPlan dto : _result) {
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
		SessionPlanDao dao = DaoFactory.createSessionPlanDao();
		List<SessionPlan> _result = dao.findBySession(sessionReference);
		for (SessionPlan dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSessionPlanIdEquals'
	 * 
	 * @param sessionPlanId
	 * @throws Exception
	 */
	public static void findWhereSessionPlanIdEquals(BigDecimal sessionPlanId) throws Exception
	{
		SessionPlanDao dao = DaoFactory.createSessionPlanDao();
		List<SessionPlan> _result = dao.findWhereSessionPlanIdEquals(sessionPlanId);
		for (SessionPlan dto : _result) {
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
		SessionPlanDao dao = DaoFactory.createSessionPlanDao();
		List<SessionPlan> _result = dao.findWhereSessionReferenceEquals(sessionReference);
		for (SessionPlan dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWherePlanIdEquals'
	 * 
	 * @param planId
	 * @throws Exception
	 */
	public static void findWherePlanIdEquals(BigDecimal planId) throws Exception
	{
		SessionPlanDao dao = DaoFactory.createSessionPlanDao();
		List<SessionPlan> _result = dao.findWherePlanIdEquals(planId);
		for (SessionPlan dto : _result) {
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
		SessionPlanDao dao = DaoFactory.createSessionPlanDao();
		List<SessionPlan> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (SessionPlan dto : _result) {
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
		SessionPlanDao dao = DaoFactory.createSessionPlanDao();
		List<SessionPlan> _result = dao.findWhereCreatedByEquals(createdBy);
		for (SessionPlan dto : _result) {
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
		SessionPlanDao dao = DaoFactory.createSessionPlanDao();
		List<SessionPlan> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (SessionPlan dto : _result) {
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
		SessionPlanDao dao = DaoFactory.createSessionPlanDao();
		List<SessionPlan> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (SessionPlan dto : _result) {
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
		SessionPlanDao dao = DaoFactory.createSessionPlanDao();
		List<SessionPlan> _result = dao.findWhereStatusEquals(status);
		for (SessionPlan dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(SessionPlan dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getSessionPlanId() );
		buf.append( ", " );
		buf.append( dto.getSessionReference() );
		buf.append( ", " );
		buf.append( dto.getPlanId() );
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
