package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the Symptom table.
 */
public class SymptomPk implements Serializable
{
	protected long symptomId;

	/** 
	 * This attribute represents whether the primitive attribute symptomId is null.
	 */
	protected boolean symptomIdNull;

	/** 
	 * Sets the value of symptomId
	 */
	public void setSymptomId(long symptomId)
	{
		this.symptomId = symptomId;
	}

	/** 
	 * Gets the value of symptomId
	 */
	public long getSymptomId()
	{
		return symptomId;
	}

	/**
	 * Method 'SymptomPk'
	 * 
	 */
	public SymptomPk()
	{
	}

	/**
	 * Method 'SymptomPk'
	 * 
	 * @param symptomId
	 */
	public SymptomPk(final long symptomId)
	{
		this.symptomId = symptomId;
	}

	/** 
	 * Sets the value of symptomIdNull
	 */
	public void setSymptomIdNull(boolean symptomIdNull)
	{
		this.symptomIdNull = symptomIdNull;
	}

	/** 
	 * Gets the value of symptomIdNull
	 */
	public boolean isSymptomIdNull()
	{
		return symptomIdNull;
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
		
		if (!(_other instanceof SymptomPk)) {
			return false;
		}
		
		final SymptomPk _cast = (SymptomPk) _other;
		if (symptomId != _cast.symptomId) {
			return false;
		}
		
		if (symptomIdNull != _cast.symptomIdNull) {
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
		_hashCode = 29 * _hashCode + (symptomIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.SymptomPk: " );
		ret.append( "symptomId=" + symptomId );
		return ret.toString();
	}

}
