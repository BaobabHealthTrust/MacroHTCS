package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the Session table.
 */
public class SessionPk implements Serializable
{
	protected String sessionReference;

	/** 
	 * Sets the value of sessionReference
	 */
	public void setSessionReference(String sessionReference)
	{
		this.sessionReference = sessionReference;
	}

	/** 
	 * Gets the value of sessionReference
	 */
	public String getSessionReference()
	{
		return sessionReference;
	}

	/**
	 * Method 'SessionPk'
	 * 
	 */
	public SessionPk()
	{
	}

	/**
	 * Method 'SessionPk'
	 * 
	 * @param sessionReference
	 */
	public SessionPk(final String sessionReference)
	{
		this.sessionReference = sessionReference;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof SessionPk)) {
			return false;
		}
		
		final SessionPk _cast = (SessionPk) _other;
		if (sessionReference == null ? _cast.sessionReference != sessionReference : !sessionReference.equals( _cast.sessionReference )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (sessionReference != null) {
			_hashCode = 29 * _hashCode + sessionReference.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.baobab.htc.data.daos.dto.SessionPk: " );
		ret.append( "sessionReference=" + sessionReference );
		return ret.toString();
	}

}
