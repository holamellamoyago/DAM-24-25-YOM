IF DB_ID ('ProyectosdeInvestigacion') IS NOT NULL
	DROP DATABASE ProyectosdeInvestigacion;
	
-- OTRA FORMA DE ELIMINAR BDs
IF EXISTS (SELECT * FROM SYS.databases WHERE name='ProyectosdeInvestigacion')
	DROP DATABASE ProyectosdeInvestigacion;
		
GO
CREATE DATABASE ProyectosdeInvestigacion

IF EXISTS (SELECT * FROM SYS.tables WHERE name = 'Departamento')
	DROP TABLE Departamento

CREATE TABLE Departamento(
	CodigoDPTO tinyint NOT NULL IDENTITY(1,1)
	
	
)