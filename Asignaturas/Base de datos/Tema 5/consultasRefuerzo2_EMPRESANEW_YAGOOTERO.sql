USE EMPRESANEW;

-- 1.
SELECT * FROM EMPREGADO
	WHERE Sexo='H' AND YEAR(DataNacemento) > 1970 AND
		NSSSupervisa = (
			SELECT NSS FROM EMPREGADO
				WHERE Nome = 'Sara' AND Apelido1 = 'Plaza' AND
					Apelido2 = 'Mar�n'
		)
	

-- 2.
SELECT Nome, Apelido1, Apelido2, COALESCE(TELEFONO1, TELEFONO2, '')
	FROM DEPARTAMENTO D INNER JOIN EMPREGADO E 
		ON D.NSSDirector = NSS
		ORDER BY Apelido1, Apelido2,Nome
		
-- 3.
SELECT NOME, APELIDO1 + ' ' + Apelido2 AS APELLIDOS, 
	DATEDIFF(YEAR, DataNacemento, GETDATE()) - 
		CASE 
			WHEN (MONTH(DataNacemento) > MONTH(DataNacemento))
				OR (MONTH(DataNacemento) = MONTH(GETDATE()) 
						AND DAY(DataNacemento) > DAY(GETDATE()))
			THEN 1
			ELSE 0
		END AS EDAD
	FROM DEPARTAMENTO D INNER JOIN EMPREGADO E 
		ON D.NSSDirector != NSS
		ORDER BY APELLIDOS DESC ,Nome ASC
		
-- 4. 
SELECT Nome, Apelido1, Apelido2, COALESCE(TELEFONO1, TELEFONO2, '') AS TELEFONO,
		(SELECT NOME FROM EMPREGADO WHERE NSS = D.NSSDIRECTOR) AS [NOMBRE JEFE]
	FROM DEPARTAMENTO D INNER JOIN EMPREGADO E 
		ON D.NSSDirector = NSS
		

--5.
SELECT E.Nome, E.Apelido1  FROM DEPARTAMENTO D
	LEFT JOIN PROXECTO P ON D.NumDepartamento = P.NumDepartControla
	INNER JOIN EMPREGADO E ON D.NSSDirector = NSS
	WHERE NumDepartControla IS NULL

-- 6.

SELECT E.NOME, E.APELIDO1, E.APELIDO2, E.LOCALIDADE AS [LOCALIDAD EMP] 
		, L.LUGAR AS [LUGAR DEP]
	FROM EMPREGADO E 
		INNER JOIN DEPARTAMENTO D ON NumDepartamento = NumDepartamentoPertenece
		INNER JOIN LUGAR L ON D.NumDepartamento = L.Num_departamento
	WHERE E.Localidade = L.Lugar
	
-- 7.
SELECT E.NOME + ' ' + E.APELIDO1 + ' ' + E.APELIDO2 AS [NOME COMPLETO],
		E.Rua, Numero_Calle,Piso, E.Localidade, D.NomeDepartamento

	FROM EMPREGADO E
	INNER JOIN DEPARTAMENTO D ON E.NumDepartamentoPertenece = D.NumDepartamento
	ORDER BY CASE
		WHEN E.Sexo='M' THEN Localidade
		WHEN E.Sexo='H' THEN D.NomeDepartamento
	END
	