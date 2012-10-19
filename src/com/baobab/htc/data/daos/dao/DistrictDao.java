package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.DistrictDao;
import com.baobab.htc.data.daos.dto.District;
import com.baobab.htc.data.daos.dto.DistrictPk;
import com.baobab.htc.data.daos.exceptions.DistrictDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface DistrictDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return DistrictPk
	 */
	public DistrictPk insert(District dto);

	/** 
	 * Updates a single row in the District table.
	 */
	public void update(DistrictPk pk, District dto) throws DistrictDaoException;

	/** 
	 * Deletes a single row in the District table.
	 */
	public void delete(DistrictPk pk) throws DistrictDaoException;

	/** 
	 * Returns all rows from the District table that match the criteria 'districtId = :districtId'.
	 */
	public District findByPrimaryKey(long districtId) throws DistrictDaoException;

	/** 
	 * Returns all rows from the District table that match the criteria ''.
	 */
	public List<District> findAll() throws DistrictDaoException;

	/** 
	 * Returns all rows from the District table that match the criteria 'regionId = :regionId'.
	 */
	public List<District> findByRegion(BigDecimal regionId) throws DistrictDaoException;

	/** 
	 * Returns all rows from the District table that match the criteria 'districtId = :districtId'.
	 */
	public List<District> findWhereDistrictIdEquals(BigDecimal districtId) throws DistrictDaoException;

	/** 
	 * Returns all rows from the District table that match the criteria 'name = :name'.
	 */
	public List<District> findWhereNameEquals(String name) throws DistrictDaoException;

	/** 
	 * Returns all rows from the District table that match the criteria 'regionId = :regionId'.
	 */
	public List<District> findWhereRegionIdEquals(BigDecimal regionId) throws DistrictDaoException;

	/** 
	 * Returns all rows from the District table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<District> findWhereDateCreatedEquals(Date dateCreated) throws DistrictDaoException;

	/** 
	 * Returns all rows from the District table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<District> findWhereCreatedByEquals(String createdBy) throws DistrictDaoException;

	/** 
	 * Returns all rows from the District table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<District> findWhereDateModifiedEquals(Date dateModified) throws DistrictDaoException;

	/** 
	 * Returns all rows from the District table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<District> findWhereModifiedByEquals(String modifiedBy) throws DistrictDaoException;

	/** 
	 * Returns all rows from the District table that match the criteria 'status = :status'.
	 */
	public List<District> findWhereStatusEquals(int status) throws DistrictDaoException;

	/** 
	 * Returns the rows from the District table that matches the specified primary-key value.
	 */
	public District findByPrimaryKey(DistrictPk pk) throws DistrictDaoException;

}
