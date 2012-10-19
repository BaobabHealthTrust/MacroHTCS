package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.TestingTypeDao;
import com.baobab.htc.data.daos.dto.TestingType;
import com.baobab.htc.data.daos.dto.TestingTypePk;
import com.baobab.htc.data.daos.exceptions.TestingTypeDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface TestingTypeDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return TestingTypePk
	 */
	public TestingTypePk insert(TestingType dto);

	/** 
	 * Updates a single row in the TestingType table.
	 */
	public void update(TestingTypePk pk, TestingType dto) throws TestingTypeDaoException;

	/** 
	 * Deletes a single row in the TestingType table.
	 */
	public void delete(TestingTypePk pk) throws TestingTypeDaoException;

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'testingTypeId = :testingTypeId'.
	 */
	public TestingType findByPrimaryKey(long testingTypeId) throws TestingTypeDaoException;

	/** 
	 * Returns all rows from the TestingType table that match the criteria ''.
	 */
	public List<TestingType> findAll() throws TestingTypeDaoException;

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'testingTypeCategoryId = :testingTypeCategoryId'.
	 */
	public List<TestingType> findByTestingTypeCategory(BigDecimal testingTypeCategoryId) throws TestingTypeDaoException;

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'testingTypeId = :testingTypeId'.
	 */
	public List<TestingType> findWhereTestingTypeIdEquals(BigDecimal testingTypeId) throws TestingTypeDaoException;

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'description = :description'.
	 */
	public List<TestingType> findWhereDescriptionEquals(String description) throws TestingTypeDaoException;

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'testingTypeCategoryId = :testingTypeCategoryId'.
	 */
	public List<TestingType> findWhereTestingTypeCategoryIdEquals(BigDecimal testingTypeCategoryId) throws TestingTypeDaoException;

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<TestingType> findWhereDateCreatedEquals(Date dateCreated) throws TestingTypeDaoException;

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<TestingType> findWhereCreatedByEquals(String createdBy) throws TestingTypeDaoException;

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<TestingType> findWhereDateModifiedEquals(Date dateModified) throws TestingTypeDaoException;

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<TestingType> findWhereModifiedByEquals(String modifiedBy) throws TestingTypeDaoException;

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'status = :status'.
	 */
	public List<TestingType> findWhereStatusEquals(int status) throws TestingTypeDaoException;

	/** 
	 * Returns the rows from the TestingType table that matches the specified primary-key value.
	 */
	public TestingType findByPrimaryKey(TestingTypePk pk) throws TestingTypeDaoException;

}
