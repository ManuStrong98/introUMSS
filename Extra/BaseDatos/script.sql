CREATE DATABASE `academico` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE academico;

CREATE TABLE estudiante
(
	codigo_sis VARCHAR(50) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido_paterno VARCHAR(50) NOT NULL,
    apellido_materno VARCHAR(50) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    PRIMARY KEY(codigo_sis)
)
ENGINE InnoDB;

INSERT INTO estudiante VALUES ('2021060802', 'Juan', 'Perez', 'Pereira', '2001-03-02');
INSERT INTO estudiante VALUES ('2022080802', 'Roberto', 'Flores', 'Gomez', '2002-03-02');
