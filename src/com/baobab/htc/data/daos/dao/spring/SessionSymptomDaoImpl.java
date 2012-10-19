package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.SessionSymptomDao;
import com.baobab.htc.data.daos.dto.SessionSymptom;
import com.baobab.htc.data.daos.dto.SessionSymptomPk;
import com.baobab.htc.data.daos.exceptions.SessionSymptomDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class SessionSymptomDaoImpl extends AbstractDAO implements ParameterizedRowMapper<SessionSymptom>, SessionSymptomDao
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
	 * @return SessionSymptomPk
	 */
	@Transactional
	public SessionSymptomPk insert(SessionSymptom dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( sessionSymptomId, sessionReference, symptomId, dateCreated, createdBy, dateModified, modifiedBy, status ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )",dto.getSessionSymptomId(),dto.getSessionReference(),dto.isSymptomIdNull()?null:dto.getSymptomId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the SessionSymptom table.
	 */
	@Transactional
	public void update(SessionSymptomPk pk, SessionSymptom dto) throws SessionSymptomDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET sessionSymptomId = ?, sessionReference = ?, symptomId = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ? WHERE sessionSymptomId = ?",dto.getSessionSymptomId(),dto.getSessionReference(),dto.getSymptomId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),pk.getSessionSymptomId());
	}

	/** 
	 * Deletes a single row in the SessionSymptom table.
	 */
	@Transactional
	public void delete(SessionSymptomPk pk) throws SessionSymptomDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE sessionSymptomId = ?",pk.getSessionSymptomId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SessionSymptom
	 */
	public SessionSymptom mapRow(ResultSet rs, int row) throws SQLException
	{
		SessionSymptom dto = new SessionSymptom();
		dto.setSessionSymptomId( rs.getLong( 1 ) );
		dto.setSessionReference( rs.getString( 2 ) );
		dto.setSymptomId( rs.getLong( 3 ) );
		if (rs.wasNull()) {
			dto.setSymptomIdNull( true );
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
		return "SessionSymptom";
	}

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'sessionSymptomId = :sessionSymptomId'.
	 */
	@Transactional
	public SessionSymptom findByPrimaryKey(long sessionSymptomId) throws SessionSymptomDaoException
	{
		try {
			List<SessionSymptom> list = jdbcTemplate.query("SELECT sessionSymptomId, sessionReference, symptomId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionSymptomId = ?", this,sessionSymptomId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SessionSymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria ''.
	 */
	@Transactional
	public List<SessionSymptom> findAll() throws SessionSymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSymptomId, sessionReference, symptomId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " ORDER BY sessionSymptomId", this);
		}
		catch (Exception e) {
			throw new SessionSymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'sessionReference = :sessionReference'.
	 */
	@Transactional
	public List<SessionSymptom> findBySession(String sessionReference) throws SessionSymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSymptomId, sessionReference, symptomId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionReference = ?", this,sessionReference);
		}
		catch (Exception e) {
			throw new SessionSymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'symptomId = :symptomId'.
	 */
	@Transactional
	public List<SessionSymptom> findBySymptom(BigDecimal symptomId) throws SessionSymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSymptomId, sessionReference, symptomId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE symptomId = ?", this,symptomId);
		}
		catch (Exception e) {
			throw new SessionSymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'sessionSymptomId = :sessionSymptomId'.
	 */
	@Transactional
	public List<SessionSymptom> findWhereSessionSymptomIdEquals(BigDecimal sessionSymptomId) throws SessionSymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSymptomId, sessionReference, symptomId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionSymptomId = ? ORDER BY sessionSymptomId", this,sessionSymptomId);
		}
		catch (Exception e) {
			throw new SessionSymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'sessionReference = :sessionReference'.
	 */
	@Transactional
	public List<SessionSymptom> findWhereSessionReferenceEquals(String sessionReference) throws SessionSymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSymptomId, sessionReference, symptomId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionReference = ? ORDER BY sessionReference", this,sessionReference);
		}
		catch (Exception e) {
			throw new SessionSymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'symptomId = :symptomId'.
	 */
	@Transactional
	public List<SessionSymptom> findWhereSymptomIdEquals(BigDecimal symptomId) throws SessionSymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSymptomId, sessionReference, symptomId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE symptomId = ? ORDER BY symptomId", this,symptomId);
		}
		catch (Exception e) {
			throw new SessionSymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<SessionSymptom> findWhereDateCreatedEquals(Date dateCreated) throws SessionSymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSymptomId, sessionReference, symptomId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new SessionSymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<SessionSymptom> findWhereCreatedByEquals(String createdBy) throws SessionSymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSymptomId, sessionReference, symptomId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new SessionSymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<SessionSymptom> findWhereDateModifiedEquals(Date dateModified) throws SessionSymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSymptomId, sessionReference, symptomId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new SessionSymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<SessionSymptom> findWhereModifiedByEquals(String modifiedBy) throws SessionSymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSymptomId, sessionReference, symptomId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new SessionSymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<SessionSymptom> findWhereStatusEquals(int status) throws SessionSymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionSymptomId, sessionReference, symptomId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new SessionSymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the SessionSymptom table that matches the specified primary-key value.
	 */
	public SessionSymptom findByPrimaryKey(SessionSymptomPk pk) throws SessionSymptomDaoException
	{
		return findByPrimaryKey( pk.getSessionSymptomId() );
	}

}
