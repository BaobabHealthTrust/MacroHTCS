package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the Region table.
 */
public class RegionPk implements Serializable
{
	protected long regionId;

	/** 
	 * This attribute represents whether the primitive attribute regionId is null.
	 */
	protected boolean regionIdNull;

	/** 
	 * Sets the value of regionId
	 */
	public void setRegionId(long regionId)
	{
		this.regionId = regionId;
	}

	/** 
	 * Gets the value of regionId
	 */
	public long getRegionId()
	{
		return regionId;
	}

	/**
	 * Method 'RegionPk'
	 * 
	 */
	public RegionPk()
	{
	}

	/**
	 * Method 'RegionPk'
	 * 
	 * @param regionId
	 */
	public RegionPk(final long regionId)
	{
		this.regionId = regionId;
	}

	/** 
	 * Sets the value of regionIdNull
	 */
	public void setRegionIdNull(boolean regionIdNull)
	{
		this.regionIdNull = regionIdNull;
	}

	/** 
	 * Gets the value of regionIdNull
	 */
	public boolean isRegionIdNull()
	{
		return regionIdNull;
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
		
		if (!(_other instanceof RegionPk)) {
			return false;
		}
		
		final RegionPk _cast = (RegionPk) _other;
		if (regionId != _cast.regionId) {
			return false;
		}
		
		if (regionIdNull != _cast.regionIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (regionId ^ (regionId >>> 32));
		_hashCode = 29 * _hashCode + (regionIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.RegionPk: " );
		ret.append( "regionId=" + regionId );
		return ret.toString();
	}

}
