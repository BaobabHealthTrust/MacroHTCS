package com.baobab.htc.data.daos.dto;

import com.baobab.htc.data.daos.dao.*;
import com.baobab.htc.data.daos.factory.*;
import com.baobab.htc.data.daos.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;
import java.math.BigDecimal;

public class Sequence implements Serializable
{
	/** 
	 * This attribute maps to the column id in the Sequence table.
	 */
	protected long id;

	/** 
	 * This attribute maps to the column sequenceName in the Sequence table.
	 */
	protected String sequenceName;

	/** 
	 * This attribute maps to the column tableId in the Sequence table.
	 */
	protected long tableId;

	/** 
	 * This attribute represents whether the primitive attribute tableId is null.
	 */
	protected boolean tableIdNull = true;

	/** 
	 * This attribute maps to the column increment in the Sequence table.
	 */
	protected int increment;

	/** 
	 * This attribute represents whether the primitive attribute increment is null.
	 */
	protected boolean incrementNull = true;

	/** 
	 * This attribute maps to the column dateCreated in the Sequence table.
	 */
	protected Date dateCreated;

	/** 
	 * This attribute maps to the column createdBy in the Sequence table.
	 */
	protected String createdBy;

	/** 
	 * This attribute maps to the column dateModified in the Sequence table.
	 */
	protected Date dateModified;

	/** 
	 * This attribute maps to the column modifiedBy in the Sequence table.
	 */
	protected String modifiedBy;

	/** 
	 * This attribute maps to the column status in the Sequence table.
	 */
	protected int status;

	/** 
	 * This attribute represents whether the primitive attribute status is null.
	 */
	protected boolean statusNull = true;

	/**
	 * Method 'Sequence'
	 * 
	 */
	public Sequence()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return long
	 */
	public long getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(long id)
	{
		this.id = id;
	}

	/**
	 * Method 'getSequenceName'
	 * 
	 * @return String
	 */
	public String getSequenceName()
	{
		return sequenceName;
	}

	/**
	 * Method 'setSequenceName'
	 * 
	 * @param sequenceName
	 */
	public void setSequenceName(String sequenceName)
	{
		this.sequenceName = sequenceName;
	}

	/**
	 * Method 'getTableId'
	 * 
	 * @return long
	 */
	public long getTableId()
	{
		return tableId;
	}

	/**
	 * Method 'setTableId'
	 * 
	 * @param tableId
	 */
	public void setTableId(long tableId)
	{
		this.tableId = tableId;
		this.tableIdNull = false;
	}

	/**
	 * Method 'setTableIdNull'
	 * 
	 * @param value
	 */
	public void setTableIdNull(boolean value)
	{
		this.tableIdNull = value;
	}

	/**
	 * Method 'isTableIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isTableIdNull()
	{
		return tableIdNull;
	}

	/**
	 * Method 'getIncrement'
	 * 
	 * @return int
	 */
	public int getIncrement()
	{
		return increment;
	}

	/**
	 * Method 'setIncrement'
	 * 
	 * @param increment
	 */
	public void setIncrement(int increment)
	{
		this.increment = increment;
		this.incrementNull = false;
	}

	/**
	 * Method 'setIncrementNull'
	 * 
	 * @param value
	 */
	public void setIncrementNull(boolean value)
	{
		this.incrementNull = value;
	}

	/**
	 * Method 'isIncrementNull'
	 * 
	 * @return boolean
	 */
	public boolean isIncrementNull()
	{
		return incrementNull;
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
		
		if (!(_other instanceof Sequence)) {
			return false;
		}
		
		final Sequence _cast = (Sequence) _other;
		if (id != _cast.id) {
			return false;
		}
		
		if (sequenceName == null ? _cast.sequenceName != sequenceName : !sequenceName.equals( _cast.sequenceName )) {
			return false;
		}
		
		if (tableId != _cast.tableId) {
			return false;
		}
		
		if (tableIdNull != _cast.tableIdNull) {
			return false;
		}
		
		if (increment != _cast.increment) {
			return false;
		}
		
		if (incrementNull != _cast.incrementNull) {
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
		_hashCode = 29 * _hashCode + (int) (id ^ (id >>> 32));
		if (sequenceName != null) {
			_hashCode = 29 * _hashCode + sequenceName.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (tableId ^ (tableId >>> 32));
		_hashCode = 29 * _hashCode + (tableIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + increment;
		_hashCode = 29 * _hashCode + (incrementNull ? 1 : 0);
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
	 * @return SequencePk
	 */
	public SequencePk createPk()
	{
		return new SequencePk(id);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.baobab.htc.data.daos.dto.Sequence: " );
		ret.append( "id=" + id );
		ret.append( ", sequenceName=" + sequenceName );
		ret.append( ", tableId=" + tableId );
		ret.append( ", increment=" + increment );
		ret.append( ", dateCreated=" + dateCreated );
		ret.append( ", createdBy=" + createdBy );
		ret.append( ", dateModified=" + dateModified );
		ret.append( ", modifiedBy=" + modifiedBy );
		ret.append( ", status=" + status );
		return ret.toString();
	}

}
