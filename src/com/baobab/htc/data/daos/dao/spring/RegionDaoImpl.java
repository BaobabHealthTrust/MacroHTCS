package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.RegionDao;
import com.baobab.htc.data.daos.dto.Region;
import com.baobab.htc.data.daos.dto.RegionPk;
import com.baobab.htc.data.daos.exceptions.RegionDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class RegionDaoImpl extends AbstractDAO implements ParameterizedRowMapper<Region>, RegionDao
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
	 * @return RegionPk
	 */
	@Transactional
	public RegionPk insert(Region dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( regionId, name, dateCreated, createdBy, dateModified, modifiedBy, status ) VALUES ( ?, ?, ?, ?, ?, ?, ? )",dto.getRegionId(),dto.getName(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the Region table.
	 */
	@Transactional
	public void update(RegionPk pk, Region dto) throws RegionDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET regionId = ?, name = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ? WHERE regionId = ?",dto.getRegionId(),dto.getName(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),pk.getRegionId());
	}

	/** 
	 * Deletes a single row in the Region table.
	 */
	@Transactional
	public void delete(RegionPk pk) throws RegionDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE regionId = ?",pk.getRegionId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return Region
	 */
	public Region mapRow(ResultSet rs, int row) throws SQLException
	{
		Region dto = new Region();
		dto.setRegionId( rs.getLong( 1 ) );
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
		return "Region";
	}

	/** 
	 * Returns all rows from the Region table that match the criteria 'regionId = :regionId'.
	 */
	@Transactional
	public Region findByPrimaryKey(long regionId) throws RegionDaoException
	{
		try {
			List<Region> list = jdbcTemplate.query("SELECT regionId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE regionId = ?", this,regionId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new RegionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Region table that match the criteria ''.
	 */
	@Transactional
	public List<Region> findAll() throws RegionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT regionId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " ORDER BY regionId", this);
		}
		catch (Exception e) {
			throw new RegionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Region table that match the criteria 'regionId = :regionId'.
	 */
	@Transactional
	public List<Region> findWhereRegionIdEquals(BigDecimal regionId) throws RegionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT regionId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE regionId = ? ORDER BY regionId", this,regionId);
		}
		catch (Exception e) {
			throw new RegionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Region table that match the criteria 'name = :name'.
	 */
	@Transactional
	public List<Region> findWhereNameEquals(String name) throws RegionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT regionId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE name = ? ORDER BY name", this,name);
		}
		catch (Exception e) {
			throw new RegionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Region table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<Region> findWhereDateCreatedEquals(Date dateCreated) throws RegionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT regionId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new RegionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Region table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<Region> findWhereCreatedByEquals(String createdBy) throws RegionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT regionId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new RegionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Region table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<Region> findWhereDateModifiedEquals(Date dateModified) throws RegionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT regionId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new RegionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Region table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<Region> findWhereModifiedByEquals(String modifiedBy) throws RegionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT regionId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new RegionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Region table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<Region> findWhereStatusEquals(int status) throws RegionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT regionId, name, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new RegionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the Region table that matches the specified primary-key value.
	 */
	public Region findByPrimaryKey(RegionPk pk) throws RegionDaoException
	{
		return findByPrimaryKey( pk.getRegionId() );
	}

}
