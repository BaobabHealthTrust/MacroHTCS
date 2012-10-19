package com.baobab.htc.data.daos.factory;

import com.baobab.htc.data.daos.dao.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.BeansException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class DaoFactory
{
	/**
	 * Method 'createCounsellorDao'
	 * 
	 * @return CounsellorDao
	 */
	public static CounsellorDao createCounsellorDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (CounsellorDao) bf.getBean( "CounsellorDao" );
	}

	/**
	 * Method 'createDistrictDao'
	 * 
	 * @return DistrictDao
	 */
	public static DistrictDao createDistrictDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (DistrictDao) bf.getBean( "DistrictDao" );
	}

	/**
	 * Method 'createRegionDao'
	 * 
	 * @return RegionDao
	 */
	public static RegionDao createRegionDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (RegionDao) bf.getBean( "RegionDao" );
	}

	/**
	 * Method 'createSessionDao'
	 * 
	 * @return SessionDao
	 */
	public static SessionDao createSessionDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (SessionDao) bf.getBean( "SessionDao" );
	}

	/**
	 * Method 'createSessionTypeDao'
	 * 
	 * @return SessionTypeDao
	 */
	public static SessionTypeDao createSessionTypeDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (SessionTypeDao) bf.getBean( "SessionTypeDao" );
	}

	/**
	 * Method 'createSiteDao'
	 * 
	 * @return SiteDao
	 */
	public static SiteDao createSiteDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (SiteDao) bf.getBean( "SiteDao" );
	}

	/**
	 * Method 'createSiteTypeDao'
	 * 
	 * @return SiteTypeDao
	 */
	public static SiteTypeDao createSiteTypeDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (SiteTypeDao) bf.getBean( "SiteTypeDao" );
	}

	/**
	 * Method 'createSymptomDao'
	 * 
	 * @return SymptomDao
	 */
	public static SymptomDao createSymptomDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (SymptomDao) bf.getBean( "SymptomDao" );
	}

	/**
	 * Method 'createSequenceDao'
	 * 
	 * @return SequenceDao
	 */
	public static SequenceDao createSequenceDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (SequenceDao) bf.getBean( "SequenceDao" );
	}

	/**
	 * Method 'createPlanDao'
	 * 
	 * @return PlanDao
	 */
	public static PlanDao createPlanDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (PlanDao) bf.getBean( "PlanDao" );
	}

	/**
	 * Method 'createSessionPlanDao'
	 * 
	 * @return SessionPlanDao
	 */
	public static SessionPlanDao createSessionPlanDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (SessionPlanDao) bf.getBean( "SessionPlanDao" );
	}

	/**
	 * Method 'createSessionSymptomDao'
	 * 
	 * @return SessionSymptomDao
	 */
	public static SessionSymptomDao createSessionSymptomDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (SessionSymptomDao) bf.getBean( "SessionSymptomDao" );
	}

	/**
	 * Method 'createTestingTypeDao'
	 * 
	 * @return TestingTypeDao
	 */
	public static TestingTypeDao createTestingTypeDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (TestingTypeDao) bf.getBean( "TestingTypeDao" );
	}

	/**
	 * Method 'createTestingTypeCategoryDao'
	 * 
	 * @return TestingTypeCategoryDao
	 */
	public static TestingTypeCategoryDao createTestingTypeCategoryDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (TestingTypeCategoryDao) bf.getBean( "TestingTypeCategoryDao" );
	}

	/**
	 * Method 'createSessionSexualRelationshipTypeDao'
	 * 
	 * @return SessionSexualRelationshipTypeDao
	 */
	public static SessionSexualRelationshipTypeDao createSessionSexualRelationshipTypeDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (SessionSexualRelationshipTypeDao) bf.getBean( "SessionSexualRelationshipTypeDao" );
	}

	/**
	 * Method 'createPeriodDao'
	 * 
	 * @return PeriodDao
	 */
	public static PeriodDao createPeriodDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (PeriodDao) bf.getBean( "PeriodDao" );
	}

	/**
	 * Method 'createSexualRelationshipTypeDao'
	 * 
	 * @return SexualRelationshipTypeDao
	 */
	public static SexualRelationshipTypeDao createSexualRelationshipTypeDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (SexualRelationshipTypeDao) bf.getBean( "SexualRelationshipTypeDao" );
	}

	/**
	 * Method 'createTraditionalAuthorityDao'
	 * 
	 * @return TraditionalAuthorityDao
	 */
	public static TraditionalAuthorityDao createTraditionalAuthorityDao()
	{
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("dao-beans.xml") );
		return (TraditionalAuthorityDao) bf.getBean( "TraditionalAuthorityDao" );
	}

}
