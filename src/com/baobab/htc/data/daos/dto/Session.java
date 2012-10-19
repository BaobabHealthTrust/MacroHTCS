package com.baobab.htc.data.daos.dto;

import com.baobab.htc.data.daos.dao.*;
import com.baobab.htc.data.daos.factory.*;
import com.baobab.htc.data.daos.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;
import java.math.BigDecimal;

public class Session implements Serializable
{
	/** 
	 * This attribute maps to the column sessionReference in the Session table.
	 */
	protected String sessionReference;

	/** 
	 * This attribute maps to the column siteId in the Session table.
	 */
	protected long siteId;

	/** 
	 * This attribute represents whether the primitive attribute siteId is null.
	 */
	protected boolean siteIdNull = true;

	/** 
	 * This attribute maps to the column terminalId in the Session table.
	 */
	protected String terminalId;

	/** 
	 * This attribute maps to the column traditionalAuthority in the Session table.
	 */
	protected String traditionalAuthority;

	/** 
	 * This attribute maps to the column counsellorId in the Session table.
	 */
	protected long counsellorId;

	/** 
	 * This attribute represents whether the primitive attribute counsellorId is null.
	 */
	protected boolean counsellorIdNull = true;

	/** 
	 * This attribute maps to the column sessionTypeId in the Session table.
	 */
	protected long sessionTypeId;

	/** 
	 * This attribute represents whether the primitive attribute sessionTypeId is null.
	 */
	protected boolean sessionTypeIdNull = true;

	/** 
	 * This attribute maps to the column couplesReference in the Session table.
	 */
	protected String couplesReference;

	/** 
	 * This attribute maps to the column sex in the Session table.
	 */
	protected int sex;

	/** 
	 * This attribute represents whether the primitive attribute sex is null.
	 */
	protected boolean sexNull = true;

	/** 
	 * This attribute maps to the column dateOfBirth in the Session table.
	 */
	protected Date dateOfBirth;

	/** 
	 * This attribute maps to the column currentOccupation in the Session table.
	 */
	protected int currentOccupation;

	/** 
	 * This attribute represents whether the primitive attribute currentOccupation is null.
	 */
	protected boolean currentOccupationNull = true;

	/** 
	 * This attribute maps to the column highestEducation in the Session table.
	 */
	protected int highestEducation;

	/** 
	 * This attribute represents whether the primitive attribute highestEducation is null.
	 */
	protected boolean highestEducationNull = true;

	/** 
	 * This attribute maps to the column currentMaritalStatus in the Session table.
	 */
	protected int currentMaritalStatus;

	/** 
	 * This attribute represents whether the primitive attribute currentMaritalStatus is null.
	 */
	protected boolean currentMaritalStatusNull = true;

	/** 
	 * This attribute maps to the column everHivTestedBefore in the Session table.
	 */
	protected int everHivTestedBefore;

	/** 
	 * This attribute represents whether the primitive attribute everHivTestedBefore is null.
	 */
	protected boolean everHivTestedBeforeNull = true;

	/** 
	 * This attribute maps to the column oftenGetTested in the Session table.
	 */
	protected int oftenGetTested;

	/** 
	 * This attribute represents whether the primitive attribute oftenGetTested is null.
	 */
	protected boolean oftenGetTestedNull = true;

	/** 
	 * This attribute maps to the column oftenDrinksAlcohol in the Session table.
	 */
	protected int oftenDrinksAlcohol;

	/** 
	 * This attribute represents whether the primitive attribute oftenDrinksAlcohol is null.
	 */
	protected boolean oftenDrinksAlcoholNull = true;

	/** 
	 * This attribute maps to the column sexualPartners in the Session table.
	 */
	protected int sexualPartners;

	/** 
	 * This attribute represents whether the primitive attribute sexualPartners is null.
	 */
	protected boolean sexualPartnersNull = true;

	/** 
	 * This attribute maps to the column sexualRelationships in the Session table.
	 */
	protected int sexualRelationships;

	/** 
	 * This attribute represents whether the primitive attribute sexualRelationships is null.
	 */
	protected boolean sexualRelationshipsNull = true;

	/** 
	 * This attribute maps to the column frequentlyUseCondom in the Session table.
	 */
	protected int frequentlyUseCondom;

	/** 
	 * This attribute represents whether the primitive attribute frequentlyUseCondom is null.
	 */
	protected boolean frequentlyUseCondomNull = true;

	/** 
	 * This attribute maps to the column usingFpMethod in the Session table.
	 */
	protected int usingFpMethod;

	/** 
	 * This attribute represents whether the primitive attribute usingFpMethod is null.
	 */
	protected boolean usingFpMethodNull = true;

	/** 
	 * This attribute maps to the column testResult1 in the Session table.
	 */
	protected int testResult1;

	/** 
	 * This attribute represents whether the primitive attribute testResult1 is null.
	 */
	protected boolean testResult1Null = true;

	/** 
	 * This attribute maps to the column testResult2 in the Session table.
	 */
	protected int testResult2;

	/** 
	 * This attribute represents whether the primitive attribute testResult2 is null.
	 */
	protected boolean testResult2Null = true;

	/** 
	 * This attribute maps to the column testResult3 in the Session table.
	 */
	protected int testResult3;

	/** 
	 * This attribute represents whether the primitive attribute testResult3 is null.
	 */
	protected boolean testResult3Null = true;

	/** 
	 * This attribute maps to the column finalResult in the Session table.
	 */
	protected int finalResult;

	/** 
	 * This attribute represents whether the primitive attribute finalResult is null.
	 */
	protected boolean finalResultNull = true;

	/** 
	 * This attribute maps to the column dateCreated in the Session table.
	 */
	protected Date dateCreated;

	/** 
	 * This attribute maps to the column createdBy in the Session table.
	 */
	protected String createdBy;

	/** 
	 * This attribute maps to the column dateModified in the Session table.
	 */
	protected Date dateModified;

	/** 
	 * This attribute maps to the column modifiedBy in the Session table.
	 */
	protected String modifiedBy;

	/** 
	 * This attribute maps to the column status in the Session table.
	 */
	protected int status;

	/** 
	 * This attribute represents whether the primitive attribute status is null.
	 */
	protected boolean statusNull = true;

	/** 
	 * This attribute maps to the column testingTypeId in the Session table.
	 */
	protected long testingTypeId;

