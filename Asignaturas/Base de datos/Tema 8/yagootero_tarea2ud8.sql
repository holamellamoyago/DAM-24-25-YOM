use EMPRESANEW

-- 1 A 

IF OBJECT_ID ('FnEdad') IS NOT NULL
	DROP FUNCTION FnEdad
	
GO

CREATE FUNCTION FnEdad
	(@FECHA DATE)
	RETURNS INT
BEGIN 
	RETURN DATEDIFF(DD, @FECHA, GETDATE()) /365.25
END

GO

SELECT dbo.FnEdad('11/02/2003') AS EDAD


SELECT NOME + ' ' + APELIDO1 + ' ' + ISNULL(Apelido2,'') AS NOME, 
		DBO.FnEdad(DataNacemento) AS EDAD
FROM EMPREGADO E 

-- 1B
IF OBJECT_ID('dbo.prFamiliarEdad') IS NOT NULL 
	DROP PROCEDURE dbo.prFamiliarEdad

GO

CREATE PROCEDURE prFamiliarEdad
	(@EDAD INT)
AS
SELECT * , 
(SELECT COUNT(*)
	FROM FAMILIAR F
	WHERE DATEDIFF(DD, DataNacemento, GETDATE()) / 365.25 > @EDAD AND
		F.NSS_empregado = E.NSS
) AS NUM_FAMILIARES
FROM EMPREGADO E 

DECLARE @SALIDA INT
EXEC @SALIDA = dbo.prFamiliarEdad 20



-- 2. 
IF OBJECT_ID('dbo.fnNumEmplMayorQueEdad') IS NOT NULL
	DROP FUNCTION dbo.fnNumEmplMayorQueEdad
GO

CREATE FUNCTION fnNumEmplMayorQueEdad
	(@NOMDEPA VARCHAR,@EDAD INT)
RETURNS INT
AS
BEGIN 

	DECLARE @VALOR_A_DEVOLVER INT

	IF ((SELECT COUNT(*)
		FROM DEPARTAMENTO D 
		WHERE D.NomeDepartamento = @NOMDEPA
	) <= 0) SELECT @VALOR_A_DEVOLVER = -1
	ELSE IF (@EDAD < 0)
		 SELECT @VALOR_A_DEVOLVER = -2
	ELSE
	BEGIN
	SELECT @VALOR_A_DEVOLVER = (SELECT COUNT(*)
			FROM EMPREGADO E 
			INNER JOIN DEPARTAMENTO D ON E.NumDepartamentoPertenece = D.									NumDepartamento
			WHERE (DATEDIFF(DD, E.DataNacemento, GETDATE()) / 365.25 ) > @EDAD
			AND 
			D.NomeDepartamento = @NOMDEPA
			)
	END
	
	RETURN @VALOR_A_DEVOLVER
END

GO

SELECT dbo.fnNumEmplMayorQueEdad( 'CONTABILIDAD' , 20 )




-- 3.

IF OBJECT_ID('FNEJER3') IS NOT NULL
	DROP FUNCTION FNEJER3

GO 
CREATE FUNCTION FNEJER3 
	(@N INT)
	RETURNS TABLE
AS
	RETURN (
		SELECT NomeDepartamento
		FROM DEPARTAMENTO D 
		INNER JOIN PROXECTO P ON P.NumDepartControla = D.NumDepartamento
		GROUP BY NomeDepartamento
		HAVING COUNT(P.NumProxecto) > @N
		
	)
GO
	
-- 4. 
IF OBJECT_ID('FN_ESVOCAL') IS NOT NULL
	DROP FUNCTION FN_ESVOCAL

GO
CREATE FUNCTION FN_ESVOCAL
	(@C CHAR)
RETURNS BIT
AS 
BEGIN 
	RETURN (CASE
		WHEN LOWER(@C) IN ('a','e','i','o','u',
							'�','�','�','�','�') THEN 1
		ELSE 0
		END)
END

GO

<<<<<<< HEAD
SELECT dbo.FN_ESVOCAL('C')
=======
SELECT dbo.FN_ESVOCAL('�')
>>>>>>> d44b7688ae915873b36101121ca329133bf893e7



IF OBJECT_ID('fnVocales') IS NOT NULL
	DROP FUNCTION fnVocales 
GO

CREATE FUNCTION fnVocales 
	(@V VARCHAR(250))
RETURNS INT
BEGIN

DECLARE @CONTADOR INT
SET @CONTADOR = 0

DECLARE @CONTADORVocales INT
SET @CONTADORVocales = 0


WHILE @CONTADOR != LEN(@V) +1 
<<<<<<< HEAD
=======
-- <= 
>>>>>>> d44b7688ae915873b36101121ca329133bf893e7
	BEGIN
	
		IF (dbo.FN_ESVOCAL(SUBSTRING(@V, @CONTADOR,1)) = 1)
		BEGIN
			SET @CONTADORVocales = @CONTADORVocales +1
		END
		
		SET @CONTADOR = @CONTADOR +1
	END;
	
RETURN @CONTADORVocales
END

GO

SELECT dbo.fnVocales('HOLA MUNDO')


<<<<<<< HEAD
SELECT SUBSTRING('HOLA MUNDO',3,1)

=======
>>>>>>> d44b7688ae915873b36101121ca329133bf893e7
-- 4C 
USE EMPRESANEW

IF OBJECT_ID('FNVOCALESNOMBRE') IS NOT NULL
	DROP FUNCTION FNVOCALESNOMBRE 
	


GO
CREATE FUNCTION FNVOCALESNOMBRE
<<<<<<< HEAD
	(@D VARCHAR)
	RETURNS @RESULTADO TABLE (
		NOMBRECOMPLETO VARCHAR,
=======
	(@D VARCHAR(50))
	RETURNS @RESULTADO TABLE (
		NOMBRECOMPLETO VARCHAR(50),
>>>>>>> d44b7688ae915873b36101121ca329133bf893e7
		CONTADOR INT
	)
AS
BEGIN
DECLARE @NUMD INT
SELECT @NUMD = NUMDEPARTAMENTO FROM DEPARTAMENTO WHERE NomeDepartamento = @D


INSERT INTO @RESULTADO 
	SELECT NOME + ' ' + APELIDO1 + ' ' + ISNULL(APELIDO2,'') AS NOMBRECOMPLETO,
		dbo.fnVocales(NOME + ' ' + APELIDO1 + ' ' + ISNULL(APELIDO2,'')) AS CONTEO
	FROM EMPREGADO E
	WHERE E.NumDepartamentoPertenece != @NUMD
	
	
	RETURN
END

GO
SELECT * FROM dbo.FNVOCALESNOMBRE('PERSOAL')
SELECT * FROM DEPARTAMENTO
SELECT dbo.fnVocales(NOME + ' ' + APELIDO1 + ' ' + ISNULL(APELIDO2,'')) FROM EMPREGADO
DECLARE @NUMD INT
SELECT @NUMD = NUMDEPARTAMENTO FROM DEPARTAMENTO WHERE NomeDepartamento = 'PERSOAL'
SELECT @NUMD

<<<<<<< HEAD
	
 
=======






GO

IF OBJECT_ID('prVisualizaTabla') IS NOT NULL 
	DROP PROCEDURE prVisualizaTabla

GO
CREATE PROCEDURE prVisualizaTabla
	(@nombreBD VARCHAR, @esquema varchar = 'dbo', @nombreTabla VARCHAR)
as
begin
	

end 





























>>>>>>> d44b7688ae915873b36101121ca329133bf893e7







