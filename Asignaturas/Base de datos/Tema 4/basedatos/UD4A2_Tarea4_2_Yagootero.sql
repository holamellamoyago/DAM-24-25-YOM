SELECT * FROM sys.databases 
	WHERE name = 'Ventas';

exec sp_helpdb VENTAS

USE Ventas
SELECT * FROM sys.filegroups
	exec sp_helpfilegroup
	
o