	/** 
	 * This attribute represents whether the primitive attribute testingTypeId is null.
	 */
	protected boolean testingTypeIdNull = true;

	/** 
	 * This attribute maps to the column sessionDate in the Session table.
	 */
	protected Date sessionDate;

	/** 
	 * This attribute maps to the column mainReason in the Session table.
	 */
	protected int mainReason;

	/** 
	 * This attribute represents whether the primitive attribute mainReason is null.
	 */
	protected boolean mainReasonNull = true;

	/** 
	 * This attribute maps to the column statusOfAnyPartners in the Session table.
	 */
	protected int statusOfAnyPartners;

	/** 
	 * This attribute represents whether the primitive attribute statusOfAnyPartners is null.
	 */
	protected boolean statusOfAnyPartnersNull = true;

	/** 
	 * This attribute maps to the column statusOfAllPartners in the Session table.
	 */
	protected int statusOfAllPartners;

	/** 
	 * This attribute represents whether the primitive attribute statusOfAllPartners is null.
	 */
	protected boolean statusOfAllPartnersNull = true;

	/** 
	 * This attribute maps to the column useCondomWithSpouse in the Session table.
	 */
	protected int useCondomWithSpouse;

	/** 
	 * This attribute represents whether the primitive attribute useCondomWithSpouse is null.
	 */
	protected boolean useCondomWithSpouseNull = true;

	/** 
	 * This attribute maps to the column maleCondomsGiven in the Session table.
	 */
	protected int maleCondomsGiven;

	/** 
	 * This attribute represents whether the primitive attribute maleCondomsGiven is null.
	 */
	protected boolean maleCondomsGivenNull = true;

	/** 
	 * This attribute maps to the column femaleCondomsGiven in the Session table.
	 */
	protected int femaleCondomsGiven;

	/** 
	 * This attribute represents whether the primitive attribute femaleCondomsGiven is null.
	 */
	protected boolean femaleCondomsGivenNull = true;

	/** 
	 * This attribute maps to the column lotNumber1 in the Session table.
	 */
	protected String lotNumber1;

	/** 
	 * This attribute maps to the column lotNumber2 in the Session table.
	 */
	protected String lotNumber2;

	/** 
	 * This attribute maps to the column lotNumber3 in the Session table.
	 */
	protected String lotNumber3;

	/** 
	 * This attribute maps to the column periodId in the Session table.
	 */
	protected long periodId;

	/** 
	 * This attribute represents whether the primitive attribute periodId is null.
	 */
	protected boolean periodIdNull = true;

	/**
	 * Method 'Session'
	 * 
	 */
	public Session()
	{
	}

	/**
	 * Method 'getSessionReference'
	 * 
	 * @return String
	 */
	public String getSessionReference()
	{
		return sessionReference;
	}

	/**
	 * Method 'setSessionReference'
	 * 
	 * @param sessionReference
	 */
	public void setSessionReference(String sessionReference)
	{
		this.sessionReference = sessionReference;
	}

	/**
	 * Method 'getSiteId'
	 * 
	 * @return long
	 */
	public long getSiteId()
	{
		return siteId;
	}

	/**
	 * Method 'setSiteId'
	 * 
	 * @param siteId
	 */
	public void setSiteId(long siteId)
	{
		this.siteId = siteId;
		this.siteIdNull = false;
	}

	/**
	 * Method 'setSiteIdNull'
	 * 
	 * @param value
	 */
	public void setSiteIdNull(boolean value)
	{
		this.siteIdNull = value;
	}

	/**
	 * Method 'isSiteIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isSiteIdNull()
	{
		return siteIdNull;
	}

	/**
	 * Method 'getTerminalId'
	 * 
	 * @return String
	 */
	public String getTerminalId()
	{
		return terminalId;
	}

	/**
	 * Method 'setTerminalId'
	 * 
	 * @param terminalId
	 */
	public void setTerminalId(String terminalId)
	{
		this.terminalId = terminalId;
	}

	/**
	 * Method 'getTraditionalAuthority'
	 * 
	 * @return String
	 */
	public String getTraditionalAuthority()
	{
		return traditionalAuthority;
	}

	/**
	 * Method 'setTraditionalAuthority'
	 * 
	 * @param traditionalAuthority
	 */
	public void setTraditionalAuthority(String traditionalAuthority)
	{
		this.traditionalAuthority = traditionalAuthority;
	}

	/**
	 * Method 'getCounsellorId'
	 * 
	 * @return long
	 */
	public long getCounsellorId()
	{
		return counsellorId;
	}

	/**
	 * Method 'setCounsellorId'
	 * 
	 * @param counsellorId
	 */
	public void setCounsellorId(long counsellorId)
	{
		this.counsellorId = counsellorId;
		this.counsellorIdNull = false;
	}

	/**
	 * Method 'setCounsellorIdNull'
	 * 
	 * @param value
	 */
	public void setCounsellorIdNull(boolean value)
	{
		this.counsellorIdNull = value;
	}

	/**
	 * Method 'isCounsellorIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isCounsellorIdNull()
	{
		return counsellorIdNull;
	}

	/**
	 * Method 'getSessionTypeId'
	 * 
	 * @return long
	 */
	public long getSessionTypeId()
	{
		return sessionTypeId;
	}

	/**
	 * Method 'setSessionTypeId'
	 * 
	 * @param sessionTypeId
	 */
	public void setSessionTypeId(long sessionTypeId)
	{
		this.sessionTypeId = sessionTypeId;
		this.sessionTypeIdNull = false;
	}

	/**
	 * Method 'setSessionTypeIdNull'
	 * 
	 * @param value
	 */
	public void setSessionTypeIdNull(boolean value)
	{
		this.sessionTypeIdNull = value;
	}

	/**
	 * Method 'isSessionTypeIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isSessionTypeIdNull()
	{
		return sessionTypeIdNull;
	}

	/**
	 * Method 'getCouplesReference'
	 * 
	 * @return String
	 */
	public String getCouplesReference()
	{
		return couplesReference;
	}

	/**
	 * Method 'setCouplesReference'
	 * 
	 * @param couplesReference
	 */
	public void setCouplesReference(String couplesReference)
	{
		this.couplesReference = couplesReference;
	}

	/**
	 * Method 'getSex'
	 * 
	 * @return int
	 */
	public int getSex()
	{
		return sex;
	}

