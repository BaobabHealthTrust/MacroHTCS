package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.TraditionalAuthorityDao;
import com.baobab.htc.data.daos.dto.TraditionalAuthority;
import com.baobab.htc.data.daos.dto.TraditionalAuthorityPk;
import com.baobab.htc.data.daos.exceptions.TraditionalAuthorityDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class TraditionalAuthorityDaoImpl extends AbstractDAO implements ParameterizedRowMapper<TraditionalAuthority>, TraditionalAuthorityDao
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
	 * @return TraditionalAuthorityPk
	 */
	@Transactional
	public TraditionalAuthorityPk insert(TraditionalAuthority dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( traditionalAuthorityId, name, districtId, dateCreated, createdBy, dateModified, modifiedBy, status ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )",dto.getTraditionalAuthorityId(),dto.getName(),dto.isDistrictIdNull()?null:dto.getDistrictId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the TraditionalAuthority table.
	 */
	@Transactional
	public void update(TraditionalAuthorityPk pk, TraditionalAuthority dto) throws TraditionalAuthorityDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET traditionalAuthorityId = ?, name = ?, districtId = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ? WHERE traditionalAuthorityId = ?",dto.getTraditionalAuthorityId(),dto.getName(),dto.getDistrictId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),pk.getTraditionalAuthorityId());
	}

	/** 
	 * Deletes a single row in the TraditionalAuthority table.
	 */
	@Transactional
	public void delete(TraditionalAuthorityPk pk) throws TraditionalAuthorityDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE traditionalAuthorityId = ?",pk.getTraditionalAuthorityId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return TraditionalAuthority
	 */
	public TraditionalAuthority mapRow(ResultSet rs, int row) throws SQLException
	{
		TraditionalAuthority dto = new TraditionalAuthority();
		dto.setTraditionalAuthorityId( rs.getLong( 1 ) );
		dto.setName( rs.getString( 2 ) );
		dto.setDistrictId( rs.getLong( 3 ) );
		if (rs.wasNull()) {
			dto.setDistrictIdNull( true );
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
		return "TraditionalAuthority";
	}

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'traditionalAuthorityId = :traditionalAuthorityId'.
	 */
	@Transactional
	public TraditionalAuthority findByPrimaryKey(long traditionalAuthorityId) throws TraditionalAuthorityDaoException
	{
		try {
			List<TraditionalAuthority> list = jdbcTemplate.query("SELECT traditionalAuthorityId, name, districtId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE traditionalAuthorityId = ?", this,traditionalAuthorityId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new TraditionalAuthorityDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria ''.
	 */
	@Transactional
	public List<TraditionalAuthority> findAll() throws TraditionalAuthorityDaoException
	{
		try {
			return jdbcTemplate.query("SELECT traditionalAuthorityId, name, districtId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " ORDER BY traditionalAuthorityId", this);
		}
		catch (Exception e) {
			throw new TraditionalAuthorityDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'districtId = :districtId'.
	 */
	@Transactional
	public List<TraditionalAuthority> findByDistrict(BigDecimal districtId) throws TraditionalAuthorityDaoException
	{
		try {
			return jdbcTemplate.query("SELECT traditionalAuthorityId, name, districtId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE districtId = ?", this,districtId);
		}
		catch (Exception e) {
			throw new TraditionalAuthorityDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'traditionalAuthorityId = :traditionalAuthorityId'.
	 */
	@Transactional
	public List<TraditionalAuthority> findWhereTraditionalAuthorityIdEquals(BigDecimal traditionalAuthorityId) throws TraditionalAuthorityDaoException
	{
		try {
			return jdbcTemplate.query("SELECT traditionalAuthorityId, name, districtId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE traditionalAuthorityId = ? ORDER BY traditionalAuthorityId", this,traditionalAuthorityId);
		}
		catch (Exception e) {
			throw new TraditionalAuthorityDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'name = :name'.
	 */
	@Transactional
	public List<TraditionalAuthority> findWhereNameEquals(String name) throws TraditionalAuthorityDaoException
	{
		try {
			return jdbcTemplate.query("SELECT traditionalAuthorityId, name, districtId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE name = ? ORDER BY name", this,name);
		}
		catch (Exception e) {
			throw new TraditionalAuthorityDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'districtId = :districtId'.
	 */
	@Transactional
	public List<TraditionalAuthority> findWhereDistrictIdEquals(BigDecimal districtId) throws TraditionalAuthorityDaoException
	{
		try {
			return jdbcTemplate.query("SELECT traditionalAuthorityId, name, districtId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE districtId = ? ORDER BY districtId", this,districtId);
		}
		catch (Exception e) {
			throw new TraditionalAuthorityDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<TraditionalAuthority> findWhereDateCreatedEquals(Date dateCreated) throws TraditionalAuthorityDaoException
	{
		try {
			return jdbcTemplate.query("SELECT traditionalAuthorityId, name, districtId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new TraditionalAuthorityDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<TraditionalAuthority> findWhereCreatedByEquals(String createdBy) throws TraditionalAuthorityDaoException
	{
		try {
			return jdbcTemplate.query("SELECT traditionalAuthorityId, name, districtId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new TraditionalAuthorityDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<TraditionalAuthority> findWhereDateModifiedEquals(Date dateModified) throws TraditionalAuthorityDaoException
	{
		try {
			return jdbcTemplate.query("SELECT traditionalAuthorityId, name, districtId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new TraditionalAuthorityDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<TraditionalAuthority> findWhereModifiedByEquals(String modifiedBy) throws TraditionalAuthorityDaoException
	{
		try {
			return jdbcTemplate.query("SELECT traditionalAuthorityId, name, districtId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new TraditionalAuthorityDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<TraditionalAuthority> findWhereStatusEquals(int status) throws TraditionalAuthorityDaoException
	{
		try {
			return jdbcTemplate.query("SELECT traditionalAuthorityId, name, districtId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new TraditionalAuthorityDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the TraditionalAuthority table that matches the specified primary-key value.
	 */
	public TraditionalAuthority findByPrimaryKey(TraditionalAuthorityPk pk) throws TraditionalAuthorityDaoException
	{
		return findByPrimaryKey( pk.getTraditionalAuthorityId() );
	}

}
