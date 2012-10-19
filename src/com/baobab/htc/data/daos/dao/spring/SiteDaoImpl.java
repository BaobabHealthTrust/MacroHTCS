package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.SiteDao;
import com.baobab.htc.data.daos.dto.Site;
import com.baobab.htc.data.daos.dto.SitePk;
import com.baobab.htc.data.daos.exceptions.SiteDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class SiteDaoImpl extends AbstractDAO implements ParameterizedRowMapper<Site>, SiteDao
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
	 * @return SitePk
	 */
	@Transactional
	public SitePk insert(Site dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )",dto.getSiteId(),dto.getName(),dto.isSiteTypeIdNull()?null:dto.getSiteTypeId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus(),dto.isTraditionalAuthorityIdNull()?null:dto.getTraditionalAuthorityId());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the Site table.
	 */
	@Transactional
	public void update(SitePk pk, Site dto) throws SiteDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET siteId = ?, name = ?, siteTypeId = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ?, traditionalAuthorityId = ? WHERE siteId = ?",dto.getSiteId(),dto.getName(),dto.getSiteTypeId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),dto.getTraditionalAuthorityId(),pk.getSiteId());
	}

	/** 
	 * Deletes a single row in the Site table.
	 */
	@Transactional
	public void delete(SitePk pk) throws SiteDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE siteId = ?",pk.getSiteId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return Site
	 */
	public Site mapRow(ResultSet rs, int row) throws SQLException
	{
		Site dto = new Site();
		dto.setSiteId( rs.getLong( 1 ) );
		dto.setName( rs.getString( 2 ) );
		dto.setSiteTypeId( rs.getLong( 3 ) );
		if (rs.wasNull()) {
			dto.setSiteTypeIdNull( true );
		}
		
		dto.setDateCreated( rs.getTimestamp(4 ) );
		dto.setCreatedBy( rs.getString( 5 ) );
		dto.setDateModified( rs.getTimestamp(6 ) );
		dto.setModifiedBy( rs.getString( 7 ) );
		dto.setStatus( rs.getInt( 8 ) );
		if (rs.wasNull()) {
			dto.setStatusNull( true );
		}
		
		dto.setTraditionalAuthorityId( rs.getLong( 9 ) );
		if (rs.wasNull()) {
			dto.setTraditionalAuthorityIdNull( true );
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
		return "Site";
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'siteId = :siteId'.
	 */
	@Transactional
	public Site findByPrimaryKey(long siteId) throws SiteDaoException
	{
		try {
			List<Site> list = jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE siteId = ?", this,siteId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'siteTypeId = :siteTypeId'.
	 */
	@Transactional
	public List<Site> findBySitetype(BigDecimal siteTypeId) throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE siteTypeId = ?", this,siteTypeId);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'districtId = :districtId'.
	 */
	@Transactional
	public List<Site> findByDistrict(BigDecimal districtId) throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE districtId = ?", this,districtId);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'districtId = :districtId'.
	 */
	@Transactional
	public List<Site> findWhereDistrictIdEquals(BigDecimal districtId) throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE districtId = ? ORDER BY districtId", this,districtId);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria ''.
	 */
	@Transactional
	public List<Site> findAll() throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " ORDER BY siteId", this);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'siteTypeId = :siteTypeId'.
	 */
	@Transactional
	public List<Site> findBySiteType(BigDecimal siteTypeId) throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE siteTypeId = ?", this,siteTypeId);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'traditionalAuthorityId = :traditionalAuthorityId'.
	 */
	@Transactional
	public List<Site> findByTraditionalAuthority(BigDecimal traditionalAuthorityId) throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE traditionalAuthorityId = ?", this,traditionalAuthorityId);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'siteId = :siteId'.
	 */
	@Transactional
	public List<Site> findWhereSiteIdEquals(BigDecimal siteId) throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE siteId = ? ORDER BY siteId", this,siteId);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'name = :name'.
	 */
	@Transactional
	public List<Site> findWhereNameEquals(String name) throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE name = ? ORDER BY name", this,name);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'traditionalAuthorityId = :traditionalAuthorityId'.
	 */
	@Transactional
	public List<Site> findWhereTraditionalAuthorityIdEquals(BigDecimal traditionalAuthorityId) throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE traditionalAuthorityId = ? ORDER BY traditionalAuthorityId", this,traditionalAuthorityId);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'siteTypeId = :siteTypeId'.
	 */
	@Transactional
	public List<Site> findWhereSiteTypeIdEquals(BigDecimal siteTypeId) throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE siteTypeId = ? ORDER BY siteTypeId", this,siteTypeId);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<Site> findWhereDateCreatedEquals(Date dateCreated) throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<Site> findWhereCreatedByEquals(String createdBy) throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<Site> findWhereDateModifiedEquals(Date dateModified) throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<Site> findWhereModifiedByEquals(String modifiedBy) throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Site table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<Site> findWhereStatusEquals(int status) throws SiteDaoException
	{
		try {
			return jdbcTemplate.query("SELECT siteId, name, siteTypeId, dateCreated, createdBy, dateModified, modifiedBy, status, traditionalAuthorityId FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new SiteDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the Site table that matches the specified primary-key value.
	 */
	public Site findByPrimaryKey(SitePk pk) throws SiteDaoException
	{
		return findByPrimaryKey( pk.getSiteId() );
	}

}
