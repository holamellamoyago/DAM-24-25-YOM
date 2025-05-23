USE master;

IF EXISTS (SELECT * FROM SYS.databases WHERE name = 'BDVideoclub')
	DROP DATABASE BDVideoclub;


	
CREATE DATABASE BDVideoclub
ON PRIMARY
(	NAME='ARCHIVOPRINCIPAL',
	FILENAME = 'C:\basedatos\BDVideoclub\ARCHIVOPRINCIPAL.MDF',
	SIZE=5MB,
	FILEGROWTH=2MB),
	
FILEGROUP DATOS_PELICULAS DEFAULT
(	NAME='DATOSPELICULAS1',
	FILENAME='C:\basedatos\BDVideoclub\DATOSPELICULAS1.NDF',
	SIZE=20MB,
	MAXSIZE=60MB,
	FILEGROWTH=10%),
(	NAME='DATOSPELICULAS2',
	FILENAME='C:\basedatos\BDVideoclub\DATOSPELICULAS2.NDF',
	SIZE=20MB,
	MAXSIZE=60MB,
	FILEGROWTH=10%);
	
GO
USE BDVideoclub;
	

	
	
CREATE TYPE FECHA
	FROM SMALLDATETIME NOT NULL
	
IF EXISTS (SElECT * FROM SYS.TYPES WHERE NAME ='NACIONALIDAD')
	DROP TYPE NACIONALIDAD;
	
CREATE TYPE NACIONALIDAD
	FROM VARCHAR(15);
	
	

IF EXISTS (SELECT * FROM SYS.tables WHERE name = 'PELICULA')
	DROP TABLE PELICULA;
	
CREATE TABLE CATEGORIA(
	CODCATEGORIA	TINYINT,
	PRECIO MONEY,
	DESCRIPCION	VARCHAR(30) NULL,
	
	CONSTRAINT PK_CATEGORIA PRIMARY KEY (CODCATEGORIA)
)


CREATE TABLE PELICULA(
	IDPELICULA VARCHAR(7),
	TITULO VARCHAR(20),
	AÑOPRODUCCION SMALLINT,
	GENERO	VARCHAR(15),
	DURACION	SMALLINT,
	NACIONALIDAD	VARCHAR(15)	NULL,
	CODCATEGORIA	TINYINT,
	
	CONSTRAINT FK_CODCATEGORIA FOREIGN KEY (CODCATEGORIA)		
	REFERENCES CATEGORIA(CODCATEGORIA) ON UPDATE			
	CASCADE ON DELETE NO ACTION,
	
	
	CONSTRAINT CK_IDPELICULA CHECK (
		(IDPELICULA LIKE '[PF][A-Z][-][0-9][0-9][0-9][0-9]')
	),
	
	CONSTRAINT PK_PELICULA PRIMARY KEY (IDPELICULA),
	
) ON [PRIMARY];




GO

IF EXISTS (SELECT * FROM SYS.tables WHERE name = 'EJEMPLAR')
	DROP TABLE EJEMPLAR;
	
GO

CREATE TABLE EJEMPLAR(
	IDPELICULA	VARCHAR(7),
	IDEJEMPLAR	TINYINT,
	ESTADO		CHAR(1),
	FECHACOMPRA	DATE DEFAULT DATEADD(dd, -2, getDate()),
	
	
	CONSTRAINT CK_ESTADO CHECK(
		(ESTADO LIKE '[BRM]')
	),
		
	CONSTRAINT FK_IDPELICULA FOREIGN KEY (IDPELICULA) REFERENCES PELICULA(IDPELICULA),
	
	CONSTRAINT PK_EJEMPLAR PRIMARY KEY (IDPELICULA, IDEJEMPLAR)
) ON DATOS_PELICULAS;


CREATE TABLE SOCIO(
	NUMERO SMALLINT IDENTITY,
	DNI		TINYINT,
	NOMBRE	VARCHAR(20),
	APELLIDOS VARCHAR(20),
	DIRECCION	VARCHAR(30),
	TELEFONO CHAR(9),
	FECHADEALTA	DATE,
	
	CONSTRAINT PK_SOCIO PRIMARY KEY (NUMERO),
	CONSTRAINT CK_DNI CHECK (
		(TELEFONO LIKE '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')
	),
	CONSTRAINT UNI_DNI UNIQUE (DNI)
)


CREATE TABLE ALQUILER(
	IDEJEMPLAR	TINYINT,
	IDPELICULA	VARCHAR(7),
	FECHAALQ	DATE,
	NUMEROSOCIO	SMALLINT,
	FECHAESTIMADADEV	AS	DATEADD(DD, 15, 'FECHAALQ'),
	FECHADEV	DATE	NULL,
	
	CONSTRAINT PK_ALQUILER PRIMARY KEY	(IDEJEMPLAR, IDPELICULA, FECHAALQ),
	CONSTRAINT FK_IDEJEMPLAR FOREIGN KEY (IDPELICULA, IDEJEMPLAR) REFERENCES
			EJEMPLAR(IDPELICULA, IDEJEMPLAR) ON DELETE CASCADE ON UPDATE CASCADE,
)

