package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.PeriodDao;
import com.baobab.htc.data.daos.dto.Period;
import com.baobab.htc.data.daos.dto.PeriodPk;
import com.baobab.htc.data.daos.exceptions.PeriodDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class PeriodDaoImpl extends AbstractDAO implements ParameterizedRowMapper<Period>, PeriodDao
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
	 * @return PeriodPk
	 */
	@Transactional
	public PeriodPk insert(Period dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( periodId, period, ending, dateCreated, createdBy, dateModified, modifiedBy, status, beginning ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )",dto.getPeriodId(),dto.isPeriodNull()?null:dto.getPeriod(),dto.getEnding(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus(),dto.getBeginning());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the Period table.
	 */
	@Transactional
	public void update(PeriodPk pk, Period dto) throws PeriodDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET periodId = ?, period = ?, ending = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ?, beginning = ? WHERE periodId = ?",dto.getPeriodId(),dto.getPeriod(),dto.getEnding(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),dto.getBeginning(),pk.getPeriodId());
	}

	/** 
	 * Deletes a single row in the Period table.
	 */
	@Transactional
	public void delete(PeriodPk pk) throws PeriodDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE periodId = ?",pk.getPeriodId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return Period
	 */
	public Period mapRow(ResultSet rs, int row) throws SQLException
	{
		Period dto = new Period();
		dto.setPeriodId( rs.getLong( 1 ) );
		dto.setPeriod( rs.getInt( 2 ) );
		if (rs.wasNull()) {
			dto.setPeriodNull( true );
		}
		
		dto.setEnding( rs.getTimestamp(3 ) );
		dto.setDateCreated( rs.getTimestamp(4 ) );
		dto.setCreatedBy( rs.getString( 5 ) );
		dto.setDateModified( rs.getTimestamp(6 ) );
		dto.setModifiedBy( rs.getString( 7 ) );
		dto.setStatus( rs.getInt( 8 ) );
		if (rs.wasNull()) {
			dto.setStatusNull( true );
		}
		
		dto.setBeginning( rs.getTimestamp(9 ) );
		return dto;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "Period";
	}

	/** 
	 * Returns all rows from the Period table that match the criteria 'periodId = :periodId'.
	 */
	@Transactional
	public Period findByPrimaryKey(long periodId) throws PeriodDaoException
	{
		try {
			List<Period> list = jdbcTemplate.query("SELECT periodId, period, ending, dateCreated, createdBy, dateModified, modifiedBy, status, beginning FROM " + getTableName() + " WHERE periodId = ?", this,periodId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new PeriodDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Period table that match the criteria 'starting = :starting'.
	 */
	@Transactional
	public List<Period> findWhereStartingEquals(Date starting) throws PeriodDaoException
	{
		try {
			return jdbcTemplate.query("SELECT periodId, period, ending, dateCreated, createdBy, dateModified, modifiedBy, status, beginning FROM " + getTableName() + " WHERE starting = ? ORDER BY starting", this,starting);
		}
		catch (Exception e) {
			throw new PeriodDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Period table that match the criteria ''.
	 */
	@Transactional
	public List<Period> findAll() throws PeriodDaoException
	{
		try {
			return jdbcTemplate.query("SELECT periodId, period, ending, dateCreated, createdBy, dateModified, modifiedBy, status, beginning FROM " + getTableName() + " ORDER BY periodId", this);
		}
		catch (Exception e) {
			throw new PeriodDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Period table that match the criteria 'periodId = :periodId'.
	 */
	@Transactional
	public List<Period> findWherePeriodIdEquals(BigDecimal periodId) throws PeriodDaoException
	{
		try {
			return jdbcTemplate.query("SELECT periodId, period, ending, dateCreated, createdBy, dateModified, modifiedBy, status, beginning FROM " + getTableName() + " WHERE periodId = ? ORDER BY periodId", this,periodId);
		}
		catch (Exception e) {
			throw new PeriodDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Period table that match the criteria 'period = :period'.
	 */
	@Transactional
	public List<Period> findWherePeriodEquals(int period) throws PeriodDaoException
	{
		try {
			return jdbcTemplate.query("SELECT periodId, period, ending, dateCreated, createdBy, dateModified, modifiedBy, status, beginning FROM " + getTableName() + " WHERE period = ? ORDER BY period", this,period);
		}
		catch (Exception e) {
			throw new PeriodDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Period table that match the criteria 'beginning = :beginning'.
	 */
	@Transactional
	public List<Period> findWhereBeginningEquals(Date beginning) throws PeriodDaoException
	{
		try {
			return jdbcTemplate.query("SELECT periodId, period, ending, dateCreated, createdBy, dateModified, modifiedBy, status, beginning FROM " + getTableName() + " WHERE beginning = ? ORDER BY beginning", this,beginning);
		}
		catch (Exception e) {
			throw new PeriodDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Period table that match the criteria 'ending = :ending'.
	 */
	@Transactional
	public List<Period> findWhereEndingEquals(Date ending) throws PeriodDaoException
	{
		try {
			return jdbcTemplate.query("SELECT periodId, period, ending, dateCreated, createdBy, dateModified, modifiedBy, status, beginning FROM " + getTableName() + " WHERE ending = ? ORDER BY ending", this,ending);
		}
		catch (Exception e) {
			throw new PeriodDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Period table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<Period> findWhereDateCreatedEquals(Date dateCreated) throws PeriodDaoException
	{
		try {
			return jdbcTemplate.query("SELECT periodId, period, ending, dateCreated, createdBy, dateModified, modifiedBy, status, beginning FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new PeriodDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Period table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<Period> findWhereCreatedByEquals(String createdBy) throws PeriodDaoException
	{
		try {
			return jdbcTemplate.query("SELECT periodId, period, ending, dateCreated, createdBy, dateModified, modifiedBy, status, beginning FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new PeriodDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Period table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<Period> findWhereDateModifiedEquals(Date dateModified) throws PeriodDaoException
	{
		try {
			return jdbcTemplate.query("SELECT periodId, period, ending, dateCreated, createdBy, dateModified, modifiedBy, status, beginning FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new PeriodDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Period table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<Period> findWhereModifiedByEquals(String modifiedBy) throws PeriodDaoException
	{
		try {
			return jdbcTemplate.query("SELECT periodId, period, ending, dateCreated, createdBy, dateModified, modifiedBy, status, beginning FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new PeriodDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Period table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<Period> findWhereStatusEquals(int status) throws PeriodDaoException
	{
		try {
			return jdbcTemplate.query("SELECT periodId, period, ending, dateCreated, createdBy, dateModified, modifiedBy, status, beginning FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new PeriodDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the Period table that matches the specified primary-key value.
	 */
	public Period findByPrimaryKey(PeriodPk pk) throws PeriodDaoException
	{
		return findByPrimaryKey( pk.getPeriodId() );
	}

}
