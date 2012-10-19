package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.TraditionalAuthorityDao;
import com.baobab.htc.data.daos.dto.TraditionalAuthority;
import com.baobab.htc.data.daos.dto.TraditionalAuthorityPk;
import com.baobab.htc.data.daos.exceptions.TraditionalAuthorityDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface TraditionalAuthorityDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return TraditionalAuthorityPk
	 */
	public TraditionalAuthorityPk insert(TraditionalAuthority dto);

	/** 
	 * Updates a single row in the TraditionalAuthority table.
	 */
	public void update(TraditionalAuthorityPk pk, TraditionalAuthority dto) throws TraditionalAuthorityDaoException;

	/** 
	 * Deletes a single row in the TraditionalAuthority table.
	 */
	public void delete(TraditionalAuthorityPk pk) throws TraditionalAuthorityDaoException;

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'traditionalAuthorityId = :traditionalAuthorityId'.
	 */
	public TraditionalAuthority findByPrimaryKey(long traditionalAuthorityId) throws TraditionalAuthorityDaoException;

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria ''.
	 */
	public List<TraditionalAuthority> findAll() throws TraditionalAuthorityDaoException;

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'districtId = :districtId'.
	 */
	public List<TraditionalAuthority> findByDistrict(BigDecimal districtId) throws TraditionalAuthorityDaoException;

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'traditionalAuthorityId = :traditionalAuthorityId'.
	 */
	public List<TraditionalAuthority> findWhereTraditionalAuthorityIdEquals(BigDecimal traditionalAuthorityId) throws TraditionalAuthorityDaoException;

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'name = :name'.
	 */
	public List<TraditionalAuthority> findWhereNameEquals(String name) throws TraditionalAuthorityDaoException;

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'districtId = :districtId'.
	 */
	public List<TraditionalAuthority> findWhereDistrictIdEquals(BigDecimal districtId) throws TraditionalAuthorityDaoException;

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<TraditionalAuthority> findWhereDateCreatedEquals(Date dateCreated) throws TraditionalAuthorityDaoException;

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<TraditionalAuthority> findWhereCreatedByEquals(String createdBy) throws TraditionalAuthorityDaoException;

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<TraditionalAuthority> findWhereDateModifiedEquals(Date dateModified) throws TraditionalAuthorityDaoException;

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<TraditionalAuthority> findWhereModifiedByEquals(String modifiedBy) throws TraditionalAuthorityDaoException;

	/** 
	 * Returns all rows from the TraditionalAuthority table that match the criteria 'status = :status'.
	 */
	public List<TraditionalAuthority> findWhereStatusEquals(int status) throws TraditionalAuthorityDaoException;

	/** 
	 * Returns the rows from the TraditionalAuthority table that matches the specified primary-key value.
	 */
	public TraditionalAuthority findByPrimaryKey(TraditionalAuthorityPk pk) throws TraditionalAuthorityDaoException;

}
