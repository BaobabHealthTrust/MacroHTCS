package com.baobab.htc.data.daos.dto;

import com.baobab.htc.data.daos.dao.*;
import com.baobab.htc.data.daos.factory.*;
import com.baobab.htc.data.daos.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;
import java.math.BigDecimal;

public class TestingType implements Serializable
{
	/** 
	 * This attribute maps to the column testingTypeId in the TestingType table.
	 */
	protected long testingTypeId;

	/** 
	 * This attribute maps to the column description in the TestingType table.
	 */
	protected String description;

	/** 
	 * This attribute maps to the column testingTypeCategoryId in the TestingType table.
	 */
	protected long testingTypeCategoryId;

	/** 
	 * This attribute represents whether the primitive attribute testingTypeCategoryId is null.
	 */
	protected boolean testingTypeCategoryIdNull = true;

	/** 
	 * This attribute maps to the column dateCreated in the TestingType table.
	 */
	protected Date dateCreated;

	/** 
	 * This attribute maps to the column createdBy in the TestingType table.
	 */
	protected String createdBy;

	/** 
	 * This attribute maps to the column dateModified in the TestingType table.
	 */
	protected Date dateModified;

	/** 
	 * This attribute maps to the column modifiedBy in the TestingType table.
	 */
	protected String modifiedBy;

	/** 
	 * This attribute maps to the column status in the TestingType table.
	 */
	protected int status;

	/** 
	 * This attribute represents whether the primitive attribute status is null.
	 */
	protected boolean statusNull = true;

	/**
	 * Method 'TestingType'
	 * 
	 */
	public TestingType()
	{
	}

	/**
	 * Method 'getTestingTypeId'
	 * 
	 * @return long
	 */
	public long getTestingTypeId()
	{
		return testingTypeId;
	}

	/**
	 * Method 'setTestingTypeId'
	 * 
	 * @param testingTypeId
	 */
	public void setTestingTypeId(long testingTypeId)
	{
		this.testingTypeId = testingTypeId;
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
	 * Method 'getTestingTypeCategoryId'
	 * 
	 * @return long
	 */
	public long getTestingTypeCategoryId()
	{
		return testingTypeCategoryId;
	}

	/**
	 * Method 'setTestingTypeCategoryId'
	 * 
	 * @param testingTypeCategoryId
	 */
	public void setTestingTypeCategoryId(long testingTypeCategoryId)
	{
		this.testingTypeCategoryId = testingTypeCategoryId;
		this.testingTypeCategoryIdNull = false;
	}

	/**
	 * Method 'setTestingTypeCategoryIdNull'
	 * 
	 * @param value
	 */
	public void setTestingTypeCategoryIdNull(boolean value)
	{
		this.testingTypeCategoryIdNull = value;
	}

	/**
	 * Method 'isTestingTypeCategoryIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isTestingTypeCategoryIdNull()
	{
		return testingTypeCategoryIdNull;
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
		
		if (!(_other instanceof TestingType)) {
			return false;
		}
		
		final TestingType _cast = (TestingType) _other;
		if (testingTypeId != _cast.testingTypeId) {
			return false;
		}
		
		if (description == null ? _cast.description != description : !description.equals( _cast.description )) {
			return false;
		}
		
		if (testingTypeCategoryId != _cast.testingTypeCategoryId) {
			return false;
		}
		
		if (testingTypeCategoryIdNull != _cast.testingTypeCategoryIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (testingTypeId ^ (testingTypeId >>> 32));
		if (description != null) {
			_hashCode = 29 * _hashCode + description.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (testingTypeCategoryId ^ (testingTypeCategoryId >>> 32));
		_hashCode = 29 * _hashCode + (testingTypeCategoryIdNull ? 1 : 0);
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
	 * @return TestingTypePk
	 */
	public TestingTypePk createPk()
	{
		return new TestingTypePk(testingTypeId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.baobab.htc.data.daos.dto.TestingType: " );
		ret.append( "testingTypeId=" + testingTypeId );
		ret.append( ", description=" + description );
		ret.append( ", testingTypeCategoryId=" + testingTypeCategoryId );
		ret.append( ", dateCreated=" + dateCreated );
		ret.append( ", createdBy=" + createdBy );
		ret.append( ", dateModified=" + dateModified );
		ret.append( ", modifiedBy=" + modifiedBy );
		ret.append( ", status=" + status );
		return ret.toString();
	}

}
