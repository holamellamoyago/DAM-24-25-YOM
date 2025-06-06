USE EMPRESANEW;

-- 1.
DECLARE @CODMELLORASSOCIAIS INT
SELECT @CODMELLORASSOCIAIS = NumProxecto
FROM PROXECTO
WHERE NomeProxecto='MELLORAS SOCIAIS'

INSERT INTO EMPREGADO_PROXECTO
VALUES ('1122331', @CODMELLORASSOCIAIS, 3)

-- 2.
UPDATE EMPREGADOFIXO
SET Salario = NULL
FROM EMPREGADOFIXO EP
INNER JOIN EMPREGADO E ON E.NSS = EP.NSS
INNER JOIN DEPARTAMENTO D  ON E.NumDepartamentoPertenece = D.NumDepartamento
WHERE D.NomeDepartamento = 'INNOVACIÓN'

SELECT SALARIO
FROM EMPREGADOFIXO EP 
INNER JOIN EMPREGADO E ON E.NSS = EP.NSS
INNER JOIN DEPARTAMENTO D  ON E.NumDepartamentoPertenece = D.NumDepartamento
WHERE D.NomeDepartamento = 'INNOVACIÓN'


-- 3.
UPDATE EMPREGADOFIXO
SET Salario = 1900
FROM EMPREGADOFIXO EP
INNER JOIN EMPREGADO E ON E.NSS = EP.NSS
INNER JOIN DEPARTAMENTO D ON D.NumDepartamento = E.NumDepartamentoPertenece
WHERE E.NSS NOT IN (
	SELECT NSSDirector FROM DEPARTAMENTO D
) AND EP.Salario = NULL

SELECT EP.Salario, E.NSS
FROM EMPREGADOFIXO EP
INNER JOIN EMPREGADO E ON E.NSS = EP.NSS
INNER JOIN DEPARTAMENTO D ON D.NumDepartamento = E.NumDepartamentoPertenece
WHERE E.NSS NOT IN (
	SELECT NSSDirector FROM DEPARTAMENTO D
) AND EP.Salario IS NULL


-- 4.

BEGIN TRANSACTION
BEGIN TRY

DECLARE @ESTADÍSTICA INT
SELECT @ESTADÍSTICA = NumDepartamento
FROM DEPARTAMENTO
WHERE NomeDepartamento = 'ESTADÍSTICA'

DECLARE @INNOVACION INT 
SELECT @INNOVACION = NumDepartamento
FROM DEPARTAMENTO
WHERE NomeDepartamento = 'INNOVACIÓN'

-- ACTUALIZO EMPREGADOS
UPDATE EMPREGADO
SET NumDepartamentoPertenece = @INNOVACION
FROM EMPREGADO
WHERE NumDepartamentoPertenece = @ESTADÍSTICA

-- ACTUALIZO PROXECTO
UPDATE PROXECTO
SET NumDepartControla = @INNOVACION
FROM PROXECTO 
WHERE NumDepartControla = @ESTADÍSTICA

SELECT * 
FROM EMPREGADO WHERE NumDepartamentoPertenece = @ESTADÍSTICA


COMMIT TRANSACTION
END TRY
BEGIN CATCH
	ROLLBACK
END CATCH


-- 5.
DECLARE @JEFEINNOVACIÓN VARCHAR

SELECT @JEFEINNOVACIÓN = NSSDirector FROM DEPARTAMENTO
WHERE NomeDepartamento='INNOVACIÓN'

UPDATE EMPREGADOFIXO
SET Salario = 3900
WHERE NSS = @JEFEINNOVACIÓN

-- 6.

IF EXISTS (SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME = 'DPTO_CONTA')
	DROP TABLE DPTO_CONTA

SELECT Nome, Apelido1, Apelido2, P.NomeProxecto INTO DPTO_CONTA 
FROM EMPREGADO E
INNER JOIN EMPREGADO_PROXECTO EP ON E.NSS = NSSEmpregado
INNER JOIN PROXECTO P ON P.NumProxecto = EP.NumProxecto
INNER JOIN DEPARTAMENTO D ON D.NumDepartamento = E.NumDepartamentoPertenece
WHERE D.NomeDepartamento = 'CONTABILIDAD'

SELECT * FROM DPTO_CONTA

IF EXISTS (SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME = 'DPTO_CONTA')
	DROP TABLE DPTO_CONTA

SELECT * FROM DEPARTAMENTO


-- 7. 

DECLARE @MEDIA_SALARIO_TECNICO INT

-- 8.

SELECT @MEDIA_SALARIO_TECNICO =  AVG(SALARIO)
FROM EMPREGADOFIXO EP 
INNER JOIN EMPREGADO E ON E.NSS= EP.NSS
INNER JOIN DEPARTAMENTO D ON D.NumDepartamento = E.NumDepartamentoPertenece
WHERE D.NomeDepartamento = 'TÉCNICO'

UPDATE EMPREGADOFIXO
SET Salario = @MEDIA_SALARIO_TECNICO
FROM EMPREGADOFIXO EP
INNER JOIN EMPREGADO E ON E.NSS = EP.NSS
INNER JOIN DEPARTAMENTO D ON D.NumDepartamento = E.NumDepartamentoPertenece
WHERE D.NomeDepartamento = 'TÉCNICO' AND EP.Salario < @MEDIA_SALARIO_TECNICO

-- 9.

IF EXISTS (SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME = 'DPTO_CONTA')
	DROP TABLE DPTO_CONTA
	
DECLARE @MEDIA_SALARIOS_EMPERSA INT 
SELECT @MEDIA_SALARIOS_EMPERSA = AVG(SALARIO)
FROM EMPREGADOFIXO EP 



SELECT e.Nome,E.Apelido1, ISNULL(E.Apelido2, ' ') AS APE2
INTO DPTO_CONTA
FROM EMPREGADO E 
INNER JOIN DEPARTAMENTO D ON E.NumDepartamentoPertenece = D.NumDepartamento
INNER JOIN FAMILIAR F ON F.NSS_empregado = E.NSS
INNER JOIN EMPREGADOFIXO EP ON EP.NSS = E.NSS
WHERE D.NomeDepartamento = 'CONTABILIDAD' AND
		F.Parentesco IN ('Hija', 'Hijo') AND 
		EP.Salario > @MEDIA_SALARIOS_EMPERSA


SELECT * FROM DPTO_CONTA

SELECT * FROM FAMILIAR




