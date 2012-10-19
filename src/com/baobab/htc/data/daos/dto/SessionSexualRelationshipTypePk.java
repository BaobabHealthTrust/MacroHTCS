package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the SessionSexualRelationshipType table.
 */
public class SessionSexualRelationshipTypePk implements Serializable
{
	protected long sessionSexualRelationshipTypeId;

	/** 
	 * This attribute represents whether the primitive attribute sessionSexualRelationshipTypeId is null.
	 */
	protected boolean sessionSexualRelationshipTypeIdNull;

	/** 
	 * Sets the value of sessionSexualRelationshipTypeId
	 */
	public void setSessionSexualRelationshipTypeId(long sessionSexualRelationshipTypeId)
	{
		this.sessionSexualRelationshipTypeId = sessionSexualRelationshipTypeId;
	}

	/** 
	 * Gets the value of sessionSexualRelationshipTypeId
	 */
	public long getSessionSexualRelationshipTypeId()
	{
		return sessionSexualRelationshipTypeId;
	}

	/**
	 * Method 'SessionSexualRelationshipTypePk'
	 * 
	 */
	public SessionSexualRelationshipTypePk()
	{
	}

	/**
	 * Method 'SessionSexualRelationshipTypePk'
	 * 
	 * @param sessionSexualRelationshipTypeId
	 */
	public SessionSexualRelationshipTypePk(final long sessionSexualRelationshipTypeId)
	{
		this.sessionSexualRelationshipTypeId = sessionSexualRelationshipTypeId;
	}

	/** 
	 * Sets the value of sessionSexualRelationshipTypeIdNull
	 */
	public void setSessionSexualRelationshipTypeIdNull(boolean sessionSexualRelationshipTypeIdNull)
	{
		this.sessionSexualRelationshipTypeIdNull = sessionSexualRelationshipTypeIdNull;
	}

	/** 
	 * Gets the value of sessionSexualRelationshipTypeIdNull
	 */
	public boolean isSessionSexualRelationshipTypeIdNull()
	{
		return sessionSexualRelationshipTypeIdNull;
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
		
		if (!(_other instanceof SessionSexualRelationshipTypePk)) {
			return false;
		}
		
		final SessionSexualRelationshipTypePk _cast = (SessionSexualRelationshipTypePk) _other;
		if (sessionSexualRelationshipTypeId != _cast.sessionSexualRelationshipTypeId) {
			return false;
		}
		
		if (sessionSexualRelationshipTypeIdNull != _cast.sessionSexualRelationshipTypeIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (sessionSexualRelationshipTypeId ^ (sessionSexualRelationshipTypeId >>> 32));
		_hashCode = 29 * _hashCode + (sessionSexualRelationshipTypeIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.SessionSexualRelationshipTypePk: " );
		ret.append( "sessionSexualRelationshipTypeId=" + sessionSexualRelationshipTypeId );
		return ret.toString();
	}

}
