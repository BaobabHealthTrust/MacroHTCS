package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the TestingType table.
 */
public class TestingTypePk implements Serializable
{
	protected long testingTypeId;

	/** 
	 * This attribute represents whether the primitive attribute testingTypeId is null.
	 */
	protected boolean testingTypeIdNull;

	/** 
	 * Sets the value of testingTypeId
	 */
	public void setTestingTypeId(long testingTypeId)
	{
		this.testingTypeId = testingTypeId;
	}

	/** 
	 * Gets the value of testingTypeId
	 */
	public long getTestingTypeId()
	{
		return testingTypeId;
	}

	/**
	 * Method 'TestingTypePk'
	 * 
	 */
	public TestingTypePk()
	{
	}

	/**
	 * Method 'TestingTypePk'
	 * 
	 * @param testingTypeId
	 */
	public TestingTypePk(final long testingTypeId)
	{
		this.testingTypeId = testingTypeId;
	}

	/** 
	 * Sets the value of testingTypeIdNull
	 */
	public void setTestingTypeIdNull(boolean testingTypeIdNull)
	{
		this.testingTypeIdNull = testingTypeIdNull;
	}

	/** 
	 * Gets the value of testingTypeIdNull
	 */
	public boolean isTestingTypeIdNull()
	{
		return testingTypeIdNull;
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
		
		if (!(_other instanceof TestingTypePk)) {
			return false;
		}
		
		final TestingTypePk _cast = (TestingTypePk) _other;
		if (testingTypeId != _cast.testingTypeId) {
			return false;
		}
		
		if (testingTypeIdNull != _cast.testingTypeIdNull) {
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
		_hashCode = 29 * _hashCode + (testingTypeIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.TestingTypePk: " );
		ret.append( "testingTypeId=" + testingTypeId );
		return ret.toString();
	}

}
