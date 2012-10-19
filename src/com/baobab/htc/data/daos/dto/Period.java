package com.baobab.htc.data.daos.dto;

import com.baobab.htc.data.daos.dao.*;
import com.baobab.htc.data.daos.factory.*;
import com.baobab.htc.data.daos.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;
import java.math.BigDecimal;

public class Period implements Serializable
{
	/** 
	 * This attribute maps to the column periodId in the Period table.
	 */
	protected long periodId;

	/** 
	 * This attribute maps to the column period in the Period table.
	 */
	protected int period;

	/** 
	 * This attribute represents whether the primitive attribute period is null.
	 */
	protected boolean periodNull = true;

	/** 
	 * This attribute maps to the column ending in the Period table.
	 */
	protected Date ending;

	/** 
	 * This attribute maps to the column dateCreated in the Period table.
	 */
	protected Date dateCreated;

	/** 
	 * This attribute maps to the column createdBy in the Period table.
	 */
	protected String createdBy;

	/** 
	 * This attribute maps to the column dateModified in the Period table.
	 */
	protected Date dateModified;

	/** 
	 * This attribute maps to the column modifiedBy in the Period table.
	 */
	protected String modifiedBy;

	/** 
	 * This attribute maps to the column status in the Period table.
	 */
	protected int status;

	/** 
	 * This attribute represents whether the primitive attribute status is null.
	 */
	protected boolean statusNull = true;

	/** 
	 * This attribute maps to the column beginning in the Period table.
	 */
	protected Date beginning;

	/**
	 * Method 'Period'
	 * 
	 */
	public Period()
	{
	}

	/**
	 * Method 'getPeriodId'
	 * 
	 * @return long
	 */
	public long getPeriodId()
	{
		return periodId;
	}

	/**
	 * Method 'setPeriodId'
	 * 
	 * @param periodId
	 */
	public void setPeriodId(long periodId)
	{
		this.periodId = periodId;
	}

	/**
	 * Method 'getPeriod'
	 * 
	 * @return int
	 */
	public int getPeriod()
	{
		return period;
	}

	/**
	 * Method 'setPeriod'
	 * 
	 * @param period
	 */
	public void setPeriod(int period)
	{
		this.period = period;
		this.periodNull = false;
	}

	/**
	 * Method 'setPeriodNull'
	 * 
	 * @param value
	 */
	public void setPeriodNull(boolean value)
	{
		this.periodNull = value;
	}

	/**
	 * Method 'isPeriodNull'
	 * 
	 * @return boolean
	 */
	public boolean isPeriodNull()
	{
		return periodNull;
	}

	/**
	 * Method 'getEnding'
	 * 
	 * @return Date
	 */
	public Date getEnding()
	{
		return ending;
	}

	/**
	 * Method 'setEnding'
	 * 
	 * @param ending
	 */
	public void setEnding(Date ending)
	{
		this.ending = ending;
	}

	/**
	 * Method 'getDateCreated'
	 * 
	 * @return Date
	 */
	public Date getDateCreated()
	{
		return dateCreated;
	}

	/**
	 * Method 'setDateCreated'
	 * 
	 * @param dateCreated
	 */
	public void setDateCreated(Date dateCreated)
	{
		this.dateCreated = dateCreated;
	}

	/**
	 * Method 'getCreatedBy'
	 * 
	 * @return String
	 */
	public String getCreatedBy()
	{
		return createdBy;
	}

