
if DB_ID ('BD_TiposUsuario1') IS NOT NULL
	drop database BD_TiposUsuario1;

CREATE DATABASE BD_TiposUsuario1;

--TipoNum

IF EXISTS (Select * from sys.types where name='TipoNum')
    DROP TYPE TipoNum

CREATE TYPE TipoNum
	FROM smallint;

--TipoTelefono

IF EXISTS (Select * from sys.types where name='TipoTelefono')
    DROP TYPE TipoTelefono

CREATE TYPE TipoTelefono
	FROM CHAR(9) NULL;
	
	
--TipoNombreCorto
IF EXISTS (SELECT * FROM SYS.TYPES WHERE name='TipoNombreCorto') DROP TYPE TipoNombreCorto;

CREATE TYPE TipoNombreCorto
	FROM VARCHAR(15)
	
SELECT * FROM sys.types WHERE is_user_defined=1;
--exeC sp_help 'TipoTelefono' 


--Ejercicio 2
DROP TYPE TipoCodigo;
DROP TYPE TipoNum;
