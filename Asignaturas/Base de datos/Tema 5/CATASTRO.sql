use CATASTRO


-- 1. SELECT NOMBREZONA, DESCRIPCI�N, observaciones FROM ZONAURBANA;

-- 2.
--SELECT CALLE, NUMERO, NUMPLANTAS FROM CASAPARTICULAR

-- 3.
--SELECT CALLE, NUMERO, METROSCONSTRUIDOS FROM CASAPARTICULAR WHERE PISCINA ='S'

-- 4.
--SELECT CALLE, NUMERO, METROSSOLAR  FROM VIVIENDA 
--	WHERE TIPOVIVIENDA='UNIFAMILIAR'

--5.
--SELECT * FROM PISO WHERE NUMHABITACIONES = 5;

-- 6.
--SELECT CALLE, NUMERO , METROSSOLAR FROM VIVIENDA 
--	WHERE METROSSOLAR BETWEEN 190 AND 300

--7.
--SELECT * FROM BLOQUEPISOS WHERE NUMPISOS > 15 
--	ORDER BY CALLE, NUMERO

-- 8.
--SELECT CALLE, NUMERO,METROSSOLAR FROM VIVIENDA
--	WHERE NOMBREZONA ='CENTRO'

-- 9.
--SELECT DNI, NOMBRE, APELLIDO1, APELLIDO2 FROM PROPIETARIO 
--	WHERE APELLIDO1 = 'L�pez'
--		ORDER BY APELLIDO1 , APELLIDO2 , NOMBRE

-- 10.
--SELECT CALLE, NUMERO, METROSSOLAR FROM VIVIENDA
--	WHERE (NOMBREZONA = 'CENTRO' OR NOMBREZONA='PALOMAR')
--		AND METROSSOLAR > 450

-- 11.
--SELECT CALLE, NUMERO, ID_HUECO FROM HUECO
--	WHERE TIPO='GARAJE' AND DNIPROPIETARIO ISNULL
	
--SELECT * FROM HUECO
	--WHERE DNIPROPIETARIO IS NULL
	--ORDER BY CALLE, NUMERO, ID_HUECO

-- 12.
--SELECT  NOMBREZONA, DESCRIPCI�N FROM ZONAURBANA
--	WHERE NUMPARQUES>1
--	ORDER BY NUMPARQUES DESC, NOMBREZONA ASC

-- 13.
--SELECT * FROM ZONAURBANA WHERE OBSERVACIONES IS NOT NULL

-- 14.
--SELECT DNI, NOMBRE , APELLIDO1, APELLIDO2 FROM PROPIETARIO
--	WHERE LEN(NOMBRE) > 3
--	ORDER BY NOMBRE, APELLIDO1, APELLIDO2

-- 15. 
--SELECT CALLE, NUMERO, PLANTA, PUERTA, METROSCONSTRUIDOS, METROSUTILES, METROSCONSTRUIDOS - METROSUTILES AS --DIFMETROS FROM PISO	
--	ORDER BY DIFMETROS

-- 16. 
--SELECT CALLE, NUMERO, PLANTA, NUMHABITACIONES FROM PISO
--	WHERE NUMHABITACIONES IN (1,3,5,6)

-- 17.
SELECT *, METROSCONSTRUIDOS - METROSUTILES AS [DIFERENCIA metros] FROM PISO
	WHERE METROSCONSTRUIDOS - METROSUTILES > 10

-- 18. NO FUNCIONA
SELECT NOMBREZONA, NUMPARQUES FROM ZONAURBANA
	WHERE NUMPARQUES < 3 AND DESCRIPCI�N IS NULL

--19 . 
SELECT * FROM PISO
	WHERE CALLE LIKE 'L%' AND METROSUTILES < 100

SELECT NOMBREZONA FROM VIVIENDA
	ORDER BY NOMBREZONA DESC

-- 21.
SELECT TOP 25 PERCENT WITH TIES * FROM PISO
	ORDER BY NUMHABITACIONES DESC

-- 22.
SELECT CODIGO, CALLE, NUMERO, TIPO, COALESCE(DNIPROPIETARIO, 'DESCONOCIDO') AS DNIPROPIETARIO 
	FROM HUECO
		WHERE METROS >= 14

-- 23.
SELECT NOMBRE, APELLIDO1, APELLIDO2 FROM PROPIETARIO
	WHERE NOMBRE NOT LIKE '[A,B,C,D]'
	OR LEN(APELLIDO1) < 4
	
	ORDER BY SEXO
	
-- 24.
SELECT * FROM VIVIENDA
	WHERE (CALLE LIKE 'DAMASCO'
		OR 
		CALLE LIKE 'General Mola')
		
		AND METROSSOLAR LIKE '2%'
		
SELECT * FROM VIVIENDA

-- 25.
SELECT NOMBRE, APELLIDO1, SEXO, 
		SEXO + SUBSTRING(NOMBRE, 1, 3) + SUBSTRING(APELLIDO1, LEN(APELLIDO1) -1, 2) 
	
	FROM PROPIETARIO

-- 26.
SELECT * FROM HUECO
	WHERE CALLE LIKE 'SOL' OR CALLE LIKE '%TENA'

-- 27.
SELECT TOP 5 WITH TIES* FROM HUECO
	ORDER BY METROS ASC

-- 28.
SELECT  REVERSE(NOMBRE) FROM PROPIETARIO
	WHERE SEXO='M'

-- 29.
SELECT ISNULL(CODIGO, '') AS CODIGO, CALLE , TIPO, METROS, FLOOR(METROS) FROM HUECO

-- 30.
SELECT DISTINCT UPPER(SUBSTRING(TIPO, 1, 1)) + LOWER(SUBSTRING(TIPO, 2, LEN(TIPO))) FROM HUECO

-- 31.
SELECT NOMBRE, APELLIDO1, APELLIDO2 ,
	CASE
		WHEN SEXO = 'H' THEN 'MASCULINO'
		WHEN SEXO = 'M' THEN 'FEMENINO'
	END

 FROM PROPIETARIO