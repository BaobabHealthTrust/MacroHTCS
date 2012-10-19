package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the Site table.
 */
public class SitePk implements Serializable
{
	protected long siteId;

	/** 
	 * This attribute represents whether the primitive attribute siteId is null.
	 */
	protected boolean siteIdNull;

	/** 
	 * Sets the value of siteId
	 */
	public void setSiteId(long siteId)
	{
		this.siteId = siteId;
	}

	/** 
	 * Gets the value of siteId
	 */
	public long getSiteId()
	{
		return siteId;
	}

	/**
	 * Method 'SitePk'
	 * 
	 */
	public SitePk()
	{
	}

	/**
	 * Method 'SitePk'
	 * 
	 * @param siteId
	 */
	public SitePk(final long siteId)
	{
		this.siteId = siteId;
	}

	/** 
	 * Sets the value of siteIdNull
	 */
	public void setSiteIdNull(boolean siteIdNull)
	{
		this.siteIdNull = siteIdNull;
	}

	/** 
	 * Gets the value of siteIdNull
	 */
	public boolean isSiteIdNull()
	{
		return siteIdNull;
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
		
		if (!(_other instanceof SitePk)) {
			return false;
		}
		
		final SitePk _cast = (SitePk) _other;
		if (siteId != _cast.siteId) {
			return false;
		}
		
		if (siteIdNull != _cast.siteIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (siteId ^ (siteId >>> 32));
		_hashCode = 29 * _hashCode + (siteIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.SitePk: " );
		ret.append( "siteId=" + siteId );
		return ret.toString();
	}

}
