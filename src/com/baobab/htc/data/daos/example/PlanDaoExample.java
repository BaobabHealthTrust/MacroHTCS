package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.PlanDao;
import com.baobab.htc.data.daos.dto.Plan;
import com.baobab.htc.data.daos.exceptions.PlanDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class PlanDaoExample
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
		// findWherePlanIdEquals(null);
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
		PlanDao dao = DaoFactory.createPlanDao();
		List<Plan> _result = dao.findAll();
		for (Plan dto : _result) {
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
		PlanDao dao = DaoFactory.createPlanDao();
		List<Plan> _result = dao.findWherePlanIdEquals(planId);
		for (Plan dto : _result) {
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
		PlanDao dao = DaoFactory.createPlanDao();
		List<Plan> _result = dao.findWhereDescriptionEquals(description);
		for (Plan dto : _result) {
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
		PlanDao dao = DaoFactory.createPlanDao();
		List<Plan> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (Plan dto : _result) {
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
		PlanDao dao = DaoFactory.createPlanDao();
		List<Plan> _result = dao.findWhereCreatedByEquals(createdBy);
		for (Plan dto : _result) {
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
		PlanDao dao = DaoFactory.createPlanDao();
		List<Plan> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (Plan dto : _result) {
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
		PlanDao dao = DaoFactory.createPlanDao();
		List<Plan> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (Plan dto : _result) {
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
		PlanDao dao = DaoFactory.createPlanDao();
		List<Plan> _result = dao.findWhereStatusEquals(status);
		for (Plan dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Plan dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getPlanId() );
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
