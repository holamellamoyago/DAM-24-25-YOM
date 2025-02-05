-- YAGO OTERO MARTINEZ
IF DB_ID ('BD_TiposUsuario1') IS NOT NULL
BEGIN
	DROP DATABASE BD_TiposUsuario1
END

GO
CREATE DATABASE BD_TiposUsuario1

-- TipoCODIGO

IF EXISTS (Select * from sys.types where name='TipoCodigo')
    DROP TYPE TipoCodigo

CREATE TYPE TipoCodigo
	FROM CHAR(10) NULL
	
IF EXISTS (Select * from sys.types where name='TIPONUM')
    DROP TYPE TIPONUM

select * from sys.types;


