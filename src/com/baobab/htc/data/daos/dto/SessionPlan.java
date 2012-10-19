package com.baobab.htc.data.daos.dto;

import com.baobab.htc.data.daos.dao.*;
import com.baobab.htc.data.daos.factory.*;
import com.baobab.htc.data.daos.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;
import java.math.BigDecimal;

public class SessionPlan implements Serializable
{
	/** 
	 * This attribute maps to the column sessionPlanId in the SessionPlan table.
	 */
	protected long sessionPlanId;

	/** 
	 * This attribute maps to the column sessionReference in the SessionPlan table.
	 */
	protected String sessionReference;

	/** 
	 * This attribute maps to the column planId in the SessionPlan table.
	 */
	protected long planId;

	/** 
	 * This attribute represents whether the primitive attribute planId is null.
	 */
	protected boolean planIdNull = true;

	/** 
	 * This attribute maps to the column dateCreated in the SessionPlan table.
	 */
	protected Date dateCreated;

	/** 
	 * This attribute maps to the column createdBy in the SessionPlan table.
	 */
	protected String createdBy;

	/** 
	 * This attribute maps to the column dateModified in the SessionPlan table.
	 */
	protected Date dateModified;

	/** 
	 * This attribute maps to the column modifiedBy in the SessionPlan table.
	 */
	protected String modifiedBy;

	/** 
	 * This attribute maps to the column status in the SessionPlan table.
	 */
	protected int status;

	/** 
	 * This attribute represents whether the primitive attribute status is null.
	 */
	protected boolean statusNull = true;

	/**
	 * Method 'SessionPlan'
	 * 
	 */
	public SessionPlan()
	{
	}

	/**
	 * Method 'getSessionPlanId'
	 * 
	 * @return long
	 */
	public long getSessionPlanId()
	{
		return sessionPlanId;
	}

	/**
	 * Method 'setSessionPlanId'
	 * 
	 * @param sessionPlanId
	 */
	public void setSessionPlanId(long sessionPlanId)
	{
		this.sessionPlanId = sessionPlanId;
	}

	/**
	 * Method 'getSessionReference'
	 * 
	 * @return String
	 */
	public String getSessionReference()
	{
		return sessionReference;
	}

	/**
	 * Method 'setSessionReference'
	 * 
	 * @param sessionReference
	 */
	public void setSessionReference(String sessionReference)
	{
		this.sessionReference = sessionReference;
	}

	/**
	 * Method 'getPlanId'
	 * 
	 * @return long
	 */
	public long getPlanId()
	{
		return planId;
	}

	/**
	 * Method 'setPlanId'
	 * 
	 * @param planId
	 */
	public void setPlanId(long planId)
	{
		this.planId = planId;
		this.planIdNull = false;
	}

	/**
	 * Method 'setPlanIdNull'
	 * 
	 * @param value
	 */
	public void setPlanIdNull(boolean value)
	{
		this.planIdNull = value;
	}

	/**
	 * Method 'isPlanIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isPlanIdNull()
	{
		return planIdNull;
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
		
		if (!(_other instanceof SessionPlan)) {
			return false;
		}
		
		final SessionPlan _cast = (SessionPlan) _other;
		if (sessionPlanId != _cast.sessionPlanId) {
			return false;
		}
		
		if (sessionReference == null ? _cast.sessionReference != sessionReference : !sessionReference.equals( _cast.sessionReference )) {
			return false;
		}
		
		if (planId != _cast.planId) {
			return false;
		}
		
		if (planIdNull != _cast.planIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (sessionPlanId ^ (sessionPlanId >>> 32));
		if (sessionReference != null) {
			_hashCode = 29 * _hashCode + sessionReference.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (planId ^ (planId >>> 32));
		_hashCode = 29 * _hashCode + (planIdNull ? 1 : 0);
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
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SessionPlanPk
	 */
	public SessionPlanPk createPk()
	{
		return new SessionPlanPk(sessionPlanId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.baobab.htc.data.daos.dto.SessionPlan: " );
		ret.append( "sessionPlanId=" + sessionPlanId );
		ret.append( ", sessionReference=" + sessionReference );
		ret.append( ", planId=" + planId );
		ret.append( ", dateCreated=" + dateCreated );
		ret.append( ", createdBy=" + createdBy );
		ret.append( ", dateModified=" + dateModified );
		ret.append( ", modifiedBy=" + modifiedBy );
		ret.append( ", status=" + status );
		return ret.toString();
	}

}