	/**
	 * Method 'setCreatedBy'
	 * 
	 * @param createdBy
	 */
	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}

	/**
	 * Method 'getDateModified'
	 * 
	 * @return Date
	 */
	public Date getDateModified()
	{
		return dateModified;
	}

	/**
	 * Method 'setDateModified'
	 * 
	 * @param dateModified
	 */
	public void setDateModified(Date dateModified)
	{
		this.dateModified = dateModified;
	}

	/**
	 * Method 'getModifiedBy'
	 * 
	 * @return String
	 */
	public String getModifiedBy()
	{
		return modifiedBy;
	}

	/**
	 * Method 'setModifiedBy'
	 * 
	 * @param modifiedBy
	 */
	public void setModifiedBy(String modifiedBy)
	{
		this.modifiedBy = modifiedBy;
	}

	/**
	 * Method 'getStatus'
	 * 
	 * @return int
	 */
	public int getStatus()
	{
		return status;
	}

	/**
	 * Method 'setStatus'
	 * 
	 * @param status
	 */
	public void setStatus(int status)
	{
		this.status = status;
		this.statusNull = false;
	}

	/**
	 * Method 'setStatusNull'
	 * 
	 * @param value
	 */
	public void setStatusNull(boolean value)
	{
		this.statusNull = value;
	}

	/**
	 * Method 'isStatusNull'
	 * 
	 * @return boolean
	 */
	public boolean isStatusNull()
	{
		return statusNull;
	}

	/**
	 * Method 'getBeginning'
	 * 
	 * @return Date
	 */
	public Date getBeginning()
	{
		return beginning;
	}

	/**
	 * Method 'setBeginning'
	 * 
	 * @param beginning
	 */
	public void setBeginning(Date beginning)
	{
		this.beginning = beginning;
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
		
		if (!(_other instanceof Period)) {
			return false;
		}
		
		final Period _cast = (Period) _other;
		if (periodId != _cast.periodId) {
			return false;
		}
		
		if (period != _cast.period) {
			return false;
		}
		
		if (periodNull != _cast.periodNull) {
			return false;
		}
		
		if (ending == null ? _cast.ending != ending : !ending.equals( _cast.ending )) {
			return false;
		}
		
		if (dateCreated == null ? _cast.dateCreated != dateCreated : !dateCreated.equals( _cast.dateCreated )) {
			return false;
		}
		
		if (createdBy == null ? _cast.createdBy != createdBy : !createdBy.equals( _cast.createdBy )) {
			return false;
		}
		
		if (dateModified == null ? _cast.dateModified != dateModified : !dateModified.equals( _cast.dateModified )) {
			return false;
		}
		
		if (modifiedBy == null ? _cast.modifiedBy != modifiedBy : !modifiedBy.equals( _cast.modifiedBy )) {
			return false;
		}
		
		if (status != _cast.status) {
			return false;
		}
		
		if (statusNull != _cast.statusNull) {
			return false;
		}
		
		if (beginning == null ? _cast.beginning != beginning : !beginning.equals( _cast.beginning )) {
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
		_hashCode = 29 * _hashCode + period;
		_hashCode = 29 * _hashCode + (periodNull ? 1 : 0);
		if (ending != null) {
			_hashCode = 29 * _hashCode + ending.hashCode();
		}
		
		if (dateCreated != null) {
			_hashCode = 29 * _hashCode + dateCreated.hashCode();
		}
		
		if (createdBy != null) {
			_hashCode = 29 * _hashCode + createdBy.hashCode();
		}
		
		if (dateModified != null) {
			_hashCode = 29 * _hashCode + dateModified.hashCode();
		}
		
		if (modifiedBy != null) {
			_hashCode = 29 * _hashCode + modifiedBy.hashCode();
		}
		
		_hashCode = 29 * _hashCode + status;
		_hashCode = 29 * _hashCode + (statusNull ? 1 : 0);
		if (beginning != null) {
			_hashCode = 29 * _hashCode + beginning.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return PeriodPk
	 */
	public PeriodPk createPk()
	{
		return new PeriodPk(periodId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.baobab.htc.data.daos.dto.Period: " );
		ret.append( "periodId=" + periodId );
		ret.append( ", period=" + period );
		ret.append( ", ending=" + ending );
		ret.append( ", dateCreated=" + dateCreated );
		ret.append( ", createdBy=" + createdBy );
		ret.append( ", dateModified=" + dateModified );
		ret.append( ", modifiedBy=" + modifiedBy );
		ret.append( ", status=" + status );
		ret.append( ", beginning=" + beginning );
		return ret.toString();
	}

}
