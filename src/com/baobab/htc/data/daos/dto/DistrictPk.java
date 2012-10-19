package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the District table.
 */
public class DistrictPk implements Serializable
{
	protected long districtId;

	/** 
	 * This attribute represents whether the primitive attribute districtId is null.
	 */
	protected boolean districtIdNull;

	/** 
	 * Sets the value of districtId
	 */
	public void setDistrictId(long districtId)
	{
		this.districtId = districtId;
	}

	/** 
	 * Gets the value of districtId
	 */
	public long getDistrictId()
	{
		return districtId;
	}

	/**
	 * Method 'DistrictPk'
	 * 
	 */
	public DistrictPk()
	{
	}

	/**
	 * Method 'DistrictPk'
	 * 
	 * @param districtId
	 */
	public DistrictPk(final long districtId)
	{
		this.districtId = districtId;
	}

	/** 
	 * Sets the value of districtIdNull
	 */
	public void setDistrictIdNull(boolean districtIdNull)
	{
		this.districtIdNull = districtIdNull;
	}

	/** 
	 * Gets the value of districtIdNull
	 */
	public boolean isDistrictIdNull()
	{
		return districtIdNull;
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
		
		if (!(_other instanceof DistrictPk)) {
			return false;
		}
		
		final DistrictPk _cast = (DistrictPk) _other;
		if (districtId != _cast.districtId) {
			return false;
		}
		
		if (districtIdNull != _cast.districtIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (districtId ^ (districtId >>> 32));
		_hashCode = 29 * _hashCode + (districtIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.DistrictPk: " );
		ret.append( "districtId=" + districtId );
		return ret.toString();
	}

}
