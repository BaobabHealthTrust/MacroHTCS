package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.SessionSymptomDao;
import com.baobab.htc.data.daos.dto.SessionSymptom;
import com.baobab.htc.data.daos.dto.SessionSymptomPk;
import com.baobab.htc.data.daos.exceptions.SessionSymptomDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface SessionSymptomDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SessionSymptomPk
	 */
	public SessionSymptomPk insert(SessionSymptom dto);

	/** 
	 * Updates a single row in the SessionSymptom table.
	 */
	public void update(SessionSymptomPk pk, SessionSymptom dto) throws SessionSymptomDaoException;

	/** 
	 * Deletes a single row in the SessionSymptom table.
	 */
	public void delete(SessionSymptomPk pk) throws SessionSymptomDaoException;

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'sessionSymptomId = :sessionSymptomId'.
	 */
	public SessionSymptom findByPrimaryKey(long sessionSymptomId) throws SessionSymptomDaoException;

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria ''.
	 */
	public List<SessionSymptom> findAll() throws SessionSymptomDaoException;

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'sessionReference = :sessionReference'.
	 */
	public List<SessionSymptom> findBySession(String sessionReference) throws SessionSymptomDaoException;

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'symptomId = :symptomId'.
	 */
	public List<SessionSymptom> findBySymptom(BigDecimal symptomId) throws SessionSymptomDaoException;

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'sessionSymptomId = :sessionSymptomId'.
	 */
	public List<SessionSymptom> findWhereSessionSymptomIdEquals(BigDecimal sessionSymptomId) throws SessionSymptomDaoException;

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'sessionReference = :sessionReference'.
	 */
	public List<SessionSymptom> findWhereSessionReferenceEquals(String sessionReference) throws SessionSymptomDaoException;

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'symptomId = :symptomId'.
	 */
	public List<SessionSymptom> findWhereSymptomIdEquals(BigDecimal symptomId) throws SessionSymptomDaoException;

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<SessionSymptom> findWhereDateCreatedEquals(Date dateCreated) throws SessionSymptomDaoException;

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<SessionSymptom> findWhereCreatedByEquals(String createdBy) throws SessionSymptomDaoException;

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<SessionSymptom> findWhereDateModifiedEquals(Date dateModified) throws SessionSymptomDaoException;

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<SessionSymptom> findWhereModifiedByEquals(String modifiedBy) throws SessionSymptomDaoException;

	/** 
	 * Returns all rows from the SessionSymptom table that match the criteria 'status = :status'.
	 */
	public List<SessionSymptom> findWhereStatusEquals(int status) throws SessionSymptomDaoException;

	/** 
	 * Returns the rows from the SessionSymptom table that matches the specified primary-key value.
	 */
	public SessionSymptom findByPrimaryKey(SessionSymptomPk pk) throws SessionSymptomDaoException;

}
