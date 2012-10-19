package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the SessionSymptom table.
 */
public class SessionSymptomPk implements Serializable
{
	protected long sessionSymptomId;

	/** 
	 * This attribute represents whether the primitive attribute sessionSymptomId is null.
	 */
	protected boolean sessionSymptomIdNull;

	/** 
	 * Sets the value of sessionSymptomId
	 */
	public void setSessionSymptomId(long sessionSymptomId)
	{
		this.sessionSymptomId = sessionSymptomId;
	}

	/** 
	 * Gets the value of sessionSymptomId
	 */
	public long getSessionSymptomId()
	{
		return sessionSymptomId;
	}

	/**
	 * Method 'SessionSymptomPk'
	 * 
	 */
	public SessionSymptomPk()
	{
	}

	/**
	 * Method 'SessionSymptomPk'
	 * 
	 * @param sessionSymptomId
	 */
	public SessionSymptomPk(final long sessionSymptomId)
	{
		this.sessionSymptomId = sessionSymptomId;
	}

	/** 
	 * Sets the value of sessionSymptomIdNull
	 */
	public void setSessionSymptomIdNull(boolean sessionSymptomIdNull)
	{
		this.sessionSymptomIdNull = sessionSymptomIdNull;
	}

	/** 
	 * Gets the value of sessionSymptomIdNull
	 */
	public boolean isSessionSymptomIdNull()
	{
		return sessionSymptomIdNull;
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
		
		if (!(_other instanceof SessionSymptomPk)) {
			return false;
		}
		
		final SessionSymptomPk _cast = (SessionSymptomPk) _other;
		if (sessionSymptomId != _cast.sessionSymptomId) {
			return false;
		}
		
		if (sessionSymptomIdNull != _cast.sessionSymptomIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (sessionSymptomId ^ (sessionSymptomId >>> 32));
		_hashCode = 29 * _hashCode + (sessionSymptomIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.SessionSymptomPk: " );
		ret.append( "sessionSymptomId=" + sessionSymptomId );
		return ret.toString();
	}

}
