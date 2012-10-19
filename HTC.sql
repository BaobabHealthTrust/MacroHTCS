SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS `HTC` ;
CREATE SCHEMA IF NOT EXISTS `HTC` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `HTC`;

-- -----------------------------------------------------
-- Table `HTC`.`Region`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `HTC`.`Region` ;

CREATE  TABLE IF NOT EXISTS `HTC`.`Region` (
  `regionId` BIGINT NOT NULL ,
  `name` VARCHAR(150) NULL ,
  `dateCreated` DATETIME NULL ,
  `createdBy` VARCHAR(100) NULL ,
  `dateModified` DATETIME NULL ,
  `modifiedBy` VARCHAR(100) NULL ,
  `status` INT NULL ,
  PRIMARY KEY (`regionId`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HTC`.`District`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `HTC`.`District` ;

CREATE  TABLE IF NOT EXISTS `HTC`.`District` (
  `districtId` BIGINT NOT NULL ,
  `name` VARCHAR(100) NULL ,
  `regionId` BIGINT NULL ,
  `dateCreated` DATETIME NULL ,
  `createdBy` VARCHAR(100) NULL ,
  `dateModified` DATETIME NULL ,
  `modifiedBy` VARCHAR(100) NULL ,
  `status` INT NULL ,
  PRIMARY KEY (`districtId`) ,
  INDEX `regionFK` (`regionId` ASC) ,
  CONSTRAINT `regionFK`
    FOREIGN KEY (`regionId` )
    REFERENCES `HTC`.`Region` (`regionId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HTC`.`SiteType`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `HTC`.`SiteType` ;

CREATE  TABLE IF NOT EXISTS `HTC`.`SiteType` (
  `siteTypeId` BIGINT NOT NULL ,
  `description` VARCHAR(100) NULL ,
  `dateCreated` DATETIME NULL ,
  `createdBy` VARCHAR(100) NULL ,
  `dateModified` DATETIME NULL ,
  `modifiedBy` VARCHAR(100) NULL ,
  `status` INT NULL ,
  PRIMARY KEY (`siteTypeId`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HTC`.`Site`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `HTC`.`Site` ;

CREATE  TABLE IF NOT EXISTS `HTC`.`Site` (
  `siteId` BIGINT NOT NULL ,
  `name` VARCHAR(100) NULL ,
  `districtId` BIGINT NULL ,
  `siteTypeId` BIGINT NULL ,
  `dateCreated` DATETIME NULL ,
  `createdBy` VARCHAR(100) NULL ,
  `dateModified` DATETIME NULL ,
  `modifiedBy` VARCHAR(100) NULL ,
  `status` INT NULL ,
  PRIMARY KEY (`siteId`) ,
  INDEX `districtSiteFK` (`districtId` ASC) ,
  INDEX `siteTypeSiteFK` (`siteTypeId` ASC) ,
  CONSTRAINT `districtSiteFK`
    FOREIGN KEY (`districtId` )
    REFERENCES `HTC`.`District` (`districtId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `siteTypeSiteFK`
    FOREIGN KEY (`siteTypeId` )
    REFERENCES `HTC`.`SiteType` (`siteTypeId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HTC`.`Counsellor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `HTC`.`Counsellor` ;

CREATE  TABLE IF NOT EXISTS `HTC`.`Counsellor` (
  `counsellorId` BIGINT NOT NULL ,
  `name` VARCHAR(100) NULL ,
  `dateCreated` DATETIME NULL ,
  `createdBy` VARCHAR(100) NULL ,
  `dateModified` DATETIME NULL ,
  `modifiedBy` VARCHAR(100) NULL ,
  `status` INT NULL ,
  PRIMARY KEY (`counsellorId`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HTC`.`SessionTypeCategory`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `HTC`.`SessionTypeCategory` ;

CREATE  TABLE IF NOT EXISTS `HTC`.`SessionTypeCategory` (
  `sessionTypeCategoryId` BIGINT NOT NULL ,
  `description` VARCHAR(150) NULL ,
  `dateCreated` DATETIME NULL ,
  `createdBy` VARCHAR(100) NULL ,
  `dateModified` DATETIME NULL ,
  `modifiedBy` VARCHAR(100) NULL ,
  `status` INT NULL ,
  PRIMARY KEY (`sessionTypeCategoryId`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HTC`.`SessionType`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `HTC`.`SessionType` ;

CREATE  TABLE IF NOT EXISTS `HTC`.`SessionType` (
  `sessionTypeId` BIGINT NOT NULL ,
  `description` VARCHAR(150) NULL ,
  `sessionTypeCategoryId` BIGINT NULL ,
  `dateCreated` DATETIME NULL ,
  `createdBy` VARCHAR(100) NULL ,
  `dateModified` DATETIME NULL ,
  `modifiedBy` VARCHAR(100) NULL ,
  `status` INT NULL ,
  PRIMARY KEY (`sessionTypeId`) ,
  INDEX `sessionTypeCategorySessionTypeFK` (`sessionTypeCategoryId` ASC) ,
  CONSTRAINT `sessionTypeCategorySessionTypeFK`
    FOREIGN KEY (`sessionTypeCategoryId` )
    REFERENCES `HTC`.`SessionTypeCategory` (`sessionTypeCategoryId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HTC`.`Session`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `HTC`.`Session` ;

CREATE  TABLE IF NOT EXISTS `HTC`.`Session` (
  `sessionReference` VARCHAR(50) NOT NULL ,
  `siteId` BIGINT NULL ,
  `terminalId` VARCHAR(50) NULL ,
  `traditionalAuthority` VARCHAR(150) NULL ,
  `counsellorId` BIGINT NULL ,
  `sessionTypeId` BIGINT NULL ,
  `couplesReference` VARCHAR(50) NULL ,
  `sex` INT NULL ,
  `dateOfBirth` DATETIME NULL ,
  `currentOccupation` INT NULL ,
  `highestEducation` INT NULL ,
  `currentMaritalStatus` INT NULL ,
  `everHivTestedBefore` INT NULL ,
  `oftenGetTested` INT NULL ,
  `oftenDrinksAlcohol` INT NULL ,
  `sexualPartners` INT NULL ,
  `sexualRelationships` INT NULL ,
  `sameSexPartner` INT NULL ,
  `statusOfPartners` INT NULL ,
  `frequentlyUseCondom` INT NULL ,
  `usingFpMethod` INT NULL ,
  `testResult1` INT NULL ,
  `testResult2` INT NULL ,
  `testResult3` INT NULL ,
  `finalResult` INT NULL ,
  `condomsGiven` INT NULL ,
  `dateCreated` DATETIME NULL ,
  `createdBy` VARCHAR(100) NULL ,
  `dateModified` DATETIME NULL ,
  `modifiedBy` VARCHAR(100) NULL ,
  `status` INT NULL ,
  PRIMARY KEY (`sessionReference`) ,
  INDEX `sessionTypeSessionFK` (`sessionTypeId` ASC) ,
  INDEX `counsellorSessionFK` (`counsellorId` ASC) ,
  INDEX `siteSessionFK` (`siteId` ASC) ,
  CONSTRAINT `sessionTypeSessionFK`
    FOREIGN KEY (`sessionTypeId` )
    REFERENCES `HTC`.`SessionType` (`sessionTypeId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `counsellorSessionFK`
    FOREIGN KEY (`counsellorId` )
    REFERENCES `HTC`.`Counsellor` (`counsellorId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `siteSessionFK`
    FOREIGN KEY (`siteId` )
    REFERENCES `HTC`.`Site` (`siteId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HTC`.`Reason`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `HTC`.`Reason` ;

CREATE  TABLE IF NOT EXISTS `HTC`.`Reason` (
  `reasonId` BIGINT NOT NULL ,
  `sessionReference` VARCHAR(50) NULL ,
  `selectedValue` INT NULL ,
  `dateCreated` DATETIME NULL ,
  `createdBy` VARCHAR(100) NULL ,
  `dateModified` DATETIME NULL ,
  `modifiedBy` VARCHAR(100) NULL ,
  `status` INT NULL ,
  PRIMARY KEY (`reasonId`) ,
  INDEX `sessionReasonFK` (`sessionReference` ASC) ,
  CONSTRAINT `sessionReasonFK`
    FOREIGN KEY (`sessionReference` )
    REFERENCES `HTC`.`Session` (`sessionReference` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HTC`.`Symptom`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `HTC`.`Symptom` ;

CREATE  TABLE IF NOT EXISTS `HTC`.`Symptom` (
  `symptomId` BIGINT NOT NULL ,
  `sessionReference` VARCHAR(50) NULL ,
  `selectedValue` INT NULL ,
  `dateCreated` DATETIME NULL ,
  `createdBy` VARCHAR(100) NULL ,
  `dateModified` DATETIME NULL ,
  `modifiedBy` VARCHAR(100) NULL ,
  `status` INT NULL ,
  PRIMARY KEY (`symptomId`) ,
  INDEX `sessionSymptomRiskReductionFK` (`sessionReference` ASC) ,
  CONSTRAINT `sessionSymptomRiskReductionFK`
    FOREIGN KEY (`sessionReference` )
    REFERENCES `HTC`.`Session` (`sessionReference` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `HTC`.`RiskReductionPlan`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `HTC`.`RiskReductionPlan` ;

CREATE  TABLE IF NOT EXISTS `HTC`.`RiskReductionPlan` (
  `riskReductionPlanId` BIGINT NOT NULL ,
  `sessionReference` VARCHAR(50) NULL ,
  `selectedValue` INT NULL ,
  `dateCreated` DATETIME NULL ,
  `createdBy` VARCHAR(100) NULL ,
  `dateModified` DATETIME NULL ,
  `modifiedBy` VARCHAR(100) NULL ,
  `status` INT NULL ,
  PRIMARY KEY (`riskReductionPlanId`) ,
  INDEX `sessionRRFK` (`sessionReference` ASC) ,
  CONSTRAINT `sessionRRFK`
    FOREIGN KEY (`sessionReference` )
    REFERENCES `HTC`.`Session` (`sessionReference` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


;
CREATE USER htcuser IDENTIFIED BY 'macro';

grant SELECT on TABLE `HTC`.`Counsellor` to htcuser;
grant UPDATE on TABLE `HTC`.`Counsellor` to htcuser;
grant INSERT on TABLE `HTC`.`Counsellor` to htcuser;
grant DELETE on TABLE `HTC`.`Counsellor` to htcuser;
grant DELETE on TABLE `HTC`.`District` to htcuser;
grant INSERT on TABLE `HTC`.`District` to htcuser;
grant SELECT on TABLE `HTC`.`District` to htcuser;
grant UPDATE on TABLE `HTC`.`District` to htcuser;
grant DELETE on TABLE `HTC`.`Reason` to htcuser;
grant INSERT on TABLE `HTC`.`Reason` to htcuser;
grant SELECT on TABLE `HTC`.`Reason` to htcuser;
grant UPDATE on TABLE `HTC`.`Reason` to htcuser;
grant DELETE on TABLE `HTC`.`Region` to htcuser;
grant INSERT on TABLE `HTC`.`Region` to htcuser;
grant SELECT on TABLE `HTC`.`Region` to htcuser;
grant UPDATE on TABLE `HTC`.`Region` to htcuser;
grant DELETE on TABLE `HTC`.`RiskReductionPlan` to htcuser;
grant INSERT on TABLE `HTC`.`RiskReductionPlan` to htcuser;
grant SELECT on TABLE `HTC`.`RiskReductionPlan` to htcuser;
grant UPDATE on TABLE `HTC`.`RiskReductionPlan` to htcuser;
grant DELETE on TABLE `HTC`.`Session` to htcuser;
grant INSERT on TABLE `HTC`.`Session` to htcuser;
grant SELECT on TABLE `HTC`.`Session` to htcuser;
grant UPDATE on TABLE `HTC`.`Session` to htcuser;
grant DELETE on TABLE `HTC`.`SessionType` to htcuser;
grant INSERT on TABLE `HTC`.`SessionType` to htcuser;
grant SELECT on TABLE `HTC`.`SessionType` to htcuser;
grant UPDATE on TABLE `HTC`.`SessionType` to htcuser;
grant DELETE on TABLE `HTC`.`SessionTypeCategory` to htcuser;
grant INSERT on TABLE `HTC`.`SessionTypeCategory` to htcuser;
grant SELECT on TABLE `HTC`.`SessionTypeCategory` to htcuser;
grant UPDATE on TABLE `HTC`.`SessionTypeCategory` to htcuser;
grant DELETE on TABLE `HTC`.`Site` to htcuser;
grant INSERT on TABLE `HTC`.`Site` to htcuser;
grant SELECT on TABLE `HTC`.`Site` to htcuser;
grant UPDATE on TABLE `HTC`.`Site` to htcuser;
grant DELETE on TABLE `HTC`.`SiteType` to htcuser;
grant INSERT on TABLE `HTC`.`SiteType` to htcuser;
grant SELECT on TABLE `HTC`.`SiteType` to htcuser;
grant UPDATE on TABLE `HTC`.`SiteType` to htcuser;
grant DELETE on TABLE `HTC`.`Symptom` to htcuser;
grant INSERT on TABLE `HTC`.`Symptom` to htcuser;
grant SELECT on TABLE `HTC`.`Symptom` to htcuser;
grant UPDATE on TABLE `HTC`.`Symptom` to htcuser;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
