package com.baobab.htc.data.daos.exceptions;

public class SessionDaoException extends DaoException
{
	/**
	 * Method 'SessionDaoException'
	 * 
	 * @param message
	 */
	public SessionDaoException(String message)
	{
		super(message);
	}

	/**
	 * Method 'SessionDaoException'
	 * 
	 * @param message
	 * @param cause
	 */
	public SessionDaoException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
