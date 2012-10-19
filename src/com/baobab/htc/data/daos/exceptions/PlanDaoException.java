package com.baobab.htc.data.daos.exceptions;

public class PlanDaoException extends DaoException
{
	/**
	 * Method 'PlanDaoException'
	 * 
	 * @param message
	 */
	public PlanDaoException(String message)
	{
		super(message);
	}

	/**
	 * Method 'PlanDaoException'
	 * 
	 * @param message
	 * @param cause
	 */
	public PlanDaoException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
