package com.baobab.htc.data.daos.dto;

import com.baobab.htc.data.daos.dao.*;
import com.baobab.htc.data.daos.factory.*;
import com.baobab.htc.data.daos.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;
import java.math.BigDecimal;

public class TraditionalAuthority implements Serializable
{
	/** 
	 * This attribute maps to the column traditionalAuthorityId in the TraditionalAuthority table.
	 */
	protected long traditionalAuthorityId;

	/** 
	 * This attribute maps to the column name in the TraditionalAuthority table.
	 */
	protected String name;

	/** 
	 * This attribute maps to the column districtId in the TraditionalAuthority table.
	 */
	protected long districtId;

	/** 
	 * This attribute represents whether the primitive attribute districtId is null.
	 */
	protected boolean districtIdNull = true;

	/** 
	 * This attribute maps to the column dateCreated in the TraditionalAuthority table.
	 */
	protected Date dateCreated;

	/** 
	 * This attribute maps to the column createdBy in the TraditionalAuthority table.
	 */
	protected String createdBy;

	/** 
	 * This attribute maps to the column dateModified in the TraditionalAuthority table.
	 */
	protected Date dateModified;

	/** 
	 * This attribute maps to the column modifiedBy in the TraditionalAuthority table.
	 */
	protected String modifiedBy;

	/** 
	 * This attribute maps to the column status in the TraditionalAuthority table.
	 */
	protected int status;

	/** 
	 * This attribute represents whether the primitive attribute status is null.
	 */
	protected boolean statusNull = true;

	/**
	 * Method 'TraditionalAuthority'
	 * 
	 */
	public TraditionalAuthority()
	{
	}

	/**
	 * Method 'getTraditionalAuthorityId'
	 * 
	 * @return long
	 */
	public long getTraditionalAuthorityId()
	{
		return traditionalAuthorityId;
	}

	/**
	 * Method 'setTraditionalAuthorityId'
	 * 
	 * @param traditionalAuthorityId
	 */
	public void setTraditionalAuthorityId(long traditionalAuthorityId)
	{
		this.traditionalAuthorityId = traditionalAuthorityId;
	}

	/**
	 * Method 'getName'
	 * 
	 * @return String
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Method 'setName'
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Method 'getDistrictId'
	 * 
	 * @return long
	 */
	public long getDistrictId()
	{
		return districtId;
	}

	/**
	 * Method 'setDistrictId'
	 * 
	 * @param districtId
	 */
	public void setDistrictId(long districtId)
	{
		this.districtId = districtId;
		this.districtIdNull = false;
	}

	/**
	 * Method 'setDistrictIdNull'
	 * 
	 * @param value
	 */
	public void setDistrictIdNull(boolean value)
	{
		this.districtIdNull = value;
	}

	/**
	 * Method 'isDistrictIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isDistrictIdNull()
	{
		return districtIdNull;
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
		
		if (!(_other instanceof TraditionalAuthority)) {
			return false;
		}
		
		final TraditionalAuthority _cast = (TraditionalAuthority) _other;
		if (traditionalAuthorityId != _cast.traditionalAuthorityId) {
			return false;
		}
		
		if (name == null ? _cast.name != name : !name.equals( _cast.name )) {
			return false;
		}
		
		if (districtId != _cast.districtId) {
			return false;
		}
		
		if (districtIdNull != _cast.districtIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (traditionalAuthorityId ^ (traditionalAuthorityId >>> 32));
		if (name != null) {
			_hashCode = 29 * _hashCode + name.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (districtId ^ (districtId >>> 32));
		_hashCode = 29 * _hashCode + (districtIdNull ? 1 : 0);
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
	 * @return TraditionalAuthorityPk
	 */
	public TraditionalAuthorityPk createPk()
	{
		return new TraditionalAuthorityPk(traditionalAuthorityId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.baobab.htc.data.daos.dto.TraditionalAuthority: " );
		ret.append( "traditionalAuthorityId=" + traditionalAuthorityId );
		ret.append( ", name=" + name );
		ret.append( ", districtId=" + districtId );
		ret.append( ", dateCreated=" + dateCreated );
		ret.append( ", createdBy=" + createdBy );
		ret.append( ", dateModified=" + dateModified );
		ret.append( ", modifiedBy=" + modifiedBy );
		ret.append( ", status=" + status );
		return ret.toString();
	}

}
