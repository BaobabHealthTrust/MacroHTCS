package com.baobab.htc.data.daos.example;

import java.math.*;
import java.util.Date;
import java.util.List;
import com.baobab.htc.data.daos.dao.SessionDao;
import com.baobab.htc.data.daos.dto.Session;
import com.baobab.htc.data.daos.exceptions.SessionDaoException;
import com.baobab.htc.data.daos.factory.DaoFactory;

public class SessionDaoExample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findBySessiontype(null);
		// findWhereSameSexPartnerEquals(0);
		// findWhereStatusOfPartnersEquals(0);
		// findWhereCondomsGivenEquals(0);
		// findWhereReturnVisitEquals(0);
		// findAll();
		// findByCounsellor(null);
		// findByPeriod(null);
		// findBySessionType(null);
		// findBySite(null);
		// findByTestingType(null);
		// findWhereSessionReferenceEquals("");
		// findWhereLotNumber1Equals("");
		// findWhereLotNumber2Equals("");
		// findWhereLotNumber3Equals("");
		// findWhereSiteIdEquals(null);
		// findWhereTerminalIdEquals("");
		// findWhereTraditionalAuthorityEquals("");
		// findWhereCounsellorIdEquals(null);
		// findWhereSessionTypeIdEquals(null);
		// findWhereTestingTypeIdEquals(null);
		// findWhereSessionDateEquals(null);
		// findWhereCouplesReferenceEquals("");
		// findWhereSexEquals(0);
		// findWhereDateOfBirthEquals(null);
		// findWhereCurrentOccupationEquals(0);
		// findWhereHighestEducationEquals(0);
		// findWhereCurrentMaritalStatusEquals(0);
		// findWhereMainReasonEquals(0);
		// findWhereEverHivTestedBeforeEquals(0);
		// findWhereOftenGetTestedEquals(0);
		// findWhereOftenDrinksAlcoholEquals(0);
		// findWhereSexualPartnersEquals(0);
		// findWhereSexualRelationshipsEquals(0);
		// findWhereStatusOfAnyPartnersEquals(0);
		// findWhereStatusOfAllPartnersEquals(0);
		// findWhereFrequentlyUseCondomEquals(0);
		// findWhereUseCondomWithSpouseEquals(0);
		// findWhereUsingFpMethodEquals(0);
		// findWhereTestResult1Equals(0);
		// findWhereTestResult2Equals(0);
		// findWhereTestResult3Equals(0);
		// findWhereFinalResultEquals(0);
		// findWhereMaleCondomsGivenEquals(0);
		// findWhereFemaleCondomsGivenEquals(0);
		// findWherePeriodIdEquals(null);
		// findWhereDateCreatedEquals(null);
		// findWhereCreatedByEquals("");
		// findWhereDateModifiedEquals(null);
		// findWhereModifiedByEquals("");
		// findWhereStatusEquals(0);
	}

	/**
	 * Method 'findBySessiontype'
	 * 
	 * @param sessionTypeId
	 * @throws Exception
	 */
	public static void findBySessiontype(BigDecimal sessionTypeId) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findBySessiontype(sessionTypeId);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSameSexPartnerEquals'
	 * 
	 * @param sameSexPartner
	 * @throws Exception
	 */
	public static void findWhereSameSexPartnerEquals(int sameSexPartner) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereSameSexPartnerEquals(sameSexPartner);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereStatusOfPartnersEquals'
	 * 
	 * @param statusOfPartners
	 * @throws Exception
	 */
	public static void findWhereStatusOfPartnersEquals(int statusOfPartners) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereStatusOfPartnersEquals(statusOfPartners);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereCondomsGivenEquals'
	 * 
	 * @param condomsGiven
	 * @throws Exception
	 */
	public static void findWhereCondomsGivenEquals(int condomsGiven) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereCondomsGivenEquals(condomsGiven);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereReturnVisitEquals'
	 * 
	 * @param returnVisit
	 * @throws Exception
	 */
	public static void findWhereReturnVisitEquals(int returnVisit) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereReturnVisitEquals(returnVisit);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findAll'
	 * 
	 * @throws Exception
	 */
	public static void findAll() throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findAll();
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findByCounsellor'
	 * 
	 * @param counsellorId
	 * @throws Exception
	 */
	public static void findByCounsellor(BigDecimal counsellorId) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findByCounsellor(counsellorId);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findByPeriod'
	 * 
	 * @param periodId
	 * @throws Exception
	 */
	public static void findByPeriod(BigDecimal periodId) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findByPeriod(periodId);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findBySessionType'
	 * 
	 * @param sessionTypeId
	 * @throws Exception
	 */
	public static void findBySessionType(BigDecimal sessionTypeId) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findBySessionType(sessionTypeId);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findBySite'
	 * 
	 * @param siteId
	 * @throws Exception
	 */
	public static void findBySite(BigDecimal siteId) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findBySite(siteId);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findByTestingType'
	 * 
	 * @param testingTypeId
	 * @throws Exception
	 */
	public static void findByTestingType(BigDecimal testingTypeId) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findByTestingType(testingTypeId);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSessionReferenceEquals'
	 * 
	 * @param sessionReference
	 * @throws Exception
	 */
	public static void findWhereSessionReferenceEquals(String sessionReference) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereSessionReferenceEquals(sessionReference);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereLotNumber1Equals'
	 * 
	 * @param lotNumber1
	 * @throws Exception
	 */
	public static void findWhereLotNumber1Equals(String lotNumber1) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereLotNumber1Equals(lotNumber1);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereLotNumber2Equals'
	 * 
	 * @param lotNumber2
	 * @throws Exception
	 */
	public static void findWhereLotNumber2Equals(String lotNumber2) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereLotNumber2Equals(lotNumber2);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereLotNumber3Equals'
	 * 
	 * @param lotNumber3
	 * @throws Exception
	 */
	public static void findWhereLotNumber3Equals(String lotNumber3) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereLotNumber3Equals(lotNumber3);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSiteIdEquals'
	 * 
	 * @param siteId
	 * @throws Exception
	 */
	public static void findWhereSiteIdEquals(BigDecimal siteId) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereSiteIdEquals(siteId);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereTerminalIdEquals'
	 * 
	 * @param terminalId
	 * @throws Exception
	 */
	public static void findWhereTerminalIdEquals(String terminalId) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereTerminalIdEquals(terminalId);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereTraditionalAuthorityEquals'
	 * 
	 * @param traditionalAuthority
	 * @throws Exception
	 */
	public static void findWhereTraditionalAuthorityEquals(String traditionalAuthority) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereTraditionalAuthorityEquals(traditionalAuthority);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereCounsellorIdEquals'
	 * 
	 * @param counsellorId
	 * @throws Exception
	 */
	public static void findWhereCounsellorIdEquals(BigDecimal counsellorId) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereCounsellorIdEquals(counsellorId);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSessionTypeIdEquals'
	 * 
	 * @param sessionTypeId
	 * @throws Exception
	 */
	public static void findWhereSessionTypeIdEquals(BigDecimal sessionTypeId) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereSessionTypeIdEquals(sessionTypeId);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereTestingTypeIdEquals'
	 * 
	 * @param testingTypeId
	 * @throws Exception
	 */
	public static void findWhereTestingTypeIdEquals(BigDecimal testingTypeId) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereTestingTypeIdEquals(testingTypeId);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSessionDateEquals'
	 * 
	 * @param sessionDate
	 * @throws Exception
	 */
	public static void findWhereSessionDateEquals(Date sessionDate) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereSessionDateEquals(sessionDate);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereCouplesReferenceEquals'
	 * 
	 * @param couplesReference
	 * @throws Exception
	 */
	public static void findWhereCouplesReferenceEquals(String couplesReference) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereCouplesReferenceEquals(couplesReference);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSexEquals'
	 * 
	 * @param sex
	 * @throws Exception
	 */
	public static void findWhereSexEquals(int sex) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereSexEquals(sex);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereDateOfBirthEquals'
	 * 
	 * @param dateOfBirth
	 * @throws Exception
	 */
	public static void findWhereDateOfBirthEquals(Date dateOfBirth) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereDateOfBirthEquals(dateOfBirth);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereCurrentOccupationEquals'
	 * 
	 * @param currentOccupation
	 * @throws Exception
	 */
	public static void findWhereCurrentOccupationEquals(int currentOccupation) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereCurrentOccupationEquals(currentOccupation);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereHighestEducationEquals'
	 * 
	 * @param highestEducation
	 * @throws Exception
	 */
	public static void findWhereHighestEducationEquals(int highestEducation) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereHighestEducationEquals(highestEducation);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereCurrentMaritalStatusEquals'
	 * 
	 * @param currentMaritalStatus
	 * @throws Exception
	 */
	public static void findWhereCurrentMaritalStatusEquals(int currentMaritalStatus) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereCurrentMaritalStatusEquals(currentMaritalStatus);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereMainReasonEquals'
	 * 
	 * @param mainReason
	 * @throws Exception
	 */
	public static void findWhereMainReasonEquals(int mainReason) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereMainReasonEquals(mainReason);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereEverHivTestedBeforeEquals'
	 * 
	 * @param everHivTestedBefore
	 * @throws Exception
	 */
	public static void findWhereEverHivTestedBeforeEquals(int everHivTestedBefore) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereEverHivTestedBeforeEquals(everHivTestedBefore);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereOftenGetTestedEquals'
	 * 
	 * @param oftenGetTested
	 * @throws Exception
	 */
	public static void findWhereOftenGetTestedEquals(int oftenGetTested) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereOftenGetTestedEquals(oftenGetTested);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereOftenDrinksAlcoholEquals'
	 * 
	 * @param oftenDrinksAlcohol
	 * @throws Exception
	 */
	public static void findWhereOftenDrinksAlcoholEquals(int oftenDrinksAlcohol) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereOftenDrinksAlcoholEquals(oftenDrinksAlcohol);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSexualPartnersEquals'
	 * 
	 * @param sexualPartners
	 * @throws Exception
	 */
	public static void findWhereSexualPartnersEquals(int sexualPartners) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereSexualPartnersEquals(sexualPartners);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereSexualRelationshipsEquals'
	 * 
	 * @param sexualRelationships
	 * @throws Exception
	 */
	public static void findWhereSexualRelationshipsEquals(int sexualRelationships) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereSexualRelationshipsEquals(sexualRelationships);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereStatusOfAnyPartnersEquals'
	 * 
	 * @param statusOfAnyPartners
	 * @throws Exception
	 */
	public static void findWhereStatusOfAnyPartnersEquals(int statusOfAnyPartners) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereStatusOfAnyPartnersEquals(statusOfAnyPartners);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereStatusOfAllPartnersEquals'
	 * 
	 * @param statusOfAllPartners
	 * @throws Exception
	 */
	public static void findWhereStatusOfAllPartnersEquals(int statusOfAllPartners) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereStatusOfAllPartnersEquals(statusOfAllPartners);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereFrequentlyUseCondomEquals'
	 * 
	 * @param frequentlyUseCondom
	 * @throws Exception
	 */
	public static void findWhereFrequentlyUseCondomEquals(int frequentlyUseCondom) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereFrequentlyUseCondomEquals(frequentlyUseCondom);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereUseCondomWithSpouseEquals'
	 * 
	 * @param useCondomWithSpouse
	 * @throws Exception
	 */
	public static void findWhereUseCondomWithSpouseEquals(int useCondomWithSpouse) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereUseCondomWithSpouseEquals(useCondomWithSpouse);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereUsingFpMethodEquals'
	 * 
	 * @param usingFpMethod
	 * @throws Exception
	 */
	public static void findWhereUsingFpMethodEquals(int usingFpMethod) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereUsingFpMethodEquals(usingFpMethod);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereTestResult1Equals'
	 * 
	 * @param testResult1
	 * @throws Exception
	 */
	public static void findWhereTestResult1Equals(int testResult1) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereTestResult1Equals(testResult1);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereTestResult2Equals'
	 * 
	 * @param testResult2
	 * @throws Exception
	 */
	public static void findWhereTestResult2Equals(int testResult2) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereTestResult2Equals(testResult2);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereTestResult3Equals'
	 * 
	 * @param testResult3
	 * @throws Exception
	 */
	public static void findWhereTestResult3Equals(int testResult3) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereTestResult3Equals(testResult3);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereFinalResultEquals'
	 * 
	 * @param finalResult
	 * @throws Exception
	 */
	public static void findWhereFinalResultEquals(int finalResult) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereFinalResultEquals(finalResult);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereMaleCondomsGivenEquals'
	 * 
	 * @param maleCondomsGiven
	 * @throws Exception
	 */
	public static void findWhereMaleCondomsGivenEquals(int maleCondomsGiven) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereMaleCondomsGivenEquals(maleCondomsGiven);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereFemaleCondomsGivenEquals'
	 * 
	 * @param femaleCondomsGiven
	 * @throws Exception
	 */
	public static void findWhereFemaleCondomsGivenEquals(int femaleCondomsGiven) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereFemaleCondomsGivenEquals(femaleCondomsGiven);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWherePeriodIdEquals'
	 * 
	 * @param periodId
	 * @throws Exception
	 */
	public static void findWherePeriodIdEquals(BigDecimal periodId) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWherePeriodIdEquals(periodId);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereDateCreatedEquals'
	 * 
	 * @param dateCreated
	 * @throws Exception
	 */
	public static void findWhereDateCreatedEquals(Date dateCreated) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereDateCreatedEquals(dateCreated);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereCreatedByEquals'
	 * 
	 * @param createdBy
	 * @throws Exception
	 */
	public static void findWhereCreatedByEquals(String createdBy) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereCreatedByEquals(createdBy);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereDateModifiedEquals'
	 * 
	 * @param dateModified
	 * @throws Exception
	 */
	public static void findWhereDateModifiedEquals(Date dateModified) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereDateModifiedEquals(dateModified);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereModifiedByEquals'
	 * 
	 * @param modifiedBy
	 * @throws Exception
	 */
	public static void findWhereModifiedByEquals(String modifiedBy) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereModifiedByEquals(modifiedBy);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'findWhereStatusEquals'
	 * 
	 * @param status
	 * @throws Exception
	 */
	public static void findWhereStatusEquals(int status) throws Exception
	{
		SessionDao dao = DaoFactory.createSessionDao();
		List<Session> _result = dao.findWhereStatusEquals(status);
		for (Session dto : _result) {
			display(dto);
		}
		
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Session dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getSessionReference() );
		buf.append( ", " );
		buf.append( dto.getSiteId() );
		buf.append( ", " );
		buf.append( dto.getTerminalId() );
		buf.append( ", " );
		buf.append( dto.getTraditionalAuthority() );
		buf.append( ", " );
		buf.append( dto.getCounsellorId() );
		buf.append( ", " );
		buf.append( dto.getSessionTypeId() );
		buf.append( ", " );
		buf.append( dto.getCouplesReference() );
		buf.append( ", " );
		buf.append( dto.getSex() );
		buf.append( ", " );
		buf.append( dto.getDateOfBirth() );
		buf.append( ", " );
		buf.append( dto.getCurrentOccupation() );
		buf.append( ", " );
		buf.append( dto.getHighestEducation() );
		buf.append( ", " );
		buf.append( dto.getCurrentMaritalStatus() );
		buf.append( ", " );
		buf.append( dto.getEverHivTestedBefore() );
		buf.append( ", " );
		buf.append( dto.getOftenGetTested() );
		buf.append( ", " );
		buf.append( dto.getOftenDrinksAlcohol() );
		buf.append( ", " );
		buf.append( dto.getSexualPartners() );
		buf.append( ", " );
		buf.append( dto.getSexualRelationships() );
		buf.append( ", " );
		buf.append( dto.getFrequentlyUseCondom() );
		buf.append( ", " );
		buf.append( dto.getUsingFpMethod() );
		buf.append( ", " );
		buf.append( dto.getTestResult1() );
		buf.append( ", " );
		buf.append( dto.getTestResult2() );
		buf.append( ", " );
		buf.append( dto.getTestResult3() );
		buf.append( ", " );
		buf.append( dto.getFinalResult() );
		buf.append( ", " );
		buf.append( dto.getDateCreated() );
		buf.append( ", " );
		buf.append( dto.getCreatedBy() );
		buf.append( ", " );
		buf.append( dto.getDateModified() );
		buf.append( ", " );
		buf.append( dto.getModifiedBy() );
		buf.append( ", " );
		buf.append( dto.getStatus() );
		buf.append( ", " );
		buf.append( dto.getTestingTypeId() );
		buf.append( ", " );
		buf.append( dto.getSessionDate() );
		buf.append( ", " );
		buf.append( dto.getMainReason() );
		buf.append( ", " );
		buf.append( dto.getStatusOfAnyPartners() );
		buf.append( ", " );
		buf.append( dto.getStatusOfAllPartners() );
		buf.append( ", " );
		buf.append( dto.getUseCondomWithSpouse() );
		buf.append( ", " );
		buf.append( dto.getMaleCondomsGiven() );
		buf.append( ", " );
		buf.append( dto.getFemaleCondomsGiven() );
		buf.append( ", " );
		buf.append( dto.getLotNumber1() );
		buf.append( ", " );
		buf.append( dto.getLotNumber2() );
		buf.append( ", " );
		buf.append( dto.getLotNumber3() );
		buf.append( ", " );
		buf.append( dto.getPeriodId() );
		System.out.println( buf.toString() );
	}

}
