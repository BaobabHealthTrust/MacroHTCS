package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.CounsellorDao;
import com.baobab.htc.data.daos.dto.Counsellor;
import com.baobab.htc.data.daos.dto.CounsellorPk;
import com.baobab.htc.data.daos.exceptions.CounsellorDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface CounsellorDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return CounsellorPk
	 */
	public CounsellorPk insert(Counsellor dto);

	/** 
	 * Updates a single row in the Counsellor table.
	 */
	public void update(CounsellorPk pk, Counsellor dto) throws CounsellorDaoException;

	/** 
	 * Deletes a single row in the Counsellor table.
	 */
	public void delete(CounsellorPk pk) throws CounsellorDaoException;

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'counsellorId = :counsellorId'.
	 */
	public Counsellor findByPrimaryKey(long counsellorId) throws CounsellorDaoException;

	/** 
	 * Returns all rows from the Counsellor table that match the criteria ''.
	 */
	public List<Counsellor> findAll() throws CounsellorDaoException;

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'counsellorId = :counsellorId'.
	 */
	public List<Counsellor> findWhereCounsellorIdEquals(BigDecimal counsellorId) throws CounsellorDaoException;

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'name = :name'.
	 */
	public List<Counsellor> findWhereNameEquals(String name) throws CounsellorDaoException;

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<Counsellor> findWhereDateCreatedEquals(Date dateCreated) throws CounsellorDaoException;

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<Counsellor> findWhereCreatedByEquals(String createdBy) throws CounsellorDaoException;

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<Counsellor> findWhereDateModifiedEquals(Date dateModified) throws CounsellorDaoException;

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<Counsellor> findWhereModifiedByEquals(String modifiedBy) throws CounsellorDaoException;

	/** 
	 * Returns all rows from the Counsellor table that match the criteria 'status = :status'.
	 */
	public List<Counsellor> findWhereStatusEquals(int status) throws CounsellorDaoException;

	/** 
	 * Returns the rows from the Counsellor table that matches the specified primary-key value.
	 */
	public Counsellor findByPrimaryKey(CounsellorPk pk) throws CounsellorDaoException;

}
