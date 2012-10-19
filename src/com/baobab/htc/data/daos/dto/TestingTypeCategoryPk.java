package com.baobab.htc.data.daos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the TestingTypeCategory table.
 */
public class TestingTypeCategoryPk implements Serializable
{
	protected long testingTypeCategoryId;

	/** 
	 * This attribute represents whether the primitive attribute testingTypeCategoryId is null.
	 */
	protected boolean testingTypeCategoryIdNull;

	/** 
	 * Sets the value of testingTypeCategoryId
	 */
	public void setTestingTypeCategoryId(long testingTypeCategoryId)
	{
		this.testingTypeCategoryId = testingTypeCategoryId;
	}

	/** 
	 * Gets the value of testingTypeCategoryId
	 */
	public long getTestingTypeCategoryId()
	{
		return testingTypeCategoryId;
	}

	/**
	 * Method 'TestingTypeCategoryPk'
	 * 
	 */
	public TestingTypeCategoryPk()
	{
	}

	/**
	 * Method 'TestingTypeCategoryPk'
	 * 
	 * @param testingTypeCategoryId
	 */
	public TestingTypeCategoryPk(final long testingTypeCategoryId)
	{
		this.testingTypeCategoryId = testingTypeCategoryId;
	}

	/** 
	 * Sets the value of testingTypeCategoryIdNull
	 */
	public void setTestingTypeCategoryIdNull(boolean testingTypeCategoryIdNull)
	{
		this.testingTypeCategoryIdNull = testingTypeCategoryIdNull;
	}

	/** 
	 * Gets the value of testingTypeCategoryIdNull
	 */
	public boolean isTestingTypeCategoryIdNull()
	{
		return testingTypeCategoryIdNull;
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
		
		if (!(_other instanceof TestingTypeCategoryPk)) {
			return false;
		}
		
		final TestingTypeCategoryPk _cast = (TestingTypeCategoryPk) _other;
		if (testingTypeCategoryId != _cast.testingTypeCategoryId) {
			return false;
		}
		
		if (testingTypeCategoryIdNull != _cast.testingTypeCategoryIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (testingTypeCategoryId ^ (testingTypeCategoryId >>> 32));
		_hashCode = 29 * _hashCode + (testingTypeCategoryIdNull ? 1 : 0);
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
		ret.append( "com.baobab.htc.data.daos.dto.TestingTypeCategoryPk: " );
		ret.append( "testingTypeCategoryId=" + testingTypeCategoryId );
		return ret.toString();
	}

}
