package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the SexualRelationshipType table.
 */
public class SexualRelationshipTypePk implements Serializable
{
	protected long sexualRelationshipTypeId;

	/** 
	 * This attribute represents whether the primitive attribute sexualRelationshipTypeId is null.
	 */
	protected boolean sexualRelationshipTypeIdNull;

	/** 
	 * Sets the value of sexualRelationshipTypeId
	 */
	public void setSexualRelationshipTypeId(long sexualRelationshipTypeId)
	{
		this.sexualRelationshipTypeId = sexualRelationshipTypeId;
	}

	/** 
	 * Gets the value of sexualRelationshipTypeId
	 */
	public long getSexualRelationshipTypeId()
	{
		return sexualRelationshipTypeId;
	}

	/**
	 * Method 'SexualRelationshipTypePk'
	 * 
	 */
	public SexualRelationshipTypePk()
	{
	}

	/**
	 * Method 'SexualRelationshipTypePk'
	 * 
	 * @param sexualRelationshipTypeId
	 */
	public SexualRelationshipTypePk(final long sexualRelationshipTypeId)
	{
		this.sexualRelationshipTypeId = sexualRelationshipTypeId;
	}

	/** 
	 * Sets the value of sexualRelationshipTypeIdNull
	 */
	public void setSexualRelationshipTypeIdNull(boolean sexualRelationshipTypeIdNull)
	{
		this.sexualRelationshipTypeIdNull = sexualRelationshipTypeIdNull;
	}

	/** 
	 * Gets the value of sexualRelationshipTypeIdNull
	 */
	public boolean isSexualRelationshipTypeIdNull()
	{
		return sexualRelationshipTypeIdNull;
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
		
		if (!(_other instanceof SexualRelationshipTypePk)) {
			return false;
		}
		
		final SexualRelationshipTypePk _cast = (SexualRelationshipTypePk) _other;
		if (sexualRelationshipTypeId != _cast.sexualRelationshipTypeId) {
			return false;
		}
		
		if (sexualRelationshipTypeIdNull != _cast.sexualRelationshipTypeIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (sexualRelationshipTypeId ^ (sexualRelationshipTypeId >>> 32));
		_hashCode = 29 * _hashCode + (sexualRelationshipTypeIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.SexualRelationshipTypePk: " );
		ret.append( "sexualRelationshipTypeId=" + sexualRelationshipTypeId );
		return ret.toString();
	}

}
