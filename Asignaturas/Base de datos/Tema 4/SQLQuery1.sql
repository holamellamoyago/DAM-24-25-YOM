USE master;

IF EXISTS (SELECT * FROM SYS.databases WHERE name = 'conflictosbelicos')
	DROP DATABASE conflictosbelicos;
	
	
CREATE DATABASE conflictosbelicos
ON PRIMARY 
(	NAME='CONFLICTOS_DATA',
	FILENAME='C:\basedatos\conflictosbelicos\CONFLICTOS_DATA.MDF',
	SIZE=5MB,
	MAXSIZE=UNLIMITED,
	FILEGROWTH=15%
),
FILEGROUP GRUPO_INTERVIENE
(	NAME='GRUPO_DATOS1',
	FILENAME='C:\basedatos\conflictosbelicos\GRUPO_DATOS1.NDF',
	SIZE=8MB,
	MAXSIZE=UNLIMITED,
	FILEGROWTH=5MB
),
(	NAME='GRUPO_DATOS2',
	FILENAME='C:\basedatos\conflictosbelicos\GRUPO_DATOS2.NDF',
	SIZE=8MB,
	MAXSIZE=UNLIMITED,
	FILEGROWTH=5MB
),
FILEGROUP GRUPO_TRAFICANTES
(	NAME='TRAFICANTE_DATOS1',
	FILENAME='C:\basedatos\conflictosbelicos\TRAFICANTE_DATOS1.NDF',
	SIZE=5MB,
	MAXSIZE=12MB,
	FILEGROWTH=3MB
)
LOG ON
(	NAME='CONFLICTO1_LOG',
	FILENAME='C:\basedatos\conflictosbelicos\CONFLICTO1_LOG.LDF',
	SIZE=5MB,
	MAXSIZE=UNLIMITED,
	FILEGROWTH=3MB
),
(	NAME='CONFLICTO2_LOG',
	FILENAME='C:\basedatos\conflictosbelicos\CONFLICTO2_LOG.LDF',
	SIZE=5MB,
	MAXSIZE=UNLIMITED,
	FILEGROWTH=3MB
)

GO
USE conflictosbelicos;

CREATE TABLE CONFLICTO(
	CODIGO	TINYINT IDENTITY(1,1),
	NOMBRE	VARCHAR,
	MUERTOS	SMALLINT,
	HERIDOS	SMALLINT,
	CAUSA	VARCHAR
	
	CONSTRAINT PK_CONFLICTO PRIMARY KEY (CODIGO)
)

CREATE TABLE RACIAL(
	CODIGO TINYINT IDENTITY(1,1),
	ETNIA	VARCHAR,
	
	CONSTRAINT PK_RACIAL PRIMARY KEY (CODIGO, ETNIA),
	CONSTRAINT FK_RACIAL_CONFLICTO FOREIGN KEY (CODIGO) REFERENCES  CONFLICTO(CODIGO)
)

CREATE TABLE TERRITORIAL(
	CODIGO TINYINT	IDENTITY(1,1),
	COD_REGION	TINYINT,
	
	CONSTRAINT PK_TERRITORIAL	PRIMARY KEY (CODIGO, COD_REGION),
	CONSTRAINT FK_COD_REGION_CONFLICTO	FOREIGN KEY	(CODIGO) REFERENCES CONFLICTO(CODIGO)

)

CREATE TABLE RELIGIOSO(
	CODIGO	TINYINT IDENTITY,
	COD_RELIGION	TINYINT,
	
	CONSTRAINT PK_RELIGIOSO	PRIMARY KEY (CODIGO, COD_RELIGION),
	CONSTRAINT FK_CODIGO_CONFLICTO	FOREIGN KEY	(CODIGO) REFERENCES CONFLICTO(CODIGO)
)

CREATE TABLE ECONOMICO (
	CODIGO TINYINT IDENTITY,
	COD_PRIMA	TINYINT,
	
	CONSTRAINT PK_ECONOMICO	PRIMARY KEY(CODIGO, COD_PRIMA),
	CONSTRAINT FK_ECONOMICO	FOREIGN KEY	(CODIGO) REFERENCES CONFLICTO
)

CREATE TABLE PAIS
(
	CODIGO	TINYINT	IDENTITY,
	COD_PAIS	SMALLINT,
	
	CONSTRAINT PK_PAIS PRIMARY KEY (CODIGO, COD_PAIS),
	CONSTRAINT FK_PAIS	FOREIGN KEY	(CODIGO) REFERENCES CONFLICTO
)

CREATE TABLE GRUPO(

	CODIGO TINYINT IDENTITY,
	NOMBRE VARCHAR,
	BAJAS	SMALLINT,
	
	CONSTRAINT PK_GRUPO	PRIMARY KEY (CODIGO)
)

CREATE TABLE INTERVIENE (
	GRUPO TINYINT ,
	CONFLICTO TINYINT ,
	F_INICIO DATE,
	F_FIN	DATE,
	
	CONSTRAINT PK_INTERVIENE	PRIMARY KEY (GRUPO, CONFLICTO , F_INICIO),
	CONSTRAINT FK_INTERVIENE_GRUPO	FOREIGN KEY	(GRUPO) REFERENCES GRUPO
)

