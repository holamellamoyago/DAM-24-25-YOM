USE EMPRESANEW;

--11._ Mostra unha relación de departamentos (nome) y persoal (nome completo) 
--asociados a este, ordeados por departamento e dentro deste por nome  
--completo en orden descendente.

SELECT DISTINCT D.NOMEDEPARTAMENTO AS [DEPARTAMENTO], 
E.Nome + E.APELIDO1 + ' ' + E.Apelido2 AS [NOME COMPLETO]
FROM DEPARTAMENTO D
	INNER JOIN EMPREGADO E ON D.NumDepartamento= E.NumDepartamentoPertenece
	
	ORDER BY D.NomeDepartamento ASC , [NOME COMPLETO] DESC
	
-- 12._ Selecciona todas as empregadas fixas que viven en Pontevedra, 
--Santiago ou Vigo ou aqueles empregados fixos que cobran máis de 3000 euros.

SELECT D.Nome, E.SALARIO FROM EMPREGADOFIXO E 
	INNER JOIN EMPREGADO D ON E.NSS = D.NSS
	WHERE D.Sexo = 'M' OR D.Sexo = 'H' AND E.Salario > 3000
	
--13._ Fai unha consulta que seleccione todas as empregadas 
--(NSS, nome e apelido1) que viven en Pontevedra ou Vigo e que teñen algún 
--familiar dado de alta na empresa.

SELECT E.NSS , E.NOME , E.APELIDO1 FROM EMPREGADO E
	INNER JOIN FAMILIAR F ON E.NSS = F.NSS_empregado
	
	WHERE E.Localidade IN ('Vigo', 'PONTEVEDRA')
	
SELECT * FROM EMPREGADO

--14._Fai unha relación (nome do departamento e nome completo do empregado e do 
--fillo/filla) de todos os empregados do departamento técnico ou de informática 
--e que son pais dun neno (de calquera sexo)..  

SELECT D.NOMEDEPARTAMENTO, 
		E.NOME + ' ' + E.APELIDO1 + ' ' + E.APELIDO2 AS [NOME COMPLETO EMPREGADO],
		F.NOME + ' ' + F.APELIDO1 + ' ' + F.APELIDO2 AS [NOME COMPLETO FILLO]
		
		FROM DEPARTAMENTO D INNER JOIN EMPREGADO E ON D.NumDepartamento = E.NumDepartamentoPertenece
				INNER JOIN FAMILIAR F ON E.NSS = F.NSS_empregado	
				
		WHERE F.Parentesco = 'HIJO'
		
--15._Fai unha consulta que amose o 20% dos homes que traballan no 
--departamento de Informática, Estadística ou Innovación.

SELECT TOP 20 PERCENT * FROM EMPREGADO 
	INNER JOIN DEPARTAMENTO D
		ON EMPREGADO.NumDepartamentoPertenece 
		 = D.NumDepartamento
		 
	WHERE Sexo = 'H' AND
		D.NomeDepartamento IN 
			('INFORMÁTICA', 'ESTADÍSTICA', 'INNOVACIÓN')
			
-- 16
SELECT E.*, EP.HORAS, EF.SALARIO FROM EMPREGADO E
	INNER JOIN EMPREGADO_PROXECTO EP ON E.NSS = EP.NSSEmpregado
	
	INNER JOIN EMPREGADOFIXO EF ON E.NSS = EF.NSS
	INNER JOIN DEPARTAMENTO D ON D.NSSDirector = E.NSS
	
	WHERE EF.Salario BETWEEN 1500 AND 3000
		AND D.NomeDepartamento IN
			('INFORMÁTICA' , 'TÉCNICO')
		AND YEAR(E.DataNacemento) < 1980
		
SELECT * FROM EMPREGADO