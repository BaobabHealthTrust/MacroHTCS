package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the TraditionalAuthority table.
 */
public class TraditionalAuthorityPk implements Serializable
{
	protected long traditionalAuthorityId;

	/** 
	 * This attribute represents whether the primitive attribute traditionalAuthorityId is null.
	 */
	protected boolean traditionalAuthorityIdNull;

	/** 
	 * Sets the value of traditionalAuthorityId
	 */
	public void setTraditionalAuthorityId(long traditionalAuthorityId)
	{
		this.traditionalAuthorityId = traditionalAuthorityId;
	}

	/** 
	 * Gets the value of traditionalAuthorityId
	 */
	public long getTraditionalAuthorityId()
	{
		return traditionalAuthorityId;
	}

	/**
	 * Method 'TraditionalAuthorityPk'
	 * 
	 */
	public TraditionalAuthorityPk()
	{
	}

	/**
	 * Method 'TraditionalAuthorityPk'
	 * 
	 * @param traditionalAuthorityId
	 */
	public TraditionalAuthorityPk(final long traditionalAuthorityId)
	{
		this.traditionalAuthorityId = traditionalAuthorityId;
	}

	/** 
	 * Sets the value of traditionalAuthorityIdNull
	 */
	public void setTraditionalAuthorityIdNull(boolean traditionalAuthorityIdNull)
	{
		this.traditionalAuthorityIdNull = traditionalAuthorityIdNull;
	}

	/** 
	 * Gets the value of traditionalAuthorityIdNull
	 */
	public boolean isTraditionalAuthorityIdNull()
	{
		return traditionalAuthorityIdNull;
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
		
		if (!(_other instanceof TraditionalAuthorityPk)) {
			return false;
		}
		
		final TraditionalAuthorityPk _cast = (TraditionalAuthorityPk) _other;
		if (traditionalAuthorityId != _cast.traditionalAuthorityId) {
			return false;
		}
		
		if (traditionalAuthorityIdNull != _cast.traditionalAuthorityIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (traditionalAuthorityId ^ (traditionalAuthorityId >>> 32));
		_hashCode = 29 * _hashCode + (traditionalAuthorityIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.TraditionalAuthorityPk: " );
		ret.append( "traditionalAuthorityId=" + traditionalAuthorityId );
		return ret.toString();
	}

}
