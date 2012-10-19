package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.PlanDao;
import com.baobab.htc.data.daos.dto.Plan;
import com.baobab.htc.data.daos.dto.PlanPk;
import com.baobab.htc.data.daos.exceptions.PlanDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class PlanDaoImpl extends AbstractDAO implements ParameterizedRowMapper<Plan>, PlanDao
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
	 * @return PlanPk
	 */
	@Transactional
	public PlanPk insert(Plan dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( planId, description, dateCreated, createdBy, dateModified, modifiedBy, status ) VALUES ( ?, ?, ?, ?, ?, ?, ? )",dto.getPlanId(),dto.getDescription(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the Plan table.
	 */
	@Transactional
	public void update(PlanPk pk, Plan dto) throws PlanDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET planId = ?, description = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ? WHERE planId = ?",dto.getPlanId(),dto.getDescription(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),pk.getPlanId());
	}

	/** 
	 * Deletes a single row in the Plan table.
	 */
	@Transactional
	public void delete(PlanPk pk) throws PlanDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE planId = ?",pk.getPlanId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return Plan
	 */
	public Plan mapRow(ResultSet rs, int row) throws SQLException
	{
		Plan dto = new Plan();
		dto.setPlanId( rs.getLong( 1 ) );
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
		return "Plan";
	}

	/** 
	 * Returns all rows from the Plan table that match the criteria 'planId = :planId'.
	 */
	@Transactional
	public Plan findByPrimaryKey(long planId) throws PlanDaoException
	{
		try {
			List<Plan> list = jdbcTemplate.query("SELECT planId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE planId = ?", this,planId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new PlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Plan table that match the criteria ''.
	 */
	@Transactional
	public List<Plan> findAll() throws PlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT planId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " ORDER BY planId", this);
		}
		catch (Exception e) {
			throw new PlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Plan table that match the criteria 'planId = :planId'.
	 */
	@Transactional
	public List<Plan> findWherePlanIdEquals(BigDecimal planId) throws PlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT planId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE planId = ? ORDER BY planId", this,planId);
		}
		catch (Exception e) {
			throw new PlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Plan table that match the criteria 'description = :description'.
	 */
	@Transactional
	public List<Plan> findWhereDescriptionEquals(String description) throws PlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT planId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE description = ? ORDER BY description", this,description);
		}
		catch (Exception e) {
			throw new PlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Plan table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<Plan> findWhereDateCreatedEquals(Date dateCreated) throws PlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT planId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new PlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Plan table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<Plan> findWhereCreatedByEquals(String createdBy) throws PlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT planId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new PlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Plan table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<Plan> findWhereDateModifiedEquals(Date dateModified) throws PlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT planId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new PlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Plan table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<Plan> findWhereModifiedByEquals(String modifiedBy) throws PlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT planId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new PlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Plan table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<Plan> findWhereStatusEquals(int status) throws PlanDaoException
	{
		try {
			return jdbcTemplate.query("SELECT planId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new PlanDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the Plan table that matches the specified primary-key value.
	 */
	public Plan findByPrimaryKey(PlanPk pk) throws PlanDaoException
	{
		return findByPrimaryKey( pk.getPlanId() );
	}

}
