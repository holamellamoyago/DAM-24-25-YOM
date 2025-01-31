exec sp_helpdb Products2
GO

SELECT * FROM sys.databases
	WHERE database_id > 4

GO	
USE BDCreateDB3;
SELECT * FROM sys.database_files;
				