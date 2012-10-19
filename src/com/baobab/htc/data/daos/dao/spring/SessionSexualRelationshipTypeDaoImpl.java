package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.SessionSexualRelationshipTypeDao;
import com.baobab.htc.data.daos.dto.SessionSexualRelationshipType;
import com.baobab.htc.data.daos.dto.SessionSexualRelationshipTypePk;
import com.baobab.htc.data.daos.exceptions.SessionSexualRelationshipTypeDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class SessionSexualRelationshipTypeDaoImpl extends AbstractDAO implements ParameterizedRowMapper<SessionSexualRelationshipType>, SessionSexualRelationshipTypeDao
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
	 * @return SessionSexualRelationshipTypePk
	 */
	@Transactional
	public SessionSexualRelationshipTypePk insert(SessionSexualRelationshipType dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( sessionSexualRelationshipTypeId, sessionReference, sexualRelationshipTypeId, dateCreated, createdBy, dateModified, modifiedBy, status ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )",dto.getSessionSexualRelationshipTypeId(),dto.getSessionReference(),dto.isSexualRelationshipTypeIdNull()?null:dto.getSexualRelationshipTypeId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the SessionSexualRelationshipType table.
	 */
	@Transactional
	public void update(SessionSexualRelationshipTypePk pk, SessionSexualRelationshipType dto) throws SessionSexualRelationshipTypeDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET sessionSexualRelationshipTypeId = ?, sessionReference = ?, sexualRelationshipTypeId = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ? WHERE sessionSexualRelationshipTypeId = ?",dto.getSessionSexualRelationshipTypeId(),dto.getSessionReference(),dto.getSexualRelationshipTypeId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),pk.getSessionSexualRelationshipTypeId());
	}

	/** 
	 * Deletes a single row in the SessionSexualRelationshipType table.
	 */
	@Transactional
	public void delete(SessionSexualRelationshipTypePk pk) throws SessionSexualRelationshipTypeDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE sessionSexualRelationshipTypeId = ?",pk.getSessionSexualRelationshipTypeId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SessionSexualRelationshipType
	 */
	public SessionSexualRelationshipType mapRow(ResultSet rs, int row) throws SQLException
	{
		SessionSexualRelationshipType dto = new SessionSexualRelationshipType();
		dto.setSessionSexualRelationshipTypeId( rs.getLong( 1 ) );
		dto.setSessionReference( rs.getString( 2 ) );
		dto.setSexualRelationshipTypeId( rs.getLong( 3 ) );
		if (rs.wasNull()) {
			dto.setSexualRelationshipTypeIdNull( true );
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
		return "SessionSexualRelationshipType";
	}

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'sessionSexualRelationshipTypeId = :sessionSexualRelationshipTypeId'.
	 */
	@Transactional
	public SessionSexualRelationshipType findByPrimaryKey(long sessionSexualRelationshipTypeId) throws SessionSexualRelationshipTypeDaoException
	{
		try {
			List<SessionSexualRelationshipType> list = jdbcTemplate.query("SELECT sessionSexualRelationshipTypeId, sessionReference, sexualRelationshipTypeId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionSexualRelationshipTypeId = ?", this,sessionSexualRelationshipTypeId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SessionSexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'sexualRelationshipTypeId = :sexualRelationshipTypeId'.
	 */
	@Transactional
	public List<SessionSexualRelationshipType> findBySexualRelationShipType(BigDecimal sexualRelationshipTypeId) throws SessionSexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSexualRelationshipTypeId, sessionReference, sexualRelationshipTypeId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sexualRelationshipTypeId = ?", this,sexualRelationshipTypeId);
		}
		catch (Exception e) {
			throw new SessionSexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria ''.
	 */
	@Transactional
	public List<SessionSexualRelationshipType> findAll() throws SessionSexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSexualRelationshipTypeId, sessionReference, sexualRelationshipTypeId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " ORDER BY sessionSexualRelationshipTypeId", this);
		}
		catch (Exception e) {
			throw new SessionSexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'sessionReference = :sessionReference'.
	 */
	@Transactional
	public List<SessionSexualRelationshipType> findBySession(String sessionReference) throws SessionSexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSexualRelationshipTypeId, sessionReference, sexualRelationshipTypeId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionReference = ?", this,sessionReference);
		}
		catch (Exception e) {
			throw new SessionSexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'sexualRelationshipTypeId = :sexualRelationshipTypeId'.
	 */
	@Transactional
	public List<SessionSexualRelationshipType> findBySexualRelationshipType(BigDecimal sexualRelationshipTypeId) throws SessionSexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSexualRelationshipTypeId, sessionReference, sexualRelationshipTypeId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sexualRelationshipTypeId = ?", this,sexualRelationshipTypeId);
		}
		catch (Exception e) {
			throw new SessionSexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'sessionSexualRelationshipTypeId = :sessionSexualRelationshipTypeId'.
	 */
	@Transactional
	public List<SessionSexualRelationshipType> findWhereSessionSexualRelationshipTypeIdEquals(BigDecimal sessionSexualRelationshipTypeId) throws SessionSexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSexualRelationshipTypeId, sessionReference, sexualRelationshipTypeId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionSexualRelationshipTypeId = ? ORDER BY sessionSexualRelationshipTypeId", this,sessionSexualRelationshipTypeId);
		}
		catch (Exception e) {
			throw new SessionSexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'sessionReference = :sessionReference'.
	 */
	@Transactional
	public List<SessionSexualRelationshipType> findWhereSessionReferenceEquals(String sessionReference) throws SessionSexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSexualRelationshipTypeId, sessionReference, sexualRelationshipTypeId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionReference = ? ORDER BY sessionReference", this,sessionReference);
		}
		catch (Exception e) {
			throw new SessionSexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'sexualRelationshipTypeId = :sexualRelationshipTypeId'.
	 */
	@Transactional
	public List<SessionSexualRelationshipType> findWhereSexualRelationshipTypeIdEquals(BigDecimal sexualRelationshipTypeId) throws SessionSexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSexualRelationshipTypeId, sessionReference, sexualRelationshipTypeId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sexualRelationshipTypeId = ? ORDER BY sexualRelationshipTypeId", this,sexualRelationshipTypeId);
		}
		catch (Exception e) {
			throw new SessionSexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<SessionSexualRelationshipType> findWhereDateCreatedEquals(Date dateCreated) throws SessionSexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSexualRelationshipTypeId, sessionReference, sexualRelationshipTypeId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new SessionSexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<SessionSexualRelationshipType> findWhereCreatedByEquals(String createdBy) throws SessionSexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSexualRelationshipTypeId, sessionReference, sexualRelationshipTypeId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new SessionSexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<SessionSexualRelationshipType> findWhereDateModifiedEquals(Date dateModified) throws SessionSexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSexualRelationshipTypeId, sessionReference, sexualRelationshipTypeId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new SessionSexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<SessionSexualRelationshipType> findWhereModifiedByEquals(String modifiedBy) throws SessionSexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSexualRelationshipTypeId, sessionReference, sexualRelationshipTypeId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new SessionSexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSexualRelationshipType table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<SessionSexualRelationshipType> findWhereStatusEquals(int status) throws SessionSexualRelationshipTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSexualRelationshipTypeId, sessionReference, sexualRelationshipTypeId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new SessionSexualRelationshipTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the SessionSexualRelationshipType table that matches the specified primary-key value.
	 */
	public SessionSexualRelationshipType findByPrimaryKey(SessionSexualRelationshipTypePk pk) throws SessionSexualRelationshipTypeDaoException
	{
		return findByPrimaryKey( pk.getSessionSexualRelationshipTypeId() );
	}

}
