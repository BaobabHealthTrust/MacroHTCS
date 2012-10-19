package com.baobab.htc.data.daos.dao.spring;

import com.baobab.htc.data.daos.dao.SessionDao;
import com.baobab.htc.data.daos.dto.Session;
import com.baobab.htc.data.daos.dto.SessionPk;
import com.baobab.htc.data.daos.exceptions.SessionDaoException;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class SessionDaoImpl extends AbstractDAO implements ParameterizedRowMapper<Session>, SessionDao
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
	 * @return SessionPk
	 */
	@Transactional
	public SessionPk insert(Session dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )",dto.getSessionReference(),dto.isSiteIdNull()?null:dto.getSiteId(),dto.getTerminalId(),dto.getTraditionalAuthority(),dto.isCounsellorIdNull()?null:dto.getCounsellorId(),dto.isSessionTypeIdNull()?null:dto.getSessionTypeId(),dto.getCouplesReference(),dto.isSexNull()?null:dto.getSex(),dto.getDateOfBirth(),dto.isCurrentOccupationNull()?null:dto.getCurrentOccupation(),dto.isHighestEducationNull()?null:dto.getHighestEducation(),dto.isCurrentMaritalStatusNull()?null:dto.getCurrentMaritalStatus(),dto.isEverHivTestedBeforeNull()?null:dto.getEverHivTestedBefore(),dto.isOftenGetTestedNull()?null:dto.getOftenGetTested(),dto.isOftenDrinksAlcoholNull()?null:dto.getOftenDrinksAlcohol(),dto.isSexualPartnersNull()?null:dto.getSexualPartners(),dto.isSexualRelationshipsNull()?null:dto.getSexualRelationships(),dto.isFrequentlyUseCondomNull()?null:dto.getFrequentlyUseCondom(),dto.isUsingFpMethodNull()?null:dto.getUsingFpMethod(),dto.isTestResult1Null()?null:dto.getTestResult1(),dto.isTestResult2Null()?null:dto.getTestResult2(),dto.isTestResult3Null()?null:dto.getTestResult3(),dto.isFinalResultNull()?null:dto.getFinalResult(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.isStatusNull()?null:dto.getStatus(),dto.isTestingTypeIdNull()?null:dto.getTestingTypeId(),dto.getSessionDate(),dto.isMainReasonNull()?null:dto.getMainReason(),dto.isStatusOfAnyPartnersNull()?null:dto.getStatusOfAnyPartners(),dto.isStatusOfAllPartnersNull()?null:dto.getStatusOfAllPartners(),dto.isUseCondomWithSpouseNull()?null:dto.getUseCondomWithSpouse(),dto.isMaleCondomsGivenNull()?null:dto.getMaleCondomsGiven(),dto.isFemaleCondomsGivenNull()?null:dto.getFemaleCondomsGiven(),dto.getLotNumber1(),dto.getLotNumber2(),dto.getLotNumber3(),dto.isPeriodIdNull()?null:dto.getPeriodId());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the Session table.
	 */
	@Transactional
	public void update(SessionPk pk, Session dto) throws SessionDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET sessionReference = ?, siteId = ?, terminalId = ?, traditionalAuthority = ?, counsellorId = ?, sessionTypeId = ?, couplesReference = ?, sex = ?, dateOfBirth = ?, currentOccupation = ?, highestEducation = ?, currentMaritalStatus = ?, everHivTestedBefore = ?, oftenGetTested = ?, oftenDrinksAlcohol = ?, sexualPartners = ?, sexualRelationships = ?, frequentlyUseCondom = ?, usingFpMethod = ?, testResult1 = ?, testResult2 = ?, testResult3 = ?, finalResult = ?, dateCreated = ?, createdBy = ?, dateModified = ?, modifiedBy = ?, status = ?, testingTypeId = ?, sessionDate = ?, mainReason = ?, statusOfAnyPartners = ?, statusOfAllPartners = ?, useCondomWithSpouse = ?, maleCondomsGiven = ?, femaleCondomsGiven = ?, lotNumber1 = ?, lotNumber2 = ?, lotNumber3 = ?, periodId = ? WHERE sessionReference = ?",dto.getSessionReference(),dto.getSiteId(),dto.getTerminalId(),dto.getTraditionalAuthority(),dto.getCounsellorId(),dto.getSessionTypeId(),dto.getCouplesReference(),dto.getSex(),dto.getDateOfBirth(),dto.getCurrentOccupation(),dto.getHighestEducation(),dto.getCurrentMaritalStatus(),dto.getEverHivTestedBefore(),dto.getOftenGetTested(),dto.getOftenDrinksAlcohol(),dto.getSexualPartners(),dto.getSexualRelationships(),dto.getFrequentlyUseCondom(),dto.getUsingFpMethod(),dto.getTestResult1(),dto.getTestResult2(),dto.getTestResult3(),dto.getFinalResult(),dto.getDateCreated(),dto.getCreatedBy(),dto.getDateModified(),dto.getModifiedBy(),dto.getStatus(),dto.getTestingTypeId(),dto.getSessionDate(),dto.getMainReason(),dto.getStatusOfAnyPartners(),dto.getStatusOfAllPartners(),dto.getUseCondomWithSpouse(),dto.getMaleCondomsGiven(),dto.getFemaleCondomsGiven(),dto.getLotNumber1(),dto.getLotNumber2(),dto.getLotNumber3(),dto.getPeriodId(),pk.getSessionReference());
	}

	/** 
	 * Deletes a single row in the Session table.
	 */
	@Transactional
	public void delete(SessionPk pk) throws SessionDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE sessionReference = ?",pk.getSessionReference());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return Session
	 */
	public Session mapRow(ResultSet rs, int row) throws SQLException
	{
		Session dto = new Session();
		dto.setSessionReference( rs.getString( 1 ) );
		dto.setSiteId( rs.getLong( 2 ) );
		if (rs.wasNull()) {
			dto.setSiteIdNull( true );
		}
		
		dto.setTerminalId( rs.getString( 3 ) );
		dto.setTraditionalAuthority( rs.getString( 4 ) );
		dto.setCounsellorId( rs.getLong( 5 ) );
		if (rs.wasNull()) {
			dto.setCounsellorIdNull( true );
		}
		
		dto.setSessionTypeId( rs.getLong( 6 ) );
		if (rs.wasNull()) {
			dto.setSessionTypeIdNull( true );
		}
		
		dto.setCouplesReference( rs.getString( 7 ) );
		dto.setSex( rs.getInt( 8 ) );
		if (rs.wasNull()) {
			dto.setSexNull( true );
		}
		
		dto.setDateOfBirth( rs.getTimestamp(9 ) );
		dto.setCurrentOccupation( rs.getInt( 10 ) );
		if (rs.wasNull()) {
			dto.setCurrentOccupationNull( true );
		}
		
		dto.setHighestEducation( rs.getInt( 11 ) );
		if (rs.wasNull()) {
			dto.setHighestEducationNull( true );
		}
		
		dto.setCurrentMaritalStatus( rs.getInt( 12 ) );
		if (rs.wasNull()) {
			dto.setCurrentMaritalStatusNull( true );
		}
		
		dto.setEverHivTestedBefore( rs.getInt( 13 ) );
		if (rs.wasNull()) {
			dto.setEverHivTestedBeforeNull( true );
		}
		
		dto.setOftenGetTested( rs.getInt( 14 ) );
		if (rs.wasNull()) {
			dto.setOftenGetTestedNull( true );
		}
		
		dto.setOftenDrinksAlcohol( rs.getInt( 15 ) );
		if (rs.wasNull()) {
			dto.setOftenDrinksAlcoholNull( true );
		}
		
		dto.setSexualPartners( rs.getInt( 16 ) );
		if (rs.wasNull()) {
			dto.setSexualPartnersNull( true );
		}
		
		dto.setSexualRelationships( rs.getInt( 17 ) );
		if (rs.wasNull()) {
			dto.setSexualRelationshipsNull( true );
		}
		
		dto.setFrequentlyUseCondom( rs.getInt( 18 ) );
		if (rs.wasNull()) {
			dto.setFrequentlyUseCondomNull( true );
		}
		
		dto.setUsingFpMethod( rs.getInt( 19 ) );
		if (rs.wasNull()) {
			dto.setUsingFpMethodNull( true );
		}
		
		dto.setTestResult1( rs.getInt( 20 ) );
		if (rs.wasNull()) {
			dto.setTestResult1Null( true );
		}
		
		dto.setTestResult2( rs.getInt( 21 ) );
		if (rs.wasNull()) {
			dto.setTestResult2Null( true );
		}
		
		dto.setTestResult3( rs.getInt( 22 ) );
		if (rs.wasNull()) {
			dto.setTestResult3Null( true );
		}
		
		dto.setFinalResult( rs.getInt( 23 ) );
		if (rs.wasNull()) {
			dto.setFinalResultNull( true );
		}
		
		dto.setDateCreated( rs.getTimestamp(24 ) );
		dto.setCreatedBy( rs.getString( 25 ) );
		dto.setDateModified( rs.getTimestamp(26 ) );
		dto.setModifiedBy( rs.getString( 27 ) );
		dto.setStatus( rs.getInt( 28 ) );
		if (rs.wasNull()) {
			dto.setStatusNull( true );
		}
		
		dto.setTestingTypeId( rs.getLong( 29 ) );
		if (rs.wasNull()) {
			dto.setTestingTypeIdNull( true );
		}
		
		dto.setSessionDate( rs.getTimestamp(30 ) );
		dto.setMainReason( rs.getInt( 31 ) );
		if (rs.wasNull()) {
			dto.setMainReasonNull( true );
		}
		
		dto.setStatusOfAnyPartners( rs.getInt( 32 ) );
		if (rs.wasNull()) {
			dto.setStatusOfAnyPartnersNull( true );
		}
		
		dto.setStatusOfAllPartners( rs.getInt( 33 ) );
		if (rs.wasNull()) {
			dto.setStatusOfAllPartnersNull( true );
		}
		
		dto.setUseCondomWithSpouse( rs.getInt( 34 ) );
		if (rs.wasNull()) {
			dto.setUseCondomWithSpouseNull( true );
		}
		
		dto.setMaleCondomsGiven( rs.getInt( 35 ) );
		if (rs.wasNull()) {
			dto.setMaleCondomsGivenNull( true );
		}
		
		dto.setFemaleCondomsGiven( rs.getInt( 36 ) );
		if (rs.wasNull()) {
			dto.setFemaleCondomsGivenNull( true );
		}
		
		dto.setLotNumber1( rs.getString( 37 ) );
		dto.setLotNumber2( rs.getString( 38 ) );
		dto.setLotNumber3( rs.getString( 39 ) );
		dto.setPeriodId( rs.getLong( 40 ) );
		if (rs.wasNull()) {
			dto.setPeriodIdNull( true );
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
		return "Session";
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'sessionReference = :sessionReference'.
	 */
	@Transactional
	public Session findByPrimaryKey(String sessionReference) throws SessionDaoException
	{
		try {
			List<Session> list = jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE sessionReference = ?", this,sessionReference);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'sessionTypeId = :sessionTypeId'.
	 */
	@Transactional
	public List<Session> findBySessiontype(BigDecimal sessionTypeId) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE sessionTypeId = ?", this,sessionTypeId);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'sameSexPartner = :sameSexPartner'.
	 */
	@Transactional
	public List<Session> findWhereSameSexPartnerEquals(int sameSexPartner) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE sameSexPartner = ? ORDER BY sameSexPartner", this,sameSexPartner);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'statusOfPartners = :statusOfPartners'.
	 */
	@Transactional
	public List<Session> findWhereStatusOfPartnersEquals(int statusOfPartners) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE statusOfPartners = ? ORDER BY statusOfPartners", this,statusOfPartners);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'condomsGiven = :condomsGiven'.
	 */
	@Transactional
	public List<Session> findWhereCondomsGivenEquals(int condomsGiven) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE condomsGiven = ? ORDER BY condomsGiven", this,condomsGiven);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'returnVisit = :returnVisit'.
	 */
	@Transactional
	public List<Session> findWhereReturnVisitEquals(int returnVisit) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE returnVisit = ? ORDER BY returnVisit", this,returnVisit);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria ''.
	 */
	@Transactional
	public List<Session> findAll() throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " ORDER BY sessionReference", this);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'counsellorId = :counsellorId'.
	 */
	@Transactional
	public List<Session> findByCounsellor(BigDecimal counsellorId) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE counsellorId = ?", this,counsellorId);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'periodId = :periodId'.
	 */
	@Transactional
	public List<Session> findByPeriod(BigDecimal periodId) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE periodId = ?", this,periodId);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'sessionTypeId = :sessionTypeId'.
	 */
	@Transactional
	public List<Session> findBySessionType(BigDecimal sessionTypeId) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE sessionTypeId = ?", this,sessionTypeId);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'siteId = :siteId'.
	 */
	@Transactional
	public List<Session> findBySite(BigDecimal siteId) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE siteId = ?", this,siteId);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'testingTypeId = :testingTypeId'.
	 */
	@Transactional
	public List<Session> findByTestingType(BigDecimal testingTypeId) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE testingTypeId = ?", this,testingTypeId);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'sessionReference = :sessionReference'.
	 */
	@Transactional
	public List<Session> findWhereSessionReferenceEquals(String sessionReference) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE sessionReference = ? ORDER BY sessionReference", this,sessionReference);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'lotNumber1 = :lotNumber1'.
	 */
	@Transactional
	public List<Session> findWhereLotNumber1Equals(String lotNumber1) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE lotNumber1 = ? ORDER BY lotNumber1", this,lotNumber1);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'lotNumber2 = :lotNumber2'.
	 */
	@Transactional
	public List<Session> findWhereLotNumber2Equals(String lotNumber2) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE lotNumber2 = ? ORDER BY lotNumber2", this,lotNumber2);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'lotNumber3 = :lotNumber3'.
	 */
	@Transactional
	public List<Session> findWhereLotNumber3Equals(String lotNumber3) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE lotNumber3 = ? ORDER BY lotNumber3", this,lotNumber3);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'siteId = :siteId'.
	 */
	@Transactional
	public List<Session> findWhereSiteIdEquals(BigDecimal siteId) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE siteId = ? ORDER BY siteId", this,siteId);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'terminalId = :terminalId'.
	 */
	@Transactional
	public List<Session> findWhereTerminalIdEquals(String terminalId) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE terminalId = ? ORDER BY terminalId", this,terminalId);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'traditionalAuthority = :traditionalAuthority'.
	 */
	@Transactional
	public List<Session> findWhereTraditionalAuthorityEquals(String traditionalAuthority) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE traditionalAuthority = ? ORDER BY traditionalAuthority", this,traditionalAuthority);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'counsellorId = :counsellorId'.
	 */
	@Transactional
	public List<Session> findWhereCounsellorIdEquals(BigDecimal counsellorId) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE counsellorId = ? ORDER BY counsellorId", this,counsellorId);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'sessionTypeId = :sessionTypeId'.
	 */
	@Transactional
	public List<Session> findWhereSessionTypeIdEquals(BigDecimal sessionTypeId) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE sessionTypeId = ? ORDER BY sessionTypeId", this,sessionTypeId);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'testingTypeId = :testingTypeId'.
	 */
	@Transactional
	public List<Session> findWhereTestingTypeIdEquals(BigDecimal testingTypeId) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE testingTypeId = ? ORDER BY testingTypeId", this,testingTypeId);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'sessionDate = :sessionDate'.
	 */
	@Transactional
	public List<Session> findWhereSessionDateEquals(Date sessionDate) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE sessionDate = ? ORDER BY sessionDate", this,sessionDate);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'couplesReference = :couplesReference'.
	 */
	@Transactional
	public List<Session> findWhereCouplesReferenceEquals(String couplesReference) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE couplesReference = ? ORDER BY couplesReference", this,couplesReference);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'sex = :sex'.
	 */
	@Transactional
	public List<Session> findWhereSexEquals(int sex) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE sex = ? ORDER BY sex", this,sex);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'dateOfBirth = :dateOfBirth'.
	 */
	@Transactional
	public List<Session> findWhereDateOfBirthEquals(Date dateOfBirth) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE dateOfBirth = ? ORDER BY dateOfBirth", this,dateOfBirth);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'currentOccupation = :currentOccupation'.
	 */
	@Transactional
	public List<Session> findWhereCurrentOccupationEquals(int currentOccupation) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE currentOccupation = ? ORDER BY currentOccupation", this,currentOccupation);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'highestEducation = :highestEducation'.
	 */
	@Transactional
	public List<Session> findWhereHighestEducationEquals(int highestEducation) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE highestEducation = ? ORDER BY highestEducation", this,highestEducation);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'currentMaritalStatus = :currentMaritalStatus'.
	 */
	@Transactional
	public List<Session> findWhereCurrentMaritalStatusEquals(int currentMaritalStatus) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE currentMaritalStatus = ? ORDER BY currentMaritalStatus", this,currentMaritalStatus);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'mainReason = :mainReason'.
	 */
	@Transactional
	public List<Session> findWhereMainReasonEquals(int mainReason) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE mainReason = ? ORDER BY mainReason", this,mainReason);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'everHivTestedBefore = :everHivTestedBefore'.
	 */
	@Transactional
	public List<Session> findWhereEverHivTestedBeforeEquals(int everHivTestedBefore) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE everHivTestedBefore = ? ORDER BY everHivTestedBefore", this,everHivTestedBefore);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'oftenGetTested = :oftenGetTested'.
	 */
	@Transactional
	public List<Session> findWhereOftenGetTestedEquals(int oftenGetTested) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE oftenGetTested = ? ORDER BY oftenGetTested", this,oftenGetTested);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'oftenDrinksAlcohol = :oftenDrinksAlcohol'.
	 */
	@Transactional
	public List<Session> findWhereOftenDrinksAlcoholEquals(int oftenDrinksAlcohol) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE oftenDrinksAlcohol = ? ORDER BY oftenDrinksAlcohol", this,oftenDrinksAlcohol);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'sexualPartners = :sexualPartners'.
	 */
	@Transactional
	public List<Session> findWhereSexualPartnersEquals(int sexualPartners) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE sexualPartners = ? ORDER BY sexualPartners", this,sexualPartners);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'sexualRelationships = :sexualRelationships'.
	 */
	@Transactional
	public List<Session> findWhereSexualRelationshipsEquals(int sexualRelationships) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE sexualRelationships = ? ORDER BY sexualRelationships", this,sexualRelationships);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'statusOfAnyPartners = :statusOfAnyPartners'.
	 */
	@Transactional
	public List<Session> findWhereStatusOfAnyPartnersEquals(int statusOfAnyPartners) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE statusOfAnyPartners = ? ORDER BY statusOfAnyPartners", this,statusOfAnyPartners);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'statusOfAllPartners = :statusOfAllPartners'.
	 */
	@Transactional
	public List<Session> findWhereStatusOfAllPartnersEquals(int statusOfAllPartners) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE statusOfAllPartners = ? ORDER BY statusOfAllPartners", this,statusOfAllPartners);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'frequentlyUseCondom = :frequentlyUseCondom'.
	 */
	@Transactional
	public List<Session> findWhereFrequentlyUseCondomEquals(int frequentlyUseCondom) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE frequentlyUseCondom = ? ORDER BY frequentlyUseCondom", this,frequentlyUseCondom);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'useCondomWithSpouse = :useCondomWithSpouse'.
	 */
	@Transactional
	public List<Session> findWhereUseCondomWithSpouseEquals(int useCondomWithSpouse) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE useCondomWithSpouse = ? ORDER BY useCondomWithSpouse", this,useCondomWithSpouse);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'usingFpMethod = :usingFpMethod'.
	 */
	@Transactional
	public List<Session> findWhereUsingFpMethodEquals(int usingFpMethod) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE usingFpMethod = ? ORDER BY usingFpMethod", this,usingFpMethod);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'testResult1 = :testResult1'.
	 */
	@Transactional
	public List<Session> findWhereTestResult1Equals(int testResult1) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE testResult1 = ? ORDER BY testResult1", this,testResult1);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'testResult2 = :testResult2'.
	 */
	@Transactional
	public List<Session> findWhereTestResult2Equals(int testResult2) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE testResult2 = ? ORDER BY testResult2", this,testResult2);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'testResult3 = :testResult3'.
	 */
	@Transactional
	public List<Session> findWhereTestResult3Equals(int testResult3) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE testResult3 = ? ORDER BY testResult3", this,testResult3);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'finalResult = :finalResult'.
	 */
	@Transactional
	public List<Session> findWhereFinalResultEquals(int finalResult) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE finalResult = ? ORDER BY finalResult", this,finalResult);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'maleCondomsGiven = :maleCondomsGiven'.
	 */
	@Transactional
	public List<Session> findWhereMaleCondomsGivenEquals(int maleCondomsGiven) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE maleCondomsGiven = ? ORDER BY maleCondomsGiven", this,maleCondomsGiven);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'femaleCondomsGiven = :femaleCondomsGiven'.
	 */
	@Transactional
	public List<Session> findWhereFemaleCondomsGivenEquals(int femaleCondomsGiven) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE femaleCondomsGiven = ? ORDER BY femaleCondomsGiven", this,femaleCondomsGiven);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'periodId = :periodId'.
	 */
	@Transactional
	public List<Session> findWherePeriodIdEquals(BigDecimal periodId) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE periodId = ? ORDER BY periodId", this,periodId);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'dateCreated = :dateCreated'.
	 */
	@Transactional
	public List<Session> findWhereDateCreatedEquals(Date dateCreated) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE dateCreated = ? ORDER BY dateCreated", this,dateCreated);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'createdBy = :createdBy'.
	 */
	@Transactional
	public List<Session> findWhereCreatedByEquals(String createdBy) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE createdBy = ? ORDER BY createdBy", this,createdBy);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'dateModified = :dateModified'.
	 */
	@Transactional
	public List<Session> findWhereDateModifiedEquals(Date dateModified) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE dateModified = ? ORDER BY dateModified", this,dateModified);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'modifiedBy = :modifiedBy'.
	 */
	@Transactional
	public List<Session> findWhereModifiedByEquals(String modifiedBy) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE modifiedBy = ? ORDER BY modifiedBy", this,modifiedBy);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the Session table that match the criteria 'status = :status'.
	 */
	@Transactional
	public List<Session> findWhereStatusEquals(int status) throws SessionDaoException
	{
		try {
			return jdbcTemplate.query("SELECT sessionReference, siteId, terminalId, traditionalAuthority, counsellorId, sessionTypeId, couplesReference, sex, dateOfBirth, currentOccupation, highestEducation, currentMaritalStatus, everHivTestedBefore, oftenGetTested, oftenDrinksAlcohol, sexualPartners, sexualRelationships, frequentlyUseCondom, usingFpMethod, testResult1, testResult2, testResult3, finalResult, dateCreated, createdBy, dateModified, modifiedBy, status, testingTypeId, sessionDate, mainReason, statusOfAnyPartners, statusOfAllPartners, useCondomWithSpouse, maleCondomsGiven, femaleCondomsGiven, lotNumber1, lotNumber2, lotNumber3, periodId FROM " + getTableName() + " WHERE status = ? ORDER BY status", this,status);
		}
		catch (Exception e) {
			throw new SessionDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the Session table that matches the specified primary-key value.
	 */
	public Session findByPrimaryKey(SessionPk pk) throws SessionDaoException
	{
		return findByPrimaryKey( pk.getSessionReference() );
	}

}
