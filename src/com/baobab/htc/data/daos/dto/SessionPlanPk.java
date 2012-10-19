package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the SessionPlan table.
 */
public class SessionPlanPk implements Serializable
{
	protected long sessionPlanId;

	/** 
	 * This attribute represents whether the primitive attribute sessionPlanId is null.
	 */
	protected boolean sessionPlanIdNull;

	/** 
	 * Sets the value of sessionPlanId
	 */
	public void setSessionPlanId(long sessionPlanId)
	{
		this.sessionPlanId = sessionPlanId;
	}

	/** 
	 * Gets the value of sessionPlanId
	 */
	public long getSessionPlanId()
	{
		return sessionPlanId;
	}

	/**
	 * Method 'SessionPlanPk'
	 * 
	 */
	public SessionPlanPk()
	{
	}

	/**
	 * Method 'SessionPlanPk'
	 * 
	 * @param sessionPlanId
	 */
	public SessionPlanPk(final long sessionPlanId)
	{
		this.sessionPlanId = sessionPlanId;
	}

	/** 
	 * Sets the value of sessionPlanIdNull
	 */
	public void setSessionPlanIdNull(boolean sessionPlanIdNull)
	{
		this.sessionPlanIdNull = sessionPlanIdNull;
	}

	/** 
	 * Gets the value of sessionPlanIdNull
	 */
	public boolean isSessionPlanIdNull()
	{
		return sessionPlanIdNull;
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
		
		if (!(_other instanceof SessionPlanPk)) {
			return false;
		}
		
		final SessionPlanPk _cast = (SessionPlanPk) _other;
		if (sessionPlanId != _cast.sessionPlanId) {
			return false;
		}
		
		if (sessionPlanIdNull != _cast.sessionPlanIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (sessionPlanId ^ (sessionPlanId >>> 32));
		_hashCode = 29 * _hashCode + (sessionPlanIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.SessionPlanPk: " );
		ret.append( "sessionPlanId=" + sessionPlanId );
		return ret.toString();
	}

}
