package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.CounsellorDao;
import com.baobab.htc.data.daos.dto.Counsellor;
import com.baobab.htc.data.daos.dto.CounsellorPk;
import com.baobab.htc.data.daos.exceptions.CounsellorDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class CounsellorDaoImpl extends AbstractDAO implements ParameterizedRowMapper<Counsellor>, CounsellorDao
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
	 * @return CounsellorPk
	 */
	@Transactional
	public CounsellorPk insert(Counsellor dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( counsellorId, name, dateCreated, createdBy, dateModified, modifiedBy, status ) VALUES ( ?, ?, ?, ?, ?, ?, ? )",dto.getCounsellorId(),dto.getName(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the Counsellor table.
	 */
	@Transactional
	public void update(CounsellorPk pk, Counsellor dto) throws CounsellorDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET counsellorId = ?, name = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ? WHERE counsellorId = ?",dto.getCounsellorId(),dto.getName(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),pk.getCounsellorId());
	}

	/** 
	 * Deletes a single row in the Counsellor table.
	 */
	@Transactional
	public void delete(CounsellorPk pk) throws CounsellorDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE counsellorId = ?",pk.getCounsellorId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return Counsellor
	 */
	public Counsellor mapRow(ResultSet rs, int row) throws SQLException
	{
		Counsellor dto = new Counsellor();
		dto.setCounsellorId( rs.getLong( 1 ) );
		dto.setName( rs.getString( 2 ) );
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
		return "Counsellor";
	}

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'counsellorId = :counsellorId'.
	 */
	@Transactional
	public Counsellor findByPrimaryKey(long counsellorId) throws CounsellorDaoException
	{
		try {
			List<Counsellor> list = jdbcTemplate.query("SELECT counsellorId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE counsellorId = ?", this,counsellorId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new CounsellorDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Counsellor table that match the criteria ''.
	 */
	@Transactional
	public List<Counsellor> findAll() throws CounsellorDaoException
	{
		try {
			return jdbcTemplate.query("SELECT counsellorId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " ORDER BY counsellorId", this);
		}
		catch (Exception e) {
			throw new CounsellorDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'counsellorId = :counsellorId'.
	 */
	@Transactional
	public List<Counsellor> findWhereCounsellorIdEquals(BigDecimal counsellorId) throws CounsellorDaoException
	{
		try {
			return jdbcTemplate.query("SELECT counsellorId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE counsellorId = ? ORDER BY counsellorId", this,counsellorId);
		}
		catch (Exception e) {
			throw new CounsellorDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'name = :name'.
	 */
	@Transactional
	public List<Counsellor> findWhereNameEquals(String name) throws CounsellorDaoException
	{
		try {
			return jdbcTemplate.query("SELECT counsellorId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE name = ? ORDER BY name", this,name);
		}
		catch (Exception e) {
			throw new CounsellorDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<Counsellor> findWhereDateCreatedEquals(Date dateCreated) throws CounsellorDaoException
	{
		try {
			return jdbcTemplate.query("SELECT counsellorId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new CounsellorDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<Counsellor> findWhereCreatedByEquals(String createdBy) throws CounsellorDaoException
	{
		try {
			return jdbcTemplate.query("SELECT counsellorId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new CounsellorDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<Counsellor> findWhereDateModifiedEquals(Date dateModified) throws CounsellorDaoException
	{
		try {
			return jdbcTemplate.query("SELECT counsellorId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new CounsellorDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<Counsellor> findWhereModifiedByEquals(String modifiedBy) throws CounsellorDaoException
	{
		try {
			return jdbcTemplate.query("SELECT counsellorId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new CounsellorDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<Counsellor> findWhereStatusEquals(int status) throws CounsellorDaoException
	{
		try {
			return jdbcTemplate.query("SELECT counsellorId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new CounsellorDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the Counsellor table that matches the specified primary-key value.
	 */
	public Counsellor findByPrimaryKey(CounsellorPk pk) throws CounsellorDaoException
	{
		return findByPrimaryKey( pk.getCounsellorId() );
	}

}
