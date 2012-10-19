package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.DistrictDao;
import com.baobab.htc.data.daos.dto.District;
import com.baobab.htc.data.daos.dto.DistrictPk;
import com.baobab.htc.data.daos.exceptions.DistrictDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class DistrictDaoImpl extends AbstractDAO implements ParameterizedRowMapper<District>, DistrictDao
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
	 * @return DistrictPk
	 */
	@Transactional
	public DistrictPk insert(District dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( districtId, name, regionId, dateCreated, createdBy, dateModified, modifiedBy, status ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )",dto.getDistrictId(),dto.getName(),dto.isRegionIdNull()?null:dto.getRegionId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the District table.
	 */
	@Transactional
	public void update(DistrictPk pk, District dto) throws DistrictDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET districtId = ?, name = ?, regionId = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ? WHERE districtId = ?",dto.getDistrictId(),dto.getName(),dto.getRegionId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),pk.getDistrictId());
	}

	/** 
	 * Deletes a single row in the District table.
	 */
	@Transactional
	public void delete(DistrictPk pk) throws DistrictDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE districtId = ?",pk.getDistrictId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return District
	 */
	public District mapRow(ResultSet rs, int row) throws SQLException
	{
		District dto = new District();
		dto.setDistrictId( rs.getLong( 1 ) );
		dto.setName( rs.getString( 2 ) );
		dto.setRegionId( rs.getLong( 3 ) );
		if (rs.wasNull()) {
			dto.setRegionIdNull( true );
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
		return "District";
	}

	/** 
	 * Returns all rows from the District table that match the criteria 'districtId = :districtId'.
	 */
	@Transactional
	public District findByPrimaryKey(long districtId) throws DistrictDaoException
	{
		try {
			List<District> list = jdbcTemplate.query("SELECT districtId, name, regionId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE districtId = ?", this,districtId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new DistrictDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the District table that match the criteria ''.
	 */
	@Transactional
	public List<District> findAll() throws DistrictDaoException
	{
		try {
			return jdbcTemplate.query("SELECT districtId, name, regionId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " ORDER BY districtId", this);
		}
		catch (Exception e) {
			throw new DistrictDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the District table that match the criteria 'regionId = :regionId'.
	 */
	@Transactional
	public List<District> findByRegion(BigDecimal regionId) throws DistrictDaoException
	{
		try {
			return jdbcTemplate.query("SELECT districtId, name, regionId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE regionId = ?", this,regionId);
		}
		catch (Exception e) {
			throw new DistrictDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the District table that match the criteria 'districtId = :districtId'.
	 */
	@Transactional
	public List<District> findWhereDistrictIdEquals(BigDecimal districtId) throws DistrictDaoException
	{
		try {
			return jdbcTemplate.query("SELECT districtId, name, regionId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE districtId = ? ORDER BY districtId", this,districtId);
		}
		catch (Exception e) {
			throw new DistrictDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the District table that match the criteria 'name = :name'.
	 */
	@Transactional
	public List<District> findWhereNameEquals(String name) throws DistrictDaoException
	{
		try {
			return jdbcTemplate.query("SELECT districtId, name, regionId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE name = ? ORDER BY name", this,name);
		}
		catch (Exception e) {
			throw new DistrictDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the District table that match the criteria 'regionId = :regionId'.
	 */
	@Transactional
	public List<District> findWhereRegionIdEquals(BigDecimal regionId) throws DistrictDaoException
	{
		try {
			return jdbcTemplate.query("SELECT districtId, name, regionId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE regionId = ? ORDER BY regionId", this,regionId);
		}
		catch (Exception e) {
			throw new DistrictDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the District table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<District> findWhereDateCreatedEquals(Date dateCreated) throws DistrictDaoException
	{
		try {
			return jdbcTemplate.query("SELECT districtId, name, regionId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new DistrictDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the District table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<District> findWhereCreatedByEquals(String createdBy) throws DistrictDaoException
	{
		try {
			return jdbcTemplate.query("SELECT districtId, name, regionId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new DistrictDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the District table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<District> findWhereDateModifiedEquals(Date dateModified) throws DistrictDaoException
	{
		try {
			return jdbcTemplate.query("SELECT districtId, name, regionId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new DistrictDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the District table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<District> findWhereModifiedByEquals(String modifiedBy) throws DistrictDaoException
	{
		try {
			return jdbcTemplate.query("SELECT districtId, name, regionId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new DistrictDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the District table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<District> findWhereStatusEquals(int status) throws DistrictDaoException
	{
		try {
			return jdbcTemplate.query("SELECT districtId, name, regionId, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new DistrictDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the District table that matches the specified primary-key value.
	 */
	public District findByPrimaryKey(DistrictPk pk) throws DistrictDaoException
	{
		return findByPrimaryKey( pk.getDistrictId() );
	}

}
