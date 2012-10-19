package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.SessionPlanDao;
import com.baobab.htc.data.daos.dto.SessionPlan;
import com.baobab.htc.data.daos.dto.SessionPlanPk;
import com.baobab.htc.data.daos.exceptions.SessionPlanDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class SessionPlanDaoImpl extends AbstractDAO implements ParameterizedRowMapper<SessionPlan>, SessionPlanDao
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
	 * @return SessionPlanPk
	 */
	@Transactional
	public SessionPlanPk insert(SessionPlan dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( sessionPlanId, sessionReference, planId, dateCreated, createdBy, dateModified, modifiedBy, status ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )",dto.getSessionPlanId(),dto.getSessionReference(),dto.isPlanIdNull()?null:dto.getPlanId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the SessionPlan table.
	 */
	@Transactional
	public void update(SessionPlanPk pk, SessionPlan dto) throws SessionPlanDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET sessionPlanId = ?, sessionReference = ?, planId = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ? WHERE sessionPlanId = ?",dto.getSessionPlanId(),dto.getSessionReference(),dto.getPlanId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),pk.getSessionPlanId());
	}

	/** 
	 * Deletes a single row in the SessionPlan table.
	 */
	@Transactional
	public void delete(SessionPlanPk pk) throws SessionPlanDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE sessionPlanId = ?",pk.getSessionPlanId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SessionPlan
	 */
	public SessionPlan mapRow(ResultSet rs, int row) throws SQLException
	{
		SessionPlan dto = new SessionPlan();
		dto.setSessionPlanId( rs.getLong( 1 ) );
		dto.setSessionReference( rs.getString( 2 ) );
		dto.setPlanId( rs.getLong( 3 ) );
		if (rs.wasNull()) {
			dto.setPlanIdNull( true );
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
		return "SessionPlan";
	}

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'sessionPlanId = :sessionPlanId'.
	 */
	@Transactional
	public SessionPlan findByPrimaryKey(long sessionPlanId) throws SessionPlanDaoException
	{
		try {
			List<SessionPlan> list = jdbcTemplate.query("SELECT sessionPlanId, sessionReference, planId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionPlanId = ?", this,sessionPlanId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SessionPlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria ''.
	 */
	@Transactional
	public List<SessionPlan> findAll() throws SessionPlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionPlanId, sessionReference, planId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " ORDER BY sessionPlanId", this);
		}
		catch (Exception e) {
			throw new SessionPlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'planId = :planId'.
	 */
	@Transactional
	public List<SessionPlan> findByPlan(BigDecimal planId) throws SessionPlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionPlanId, sessionReference, planId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE planId = ?", this,planId);
		}
		catch (Exception e) {
			throw new SessionPlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'sessionReference = :sessionReference'.
	 */
	@Transactional
	public List<SessionPlan> findBySession(String sessionReference) throws SessionPlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionPlanId, sessionReference, planId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionReference = ?", this,sessionReference);
		}
		catch (Exception e) {
			throw new SessionPlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'sessionPlanId = :sessionPlanId'.
	 */
	@Transactional
	public List<SessionPlan> findWhereSessionPlanIdEquals(BigDecimal sessionPlanId) throws SessionPlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionPlanId, sessionReference, planId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionPlanId = ? ORDER BY sessionPlanId", this,sessionPlanId);
		}
		catch (Exception e) {
			throw new SessionPlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'sessionReference = :sessionReference'.
	 */
	@Transactional
	public List<SessionPlan> findWhereSessionReferenceEquals(String sessionReference) throws SessionPlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionPlanId, sessionReference, planId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sessionReference = ? ORDER BY sessionReference", this,sessionReference);
		}
		catch (Exception e) {
			throw new SessionPlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'planId = :planId'.
	 */
	@Transactional
	public List<SessionPlan> findWherePlanIdEquals(BigDecimal planId) throws SessionPlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionPlanId, sessionReference, planId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE planId = ? ORDER BY planId", this,planId);
		}
		catch (Exception e) {
			throw new SessionPlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<SessionPlan> findWhereDateCreatedEquals(Date dateCreated) throws SessionPlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionPlanId, sessionReference, planId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new SessionPlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<SessionPlan> findWhereCreatedByEquals(String createdBy) throws SessionPlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionPlanId, sessionReference, planId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new SessionPlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<SessionPlan> findWhereDateModifiedEquals(Date dateModified) throws SessionPlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionPlanId, sessionReference, planId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new SessionPlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<SessionPlan> findWhereModifiedByEquals(String modifiedBy) throws SessionPlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionPlanId, sessionReference, planId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new SessionPlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SessionPlan table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<SessionPlan> findWhereStatusEquals(int status) throws SessionPlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionPlanId, sessionReference, planId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new SessionPlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the SessionPlan table that matches the specified primary-key value.
	 */
	public SessionPlan findByPrimaryKey(SessionPlanPk pk) throws SessionPlanDaoException
	{
		return findByPrimaryKey( pk.getSessionPlanId() );
	}

}
