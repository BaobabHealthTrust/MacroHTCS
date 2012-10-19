package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.TestingTypeCategoryDao;
import com.baobab.htc.data.daos.dto.TestingTypeCategory;
import com.baobab.htc.data.daos.dto.TestingTypeCategoryPk;
import com.baobab.htc.data.daos.exceptions.TestingTypeCategoryDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface TestingTypeCategoryDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return TestingTypeCategoryPk
	 */
	public TestingTypeCategoryPk insert(TestingTypeCategory dto);

	/** 
	 * Updates a single row in the TestingTypeCategory table.
	 */
	public void update(TestingTypeCategoryPk pk, TestingTypeCategory dto) throws TestingTypeCategoryDaoException;

	/** 
	 * Deletes a single row in the TestingTypeCategory table.
	 */
	public void delete(TestingTypeCategoryPk pk) throws TestingTypeCategoryDaoException;

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'testingTypeCategoryId = :testingTypeCategoryId'.
	 */
	public TestingTypeCategory findByPrimaryKey(long testingTypeCategoryId) throws TestingTypeCategoryDaoException;

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria ''.
	 */
	public List<TestingTypeCategory> findAll() throws TestingTypeCategoryDaoException;

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'testingTypeCategoryId = :testingTypeCategoryId'.
	 */
	public List<TestingTypeCategory> findWhereTestingTypeCategoryIdEquals(BigDecimal testingTypeCategoryId) throws TestingTypeCategoryDaoException;

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'description = :description'.
	 */
	public List<TestingTypeCategory> findWhereDescriptionEquals(String description) throws TestingTypeCategoryDaoException;

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<TestingTypeCategory> findWhereDateCreatedEquals(Date dateCreated) throws TestingTypeCategoryDaoException;

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<TestingTypeCategory> findWhereCreatedByEquals(String createdBy) throws TestingTypeCategoryDaoException;

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<TestingTypeCategory> findWhereDateModifiedEquals(Date dateModified) throws TestingTypeCategoryDaoException;

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<TestingTypeCategory> findWhereModifiedByEquals(String modifiedBy) throws TestingTypeCategoryDaoException;

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'status = :status'.
	 */
	public List<TestingTypeCategory> findWhereStatusEquals(int status) throws TestingTypeCategoryDaoException;

	/** 
	 * Returns the rows from the TestingTypeCategory table that matches the specified primary-key value.
	 */
	public TestingTypeCategory findByPrimaryKey(TestingTypeCategoryPk pk) throws TestingTypeCategoryDaoException;

}
