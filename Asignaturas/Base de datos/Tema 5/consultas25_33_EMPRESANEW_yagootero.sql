USE EMPRESANEW;

-- 25

SELECT NOME, APELIDO1 , APELIDO2 , D.NomeDepartamento, Salario
	FROM EMPREGADO E
	INNER JOIN DEPARTAMENTO D ON E.NumDepartamentoPertenece = D.NumDepartamento
	INNER JOIN EMPREGADOFIXO EF ON E.NSS = EF.NSS
	WHERE Salario = (
		(SELECT MIN(Salario) FROM EMPREGADOFIXO)
	)
	
SELECT EE.Nome, EE.Apelido1, (
	SELECT COUNT(*) FROM EMPREGADO E 
	INNER JOIN FAMILIAR F ON E.NSS = F.NSS_empregado
		WHERE F.Parentesco = 'HIJA' OR F.Parentesco='HIJO'
		AND F.NSS_empregado = EE.NSS
)
	FROM EMPREGADO EE
	
	
SELECT D.NomeDepartamento, E.Nome, E.Apelido1, JEFE.Apelido1 AS APE1 FROM DEPARTAMENTO D
	INNER JOIN EMPREGADO E ON E.NumDepartamentoPertenece = D.NumDepartamento
	INNER JOIN EMPREGADO JEFE ON JEFE.NSS = D.NSSDirector
	WHERE (E.Nome LIKE '[JMR]A') OR 
		(JEFE.Apelido1 LIKE 'V[a-z][a-z][a-z][a-z][a-z]]')
	ORDER BY E.Nome
--SELECT * FROM FAMILIAR

SELECT * FROM EMPREGADO
