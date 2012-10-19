package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.SequenceDao;
import com.baobab.htc.data.daos.dto.Sequence;
import com.baobab.htc.data.daos.dto.SequencePk;
import com.baobab.htc.data.daos.exceptions.SequenceDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class SequenceDaoImpl extends AbstractDAO implements ParameterizedRowMapper<Sequence>, SequenceDao
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
	 * @return SequencePk
	 */
	@Transactional
	public SequencePk insert(Sequence dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( id, sequenceName, tableId, increment, dateCreated, createdBy, dateModified, modifiedBy, status ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )",dto.getId(),dto.getSequenceName(),dto.isTableIdNull()?null:dto.getTableId(),dto.isIncrementNull()?null:dto.getIncrement(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the Sequence table.
	 */
	@Transactional
	public void update(SequencePk pk, Sequence dto) throws SequenceDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET id = ?, sequenceName = ?, tableId = ?, increment = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ? WHERE id = ?",dto.getId(),dto.getSequenceName(),dto.getTableId(),dto.getIncrement(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),pk.getId());
	}

	/** 
	 * Deletes a single row in the Sequence table.
	 */
	@Transactional
	public void delete(SequencePk pk) throws SequenceDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE id = ?",pk.getId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return Sequence
	 */
	public Sequence mapRow(ResultSet rs, int row) throws SQLException
	{
		Sequence dto = new Sequence();
		dto.setId( rs.getLong( 1 ) );
		dto.setSequenceName( rs.getString( 2 ) );
		dto.setTableId( rs.getLong( 3 ) );
		if (rs.wasNull()) {
			dto.setTableIdNull( true );
		}
		
		dto.setIncrement( rs.getInt( 4 ) );
		if (rs.wasNull()) {
			dto.setIncrementNull( true );
		}
		
		dto.setDateCreated( rs.getTimestamp(5 ) );
		dto.setCreatedBy( rs.getString( 6 ) );
		dto.setDateModified( rs.getTimestamp(7 ) );
		dto.setModifiedBy( rs.getString( 8 ) );
		dto.setStatus( rs.getInt( 9 ) );
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
		return "Sequence";
	}

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'id = :id'.
	 */
	@Transactional
	public Sequence findByPrimaryKey(long id) throws SequenceDaoException
	{
		try {
			List<Sequence> list = jdbcTemplate.query("SELECT id, sequenceName, tableId, increment, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE id = ?", this,id);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SequenceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Sequence table that match the criteria ''.
	 */
	@Transactional
	public List<Sequence> findAll() throws SequenceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT id, sequenceName, tableId, increment, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " ORDER BY id", this);
		}
		catch (Exception e) {
			throw new SequenceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'id = :id'.
	 */
	@Transactional
	public List<Sequence> findWhereIdEquals(BigDecimal id) throws SequenceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT id, sequenceName, tableId, increment, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE id = ? ORDER BY id", this,id);
		}
		catch (Exception e) {
			throw new SequenceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'sequenceName = :sequenceName'.
	 */
	@Transactional
	public List<Sequence> findWhereSequenceNameEquals(String sequenceName) throws SequenceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT id, sequenceName, tableId, increment, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE sequenceName = ? ORDER BY sequenceName", this,sequenceName);
		}
		catch (Exception e) {
			throw new SequenceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'tableId = :tableId'.
	 */
	@Transactional
	public List<Sequence> findWhereTableIdEquals(BigDecimal tableId) throws SequenceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT id, sequenceName, tableId, increment, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE tableId = ? ORDER BY tableId", this,tableId);
		}
		catch (Exception e) {
			throw new SequenceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'increment = :increment'.
	 */
	@Transactional
	public List<Sequence> findWhereIncrementEquals(int increment) throws SequenceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT id, sequenceName, tableId, increment, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE increment = ? ORDER BY increment", this,increment);
		}
		catch (Exception e) {
			throw new SequenceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<Sequence> findWhereDateCreatedEquals(Date dateCreated) throws SequenceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT id, sequenceName, tableId, increment, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new SequenceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<Sequence> findWhereCreatedByEquals(String createdBy) throws SequenceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT id, sequenceName, tableId, increment, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new SequenceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<Sequence> findWhereDateModifiedEquals(Date dateModified) throws SequenceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT id, sequenceName, tableId, increment, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new SequenceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<Sequence> findWhereModifiedByEquals(String modifiedBy) throws SequenceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT id, sequenceName, tableId, increment, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new SequenceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<Sequence> findWhereStatusEquals(int status) throws SequenceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT id, sequenceName, tableId, increment, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new SequenceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the Sequence table that matches the specified primary-key value.
	 */
	public Sequence findByPrimaryKey(SequencePk pk) throws SequenceDaoException
	{
		return findByPrimaryKey( pk.getId() );
	}

}
