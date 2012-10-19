package com.baobab.htc.data.daos.dto;

import com.baobab.htc.data.daos.dao.*;
import com.baobab.htc.data.daos.factory.*;
import com.baobab.htc.data.daos.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;
import java.math.BigDecimal;

public class Symptom implements Serializable
{
	/** 
	 * This attribute maps to the column symptomId in the Symptom table.
	 */
	protected long symptomId;

	/** 
	 * This attribute maps to the column dateCreated in the Symptom table.
	 */
	protected Date dateCreated;

	/** 
	 * This attribute maps to the column createdBy in the Symptom table.
	 */
	protected String createdBy;

	/** 
	 * This attribute maps to the column dateModified in the Symptom table.
	 */
	protected Date dateModified;

	/** 
	 * This attribute maps to the column modifiedBy in the Symptom table.
	 */
	protected String modifiedBy;

	/** 
	 * This attribute maps to the column status in the Symptom table.
	 */
	protected int status;

	/** 
	 * This attribute represents whether the primitive attribute status is null.
	 */
	protected boolean statusNull = true;

	/** 
	 * This attribute maps to the column description in the Symptom table.
	 */
	protected String description;

	/**
	 * Method 'Symptom'
	 * 
	 */
	public Symptom()
	{
	}

	/**
	 * Method 'getSymptomId'
	 * 
	 * @return long
	 */
	public long getSymptomId()
	{
		return symptomId;
	}

	/**
	 * Method 'setSymptomId'
	 * 
	 * @param symptomId
	 */
	public void setSymptomId(long symptomId)
	{
		this.symptomId = symptomId;
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
	 * Method 'getDescription'
	 * 
	 * @return String
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Method 'setDescription'
	 * 
	 * @param description
	 */
	public void setDescription(String description)
	{
		this.description = description;
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
		
		if (!(_other instanceof Symptom)) {
			return false;
		}
		
		final Symptom _cast = (Symptom) _other;
		if (symptomId != _cast.symptomId) {
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
		
		if (description == null ? _cast.description != description : !description.equals( _cast.description )) {
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
		_hashCode = 29 * _hashCode + (int) (symptomId ^ (symptomId >>> 32));
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
		if (description != null) {
			_hashCode = 29 * _hashCode + description.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SymptomPk
	 */
	public SymptomPk createPk()
	{
		return new SymptomPk(symptomId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.baobab.htc.data.daos.dto.Symptom: " );
		ret.append( "symptomId=" + symptomId );
		ret.append( ", dateCreated=" + dateCreated );
		ret.append( ", createdBy=" + createdBy );
		ret.append( ", dateModified=" + dateModified );
		ret.append( ", modifiedBy=" + modifiedBy );
		ret.append( ", status=" + status );
		ret.append( ", description=" + description );
		return ret.toString();
	}

}
