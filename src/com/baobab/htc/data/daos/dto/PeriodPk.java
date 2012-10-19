package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the Period table.
 */
public class PeriodPk implements Serializable
{
	protected long periodId;

	/** 
	 * This attribute represents whether the primitive attribute periodId is null.
	 */
	protected boolean periodIdNull;

	/** 
	 * Sets the value of periodId
	 */
	public void setPeriodId(long periodId)
	{
		this.periodId = periodId;
	}

	/** 
	 * Gets the value of periodId
	 */
	public long getPeriodId()
	{
		return periodId;
	}

	/**
	 * Method 'PeriodPk'
	 * 
	 */
	public PeriodPk()
	{
	}

	/**
	 * Method 'PeriodPk'
	 * 
	 * @param periodId
	 */
	public PeriodPk(final long periodId)
	{
		this.periodId = periodId;
	}

	/** 
	 * Sets the value of periodIdNull
	 */
	public void setPeriodIdNull(boolean periodIdNull)
	{
		this.periodIdNull = periodIdNull;
	}

	/** 
	 * Gets the value of periodIdNull
	 */
	public boolean isPeriodIdNull()
	{
		return periodIdNull;
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
		
		if (!(_other instanceof PeriodPk)) {
			return false;
		}
		
		final PeriodPk _cast = (PeriodPk) _other;
		if (periodId != _cast.periodId) {
			return false;
		}
		
		if (periodIdNull != _cast.periodIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (periodId ^ (periodId >>> 32));
		_hashCode = 29 * _hashCode + (periodIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.PeriodPk: " );
		ret.append( "periodId=" + periodId );
		return ret.toString();
	}

}
