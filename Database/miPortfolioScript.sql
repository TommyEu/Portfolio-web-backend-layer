-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema portfolio
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema portfolio
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `portfolio` DEFAULT CHARACTER SET utf8 ;
USE `portfolio` ;

-- -----------------------------------------------------
-- Table `portfolio`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio`.`user` (
  `iduser` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `social_idsocial` INT NOT NULL,
  `acerca_de_idacerca_de` INT NOT NULL,
  PRIMARY KEY (`iduser`, `social_idsocial`, `acerca_de_idacerca_de`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio`.`social`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio`.`social` (
  `idsocial` INT NOT NULL,
  `twitter` VARCHAR(2048) NULL,
  `linkedin` VARCHAR(2048) NULL,
  `github` VARCHAR(2048) NULL,
  `instagram` VARCHAR(2048) NULL,
  `user_iduser` INT NOT NULL,
  PRIMARY KEY (`idsocial`, `user_iduser`),
  INDEX `fk_social_user1_idx` (`user_iduser` ASC) VISIBLE,
  CONSTRAINT `fk_social_user1`
    FOREIGN KEY (`user_iduser`)
    REFERENCES `portfolio`.`user` (`iduser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio`.`experiencia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio`.`experiencia` (
  `idexperiencia` INT NOT NULL,
  `titulo` VARCHAR(60) NULL,
  `logo_empresa` VARCHAR(2048) NULL,
  `anio_inicio` INT NULL,
  `anio_final` INT NULL,
  `descripcion` VARCHAR(400) NULL,
  `user_iduser` INT NOT NULL,
  PRIMARY KEY (`idexperiencia`, `user_iduser`),
  INDEX `fk_experiencia_user1_idx` (`user_iduser` ASC) VISIBLE,
  CONSTRAINT `fk_experiencia_user1`
    FOREIGN KEY (`user_iduser`)
    REFERENCES `portfolio`.`user` (`iduser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio`.`acerca_de`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio`.`acerca_de` (
  `idacerca_de` INT NOT NULL,
  `foto` VARCHAR(2048) NULL,
  `nombre` VARCHAR(45) NULL,
  `titulo` VARCHAR(45) NULL,
  `info_resumen` VARCHAR(400) NULL,
  `user_iduser` INT NOT NULL,
  PRIMARY KEY (`idacerca_de`, `user_iduser`),
  INDEX `fk_acerca_de_user1_idx` (`user_iduser` ASC) VISIBLE,
  CONSTRAINT `fk_acerca_de_user1`
    FOREIGN KEY (`user_iduser`)
    REFERENCES `portfolio`.`user` (`iduser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio`.`educacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio`.`educacion` (
  `ideducacion` INT NOT NULL,
  `institucion` VARCHAR(45) NULL,
  `carrera` VARCHAR(45) NULL,
  `anio_inicio` INT NULL,
  `anio_final` INT NULL,
  `logo` VARCHAR(2048) NULL,
  `user_iduser` INT NOT NULL,
  PRIMARY KEY (`ideducacion`, `user_iduser`),
  INDEX `fk_educacion_user1_idx` (`user_iduser` ASC) VISIBLE,
  CONSTRAINT `fk_educacion_user1`
    FOREIGN KEY (`user_iduser`)
    REFERENCES `portfolio`.`user` (`iduser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio`.`skills`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio`.`skills` (
  `idskills` INT NOT NULL,
  `nombre_skill` VARCHAR(45) NULL,
  `progreso` VARCHAR(45) NULL,
  `user_iduser` INT NOT NULL,
  PRIMARY KEY (`idskills`, `user_iduser`),
  INDEX `fk_skills_user1_idx` (`user_iduser` ASC) VISIBLE,
  CONSTRAINT `fk_skills_user1`
    FOREIGN KEY (`user_iduser`)
    REFERENCES `portfolio`.`user` (`iduser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio`.`proyectos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio`.`proyectos` (
  `idproyectos` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `imagen` VARCHAR(2048) NULL,
  `descripcion` VARCHAR(400) NULL,
  `fecha_finalizacion` DATE NULL,
  `link` VARCHAR(2048) NULL,
  `user_iduser` INT NOT NULL,
  PRIMARY KEY (`idproyectos`, `user_iduser`),
  INDEX `fk_proyectos_user1_idx` (`user_iduser` ASC) VISIBLE,
  CONSTRAINT `fk_proyectos_user1`
    FOREIGN KEY (`user_iduser`)
    REFERENCES `portfolio`.`user` (`iduser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
