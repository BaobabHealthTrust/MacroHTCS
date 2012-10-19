package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.TestingTypeDao;
import com.baobab.htc.data.daos.dto.TestingType;
import com.baobab.htc.data.daos.dto.TestingTypePk;
import com.baobab.htc.data.daos.exceptions.TestingTypeDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class TestingTypeDaoImpl extends AbstractDAO implements ParameterizedRowMapper<TestingType>, TestingTypeDao
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
	 * @return TestingTypePk
	 */
	@Transactional
	public TestingTypePk insert(TestingType dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( testingTypeId, description, testingTypeCategoryId, dateCreated, createdBy, dateModified, modifiedBy, status ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )",dto.getTestingTypeId(),dto.getDescription(),dto.isTestingTypeCategoryIdNull()?null:dto.getTestingTypeCategoryId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the TestingType table.
	 */
	@Transactional
	public void update(TestingTypePk pk, TestingType dto) throws TestingTypeDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET testingTypeId = ?, description = ?, testingTypeCategoryId = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ? WHERE testingTypeId = ?",dto.getTestingTypeId(),dto.getDescription(),dto.getTestingTypeCategoryId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),pk.getTestingTypeId());
	}

	/** 
	 * Deletes a single row in the TestingType table.
	 */
	@Transactional
	public void delete(TestingTypePk pk) throws TestingTypeDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE testingTypeId = ?",pk.getTestingTypeId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return TestingType
	 */
	public TestingType mapRow(ResultSet rs, int row) throws SQLException
	{
		TestingType dto = new TestingType();
		dto.setTestingTypeId( rs.getLong( 1 ) );
		dto.setDescription( rs.getString( 2 ) );
		dto.setTestingTypeCategoryId( rs.getLong( 3 ) );
		if (rs.wasNull()) {
			dto.setTestingTypeCategoryIdNull( true );
		}
		
		dto.setDateCreated( rs.getTimestamp(4 ) );
		dto.setCreatedBy( rs.getString( 5 ) );
		dto.setDateModified( rs.getTimestamp(6 ) );
		dto.setModifiedBy( rs.getString( 7 ) );
		dto.setStatus( rs.getInt( 8 ) );
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
		return "TestingType";
	}

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'testingTypeId = :testingTypeId'.
	 */
	@Transactional
	public TestingType findByPrimaryKey(long testingTypeId) throws TestingTypeDaoException
	{
		try {
			List<TestingType> list = jdbcTemplate.query("SELECT testingTypeId, description, testingTypeCategoryId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE testingTypeId = ?", this,testingTypeId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new TestingTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingType table that match the criteria ''.
	 */
	@Transactional
	public List<TestingType> findAll() throws TestingTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeId, description, testingTypeCategoryId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " ORDER BY testingTypeId", this);
		}
		catch (Exception e) {
			throw new TestingTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'testingTypeCategoryId = :testingTypeCategoryId'.
	 */
	@Transactional
	public List<TestingType> findByTestingTypeCategory(BigDecimal testingTypeCategoryId) throws TestingTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeId, description, testingTypeCategoryId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE testingTypeCategoryId = ?", this,testingTypeCategoryId);
		}
		catch (Exception e) {
			throw new TestingTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'testingTypeId = :testingTypeId'.
	 */
	@Transactional
	public List<TestingType> findWhereTestingTypeIdEquals(BigDecimal testingTypeId) throws TestingTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeId, description, testingTypeCategoryId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE testingTypeId = ? ORDER BY testingTypeId", this,testingTypeId);
		}
		catch (Exception e) {
			throw new TestingTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'description = :description'.
	 */
	@Transactional
	public List<TestingType> findWhereDescriptionEquals(String description) throws TestingTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeId, description, testingTypeCategoryId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE description = ? ORDER BY description", this,description);
		}
		catch (Exception e) {
			throw new TestingTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'testingTypeCategoryId = :testingTypeCategoryId'.
	 */
	@Transactional
	public List<TestingType> findWhereTestingTypeCategoryIdEquals(BigDecimal testingTypeCategoryId) throws TestingTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeId, description, testingTypeCategoryId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE testingTypeCategoryId = ? ORDER BY testingTypeCategoryId", this,testingTypeCategoryId);
		}
		catch (Exception e) {
			throw new TestingTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<TestingType> findWhereDateCreatedEquals(Date dateCreated) throws TestingTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeId, description, testingTypeCategoryId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new TestingTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<TestingType> findWhereCreatedByEquals(String createdBy) throws TestingTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeId, description, testingTypeCategoryId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new TestingTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<TestingType> findWhereDateModifiedEquals(Date dateModified) throws TestingTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeId, description, testingTypeCategoryId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new TestingTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<TestingType> findWhereModifiedByEquals(String modifiedBy) throws TestingTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeId, description, testingTypeCategoryId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new TestingTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TestingType table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<TestingType> findWhereStatusEquals(int status) throws TestingTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT testingTypeId, description, testingTypeCategoryId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new TestingTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the TestingType table that matches the specified primary-key value.
	 */
	public TestingType findByPrimaryKey(TestingTypePk pk) throws TestingTypeDaoException
	{
		return findByPrimaryKey( pk.getTestingTypeId() );
	}

}
