package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.SymptomDao;
import com.baobab.htc.data.daos.dto.Symptom;
import com.baobab.htc.data.daos.dto.SymptomPk;
import com.baobab.htc.data.daos.exceptions.SymptomDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface SymptomDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SymptomPk
	 */
	public SymptomPk insert(Symptom dto);

	/** 
	 * Updates a single row in the Symptom table.
	 */
	public void update(SymptomPk pk, Symptom dto) throws SymptomDaoException;

	/** 
	 * Deletes a single row in the Symptom table.
	 */
	public void delete(SymptomPk pk) throws SymptomDaoException;

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'symptomId = :symptomId'.
	 */
	public Symptom findByPrimaryKey(long symptomId) throws SymptomDaoException;

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'sessionReference = :sessionReference'.
	 */
	public List<Symptom> findBySession(String sessionReference) throws SymptomDaoException;

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'sessionReference = :sessionReference'.
	 */
	public List<Symptom> findWhereSessionReferenceEquals(String sessionReference) throws SymptomDaoException;

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'selectedValue = :selectedValue'.
	 */
	public List<Symptom> findWhereSelectedValueEquals(int selectedValue) throws SymptomDaoException;

	/** 
	 * Returns all rows from the Symptom table that match the criteria ''.
	 */
	public List<Symptom> findAll() throws SymptomDaoException;

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'symptomId = :symptomId'.
	 */
	public List<Symptom> findWhereSymptomIdEquals(BigDecimal symptomId) throws SymptomDaoException;

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'description = :description'.
	 */
	public List<Symptom> findWhereDescriptionEquals(String description) throws SymptomDaoException;

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<Symptom> findWhereDateCreatedEquals(Date dateCreated) throws SymptomDaoException;

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<Symptom> findWhereCreatedByEquals(String createdBy) throws SymptomDaoException;

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<Symptom> findWhereDateModifiedEquals(Date dateModified) throws SymptomDaoException;

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<Symptom> findWhereModifiedByEquals(String modifiedBy) throws SymptomDaoException;

	/** 
	 * Returns all rows from the Symptom table that match the criteria 'status = :status'.
	 */
	public List<Symptom> findWhereStatusEquals(int status) throws SymptomDaoException;

	/** 
	 * Returns the rows from the Symptom table that matches the specified primary-key value.
	 */
	public Symptom findByPrimaryKey(SymptomPk pk) throws SymptomDaoException;

}