	/**
	 * Method 'setSex'
	 * 
	 * @param sex
	 */
	public void setSex(int sex)
	{
		this.sex = sex;
		this.sexNull = false;
	}

	/**
	 * Method 'setSexNull'
	 * 
	 * @param value
	 */
	public void setSexNull(boolean value)
	{
		this.sexNull = value;
	}

	/**
	 * Method 'isSexNull'
	 * 
	 * @return boolean
	 */
	public boolean isSexNull()
	{
		return sexNull;
	}

	/**
	 * Method 'getDateOfBirth'
	 * 
	 * @return Date
	 */
	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}

	/**
	 * Method 'setDateOfBirth'
	 * 
	 * @param dateOfBirth
	 */
	public void setDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * Method 'getCurrentOccupation'
	 * 
	 * @return int
	 */
	public int getCurrentOccupation()
	{
		return currentOccupation;
	}

	/**
	 * Method 'setCurrentOccupation'
	 * 
	 * @param currentOccupation
	 */
	public void setCurrentOccupation(int currentOccupation)
	{
		this.currentOccupation = currentOccupation;
		this.currentOccupationNull = false;
	}

	/**
	 * Method 'setCurrentOccupationNull'
	 * 
	 * @param value
	 */
	public void setCurrentOccupationNull(boolean value)
	{
		this.currentOccupationNull = value;
	}

	/**
	 * Method 'isCurrentOccupationNull'
	 * 
	 * @return boolean
	 */
	public boolean isCurrentOccupationNull()
	{
		return currentOccupationNull;
	}

	/**
	 * Method 'getHighestEducation'
	 * 
	 * @return int
	 */
	public int getHighestEducation()
	{
		return highestEducation;
	}

	/**
	 * Method 'setHighestEducation'
	 * 
	 * @param highestEducation
	 */
	public void setHighestEducation(int highestEducation)
	{
		this.highestEducation = highestEducation;
		this.highestEducationNull = false;
	}

	/**
	 * Method 'setHighestEducationNull'
	 * 
	 * @param value
	 */
	public void setHighestEducationNull(boolean value)
	{
		this.highestEducationNull = value;
	}

	/**
	 * Method 'isHighestEducationNull'
	 * 
	 * @return boolean
	 */
	public boolean isHighestEducationNull()
	{
		return highestEducationNull;
	}

	/**
	 * Method 'getCurrentMaritalStatus'
	 * 
	 * @return int
	 */
	public int getCurrentMaritalStatus()
	{
		return currentMaritalStatus;
	}

	/**
	 * Method 'setCurrentMaritalStatus'
	 * 
	 * @param currentMaritalStatus
	 */
	public void setCurrentMaritalStatus(int currentMaritalStatus)
	{
		this.currentMaritalStatus = currentMaritalStatus;
		this.currentMaritalStatusNull = false;
	}

	/**
	 * Method 'setCurrentMaritalStatusNull'
	 * 
	 * @param value
	 */
	public void setCurrentMaritalStatusNull(boolean value)
	{
		this.currentMaritalStatusNull = value;
	}

	/**
	 * Method 'isCurrentMaritalStatusNull'
	 * 
	 * @return boolean
	 */
	public boolean isCurrentMaritalStatusNull()
	{
		return currentMaritalStatusNull;
	}

	/**
	 * Method 'getEverHivTestedBefore'
	 * 
	 * @return int
	 */
	public int getEverHivTestedBefore()
	{
		return everHivTestedBefore;
	}

	/**
	 * Method 'setEverHivTestedBefore'
	 * 
	 * @param everHivTestedBefore
	 */
	public void setEverHivTestedBefore(int everHivTestedBefore)
	{
		this.everHivTestedBefore = everHivTestedBefore;
		this.everHivTestedBeforeNull = false;
	}

	/**
	 * Method 'setEverHivTestedBeforeNull'
	 * 
	 * @param value
	 */
	public void setEverHivTestedBeforeNull(boolean value)
	{
		this.everHivTestedBeforeNull = value;
	}

	/**
	 * Method 'isEverHivTestedBeforeNull'
	 * 
	 * @return boolean
	 */
	public boolean isEverHivTestedBeforeNull()
	{
		return everHivTestedBeforeNull;
	}

	/**
	 * Method 'getOftenGetTested'
	 * 
	 * @return int
	 */
	public int getOftenGetTested()
	{
		return oftenGetTested;
	}

	/**
	 * Method 'setOftenGetTested'
	 * 
	 * @param oftenGetTested
	 */
	public void setOftenGetTested(int oftenGetTested)
	{
		this.oftenGetTested = oftenGetTested;
		this.oftenGetTestedNull = false;
	}

	/**
	 * Method 'setOftenGetTestedNull'
	 * 
	 * @param value
	 */
	public void setOftenGetTestedNull(boolean value)
	{
		this.oftenGetTestedNull = value;
	}

	/**
	 * Method 'isOftenGetTestedNull'
	 * 
	 * @return boolean
	 */
	public boolean isOftenGetTestedNull()
	{
		return oftenGetTestedNull;
	}

	/**
	 * Method 'getOftenDrinksAlcohol'
	 * 
	 * @return int
	 */
	public int getOftenDrinksAlcohol()
	{
		return oftenDrinksAlcohol;
	}

	/**
	 * Method 'setOftenDrinksAlcohol'
	 * 
	 * @param oftenDrinksAlcohol
	 */
	public void setOftenDrinksAlcohol(int oftenDrinksAlcohol)
	{
		this.oftenDrinksAlcohol = oftenDrinksAlcohol;
		this.oftenDrinksAlcoholNull = false;
	}

	/**
	 * Method 'setOftenDrinksAlcoholNull'
	 * 
	 * @param value
	 */
	public void setOftenDrinksAlcoholNull(boolean value)
	{
		this.oftenDrinksAlcoholNull = value;
	}

	/**
	 * Method 'isOftenDrinksAlcoholNull'
	 * 
	 * @return boolean
	 */
	public boolean isOftenDrinksAlcoholNull()
	{
		return oftenDrinksAlcoholNull;
	}

	/**
	 * Method 'getSexualPartners'
	 * 
	 * @return int
	 */
	public int getSexualPartners()
	{
		return sexualPartners;
	}

	/**
	 * Method 'setSexualPartners'
	 * 
	 * @param sexualPartners
	 */
	public void setSexualPartners(int sexualPartners)
	{
		this.sexualPartners = sexualPartners;
		this.sexualPartnersNull = false;
	}

	/**
	 * Method 'setSexualPartnersNull'
	 * 
	 * @param value
	 */
	public void setSexualPartnersNull(boolean value)
	{
		this.sexualPartnersNull = value;
	}

	/**
	 * Method 'isSexualPartnersNull'
	 * 
	 * @return boolean
	 */
	public boolean isSexualPartnersNull()
	{
		return sexualPartnersNull;
	}

	/**
	 * Method 'getSexualRelationships'
	 * 
	 * @return int
	 */
	public int getSexualRelationships()
	{
		return sexualRelationships;
	}

	/**
	 * Method 'setSexualRelationships'
	 * 
	 * @param sexualRelationships
	 */
	public void setSexualRelationships(int sexualRelationships)
	{
		this.sexualRelationships = sexualRelationships;
		this.sexualRelationshipsNull = false;
	}

	/**
	 * Method 'setSexualRelationshipsNull'
	 * 
	 * @param value
	 */
	public void setSexualRelationshipsNull(boolean value)
	{
		this.sexualRelationshipsNull = value;
	}

	/**
	 * Method 'isSexualRelationshipsNull'
	 * 
	 * @return boolean
	 */
	public boolean isSexualRelationshipsNull()
	{
		return sexualRelationshipsNull;
	}

	/**
	 * Method 'getFrequentlyUseCondom'
	 * 
	 * @return int
	 */
	public int getFrequentlyUseCondom()
	{
		return frequentlyUseCondom;
	}

	/**
	 * Method 'setFrequentlyUseCondom'
	 * 
	 * @param frequentlyUseCondom
	 */
	public void setFrequentlyUseCondom(int frequentlyUseCondom)
	{
		this.frequentlyUseCondom = frequentlyUseCondom;
		this.frequentlyUseCondomNull = false;
	}

	/**
	 * Method 'setFrequentlyUseCondomNull'
	 * 
	 * @param value
	 */
	public void setFrequentlyUseCondomNull(boolean value)
	{
		this.frequentlyUseCondomNull = value;
	}

	/**
	 * Method 'isFrequentlyUseCondomNull'
	 * 
	 * @return boolean
	 */
	public boolean isFrequentlyUseCondomNull()
	{
		return frequentlyUseCondomNull;
	}

	/**
	 * Method 'getUsingFpMethod'
	 * 
	 * @return int
	 */
	public int getUsingFpMethod()
	{
		return usingFpMethod;
	}

	/**
	 * Method 'setUsingFpMethod'
	 * 
	 * @param usingFpMethod
	 */
	public void setUsingFpMethod(int usingFpMethod)
	{
		this.usingFpMethod = usingFpMethod;
		this.usingFpMethodNull = false;
	}

	/**
	 * Method 'setUsingFpMethodNull'
	 * 
	 * @param value
	 */
	public void setUsingFpMethodNull(boolean value)
	{
		this.usingFpMethodNull = value;
	}

	/**
	 * Method 'isUsingFpMethodNull'
	 * 
	 * @return boolean
	 */
	public boolean isUsingFpMethodNull()
	{
		return usingFpMethodNull;
	}

	/**
	 * Method 'getTestResult1'
	 * 
	 * @return int
	 */
	public int getTestResult1()
	{
		return testResult1;
	}

	/**
	 * Method 'setTestResult1'
	 * 
	 * @param testResult1
	 */
	public void setTestResult1(int testResult1)
	{
		this.testResult1 = testResult1;
		this.testResult1Null = false;
	}

	/**
	 * Method 'setTestResult1Null'
	 * 
	 * @param value
	 */
	public void setTestResult1Null(boolean value)
	{
		this.testResult1Null = value;
	}

	/**
	 * Method 'isTestResult1Null'
	 * 
	 * @return boolean
	 */
	public boolean isTestResult1Null()
	{
		return testResult1Null;
	}

	/**
	 * Method 'getTestResult2'
	 * 
	 * @return int
	 */
	public int getTestResult2()
	{
		return testResult2;
	}

	/**
	 * Method 'setTestResult2'
	 * 
	 * @param testResult2
	 */
	public void setTestResult2(int testResult2)
	{
		this.testResult2 = testResult2;
		this.testResult2Null = false;
	}

	/**
	 * Method 'setTestResult2Null'
	 * 
	 * @param value
	 */
	public void setTestResult2Null(boolean value)
	{
		this.testResult2Null = value;
	}

	/**
	 * Method 'isTestResult2Null'
	 * 
	 * @return boolean
	 */
	public boolean isTestResult2Null()
	{
		return testResult2Null;
	}

	/**
	 * Method 'getTestResult3'
	 * 
	 * @return int
	 */
	public int getTestResult3()
	{
		return testResult3;
	}

	/**
	 * Method 'setTestResult3'
	 * 
	 * @param testResult3
	 */
	public void setTestResult3(int testResult3)
	{
		this.testResult3 = testResult3;
		this.testResult3Null = false;
	}

	/**
	 * Method 'setTestResult3Null'
	 * 
	 * @param value
	 */
	public void setTestResult3Null(boolean value)
	{
		this.testResult3Null = value;
	}

	/**
	 * Method 'isTestResult3Null'
	 * 
	 * @return boolean
	 */
	public boolean isTestResult3Null()
	{
		return testResult3Null;
	}

	/**
	 * Method 'getFinalResult'
	 * 
	 * @return int
	 */
	public int getFinalResult()
	{
		return finalResult;
	}

	/**
	 * Method 'setFinalResult'
	 * 
	 * @param finalResult
	 */
	public void setFinalResult(int finalResult)
	{
		this.finalResult = finalResult;
		this.finalResultNull = false;
	}

	/**
	 * Method 'setFinalResultNull'
	 * 
	 * @param value
	 */
	public void setFinalResultNull(boolean value)
	{
		this.finalResultNull = value;
	}

	/**
	 * Method 'isFinalResultNull'
	 * 
	 * @return boolean
	 */
	public boolean isFinalResultNull()
	{
		return finalResultNull;
	}

	/**
	 * Method 'getDateCreated'
	 * 
	 * @return Date
	 */
	public Date getDateCreated()
	{
		return dateCreated;
	}

	/**
	 * Method 'setDateCreated'
	 * 
	 * @param dateCreated
	 */
	public void setDateCreated(Date dateCreated)
	{
		this.dateCreated = dateCreated;
	}

	/**
	 * Method 'getCreatedBy'
	 * 
	 * @return String
	 */
	public String getCreatedBy()
	{
		return createdBy;
	}

	/**
	 * Method 'setCreatedBy'
	 * 
	 * @param createdBy
	 */
	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}

	/**
	 * Method 'getDateModified'
	 * 
	 * @return Date
	 */
	public Date getDateModified()
	{
		return dateModified;
	}

	/**
	 * Method 'setDateModified'
	 * 
	 * @param dateModified
	 */
	public void setDateModified(Date dateModified)
	{
		this.dateModified = dateModified;
	}

	/**
	 * Method 'getModifiedBy'
	 * 
	 * @return String
	 */
	public String getModifiedBy()
	{
		return modifiedBy;
	}

	/**
	 * Method 'setModifiedBy'
	 * 
	 * @param modifiedBy
	 */
	public void setModifiedBy(String modifiedBy)
	{
		this.modifiedBy = modifiedBy;
	}

	/**
	 * Method 'getStatus'
	 * 
	 * @return int
	 */
	public int getStatus()
	{
		return status;
	}

	/**
	 * Method 'setStatus'
	 * 
	 * @param status
	 */
	public void setStatus(int status)
	{
		this.status = status;
		this.statusNull = false;
	}

	/**
	 * Method 'setStatusNull'
	 * 
	 * @param value
	 */
	public void setStatusNull(boolean value)
	{
		this.statusNull = value;
	}

	/**
	 * Method 'isStatusNull'
	 * 
	 * @return boolean
	 */
	public boolean isStatusNull()
	{
		return statusNull;
	}

	/**
	 * Method 'getTestingTypeId'
	 * 
	 * @return long
	 */
	public long getTestingTypeId()
	{
		return testingTypeId;
	}

	/**
	 * Method 'setTestingTypeId'
	 * 
	 * @param testingTypeId
	 */
	public void setTestingTypeId(long testingTypeId)
	{
		this.testingTypeId = testingTypeId;
		this.testingTypeIdNull = false;
	}

	/**
	 * Method 'setTestingTypeIdNull'
	 * 
	 * @param value
	 */
	public void setTestingTypeIdNull(boolean value)
	{
		this.testingTypeIdNull = value;
	}

	/**
	 * Method 'isTestingTypeIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isTestingTypeIdNull()
	{
		return testingTypeIdNull;
	}

	/**
	 * Method 'getSessionDate'
	 * 
	 * @return Date
	 */
	public Date getSessionDate()
	{
		return sessionDate;
	}

	/**
	 * Method 'setSessionDate'
	 * 
	 * @param sessionDate
	 */
	public void setSessionDate(Date sessionDate)
	{
		this.sessionDate = sessionDate;
	}

	/**
	 * Method 'getMainReason'
	 * 
	 * @return int
	 */
	public int getMainReason()
	{
		return mainReason;
	}

	/**
	 * Method 'setMainReason'
	 * 
	 * @param mainReason
	 */
	public void setMainReason(int mainReason)
	{
		this.mainReason = mainReason;
		this.mainReasonNull = false;
	}

	/**
	 * Method 'setMainReasonNull'
	 * 
	 * @param value
	 */
	public void setMainReasonNull(boolean value)
	{
		this.mainReasonNull = value;
	}

	/**
	 * Method 'isMainReasonNull'
	 * 
	 * @return boolean
	 */
	public boolean isMainReasonNull()
	{
		return mainReasonNull;
	}

	/**
	 * Method 'getStatusOfAnyPartners'
	 * 
	 * @return int
	 */
	public int getStatusOfAnyPartners()
	{
		return statusOfAnyPartners;
	}

	/**
	 * Method 'setStatusOfAnyPartners'
	 * 
	 * @param statusOfAnyPartners
	 */
	public void setStatusOfAnyPartners(int statusOfAnyPartners)
	{
		this.statusOfAnyPartners = statusOfAnyPartners;
		this.statusOfAnyPartnersNull = false;
	}

	/**
	 * Method 'setStatusOfAnyPartnersNull'
	 * 
	 * @param value
	 */
	public void setStatusOfAnyPartnersNull(boolean value)
	{
		this.statusOfAnyPartnersNull = value;
	}

	/**
	 * Method 'isStatusOfAnyPartnersNull'
	 * 
	 * @return boolean
	 */
	public boolean isStatusOfAnyPartnersNull()
	{
		return statusOfAnyPartnersNull;
	}

	/**
	 * Method 'getStatusOfAllPartners'
	 * 
	 * @return int
	 */
	public int getStatusOfAllPartners()
	{
		return statusOfAllPartners;
	}

	/**
	 * Method 'setStatusOfAllPartners'
	 * 
	 * @param statusOfAllPartners
	 */
	public void setStatusOfAllPartners(int statusOfAllPartners)
	{
		this.statusOfAllPartners = statusOfAllPartners;
		this.statusOfAllPartnersNull = false;
	}

	/**
	 * Method 'setStatusOfAllPartnersNull'
	 * 
	 * @param value
	 */
	public void setStatusOfAllPartnersNull(boolean value)
	{
		this.statusOfAllPartnersNull = value;
	}

	/**
	 * Method 'isStatusOfAllPartnersNull'
	 * 
	 * @return boolean
	 */
	public boolean isStatusOfAllPartnersNull()
	{
		return statusOfAllPartnersNull;
	}

	/**
	 * Method 'getUseCondomWithSpouse'
	 * 
	 * @return int
	 */
	public int getUseCondomWithSpouse()
	{
		return useCondomWithSpouse;
	}

	/**
	 * Method 'setUseCondomWithSpouse'
	 * 
	 * @param useCondomWithSpouse
	 */
	public void setUseCondomWithSpouse(int useCondomWithSpouse)
	{
		this.useCondomWithSpouse = useCondomWithSpouse;
		this.useCondomWithSpouseNull = false;
	}

	/**
	 * Method 'setUseCondomWithSpouseNull'
	 * 
	 * @param value
	 */
	public void setUseCondomWithSpouseNull(boolean value)
	{
		this.useCondomWithSpouseNull = value;
	}

	/**
	 * Method 'isUseCondomWithSpouseNull'
	 * 
	 * @return boolean
	 */
	public boolean isUseCondomWithSpouseNull()
	{
		return useCondomWithSpouseNull;
	}

	/**
	 * Method 'getMaleCondomsGiven'
	 * 
	 * @return int
	 */
	public int getMaleCondomsGiven()
	{
		return maleCondomsGiven;
	}

	/**
	 * Method 'setMaleCondomsGiven'
	 * 
	 * @param maleCondomsGiven
	 */
	public void setMaleCondomsGiven(int maleCondomsGiven)
	{
		this.maleCondomsGiven = maleCondomsGiven;
		this.maleCondomsGivenNull = false;
	}

	/**
	 * Method 'setMaleCondomsGivenNull'
	 * 
	 * @param value
	 */
	public void setMaleCondomsGivenNull(boolean value)
	{
		this.maleCondomsGivenNull = value;
	}

	/**
	 * Method 'isMaleCondomsGivenNull'
	 * 
	 * @return boolean
	 */
	public boolean isMaleCondomsGivenNull()
	{
		return maleCondomsGivenNull;
	}

	/**
	 * Method 'getFemaleCondomsGiven'
	 * 
	 * @return int
	 */
	public int getFemaleCondomsGiven()
	{
		return femaleCondomsGiven;
	}

	/**
	 * Method 'setFemaleCondomsGiven'
	 * 
	 * @param femaleCondomsGiven
	 */
	public void setFemaleCondomsGiven(int femaleCondomsGiven)
	{
		this.femaleCondomsGiven = femaleCondomsGiven;
		this.femaleCondomsGivenNull = false;
	}

	/**
	 * Method 'setFemaleCondomsGivenNull'
	 * 
	 * @param value
	 */
	public void setFemaleCondomsGivenNull(boolean value)
	{
		this.femaleCondomsGivenNull = value;
	}

	/**
	 * Method 'isFemaleCondomsGivenNull'
	 * 
	 * @return boolean
	 */
	public boolean isFemaleCondomsGivenNull()
	{
		return femaleCondomsGivenNull;
	}

	/**
	 * Method 'getLotNumber1'
	 * 
	 * @return String
	 */
	public String getLotNumber1()
	{
		return lotNumber1;
	}

	/**
	 * Method 'setLotNumber1'
	 * 
	 * @param lotNumber1
	 */
	public void setLotNumber1(String lotNumber1)
	{
		this.lotNumber1 = lotNumber1;
	}

	/**
	 * Method 'getLotNumber2'
	 * 
	 * @return String
	 */
	public String getLotNumber2()
	{
		return lotNumber2;
	}

	/**
	 * Method 'setLotNumber2'
	 * 
	 * @param lotNumber2
	 */
	public void setLotNumber2(String lotNumber2)
	{
		this.lotNumber2 = lotNumber2;
	}

	/**
	 * Method 'getLotNumber3'
	 * 
	 * @return String
	 */
	public String getLotNumber3()
	{
		return lotNumber3;
	}

	/**
	 * Method 'setLotNumber3'
	 * 
	 * @param lotNumber3
	 */
	public void setLotNumber3(String lotNumber3)
	{
		this.lotNumber3 = lotNumber3;
	}

	/**
	 * Method 'getPeriodId'
	 * 
	 * @return long
	 */
	public long getPeriodId()
	{
		return periodId;
	}

	/**
	 * Method 'setPeriodId'
	 * 
	 * @param periodId
	 */
	public void setPeriodId(long periodId)
	{
		this.periodId = periodId;
		this.periodIdNull = false;
	}

	/**
	 * Method 'setPeriodIdNull'
	 * 
	 * @param value
	 */
	public void setPeriodIdNull(boolean value)
	{
		this.periodIdNull = value;
	}

	/**
	 * Method 'isPeriodIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isPeriodIdNull()
	{
		return periodIdNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Session)) {
			return false;
		}
		
		final Session _cast = (Session) _other;
		if (sessionReference == null ? _cast.sessionReference != sessionReference : !sessionReference.equals( _cast.sessionReference )) {
			return false;
		}
		
		if (siteId != _cast.siteId) {
			return false;
		}
		
		if (siteIdNull != _cast.siteIdNull) {
			return false;
		}
		
		if (terminalId == null ? _cast.terminalId != terminalId : !terminalId.equals( _cast.terminalId )) {
			return false;
		}
		
		if (traditionalAuthority == null ? _cast.traditionalAuthority != traditionalAuthority : !traditionalAuthority.equals( _cast.traditionalAuthority )) {
			return false;
		}
		
		if (counsellorId != _cast.counsellorId) {
			return false;
		}
		
		if (counsellorIdNull != _cast.counsellorIdNull) {
			return false;
		}
		
		if (sessionTypeId != _cast.sessionTypeId) {
			return false;
		}
		
		if (sessionTypeIdNull != _cast.sessionTypeIdNull) {
			return false;
		}
		
		if (couplesReference == null ? _cast.couplesReference != couplesReference : !couplesReference.equals( _cast.couplesReference )) {
			return false;
		}
		
		if (sex != _cast.sex) {
			return false;
		}
		
		if (sexNull != _cast.sexNull) {
			return false;
		}
		
		if (dateOfBirth == null ? _cast.dateOfBirth != dateOfBirth : !dateOfBirth.equals( _cast.dateOfBirth )) {
			return false;
		}
		
		if (currentOccupation != _cast.currentOccupation) {
			return false;
		}
		
		if (currentOccupationNull != _cast.currentOccupationNull) {
			return false;
		}
		
		if (highestEducation != _cast.highestEducation) {
			return false;
		}
		
		if (highestEducationNull != _cast.highestEducationNull) {
			return false;
		}
		
		if (currentMaritalStatus != _cast.currentMaritalStatus) {
			return false;
		}
		
		if (currentMaritalStatusNull != _cast.currentMaritalStatusNull) {
			return false;
		}
		
		if (everHivTestedBefore != _cast.everHivTestedBefore) {
			return false;
		}
		
		if (everHivTestedBeforeNull != _cast.everHivTestedBeforeNull) {
			return false;
		}
		
		if (oftenGetTested != _cast.oftenGetTested) {
			return false;
		}
		
		if (oftenGetTestedNull != _cast.oftenGetTestedNull) {
			return false;
		}
		
		if (oftenDrinksAlcohol != _cast.oftenDrinksAlcohol) {
			return false;
		}
		
		if (oftenDrinksAlcoholNull != _cast.oftenDrinksAlcoholNull) {
			return false;
		}
		
		if (sexualPartners != _cast.sexualPartners) {
			return false;
		}
		
		if (sexualPartnersNull != _cast.sexualPartnersNull) {
			return false;
		}
		
		if (sexualRelationships != _cast.sexualRelationships) {
			return false;
		}
		
		if (sexualRelationshipsNull != _cast.sexualRelationshipsNull) {
			return false;
		}
		
		if (frequentlyUseCondom != _cast.frequentlyUseCondom) {
			return false;
		}
		
		if (frequentlyUseCondomNull != _cast.frequentlyUseCondomNull) {
			return false;
		}
		
		if (usingFpMethod != _cast.usingFpMethod) {
			return false;
		}
		
		if (usingFpMethodNull != _cast.usingFpMethodNull) {
			return false;
		}
		
		if (testResult1 != _cast.testResult1) {
			return false;
		}
		
		if (testResult1Null != _cast.testResult1Null) {
			return false;
		}
		
		if (testResult2 != _cast.testResult2) {
			return false;
		}
		
		if (testResult2Null != _cast.testResult2Null) {
			return false;
		}
		
		if (testResult3 != _cast.testResult3) {
			return false;
		}
		
		if (testResult3Null != _cast.testResult3Null) {
			return false;
		}
		
		if (finalResult != _cast.finalResult) {
			return false;
		}
		
		if (finalResultNull != _cast.finalResultNull) {
			return false;
		}
		
		if (dateCreated == null ? _cast.dateCreated != dateCreated : !dateCreated.equals( _cast.dateCreated )) {
			return false;
		}
		
		if (createdBy == null ? _cast.createdBy != createdBy : !createdBy.equals( _cast.createdBy )) {
			return false;
		}
		
		if (dateModified == null ? _cast.dateModified != dateModified : !dateModified.equals( _cast.dateModified )) {
			return false;
		}
		
		if (modifiedBy == null ? _cast.modifiedBy != modifiedBy : !modifiedBy.equals( _cast.modifiedBy )) {
			return false;
		}
		
		if (status != _cast.status) {
			return false;
		}
		
		if (statusNull != _cast.statusNull) {
			return false;
		}
		
		if (testingTypeId != _cast.testingTypeId) {
			return false;
		}
		
		if (testingTypeIdNull != _cast.testingTypeIdNull) {
			return false;
		}
		
		if (sessionDate == null ? _cast.sessionDate != sessionDate : !sessionDate.equals( _cast.sessionDate )) {
			return false;
		}
		
		if (mainReason != _cast.mainReason) {
			return false;
		}
		
		if (mainReasonNull != _cast.mainReasonNull) {
			return false;
		}
		
		if (statusOfAnyPartners != _cast.statusOfAnyPartners) {
			return false;
		}
		
		if (statusOfAnyPartnersNull != _cast.statusOfAnyPartnersNull) {
			return false;
		}
		
		if (statusOfAllPartners != _cast.statusOfAllPartners) {
			return false;
		}
		
		if (statusOfAllPartnersNull != _cast.statusOfAllPartnersNull) {
			return false;
		}
		
		if (useCondomWithSpouse != _cast.useCondomWithSpouse) {
			return false;
		}
		
		if (useCondomWithSpouseNull != _cast.useCondomWithSpouseNull) {
			return false;
		}
		
		if (maleCondomsGiven != _cast.maleCondomsGiven) {
			return false;
		}
		
		if (maleCondomsGivenNull != _cast.maleCondomsGivenNull) {
			return false;
		}
		
		if (femaleCondomsGiven != _cast.femaleCondomsGiven) {
			return false;
		}
		
		if (femaleCondomsGivenNull != _cast.femaleCondomsGivenNull) {
			return false;
		}
		
		if (lotNumber1 == null ? _cast.lotNumber1 != lotNumber1 : !lotNumber1.equals( _cast.lotNumber1 )) {
			return false;
		}
		
		if (lotNumber2 == null ? _cast.lotNumber2 != lotNumber2 : !lotNumber2.equals( _cast.lotNumber2 )) {
			return false;
		}
		
		if (lotNumber3 == null ? _cast.lotNumber3 != lotNumber3 : !lotNumber3.equals( _cast.lotNumber3 )) {
			return false;
		}
		
		if (periodId != _cast.periodId) {
			return false;
		}
		
		if (periodIdNull != _cast.periodIdNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (sessionReference != null) {
			_hashCode = 29 * _hashCode + sessionReference.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (siteId ^ (siteId >>> 32));
		_hashCode = 29 * _hashCode + (siteIdNull ? 1 : 0);
		if (terminalId != null) {
			_hashCode = 29 * _hashCode + terminalId.hashCode();
		}
		
		if (traditionalAuthority != null) {
			_hashCode = 29 * _hashCode + traditionalAuthority.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (counsellorId ^ (counsellorId >>> 32));
		_hashCode = 29 * _hashCode + (counsellorIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (sessionTypeId ^ (sessionTypeId >>> 32));
		_hashCode = 29 * _hashCode + (sessionTypeIdNull ? 1 : 0);
		if (couplesReference != null) {
			_hashCode = 29 * _hashCode + couplesReference.hashCode();
		}
		
		_hashCode = 29 * _hashCode + sex;
		_hashCode = 29 * _hashCode + (sexNull ? 1 : 0);
		if (dateOfBirth != null) {
			_hashCode = 29 * _hashCode + dateOfBirth.hashCode();
		}
		
		_hashCode = 29 * _hashCode + currentOccupation;
		_hashCode = 29 * _hashCode + (currentOccupationNull ? 1 : 0);
		_hashCode = 29 * _hashCode + highestEducation;
		_hashCode = 29 * _hashCode + (highestEducationNull ? 1 : 0);
		_hashCode = 29 * _hashCode + currentMaritalStatus;
		_hashCode = 29 * _hashCode + (currentMaritalStatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + everHivTestedBefore;
		_hashCode = 29 * _hashCode + (everHivTestedBeforeNull ? 1 : 0);
		_hashCode = 29 * _hashCode + oftenGetTested;
		_hashCode = 29 * _hashCode + (oftenGetTestedNull ? 1 : 0);
		_hashCode = 29 * _hashCode + oftenDrinksAlcohol;
		_hashCode = 29 * _hashCode + (oftenDrinksAlcoholNull ? 1 : 0);
		_hashCode = 29 * _hashCode + sexualPartners;
		_hashCode = 29 * _hashCode + (sexualPartnersNull ? 1 : 0);
		_hashCode = 29 * _hashCode + sexualRelationships;
		_hashCode = 29 * _hashCode + (sexualRelationshipsNull ? 1 : 0);
		_hashCode = 29 * _hashCode + frequentlyUseCondom;
		_hashCode = 29 * _hashCode + (frequentlyUseCondomNull ? 1 : 0);
		_hashCode = 29 * _hashCode + usingFpMethod;
		_hashCode = 29 * _hashCode + (usingFpMethodNull ? 1 : 0);
		_hashCode = 29 * _hashCode + testResult1;
		_hashCode = 29 * _hashCode + (testResult1Null ? 1 : 0);
		_hashCode = 29 * _hashCode + testResult2;
		_hashCode = 29 * _hashCode + (testResult2Null ? 1 : 0);
		_hashCode = 29 * _hashCode + testResult3;
		_hashCode = 29 * _hashCode + (testResult3Null ? 1 : 0);
		_hashCode = 29 * _hashCode + finalResult;
		_hashCode = 29 * _hashCode + (finalResultNull ? 1 : 0);
		if (dateCreated != null) {
			_hashCode = 29 * _hashCode + dateCreated.hashCode();
		}
		
		if (createdBy != null) {
			_hashCode = 29 * _hashCode + createdBy.hashCode();
		}
		
		if (dateModified != null) {
			_hashCode = 29 * _hashCode + dateModified.hashCode();
		}
		
		if (modifiedBy != null) {
			_hashCode = 29 * _hashCode + modifiedBy.hashCode();
		}
		
		_hashCode = 29 * _hashCode + status;
		_hashCode = 29 * _hashCode + (statusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (testingTypeId ^ (testingTypeId >>> 32));
		_hashCode = 29 * _hashCode + (testingTypeIdNull ? 1 : 0);
		if (sessionDate != null) {
			_hashCode = 29 * _hashCode + sessionDate.hashCode();
		}
		
		_hashCode = 29 * _hashCode + mainReason;
		_hashCode = 29 * _hashCode + (mainReasonNull ? 1 : 0);
		_hashCode = 29 * _hashCode + statusOfAnyPartners;
		_hashCode = 29 * _hashCode + (statusOfAnyPartnersNull ? 1 : 0);
		_hashCode = 29 * _hashCode + statusOfAllPartners;
		_hashCode = 29 * _hashCode + (statusOfAllPartnersNull ? 1 : 0);
		_hashCode = 29 * _hashCode + useCondomWithSpouse;
		_hashCode = 29 * _hashCode + (useCondomWithSpouseNull ? 1 : 0);
		_hashCode = 29 * _hashCode + maleCondomsGiven;
		_hashCode = 29 * _hashCode + (maleCondomsGivenNull ? 1 : 0);
		_hashCode = 29 * _hashCode + femaleCondomsGiven;
		_hashCode = 29 * _hashCode + (femaleCondomsGivenNull ? 1 : 0);
		if (lotNumber1 != null) {
			_hashCode = 29 * _hashCode + lotNumber1.hashCode();
		}
		
		if (lotNumber2 != null) {
			_hashCode = 29 * _hashCode + lotNumber2.hashCode();
		}
		
		if (lotNumber3 != null) {
			_hashCode = 29 * _hashCode + lotNumber3.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (periodId ^ (periodId >>> 32));
		_hashCode = 29 * _hashCode + (periodIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SessionPk
	 */
	public SessionPk createPk()
	{
		return new SessionPk(sessionReference);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.baobab.htc.data.daos.dto.Session: " );
		ret.append( "sessionReference=" + sessionReference );
		ret.append( ", siteId=" + siteId );
		ret.append( ", terminalId=" + terminalId );
		ret.append( ", traditionalAuthority=" + traditionalAuthority );
		ret.append( ", counsellorId=" + counsellorId );
		ret.append( ", sessionTypeId=" + sessionTypeId );
		ret.append( ", couplesReference=" + couplesReference );
		ret.append( ", sex=" + sex );
		ret.append( ", dateOfBirth=" + dateOfBirth );
		ret.append( ", currentOccupation=" + currentOccupation );
		ret.append( ", highestEducation=" + highestEducation );
		ret.append( ", currentMaritalStatus=" + currentMaritalStatus );
		ret.append( ", everHivTestedBefore=" + everHivTestedBefore );
		ret.append( ", oftenGetTested=" + oftenGetTested );
		ret.append( ", oftenDrinksAlcohol=" + oftenDrinksAlcohol );
		ret.append( ", sexualPartners=" + sexualPartners );
		ret.append( ", sexualRelationships=" + sexualRelationships );
		ret.append( ", frequentlyUseCondom=" + frequentlyUseCondom );
		ret.append( ", usingFpMethod=" + usingFpMethod );
		ret.append( ", testResult1=" + testResult1 );
		ret.append( ", testResult2=" + testResult2 );
		ret.append( ", testResult3=" + testResult3 );
		ret.append( ", finalResult=" + finalResult );
		ret.append( ", dateCreated=" + dateCreated );
		ret.append( ", createdBy=" + createdBy );
		ret.append( ", dateModified=" + dateModified );
		ret.append( ", modifiedBy=" + modifiedBy );
		ret.append( ", status=" + status );
		ret.append( ", testingTypeId=" + testingTypeId );
		ret.append( ", sessionDate=" + sessionDate );
		ret.append( ", mainReason=" + mainReason );
		ret.append( ", statusOfAnyPartners=" + statusOfAnyPartners );
		ret.append( ", statusOfAllPartners=" + statusOfAllPartners );
		ret.append( ", useCondomWithSpouse=" + useCondomWithSpouse );
		ret.append( ", maleCondomsGiven=" + maleCondomsGiven );
		ret.append( ", femaleCondomsGiven=" + femaleCondomsGiven );
		ret.append( ", lotNumber1=" + lotNumber1 );
		ret.append( ", lotNumber2=" + lotNumber2 );
		ret.append( ", lotNumber3=" + lotNumber3 );
		ret.append( ", periodId=" + periodId );
		return ret.toString();
	}

}
