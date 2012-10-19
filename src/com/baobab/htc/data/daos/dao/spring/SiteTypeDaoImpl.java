package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.SiteTypeDao;
import com.baobab.htc.data.daos.dto.SiteType;
import com.baobab.htc.data.daos.dto.SiteTypePk;
import com.baobab.htc.data.daos.exceptions.SiteTypeDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class SiteTypeDaoImpl extends AbstractDAO implements ParameterizedRowMapper<SiteType>, SiteTypeDao
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
	 * @return SiteTypePk
	 */
	@Transactional
	public SiteTypePk insert(SiteType dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( siteTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status ) VALUES ( ?, ?, ?, ?, ?, ?, ? )",dto.getSiteTypeId(),dto.getDescription(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the SiteType table.
	 */
	@Transactional
	public void update(SiteTypePk pk, SiteType dto) throws SiteTypeDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET siteTypeId = ?, description = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ? WHERE siteTypeId = ?",dto.getSiteTypeId(),dto.getDescription(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),pk.getSiteTypeId());
	}

	/** 
	 * Deletes a single row in the SiteType table.
	 */
	@Transactional
	public void delete(SiteTypePk pk) throws SiteTypeDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE siteTypeId = ?",pk.getSiteTypeId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SiteType
	 */
	public SiteType mapRow(ResultSet rs, int row) throws SQLException
	{
		SiteType dto = new SiteType();
		dto.setSiteTypeId( rs.getLong( 1 ) );
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
		return "SiteType";
	}

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'siteTypeId = :siteTypeId'.
	 */
	@Transactional
	public SiteType findByPrimaryKey(long siteTypeId) throws SiteTypeDaoException
	{
		try {
			List<SiteType> list = jdbcTemplate.query("SELECT siteTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE siteTypeId = ?", this,siteTypeId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SiteTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'siteTypeCategoryId = :siteTypeCategoryId'.
	 */
	@Transactional
	public List<SiteType> findBySitetypecategory(BigDecimal siteTypeCategoryId) throws SiteTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE siteTypeCategoryId = ?", this,siteTypeCategoryId);
		}
		catch (Exception e) {
			throw new SiteTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'siteTypeCategoryId = :siteTypeCategoryId'.
	 */
	@Transactional
	public List<SiteType> findWhereSiteTypeCategoryIdEquals(BigDecimal siteTypeCategoryId) throws SiteTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE siteTypeCategoryId = ? ORDER BY siteTypeCategoryId", this,siteTypeCategoryId);
		}
		catch (Exception e) {
			throw new SiteTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SiteType table that match the criteria ''.
	 */
	@Transactional
	public List<SiteType> findAll() throws SiteTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " ORDER BY siteTypeId", this);
		}
		catch (Exception e) {
			throw new SiteTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'siteTypeId = :siteTypeId'.
	 */
	@Transactional
	public List<SiteType> findWhereSiteTypeIdEquals(BigDecimal siteTypeId) throws SiteTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE siteTypeId = ? ORDER BY siteTypeId", this,siteTypeId);
		}
		catch (Exception e) {
			throw new SiteTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'description = :description'.
	 */
	@Transactional
	public List<SiteType> findWhereDescriptionEquals(String description) throws SiteTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE description = ? ORDER BY description", this,description);
		}
		catch (Exception e) {
			throw new SiteTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<SiteType> findWhereDateCreatedEquals(Date dateCreated) throws SiteTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new SiteTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<SiteType> findWhereCreatedByEquals(String createdBy) throws SiteTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new SiteTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<SiteType> findWhereDateModifiedEquals(Date dateModified) throws SiteTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new SiteTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<SiteType> findWhereModifiedByEquals(String modifiedBy) throws SiteTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new SiteTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SiteType table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<SiteType> findWhereStatusEquals(int status) throws SiteTypeDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteTypeId, description, dateCreated, createdBy, dateModified, modifiedBy, status FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new SiteTypeDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the SiteType table that matches the specified primary-key value.
	 */
	public SiteType findByPrimaryKey(SiteTypePk pk) throws SiteTypeDaoException
	{
		return findByPrimaryKey( pk.getSiteTypeId() );
	}

}