CREATE TABLE ACTOR(
	NOMBRE VARCHAR(20), 
	NACIONALIDAD NACIONALIDAD,
	SEXO	CHAR(1),
	
	CONSTRAINT PK_ACTOR PRIMARY KEY (NOMBRE),
	CONSTRAINT CK_SEXO	CHECK(
		(SEXO LIKE	'[HM]')
	)
	
)

CREATE TABLE ACTUA(
	NOMBREACTOR VARCHAR(20),
	IDPELICULA	VARCHAR(7),
	PRINSEC		CHAR(1),
	
	CONSTRAINT CK_PRINSEC CHECK(
		(PRINSEC LIKE '[PS]')
	),
	
	CONSTRAINT PK_ACTUA PRIMARY KEY (NOMBREACTOR,				IDPELICULA),
	
	CONSTRAINT FK_NOMBREACTOR FOREIGN KEY (NOMBREACTOR)			REFERENCES	ACTOR(NOMBRE) 
			ON	UPDATE NO ACTION 
			ON	DELETE NO ACTION,
	
	CONSTRAINT FK_IDPELICULA_ACTOR FOREIGN KEY					(IDPELICULA)		REFERENCES PELICULA						(IDPELICULA)ON UPDATE CASCADE ON DELETE						CASCADE
)


CREATE TABLE DIRECTOR(
	NOMBRE VARCHAR(20),
	NACIONALIDAD	NACIONALIDAD,
	
	CONSTRAINT PK_DIRECTOR PRIMARY KEY (NOMBRE)
)


CREATE TABLE DIRIGE (
	IDPELICULA	VARCHAR(7),
	NOMBREDIRECTOR	VARCHAR(20),
	
	
	CONSTRAINT PK_DIRIGE PRIMARY KEY (IDPELICULA, NOMBREDIRECTOR),

	CONSTRAINT FK_IDPELICULA_DIRIGE FOREIGN KEY (IDPELICULA) REFERENCES PELICULA(IDPELICULA)ON UPDATE NO ACTION ON DELETE NO ACTION,
	
	CONSTRAINT FK_NOMBREDIRECTOR	FOREIGN KEY (NOMBREDIRECTOR) REFERENCES DIRECTOR(NOMBRE)ON UPDATE CASCADE ON DELETE CASCADE
)

CREATE TABLE FAMILIAR(
	DNI CHAR(9),
	NOMBRE	VARCHAR(60),
	PARENTESCO VARCHAR(15),
	FECHANACIMIENTO DATE,
	NUMEROSOCIO TINYINT,
	
	CONSTRAINT PK_FAMILIAR PRIMARY KEY (DNI),
	
	
	
) ON [PRIMARY];

-- C




	

ALTER TABLE ALQUILER	
	ADD CONSTRAINT DF_FECHADEALQUILER  DEFAULT GETDATE()	FOR FECHAALQ
	
ALTER TABLE SOCIO
	ADD CONSTRAINT DF_FECHADEALTA DEFAULT GETDATE()
	FOR	FECHADEALTA
	
ALTER TABLE CATEGORIA 

	WITH CHECK ADD CONSTRAINT CK_PRECIO CHECK (
	((PRECIO) > 1 AND (PRECIO) < 300)
)



	
ALTER TABLE ALQUILER
	ADD PRECIOALQUILER MONEY NOT NULL  CONSTRAINT DF_PRECIOALQUILER DEFAULT  4 WITH VALUES

ALTER TABLE ALQUILER
	
	DROP
		CONSTRAINT DF_PRECIOALQUILER, 
		COLUMN PRECIOALQUILER	
         
GO
         
         
CREATE TABLE DISTRIBUIDORA(
	ID TINYINT IDENTITY(1,1),
	NOMBRE VARCHAR(20),
	DIRECCION VARCHAR(50),
	FAX CHAR(9) NULL,
	EMAIL VARCHAR(60) NULL,
	
	CONSTRAINT UQ_NOMBRE UNIQUE (NOMBRE),
	CONSTRAINT PK_DISTRIBUIDORA PRIMARY KEY (ID)
)

CREATE TABLE DISTRIBUYE(
	ID_DISTRIBUIDORA	TINYINT ,
	ID_PELICULA			VARCHAR(7),
	
	CONSTRAINT PK_DISTRIBUYE PRIMARY KEY (ID_DISTRIBUIDORA , ID_PELICULA),
	CONSTRAINT FK_DISTRIBUIDORA FOREIGN KEY (ID_DISTRIBUIDORA) REFERENCES DISTRIBUIDORA(ID),
	CONSTRAINT FK_PELICULA		FOREIGN KEY (ID_PELICULA) REFERENCES PELICULA(IDPELICULA)
		ON DELETE NO ACTION ON UPDATE CASCADE
)

CREATE TABLE SOCIO_RECOMENDADO(
	ID_RECOMENDACION SMALLINT,
	ID_RECOMENDADO SMALLINT,
	
	CONSTRAINT FK_RECOMENSACION FOREIGN KEY (ID_RECOMENDACION) REFERENCES SOCIO(NUMERO)
		ON DELETE SET NULL ON UPDATE CASCADE
)



INSERT INTO PELICULA(IDPELICULA) VALUES ('PA-1234');

INSERT INTO EJEMPLAR(IDPELICULA, IDEJEMPLAR, ESTADO) VALUES ('PA-1234',	3, 'B')


--SELECT * FROM PELICULA;
--SELECT * FROM BDVideoclub;


USE master;

