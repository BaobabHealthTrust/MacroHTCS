package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the SessionType table.
 */
public class SessionTypePk implements Serializable
{
	protected long sessionTypeId;

	/** 
	 * This attribute represents whether the primitive attribute sessionTypeId is null.
	 */
	protected boolean sessionTypeIdNull;

	/** 
	 * Sets the value of sessionTypeId
	 */
	public void setSessionTypeId(long sessionTypeId)
	{
		this.sessionTypeId = sessionTypeId;
	}

	/** 
	 * Gets the value of sessionTypeId
	 */
	public long getSessionTypeId()
	{
		return sessionTypeId;
	}

	/**
	 * Method 'SessionTypePk'
	 * 
	 */
	public SessionTypePk()
	{
	}

	/**
	 * Method 'SessionTypePk'
	 * 
	 * @param sessionTypeId
	 */
	public SessionTypePk(final long sessionTypeId)
	{
		this.sessionTypeId = sessionTypeId;
	}

	/** 
	 * Sets the value of sessionTypeIdNull
	 */
	public void setSessionTypeIdNull(boolean sessionTypeIdNull)
	{
		this.sessionTypeIdNull = sessionTypeIdNull;
	}

	/** 
	 * Gets the value of sessionTypeIdNull
	 */
	public boolean isSessionTypeIdNull()
	{
		return sessionTypeIdNull;
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
		
		if (!(_other instanceof SessionTypePk)) {
			return false;
		}
		
		final SessionTypePk _cast = (SessionTypePk) _other;
		if (sessionTypeId != _cast.sessionTypeId) {
			return false;
		}
		
		if (sessionTypeIdNull != _cast.sessionTypeIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (sessionTypeId ^ (sessionTypeId >>> 32));
		_hashCode = 29 * _hashCode + (sessionTypeIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.SessionTypePk: " );
		ret.append( "sessionTypeId=" + sessionTypeId );
		return ret.toString();
	}

}
