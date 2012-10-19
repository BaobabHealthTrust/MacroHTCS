package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.SymptomDao;
import com.baobab.htc.data.daos.dto.Symptom;
import com.baobab.htc.data.daos.dto.SymptomPk;
import com.baobab.htc.data.daos.exceptions.SymptomDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class SymptomDaoImpl extends AbstractDAO implements ParameterizedRowMapper<Symptom>, SymptomDao
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
	 * @return SymptomPk
	 */
	@Transactional
	public SymptomPk insert(Symptom dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( symptomId, dateCreated, createdBy, dateModified, modifiedBy, status, description ) VALUES ( ?, ?, ?, ?, ?, ?, ? )",dto.getSymptomId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus(),dto.getDescription());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the Symptom table.
	 */
	@Transactional
	public void update(SymptomPk pk, Symptom dto) throws SymptomDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET symptomId = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ?, description = ? WHERE symptomId = ?",dto.getSymptomId(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),dto.getDescription(),pk.getSymptomId());
	}

	/** 
	 * Deletes a single row in the Symptom table.
	 */
	@Transactional
	public void delete(SymptomPk pk) throws SymptomDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE symptomId = ?",pk.getSymptomId());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return Symptom
	 */
	public Symptom mapRow(ResultSet rs, int row) throws SQLException
	{
		Symptom dto = new Symptom();
		dto.setSymptomId( rs.getLong( 1 ) );
		dto.setDateCreated( rs.getTimestamp(2 ) );
		dto.setCreatedBy( rs.getString( 3 ) );
		dto.setDateModified( rs.getTimestamp(4 ) );
		dto.setModifiedBy( rs.getString( 5 ) );
		dto.setStatus( rs.getInt( 6 ) );
		if (rs.wasNull()) {
			dto.setStatusNull( true );
		}
		
		dto.setDescription( rs.getString( 7 ) );
		return dto;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "Symptom";
	}

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'symptomId = :symptomId'.
	 */
	@Transactional
	public Symptom findByPrimaryKey(long symptomId) throws SymptomDaoException
	{
		try {
			List<Symptom> list = jdbcTemplate.query("SELECT symptomId, dateCreated, createdBy, dateModified, modifiedBy, status, description FROM " + getTableName() + " WHERE symptomId = ?", this,symptomId);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'sessionReference = :sessionReference'.
	 */
	@Transactional
	public List<Symptom> findBySession(String sessionReference) throws SymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT symptomId, dateCreated, createdBy, dateModified, modifiedBy, status, description FROM " + getTableName() + " WHERE sessionReference = ?", this,sessionReference);
		}
		catch (Exception e) {
			throw new SymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'sessionReference = :sessionReference'.
	 */
	@Transactional
	public List<Symptom> findWhereSessionReferenceEquals(String sessionReference) throws SymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT symptomId, dateCreated, createdBy, dateModified, modifiedBy, status, description FROM " + getTableName() + " WHERE sessionReference = ? ORDER BY sessionReference", this,sessionReference);
		}
		catch (Exception e) {
			throw new SymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'selectedValue = :selectedValue'.
	 */
	@Transactional
	public List<Symptom> findWhereSelectedValueEquals(int selectedValue) throws SymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT symptomId, dateCreated, createdBy, dateModified, modifiedBy, status, description FROM " + getTableName() + " WHERE selectedValue = ? ORDER BY selectedValue", this,selectedValue);
		}
		catch (Exception e) {
			throw new SymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Symptom table that match the criteria ''.
	 */
	@Transactional
	public List<Symptom> findAll() throws SymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT symptomId, dateCreated, createdBy, dateModified, modifiedBy, status, description FROM " + getTableName() + " ORDER BY symptomId", this);
		}
		catch (Exception e) {
			throw new SymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'symptomId = :symptomId'.
	 */
	@Transactional
	public List<Symptom> findWhereSymptomIdEquals(BigDecimal symptomId) throws SymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT symptomId, dateCreated, createdBy, dateModified, modifiedBy, status, description FROM " + getTableName() + " WHERE symptomId = ? ORDER BY symptomId", this,symptomId);
		}
		catch (Exception e) {
			throw new SymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'description = :description'.
	 */
	@Transactional
	public List<Symptom> findWhereDescriptionEquals(String description) throws SymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT symptomId, dateCreated, createdBy, dateModified, modifiedBy, status, description FROM " + getTableName() + " WHERE description = ? ORDER BY description", this,description);
		}
		catch (Exception e) {
			throw new SymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<Symptom> findWhereDateCreatedEquals(Date dateCreated) throws SymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT symptomId, dateCreated, createdBy, dateModified, modifiedBy, status, description FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new SymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<Symptom> findWhereCreatedByEquals(String createdBy) throws SymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT symptomId, dateCreated, createdBy, dateModified, modifiedBy, status, description FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new SymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<Symptom> findWhereDateModifiedEquals(Date dateModified) throws SymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT symptomId, dateCreated, createdBy, dateModified, modifiedBy, status, description FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new SymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<Symptom> findWhereModifiedByEquals(String modifiedBy) throws SymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT symptomId, dateCreated, createdBy, dateModified, modifiedBy, status, description FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new SymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<Symptom> findWhereStatusEquals(int status) throws SymptomDaoException
	{
		try {
			return jdbcTemplate.query("SELECT symptomId, dateCreated, createdBy, dateModified, modifiedBy, status, description FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new SymptomDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the Symptom table that matches the specified primary-key value.
	 */
	public Symptom findByPrimaryKey(SymptomPk pk) throws SymptomDaoException
	{
		return findByPrimaryKey( pk.getSymptomId() );
	}

}
