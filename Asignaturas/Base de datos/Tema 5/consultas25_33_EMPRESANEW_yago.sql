-- 25
SELECT e.Nome, e.Apellido1, e.Apellido2, d.NomeDepartamento
FROM EMPREGADO e
JOIN EMPREGADOFIXO ef ON e.NSS = ef.NSS
JOIN DEPARTAMENTO d ON e.NumDepartamento = d.NumDepartamento
WHERE ef.Salario = (SELECT MIN(Salario) FROM EMPREGADOFIXO);

-- 26
SELECT e.NSS, e.Nome, e.Apellido1, COUNT(f.Numero) AS NumFillos
FROM EMPREGADO e
JOIN FAMILIAR f ON e.NSS = f.NSS
WHERE f.Parentesco IN ('Hijo', 'Hija') 
AND (YEAR(CURRENT_DATE) - YEAR(f.Data_madimento) > 40
GROUP BY e.NSS, e.Nome, e.Apellido1
HAVING SUM(YEAR(CURRENT_DATE) - YEAR(f.Data_madimento)) > 40;

-- 27
SELECT d.NomeDepartamento, e.Nome, e.Apellido1, e.Apellido2
FROM EMPREGADO e
JOIN DEPARTAMENTO d ON e.NumDepartamento = d.NumDepartamento
LEFT JOIN EMPREGADO jefe ON e.NSS_Supervisa = jefe.NSS
WHERE (e.Nome LIKE 'J%' OR e.Nome LIKE 'M%' OR e.Nome LIKE 'R%') AND SUBSTRING(e.Nome, 2, 1) = 'A'
   OR (jefe.Apellido1 LIKE 'V%' AND LENGTH(jefe.Apellido1) = 6);

-- 28
SELECT DISTINCT p.Lugar
FROM PROXECTO p
JOIN EMPREGADO_PROXECTO ep ON p.NumProyecto = ep.NumProyecto
JOIN EMPREGADO e ON ep.NSSEmpregado = e.NSS
WHERE e.NumDepartamento = 1;

-- 29
SELECT SUM(ef.Salario) AS TotalAPagar
FROM EMPREGADOFIXO ef
JOIN EMPREGADO e ON ef.NSS = e.NSS
WHERE e.NumDepartamento = 2;

-- 30
SELECT Nome, Apellido1, Apellido2
FROM EMPREGADO
WHERE NSS IN (SELECT NSS FROM EMPREGADOFIXO)
ORDER BY Data_Nacimiento ASC
LIMIT 1;

-- 31
SELECT e.Sexo, 
       AVG(ef.Salario) AS SalarioMedio, 
       MIN(ef.Salario) AS SalarioMinimo, 
       MAX(ef.Salario) AS SalarioMaximo
FROM EMPREGADO e
JOIN EMPREGADOFIXO ef ON e.NSS = ef.NSS
WHERE e.NSS NOT IN (SELECT NSSDirector FROM DEPARTAMENTO)
GROUP BY e.Sexo;

-- 32
SELECT DISTINCT p.NormeProyecto
FROM PROXECTO p
JOIN EMPREGADO_PROXECTO ep ON p.NumProyecto = ep.NumProyecto
JOIN EMPREGADOTEMPORAL et ON ep.NSSEmpregado = et.NSS
WHERE et.CosteHora IS NULL;

-- 33
SELECT e.Nome, e.Apellido1, e.Apellido2
FROM EMPREGADO e
JOIN FAMILIAR f ON e.NSS = f.NSS
WHERE f.Parentesco IN ('Hijo', 'Hija')
GROUP BY e.NSS, e.Nome, e.Apellido1, e.Apellido2
HAVING COUNT(f.Numero) > 1;