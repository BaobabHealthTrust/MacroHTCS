package com.baobab.htc.data.daos.dao;

import com.baobab.htc.data.daos.dao.SessionDao;
import com.baobab.htc.data.daos.dto.Session;
import com.baobab.htc.data.daos.dto.SessionPk;
import com.baobab.htc.data.daos.exceptions.SessionDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

public interface SessionDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SessionPk
	 */
	public SessionPk insert(Session dto);

	/** 
	 * Updates a single row in the Session table.
	 */
	public void update(SessionPk pk, Session dto) throws SessionDaoException;

	/** 
	 * Deletes a single row in the Session table.
	 */
	public void delete(SessionPk pk) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'sessionReference = :sessionReference'.
	 */
	public Session findByPrimaryKey(String sessionReference) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'sessionTypeId = :sessionTypeId'.
	 */
	public List<Session> findBySessiontype(BigDecimal sessionTypeId) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'sameSexPartner = :sameSexPartner'.
	 */
	public List<Session> findWhereSameSexPartnerEquals(int sameSexPartner) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'statusOfPartners = :statusOfPartners'.
	 */
	public List<Session> findWhereStatusOfPartnersEquals(int statusOfPartners) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'condomsGiven = :condomsGiven'.
	 */
	public List<Session> findWhereCondomsGivenEquals(int condomsGiven) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'returnVisit = :returnVisit'.
	 */
	public List<Session> findWhereReturnVisitEquals(int returnVisit) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria ''.
	 */
	public List<Session> findAll() throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'counsellorId = :counsellorId'.
	 */
	public List<Session> findByCounsellor(BigDecimal counsellorId) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'periodId = :periodId'.
	 */
	public List<Session> findByPeriod(BigDecimal periodId) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'sessionTypeId = :sessionTypeId'.
	 */
	public List<Session> findBySessionType(BigDecimal sessionTypeId) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'siteId = :siteId'.
	 */
	public List<Session> findBySite(BigDecimal siteId) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'testingTypeId = :testingTypeId'.
	 */
	public List<Session> findByTestingType(BigDecimal testingTypeId) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'sessionReference = :sessionReference'.
	 */
	public List<Session> findWhereSessionReferenceEquals(String sessionReference) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'lotNumber1 = :lotNumber1'.
	 */
	public List<Session> findWhereLotNumber1Equals(String lotNumber1) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'lotNumber2 = :lotNumber2'.
	 */
	public List<Session> findWhereLotNumber2Equals(String lotNumber2) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'lotNumber3 = :lotNumber3'.
	 */
	public List<Session> findWhereLotNumber3Equals(String lotNumber3) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'siteId = :siteId'.
	 */
	public List<Session> findWhereSiteIdEquals(BigDecimal siteId) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'terminalId = :terminalId'.
	 */
	public List<Session> findWhereTerminalIdEquals(String terminalId) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'traditionalAuthority = :traditionalAuthority'.
	 */
	public List<Session> findWhereTraditionalAuthorityEquals(String traditionalAuthority) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'counsellorId = :counsellorId'.
	 */
	public List<Session> findWhereCounsellorIdEquals(BigDecimal counsellorId) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'sessionTypeId = :sessionTypeId'.
	 */
	public List<Session> findWhereSessionTypeIdEquals(BigDecimal sessionTypeId) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'testingTypeId = :testingTypeId'.
	 */
	public List<Session> findWhereTestingTypeIdEquals(BigDecimal testingTypeId) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'sessionDate = :sessionDate'.
	 */
	public List<Session> findWhereSessionDateEquals(Date sessionDate) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'couplesReference = :couplesReference'.
	 */
	public List<Session> findWhereCouplesReferenceEquals(String couplesReference) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'sex = :sex'.
	 */
	public List<Session> findWhereSexEquals(int sex) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'dateOfBirth = :dateOfBirth'.
	 */
	public List<Session> findWhereDateOfBirthEquals(Date dateOfBirth) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'currentOccupation = :currentOccupation'.
	 */
	public List<Session> findWhereCurrentOccupationEquals(int currentOccupation) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'highestEducation = :highestEducation'.
	 */
	public List<Session> findWhereHighestEducationEquals(int highestEducation) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'currentMaritalStatus = :currentMaritalStatus'.
	 */
	public List<Session> findWhereCurrentMaritalStatusEquals(int currentMaritalStatus) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'mainReason = :mainReason'.
	 */
	public List<Session> findWhereMainReasonEquals(int mainReason) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'everHivTestedBefore = :everHivTestedBefore'.
	 */
	public List<Session> findWhereEverHivTestedBeforeEquals(int everHivTestedBefore) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'oftenGetTested = :oftenGetTested'.
	 */
	public List<Session> findWhereOftenGetTestedEquals(int oftenGetTested) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'oftenDrinksAlcohol = :oftenDrinksAlcohol'.
	 */
	public List<Session> findWhereOftenDrinksAlcoholEquals(int oftenDrinksAlcohol) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'sexualPartners = :sexualPartners'.
	 */
	public List<Session> findWhereSexualPartnersEquals(int sexualPartners) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'sexualRelationships = :sexualRelationships'.
	 */
	public List<Session> findWhereSexualRelationshipsEquals(int sexualRelationships) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'statusOfAnyPartners = :statusOfAnyPartners'.
	 */
	public List<Session> findWhereStatusOfAnyPartnersEquals(int statusOfAnyPartners) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'statusOfAllPartners = :statusOfAllPartners'.
	 */
	public List<Session> findWhereStatusOfAllPartnersEquals(int statusOfAllPartners) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'frequentlyUseCondom = :frequentlyUseCondom'.
	 */
	public List<Session> findWhereFrequentlyUseCondomEquals(int frequentlyUseCondom) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'useCondomWithSpouse = :useCondomWithSpouse'.
	 */
	public List<Session> findWhereUseCondomWithSpouseEquals(int useCondomWithSpouse) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'usingFpMethod = :usingFpMethod'.
	 */
	public List<Session> findWhereUsingFpMethodEquals(int usingFpMethod) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'testResult1 = :testResult1'.
	 */
	public List<Session> findWhereTestResult1Equals(int testResult1) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'testResult2 = :testResult2'.
	 */
	public List<Session> findWhereTestResult2Equals(int testResult2) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'testResult3 = :testResult3'.
	 */
	public List<Session> findWhereTestResult3Equals(int testResult3) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'finalResult = :finalResult'.
	 */
	public List<Session> findWhereFinalResultEquals(int finalResult) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'maleCondomsGiven = :maleCondomsGiven'.
	 */
	public List<Session> findWhereMaleCondomsGivenEquals(int maleCondomsGiven) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'femaleCondomsGiven = :femaleCondomsGiven'.
	 */
	public List<Session> findWhereFemaleCondomsGivenEquals(int femaleCondomsGiven) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'periodId = :periodId'.
	 */
	public List<Session> findWherePeriodIdEquals(BigDecimal periodId) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'dateCreated = :dateCreated'.
	 */
	public List<Session> findWhereDateCreatedEquals(Date dateCreated) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'createdBy = :createdBy'.
	 */
	public List<Session> findWhereCreatedByEquals(String createdBy) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'dateModified = :dateModified'.
	 */
	public List<Session> findWhereDateModifiedEquals(Date dateModified) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	public List<Session> findWhereModifiedByEquals(String modifiedBy) throws SessionDaoException;

	/** 
	 * Returns all rows from the Session table that match the criteria 'status = :status'.
	 */
	public List<Session> findWhereStatusEquals(int status) throws SessionDaoException;

	/** 
	 * Returns the rows from the Session table that matches the specified primary-key value.
	 */
	public Session findByPrimaryKey(SessionPk pk) throws SessionDaoException;

}
