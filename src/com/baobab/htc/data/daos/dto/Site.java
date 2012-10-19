package com.baobab.htc.data.daos.dto;

import com.baobab.htc.data.daos.dao.*;
import com.baobab.htc.data.daos.factory.*;
import com.baobab.htc.data.daos.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;
import java.math.BigDecimal;

public class Site implements Serializable
{
	/** 
	 * This attribute maps to the column siteId in the Site table.
	 */
	protected long siteId;

	/** 
	 * This attribute maps to the column name in the Site table.
	 */
	protected String name;

	/** 
	 * This attribute maps to the column siteTypeId in the Site table.
	 */
	protected long siteTypeId;

	/** 
	 * This attribute represents whether the primitive attribute siteTypeId is null.
	 */
	protected boolean siteTypeIdNull = true;

	/** 
	 * This attribute maps to the column dateCreated in the Site table.
	 */
	protected Date dateCreated;

	/** 
	 * This attribute maps to the column createdBy in the Site table.
	 */
	protected String createdBy;

	/** 
	 * This attribute maps to the column dateModified in the Site table.
	 */
	protected Date dateModified;

	/** 
	 * This attribute maps to the column modifiedBy in the Site table.
	 */
	protected String modifiedBy;

	/** 
	 * This attribute maps to the column status in the Site table.
	 */
	protected int status;

	/** 
	 * This attribute represents whether the primitive attribute status is null.
	 */
	protected boolean statusNull = true;

	/** 
	 * This attribute maps to the column traditionalAuthorityId in the Site table.
	 */
	protected long traditionalAuthorityId;

	/** 
	 * This attribute represents whether the primitive attribute traditionalAuthorityId is null.
	 */
	protected boolean traditionalAuthorityIdNull = true;

	/**
	 * Method 'Site'
	 * 
	 */
	public Site()
	{
	}

	/**
	 * Method 'getSiteId'
	 * 
	 * @return long
	 */
	public long getSiteId()
	{
		return siteId;
	}

	/**
	 * Method 'setSiteId'
	 * 
	 * @param siteId
	 */
	public void setSiteId(long siteId)
	{
		this.siteId = siteId;
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
	 * Method 'getSiteTypeId'
	 * 
	 * @return long
	 */
	public long getSiteTypeId()
	{
		return siteTypeId;
	}

	/**
	 * Method 'setSiteTypeId'
	 * 
	 * @param siteTypeId
	 */
	public void setSiteTypeId(long siteTypeId)
	{
		this.siteTypeId = siteTypeId;
		this.siteTypeIdNull = false;
	}

	/**
	 * Method 'setSiteTypeIdNull'
	 * 
	 * @param value
	 */
	public void setSiteTypeIdNull(boolean value)
	{
		this.siteTypeIdNull = value;
	}

	/**
	 * Method 'isSiteTypeIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isSiteTypeIdNull()
	{
		return siteTypeIdNull;
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
		this.traditionalAuthorityIdNull = false;
	}

	/**
	 * Method 'setTraditionalAuthorityIdNull'
	 * 
	 * @param value
	 */
	public void setTraditionalAuthorityIdNull(boolean value)
	{
		this.traditionalAuthorityIdNull = value;
	}

	/**
	 * Method 'isTraditionalAuthorityIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isTraditionalAuthorityIdNull()
	{
		return traditionalAuthorityIdNull;
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
		
		if (!(_other instanceof Site)) {
			return false;
		}
		
		final Site _cast = (Site) _other;
		if (siteId != _cast.siteId) {
			return false;
		}
		
		if (name == null ? _cast.name != name : !name.equals( _cast.name )) {
			return false;
		}
		
		if (siteTypeId != _cast.siteTypeId) {
			return false;
		}
		
		if (siteTypeIdNull != _cast.siteTypeIdNull) {
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
		
		if (traditionalAuthorityId != _cast.traditionalAuthorityId) {
			return false;
		}
		
		if (traditionalAuthorityIdNull != _cast.traditionalAuthorityIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (siteId ^ (siteId >>> 32));
		if (name != null) {
			_hashCode = 29 * _hashCode + name.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (siteTypeId ^ (siteTypeId >>> 32));
		_hashCode = 29 * _hashCode + (siteTypeIdNull ? 1 : 0);
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
		_hashCode = 29 * _hashCode + (int) (traditionalAuthorityId ^ (traditionalAuthorityId >>> 32));
		_hashCode = 29 * _hashCode + (traditionalAuthorityIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SitePk
	 */
	public SitePk createPk()
	{
		return new SitePk(siteId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.baobab.htc.data.daos.dto.Site: " );
		ret.append( "siteId=" + siteId );
		ret.append( ", name=" + name );
		ret.append( ", siteTypeId=" + siteTypeId );
		ret.append( ", dateCreated=" + dateCreated );
		ret.append( ", createdBy=" + createdBy );
		ret.append( ", dateModified=" + dateModified );
		ret.append( ", modifiedBy=" + modifiedBy );
		ret.append( ", status=" + status );
		ret.append( ", traditionalAuthorityId=" + traditionalAuthorityId );
		return ret.toString();
	}

}
