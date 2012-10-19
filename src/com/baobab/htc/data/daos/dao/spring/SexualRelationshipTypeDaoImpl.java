package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.SexualRelationshipTypeDao;
import com.baobab.htc.data.daos.dto.SexualRelationshipType;
import com.baobab.htc.data.daos.dto.SexualRelationshipTypePk;
import com.baobab.htc.data.daos.exceptions.SexualRelationshipTypeDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class SexualRelationshipTypeDaoImpl extends AbstractDAO implements ParameterizedRowMapper<SexualRelationshipType>, SexualRelationshipTypeDao
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
	 * @return SexualRelationshipTypePk
	 */
	@Transactional
	public SexualRelationshipTypePk insert(SexualRelationshipType dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( sexualRelationshipTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status ) VALUES ( ?, ?, ?, ?, ?, ?, ? )",dto.getSexualRelationshipTypeId(),dto.getDescription(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the SexualRelationshipType table.
	 */
	@Transactional
	public void update(SexualRelationshipTypePk pk, SexualRelationshipType dto) throws SexualRelationshipTypeDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET sexualRelationshipTypeId = ?, description = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ? WHERE sexualRelationshipTypeId = ?",dto.getSexualRelationshipTypeId(),dto.getDescription(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),pk.getSexualRelationshipTypeId());
	}

	/** 
	 * Deletes a single row in the SexualRelationshipType table.
	 */
	@Transactional
	public void delete(SexualRelationshipTypePk pk) throws SexualRelationshipTypeDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE sexualRelationshipTypeId = ?",pk.getSexualRelationshipTypeId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SexualRelationshipType
	 */
	public SexualRelationshipType mapRow(ResultSet rs, int row) throws SQLException
	{
		SexualRelationshipType dto = new SexualRelationshipType();
		dto.setSexualRelationshipTypeId( rs.getLong( 1 ) );
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
		return "SexualRelationshipType";
	}

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'sexualRelationshipTypeId = :sexualRelationshipTypeId'.
	 */
	@Transactional
	public SexualRelationshipType findByPrimaryKey(long sexualRelationshipTypeId) throws SexualRelationshipTypeDaoException
	{
		try {
			List<SexualRelationshipType> list = jdbcTemplate.query("SELECT sexualRelationshipTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sexualRelationshipTypeId = ?", this,sexualRelationshipTypeId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria ''.
	 */
	@Transactional
	public List<SexualRelationshipType> findAll() throws SexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sexualRelationshipTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " ORDER BY sexualRelationshipTypeId", this);
		}
		catch (Exception e) {
			throw new SexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'sexualRelationshipTypeId = :sexualRelationshipTypeId'.
	 */
	@Transactional
	public List<SexualRelationshipType> findWhereSexualRelationshipTypeIdEquals(BigDecimal sexualRelationshipTypeId) throws SexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sexualRelationshipTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sexualRelationshipTypeId = ? ORDER BY sexualRelationshipTypeId", this,sexualRelationshipTypeId);
		}
		catch (Exception e) {
			throw new SexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'description = :description'.
	 */
	@Transactional
	public List<SexualRelationshipType> findWhereDescriptionEquals(String description) throws SexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sexualRelationshipTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE description = ? ORDER BY description", this,description);
		}
		catch (Exception e) {
			throw new SexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<SexualRelationshipType> findWhereDateCreatedEquals(Date dateCreated) throws SexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sexualRelationshipTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new SexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<SexualRelationshipType> findWhereCreatedByEquals(String createdBy) throws SexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sexualRelationshipTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new SexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<SexualRelationshipType> findWhereDateModifiedEquals(Date dateModified) throws SexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sexualRelationshipTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new SexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<SexualRelationshipType> findWhereModifiedByEquals(String modifiedBy) throws SexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sexualRelationshipTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new SexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SexualRelationshipType table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<SexualRelationshipType> findWhereStatusEquals(int status) throws SexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sexualRelationshipTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new SexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the SexualRelationshipType table that matches the specified primary-key value.
	 */
	public SexualRelationshipType findByPrimaryKey(SexualRelationshipTypePk pk) throws SexualRelationshipTypeDaoException
	{
		return findByPrimaryKey( pk.getSexualRelationshipTypeId() );
	}

}
