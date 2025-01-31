IF DB_ID('Ventas') IS NOT NULL
begin
	DROP DATABASE Ventas;
	PRINT 'LA BASE DE VENTAS SE HA BORRADO';
end
GO
CREATE DATABASE Ventas
ON PRIMARY
(	NAME = 'Ventas_root',
	FILENAME='C:\basedatos\Ventas\Ventas_root.mdf',
	SIZE=10,
	MAXSIZE=50,
	FILEGROWTH=15%
),
FILEGROUP GRUPO_CLIENTES
(	NAME='cliente_data1.ndf',
	FILENAME='C:\basedatos\Ventas\Clientes_data.ndf',
	SIZE=5MB,
	MAXSIZE=50MB
)
LOG ON
(	NAME='log_data1.ldf',
	FILENAME='C:\basedatos\Ventas\LOG_DATA1.ldf',
	SIZE=5,
	MAXSIZE=50,
	FILEGROWTH=5
)


GO
--lISTA TODA SLAS BASES DE DATOS
SELECT * from sys.databases;


GO
-- Lista de todas kas tablas bases de datos
SELECT * FROM sys.databases
	WHERE database_id > 4;
	
GO
--Utiliza un procedimiento almaneceado para generar una lista de todas l
--las bases de datos
exec sp_helpdb;