CREATE TABLE DIVISION(
	GRUPO TINYINT,
	DIVISION	TINYINT,
	BAJAS		SMALLINT,
	HOMBRES		SMALLINT,
	AVIONES		SMALLINT,
	TANQUES		SMALLINT,
	BARCOS		SMALLINT,
	
	CONSTRAINT PK_DIVISION	PRIMARY KEY (GRUPO, DIVISION),
	CONSTRAINT FK_DIVISION	FOREIGN KEY (GRUPO) REFERENCES GRUPO
)

CREATE TABLE LIDER (
	CODIGO TINYINT ,
	CODIGO_GRUPO	TINYINT ,
	APOYOS			SMALLINT,
	
	CONSTRAINT PK_LIDER		PRIMARY KEY (CODIGO, CODIGO_GRUPO),
	CONSTRAINT FK_LIDER		FOREIGN KEY	(CODIGO_GRUPO) REFERENCES GRUPO
)

CREATE TABLE JEFE(
	CODIGO		TINYINT,
	COD_GRUPO	TINYINT,
	DIVISION	TINYINT,
	COD_LIDER	TINYINT,

	CONSTRAINT PK_JEFE PRIMARY KEY (CODIGO),
	CONSTRAINT FK_JEFE_DIVISION FOREIGN KEY (COD_GRUPO , DIVISION) REFERENCES DIVISION,
	CONSTRAINT FK_JEFE_GRUPO	FOREIGN KEY	(COD_GRUPO, COD_LIDER) REFERENCES LIDER
)

CREATE TABLE ARMA (
	CODIGO TINYINT IDENTITY ,
	INDICADOR	SMALLINT,
	
	CONSTRAINT PK_ARMA PRIMARY KEY (CODIGO)
)

CREATE TABLE TRAFICANTE (
	NOMBRE	VARCHAR,
	
	CONSTRAINT	PK_TRAFICANTE PRIMARY KEY(NOMBRE),
)

CREATE TABLE STOCK(
	NUM_ARMA	TINYINT,
	NOMBRE_TRAFICANTE	VARCHAR,
	CANTIDAD	SMALLINT,
	
	CONSTRAINT PK_STOCK	PRIMARY KEY	(NUM_ARMA),
	CONSTRAINT FK_NUM_ARMA FOREIGN KEY (NUM_ARMA) REFERENCES ARMA,
	CONSTRAINT FK_NUM_TRAFICANTE FOREIGN KEY (NOMBRE_TRAFICANTE) REFERENCES TRAFICANTE
)

CREATE TABLE SUMINISTRA	(
	GRUPO	TINYINT,
	ARMA	TINYINT,
	TRAFICANTE	VARCHAR,
	CANTIDAD	SMALLINT,
	
	CONSTRAINT PK_SUMINISTRA PRIMARY KEY (GRUPO, ARMA , TRAFICANTE),
	CONSTRAINT FK_GRUPO_GRUPO FOREIGN KEY (GRUPO) REFERENCES GRUPO,
	CONSTRAINT FK_TRAFICANTE FOREIGN KEY (TRAFICANTE) REFERENCES TRAFICANTE,
	CONSTRAINT FK_ARMA	FOREIGN KEY	(ARMA)		REFERENCES ARMA
)

CREATE TABLE ORGANIZACIONES(
	CODIGO TINYINT	IDENTITY,
	NOMBRE	VARCHAR,
	TIPO	VARCHAR,
	DEPENDE_DE VARCHAR NULL,
	
	CONSTRAINT PK_ORGANIZACIONES PRIMARY KEY (CODIGO),
	CONSTRAINT FK_ORGANIZACIONES	FOREIGN KEY	(CODIGO) REFERENCES ORGANIZACIONES,
)

CREATE TABLE DIALOGA(
	GRUPO TINYINT,
	LIDER	TINYINT,
	ORGANIZACION	TINYINT,
	
	CONSTRAINT PK_DIALOGA	PRIMARY KEY	(GRUPO, LIDER, ORGANIZACION),
	CONSTRAINT FK_DIALOGA	FOREIGN KEY (GRUPO, LIDER) REFERENCES LIDER,
	CONSTRAINT FK_IORGANIZACION_DIALOGA FOREIGN KEY (ORGANIZACION) REFERENCES ORGANIZACIONES
)

CREATE TABLE MEDIA(
	CONFLICTO TINYINT ,
	ORGANIZACION	TINYINT,
	FEHCA_INICIO	DATE,
	FECHA_FIN	DATE NULL,
	T_AYUDA		VARCHAR,
	DESPLEGADOS	SMALLINT,
	
	CONSTRAINT PK_MEDIA	PRIMARY KEY (CONFLICTO, ORGANIZACION, FEHCA_INICIO),
	CONSTRAINT FK_CONFLICTO_MEDIA	FOREIGN KEY	(CONFLICTO) REFERENCES CONFLICTO,
	CONSTRAINT FK_ORGANIZACION_MEDIA	FOREIGN KEY (ORGANIZACION)	REFERENCES ORGANIZACIONES
)