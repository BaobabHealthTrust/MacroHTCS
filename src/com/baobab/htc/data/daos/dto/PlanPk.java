package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the Plan table.
 */
public class PlanPk implements Serializable
{
	protected long planId;

	/** 
	 * This attribute represents whether the primitive attribute planId is null.
	 */
	protected boolean planIdNull;

	/** 
	 * Sets the value of planId
	 */
	public void setPlanId(long planId)
	{
		this.planId = planId;
	}

	/** 
	 * Gets the value of planId
	 */
	public long getPlanId()
	{
		return planId;
	}

	/**
	 * Method 'PlanPk'
	 * 
	 */
	public PlanPk()
	{
	}

	/**
	 * Method 'PlanPk'
	 * 
	 * @param planId
	 */
	public PlanPk(final long planId)
	{
		this.planId = planId;
	}

	/** 
	 * Sets the value of planIdNull
	 */
	public void setPlanIdNull(boolean planIdNull)
	{
		this.planIdNull = planIdNull;
	}

	/** 
	 * Gets the value of planIdNull
	 */
	public boolean isPlanIdNull()
	{
		return planIdNull;
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
		
		if (!(_other instanceof PlanPk)) {
			return false;
		}
		
		final PlanPk _cast = (PlanPk) _other;
		if (planId != _cast.planId) {
			return false;
		}
		
		if (planIdNull != _cast.planIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (planId ^ (planId >>> 32));
		_hashCode = 29 * _hashCode + (planIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.PlanPk: " );
		ret.append( "planId=" + planId );
		return ret.toString();
	}

}
