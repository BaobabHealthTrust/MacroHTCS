package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.RegionDao;
import com.baobab.htc.data.daos.dto.Region;
import com.baobab.htc.data.daos.dto.RegionPk;
import com.baobab.htc.data.daos.exceptions.RegionDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface RegionDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return RegionPk
	 */
	public RegionPk insert(Region dto);

	/** 
	 * Updates a single row in the Region table.
	 */
	public void update(RegionPk pk, Region dto) throws RegionDaoException;

	/** 
	 * Deletes a single row in the Region table.
	 */
	public void delete(RegionPk pk) throws RegionDaoException;

	/** 
	 * Returns all rows from the Region table that match the criteria 'regionId = :regionId'.
	 */
	public Region findByPrimaryKey(long regionId) throws RegionDaoException;

	/** 
	 * Returns all rows from the Region table that match the criteria ''.
	 */
	public List<Region> findAll() throws RegionDaoException;

	/** 
	 * Returns all rows from the Region table that match the criteria 'regionId = :regionId'.
	 */
	public List<Region> findWhereRegionIdEquals(BigDecimal regionId) throws RegionDaoException;

	/** 
	 * Returns all rows from the Region table that match the criteria 'name = :name'.
	 */
	public List<Region> findWhereNameEquals(String name) throws RegionDaoException;

	/** 
	 * Returns all rows from the Region table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<Region> findWhereDateCreatedEquals(Date dateCreated) throws RegionDaoException;

	/** 
	 * Returns all rows from the Region table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<Region> findWhereCreatedByEquals(String createdBy) throws RegionDaoException;

	/** 
	 * Returns all rows from the Region table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<Region> findWhereDateModifiedEquals(Date dateModified) throws RegionDaoException;

	/** 
	 * Returns all rows from the Region table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<Region> findWhereModifiedByEquals(String modifiedBy) throws RegionDaoException;

	/** 
	 * Returns all rows from the Region table that match the criteria 'status = :status'.
	 */
	public List<Region> findWhereStatusEquals(int status) throws RegionDaoException;

	/** 
	 * Returns the rows from the Region table that matches the specified primary-key value.
	 */
	public Region findByPrimaryKey(RegionPk pk) throws RegionDaoException;

}
