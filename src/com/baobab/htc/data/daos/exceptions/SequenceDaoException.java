package com.baobab.htc.data.daos.exceptions;

public class SequenceDaoException extends DaoException
{
	/**
	 * Method 'SequenceDaoException'
	 * 
	 * @param message
	 */
	public SequenceDaoException(String message)
	{
		super(message);
	}

	/**
	 * Method 'SequenceDaoException'
	 * 
	 * @param message
	 * @param cause
	 */
	public SequenceDaoException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
