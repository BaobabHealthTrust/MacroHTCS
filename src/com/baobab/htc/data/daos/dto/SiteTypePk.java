package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the SiteType table.
 */
public class SiteTypePk implements Serializable
{
	protected long siteTypeId;

	/** 
	 * This attribute represents whether the primitive attribute siteTypeId is null.
	 */
	protected boolean siteTypeIdNull;

	/** 
	 * Sets the value of siteTypeId
	 */
	public void setSiteTypeId(long siteTypeId)
	{
		this.siteTypeId = siteTypeId;
	}

	/** 
	 * Gets the value of siteTypeId
	 */
	public long getSiteTypeId()
	{
		return siteTypeId;
	}

	/**
	 * Method 'SiteTypePk'
	 * 
	 */
	public SiteTypePk()
	{
	}

	/**
	 * Method 'SiteTypePk'
	 * 
	 * @param siteTypeId
	 */
	public SiteTypePk(final long siteTypeId)
	{
		this.siteTypeId = siteTypeId;
	}

	/** 
	 * Sets the value of siteTypeIdNull
	 */
	public void setSiteTypeIdNull(boolean siteTypeIdNull)
	{
		this.siteTypeIdNull = siteTypeIdNull;
	}

	/** 
	 * Gets the value of siteTypeIdNull
	 */
	public boolean isSiteTypeIdNull()
	{
		return siteTypeIdNull;
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
		
		if (!(_other instanceof SiteTypePk)) {
			return false;
		}
		
		final SiteTypePk _cast = (SiteTypePk) _other;
		if (siteTypeId != _cast.siteTypeId) {
			return false;
		}
		
		if (siteTypeIdNull != _cast.siteTypeIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (siteTypeId ^ (siteTypeId >>> 32));
		_hashCode = 29 * _hashCode + (siteTypeIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.SiteTypePk: " );
		ret.append( "siteTypeId=" + siteTypeId );
		return ret.toString();
	}

}
