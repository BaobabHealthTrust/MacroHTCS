package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.SessionTypeDao;
import com.baobab.htc.data.daos.dto.SessionType;
import com.baobab.htc.data.daos.dto.SessionTypePk;
import com.baobab.htc.data.daos.exceptions.SessionTypeDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class SessionTypeDaoImpl extends AbstractDAO implements ParameterizedRowMapper<SessionType>, SessionTypeDao
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
	 * @return SessionTypePk
	 */
	@Transactional
	public SessionTypePk insert(SessionType dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( sessionTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status ) VALUES ( ?, ?, ?, ?, ?, ?, ? )",dto.getSessionTypeId(),dto.getDescription(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the SessionType table.
	 */
	@Transactional
	public void update(SessionTypePk pk, SessionType dto) throws SessionTypeDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET sessionTypeId = ?, description = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ? WHERE sessionTypeId = ?",dto.getSessionTypeId(),dto.getDescription(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),pk.getSessionTypeId());
	}

	/** 
	 * Deletes a single row in the SessionType table.
	 */
	@Transactional
	public void delete(SessionTypePk pk) throws SessionTypeDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE sessionTypeId = ?",pk.getSessionTypeId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SessionType
	 */
	public SessionType mapRow(ResultSet rs, int row) throws SQLException
	{
		SessionType dto = new SessionType();
		dto.setSessionTypeId( rs.getLong( 1 ) );
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
		return "SessionType";
	}

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'sessionTypeId = :sessionTypeId'.
	 */
	@Transactional
	public SessionType findByPrimaryKey(long sessionTypeId) throws SessionTypeDaoException
	{
		try {
			List<SessionType> list = jdbcTemplate.query("SELECT sessionTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionTypeId = ?", this,sessionTypeId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SessionTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'sessionTypeCategoryId = :sessionTypeCategoryId'.
	 */
	@Transactional
	public List<SessionType> findBySessiontypecategory(BigDecimal sessionTypeCategoryId) throws SessionTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionTypeCategoryId = ?", this,sessionTypeCategoryId);
		}
		catch (Exception e) {
			throw new SessionTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'sessionTypeCategoryId = :sessionTypeCategoryId'.
	 */
	@Transactional
	public List<SessionType> findWhereSessionTypeCategoryIdEquals(BigDecimal sessionTypeCategoryId) throws SessionTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionTypeCategoryId = ? ORDER BY sessionTypeCategoryId", this,sessionTypeCategoryId);
		}
		catch (Exception e) {
			throw new SessionTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionType table that match the criteria ''.
	 */
	@Transactional
	public List<SessionType> findAll() throws SessionTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " ORDER BY sessionTypeId", this);
		}
		catch (Exception e) {
			throw new SessionTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'sessionTypeId = :sessionTypeId'.
	 */
	@Transactional
	public List<SessionType> findWhereSessionTypeIdEquals(BigDecimal sessionTypeId) throws SessionTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionTypeId = ? ORDER BY sessionTypeId", this,sessionTypeId);
		}
		catch (Exception e) {
			throw new SessionTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'description = :description'.
	 */
	@Transactional
	public List<SessionType> findWhereDescriptionEquals(String description) throws SessionTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE description = ? ORDER BY description", this,description);
		}
		catch (Exception e) {
			throw new SessionTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<SessionType> findWhereDateCreatedEquals(Date dateCreated) throws SessionTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new SessionTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<SessionType> findWhereCreatedByEquals(String createdBy) throws SessionTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new SessionTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<SessionType> findWhereDateModifiedEquals(Date dateModified) throws SessionTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new SessionTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<SessionType> findWhereModifiedByEquals(String modifiedBy) throws SessionTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new SessionTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionType table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<SessionType> findWhereStatusEquals(int status) throws SessionTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new SessionTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the SessionType table that matches the specified primary-key value.
	 */
	public SessionType findByPrimaryKey(SessionTypePk pk) throws SessionTypeDaoException
	{
		return findByPrimaryKey( pk.getSessionTypeId() );
	}

}
