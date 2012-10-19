package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.SequenceDao;
import com.baobab.htc.data.daos.dto.Sequence;
import com.baobab.htc.data.daos.dto.SequencePk;
import com.baobab.htc.data.daos.exceptions.SequenceDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface SequenceDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SequencePk
	 */
	public SequencePk insert(Sequence dto);

	/** 
	 * Updates a single row in the Sequence table.
	 */
	public void update(SequencePk pk, Sequence dto) throws SequenceDaoException;

	/** 
	 * Deletes a single row in the Sequence table.
	 */
	public void delete(SequencePk pk) throws SequenceDaoException;

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'id = :id'.
	 */
	public Sequence findByPrimaryKey(long id) throws SequenceDaoException;

	/** 
	 * Returns all rows from the Sequence table that match the criteria ''.
	 */
	public List<Sequence> findAll() throws SequenceDaoException;

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'id = :id'.
	 */
	public List<Sequence> findWhereIdEquals(BigDecimal id) throws SequenceDaoException;

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'sequenceName = :sequenceName'.
	 */
	public List<Sequence> findWhereSequenceNameEquals(String sequenceName) throws SequenceDaoException;

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'tableId = :tableId'.
	 */
	public List<Sequence> findWhereTableIdEquals(BigDecimal tableId) throws SequenceDaoException;

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'increment = :increment'.
	 */
	public List<Sequence> findWhereIncrementEquals(int increment) throws SequenceDaoException;

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<Sequence> findWhereDateCreatedEquals(Date dateCreated) throws SequenceDaoException;

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<Sequence> findWhereCreatedByEquals(String createdBy) throws SequenceDaoException;

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<Sequence> findWhereDateModifiedEquals(Date dateModified) throws SequenceDaoException;

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<Sequence> findWhereModifiedByEquals(String modifiedBy) throws SequenceDaoException;

	/** 
	 * Returns all rows from the Sequence table that match the criteria 'status = :status'.
	 */
	public List<Sequence> findWhereStatusEquals(int status) throws SequenceDaoException;

	/** 
	 * Returns the rows from the Sequence table that matches the specified primary-key value.
	 */
	public Sequence findByPrimaryKey(SequencePk pk) throws SequenceDaoException;

}
