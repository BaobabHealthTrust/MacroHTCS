package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.TestingTypeCategoryDao;
import com.baobab.htc.data.daos.dto.TestingTypeCategory;
import com.baobab.htc.data.daos.dto.TestingTypeCategoryPk;
import com.baobab.htc.data.daos.exceptions.TestingTypeCategoryDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class TestingTypeCategoryDaoImpl extends AbstractDAO implements ParameterizedRowMapper<TestingTypeCategory>, TestingTypeCategoryDao
{
	protected SimpleJdbcTemplate jdbcTemplate;

	protected DataSource dataSource;

	/**
	 * Method 'setDataSource'
	 * 
	 * @param dataSource
	 */
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
		jdbcTemplate = new SimpleJdbcTemplate(dataSource);
	}

	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return TestingTypeCategoryPk
	 */
	@Transactional
	public TestingTypeCategoryPk insert(TestingTypeCategory dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( testingTypeCategoryId, description, dateCreated, createdBy, dateModified, modifiedBy, status ) VALUES ( ?, ?, ?, ?, ?, ?, ? )",dto.getTestingTypeCategoryId(),dto.getDescription(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the TestingTypeCategory table.
	 */
	@Transactional
	public void update(TestingTypeCategoryPk pk, TestingTypeCategory dto) throws TestingTypeCategoryDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET testingTypeCategoryId = ?, description = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ? WHERE testingTypeCategoryId = ?",dto.getTestingTypeCategoryId(),dto.getDescription(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),pk.getTestingTypeCategoryId());
	}

	/** 
	 * Deletes a single row in the TestingTypeCategory table.
	 */
	@Transactional
	public void delete(TestingTypeCategoryPk pk) throws TestingTypeCategoryDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE testingTypeCategoryId = ?",pk.getTestingTypeCategoryId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return TestingTypeCategory
	 */
	public TestingTypeCategory mapRow(ResultSet rs, int row) throws SQLException
	{
		TestingTypeCategory dto = new TestingTypeCategory();
		dto.setTestingTypeCategoryId( rs.getLong( 1 ) );
		dto.setDescription( rs.getString( 2 ) );
		dto.setDateCreated( rs.getTimestamp(3 ) );
		dto.setCreatedBy( rs.getString( 4 ) );
		dto.setDateModified( rs.getTimestamp(5 ) );
		dto.setModifiedBy( rs.getString( 6 ) );
		dto.setStatus( rs.getInt( 7 ) );
		if (rs.wasNull()) {
			dto.setStatusNull( true );
		}
		
		return dto;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "TestingTypeCategory";
	}

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'testingTypeCategoryId = :testingTypeCategoryId'.
	 */
	@Transactional
	public TestingTypeCategory findByPrimaryKey(long testingTypeCategoryId) throws TestingTypeCategoryDaoException
	{
		try {
			List<TestingTypeCategory> list = jdbcTemplate.query("SELECT testingTypeCategoryId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE testingTypeCategoryId = ?", this,testingTypeCategoryId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new TestingTypeCategoryDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria ''.
	 */
	@Transactional
	public List<TestingTypeCategory> findAll() throws TestingTypeCategoryDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeCategoryId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " ORDER BY testingTypeCategoryId", this);
		}
		catch (Exception e) {
			throw new TestingTypeCategoryDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'testingTypeCategoryId = :testingTypeCategoryId'.
	 */
	@Transactional
	public List<TestingTypeCategory> findWhereTestingTypeCategoryIdEquals(BigDecimal testingTypeCategoryId) throws TestingTypeCategoryDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeCategoryId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE testingTypeCategoryId = ? ORDER BY testingTypeCategoryId", this,testingTypeCategoryId);
		}
		catch (Exception e) {
			throw new TestingTypeCategoryDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'description = :description'.
	 */
	@Transactional
	public List<TestingTypeCategory> findWhereDescriptionEquals(String description) throws TestingTypeCategoryDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeCategoryId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE description = ? ORDER BY description", this,description);
		}
		catch (Exception e) {
			throw new TestingTypeCategoryDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<TestingTypeCategory> findWhereDateCreatedEquals(Date dateCreated) throws TestingTypeCategoryDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeCategoryId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new TestingTypeCategoryDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<TestingTypeCategory> findWhereCreatedByEquals(String createdBy) throws TestingTypeCategoryDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeCategoryId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new TestingTypeCategoryDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<TestingTypeCategory> findWhereDateModifiedEquals(Date dateModified) throws TestingTypeCategoryDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeCategoryId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new TestingTypeCategoryDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<TestingTypeCategory> findWhereModifiedByEquals(String modifiedBy) throws TestingTypeCategoryDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeCategoryId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new TestingTypeCategoryDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingTypeCategory table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<TestingTypeCategory> findWhereStatusEquals(int status) throws TestingTypeCategoryDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeCategoryId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new TestingTypeCategoryDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the TestingTypeCategory table that matches the specified primary-key value.
	 */
	public TestingTypeCategory findByPrimaryKey(TestingTypeCategoryPk pk) throws TestingTypeCategoryDaoException
	{
		return findByPrimaryKey( pk.getTestingTypeCategoryId() );
	}

}
