package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the Counsellor table.
 */
public class CounsellorPk implements Serializable
{
	protected long counsellorId;

	/** 
	 * This attribute represents whether the primitive attribute counsellorId is null.
	 */
	protected boolean counsellorIdNull;

	/** 
	 * Sets the value of counsellorId
	 */
	public void setCounsellorId(long counsellorId)
	{
		this.counsellorId = counsellorId;
	}

	/** 
	 * Gets the value of counsellorId
	 */
	public long getCounsellorId()
	{
		return counsellorId;
	}

	/**
	 * Method 'CounsellorPk'
	 * 
	 */
	public CounsellorPk()
	{
	}

	/**
	 * Method 'CounsellorPk'
	 * 
	 * @param counsellorId
	 */
	public CounsellorPk(final long counsellorId)
	{
		this.counsellorId = counsellorId;
	}

	/** 
	 * Sets the value of counsellorIdNull
	 */
	public void setCounsellorIdNull(boolean counsellorIdNull)
	{
		this.counsellorIdNull = counsellorIdNull;
	}

	/** 
	 * Gets the value of counsellorIdNull
	 */
	public boolean isCounsellorIdNull()
	{
		return counsellorIdNull;
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
		
		if (!(_other instanceof CounsellorPk)) {
			return false;
		}
		
		final CounsellorPk _cast = (CounsellorPk) _other;
		if (counsellorId != _cast.counsellorId) {
			return false;
		}
		
		if (counsellorIdNull != _cast.counsellorIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (counsellorId ^ (counsellorId >>> 32));
		_hashCode = 29 * _hashCode + (counsellorIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.CounsellorPk: " );
		ret.append( "counsellorId=" + counsellorId );
		return ret.toString();
	}

}
