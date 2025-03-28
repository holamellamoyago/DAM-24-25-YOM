USE CATASTRO;

-- 42 
SELECT  MAX(H.PLANTA) AS [NUM MAX PLANTA] FROM PROPIETARIO P
	INNER JOIN PISO H ON H.DNIPROPIETARIO = P.DNI
	WHERE P.NOMBRE LIKE'M%'
	
-- 43 
SELECT SUM(NUMPARQUES) AS [TOTAL PARQUES] FROM ZONAURBANA

-- 44 
SELECT MAX(METROSSOLAR) AS [TAMA�O MAXIMO] FROM VIVIENDA

-- 45
SELECT MAX(PLANTA) AS [PLANTA M�XIMA DAMASCO] FROM PISO
	WHERE CALLE ='DAMASCO'
	
-- 46
SELECT MIN(METROSUTILES) AS [TAM��O MINIMO] , MAX(METROSUTILES) AS [TAM MAX] FROM PISO
	WHERE CALLE='Luca de Tena' AND NUMERO='22'
	
SELECT * FROM PISO

-- 47
SELECT AVG(CAST(NUMPARQUES AS FLOAT)) AS  [MEDIA DE PARQUES] FROM ZONAURBANA

-- 48 
SELECT COUNT(TIPOVIVIENDA) AS [VIVIENDAS UNIFAMILIARES] FROM VIVIENDA
	WHERE TIPOVIVIENDA='CASA'

SELECT * FROM VIVIENDA

-- 49
SELECT CAST(AVG(1.0*METROSCONSTRUIDOS)AS DECIMAL(8,2)) AS [MEDIA DE METROS CASAPARTICULAR] FROM CASAPARTICULAR

-- 50
SELECT COUNT(TIPOVIVIENDA) AS [BLOQUES EN X QUE PASAN DE 300M]FROM VIVIENDA
	WHERE TIPOVIVIENDA = 'BLOQUE' AND METROSSOLAR > 300
		AND (NOMBREZONA='CENTRO' OR NOMBREZONA='CUATROVIENTOS')

-- 51

SELECT DISTINCT COUNT(CP.DNIPROPIETARIO) AS [NUM PROPI] FROM PROPIETARIO P 
	INNER JOIN CASAPARTICULAR CP ON P.DNI = CP.DNIPROPIETARIO

-- 52
SELECT DISTINCT COUNT(DNI) FROM PROPIETARIO P
	INNER JOIN HUECO H ON DNI = DNIPROPIETARIO
	INNER JOIN VIVIENDA V ON H.CALLE = V.CALLE AND H.NUMERO = V.NUMERO
	
	WHERE SEXO='M' AND (V.NOMBREZONA='PALOMAR' OR V.NOMBREZONA='CENTRO')

--53 
SELECT NOMBREZONA, COUNT(TIPOVIVIENDA) FROM VIVIENDA
	GROUP BY NOMBREZONA
	
-- 54
SELECT NOMBREZONA, COUNT(TIPOVIVIENDA) AS [BLOQUES DE PISOS] FROM VIVIENDA
	WHERE TIPOVIVIENDA='BLOQUE'
	GROUP BY NOMBREZONA
	
SELECT * FROM VIVIENDA

-- 55
SELECT DISTINCT BP.CALLE, BP.NUMERO , NUMPISOS, MAX(PLANTA) AS [ALT MAX]
	
	FROM BLOQUEPISOS BP
	INNER JOIN PISO P ON P.CALLE = BP.CALLE AND P.NUMERO = BP.NUMERO
	
	GROUP BY BP.CALLE, BP.NUMERO, NUMPISOS
	
-- 56
SELECT CALLE, NUMERO FROM BLOQUEPISOS
	WHERE NUMPISOS > 4
	
-- 57
SELECT MIN(METROSUTILES) AS [MEN MIN] , MAX(METROSUTILES) AS [MEN MAX]
	FROM PISO P
	INNER JOIN VIVIENDA V ON P.CALLE=V.CALLE AND P.NUMERO = V.NUMERO
	WHERE V.NOMBREZONA='CENTRO'

-- 58
SELECT CALLE,COUNT(CODIGO) AS HUECOS FROM HUECO H
	GROUP BY CALLE, NUMERO
	

	
	
--59
SELECT COUNT(NUMPISOS) FROM  BLOQUEPISOS BP
	INNER JOIN VIVIENDA V ON V.CALLE = BP.CALLE AND V.NUMERO = BP.NUMERO
	INNER JOIN PISO P ON P.CALLE = V.CALLE AND P.NUMERO = V.NUMERO
	WHERE (V.NOMBREZONA='CENTRO' OR V.NOMBREZONA='PALOMAR') 
		AND NUMHABITACIONES > 3
		AND METROSUTILES BETWEEN 100 AND 180
		
SELECT COUNT(P.CALLE + CAST(P.NUMERO AS VARCHAR(20))) AS [NUMERO DE BLOQUES]
	FROM PISO P
	WHERE CALLE+CAST(NUMERO AS VARCHAR(4)) IN
		(SELECT CALLE+CAST(NUMERO AS VARCHAR(4)) FROM VIVIENDA 
			WHERE NOMBREZONA IN ('CENTRO','PALOMAR'))
		AND NUMHABITACIONES > 3
		AND METROSUTILES BETWEEN 100 AND 180
		
-- 60 
SELECT CP.CALLE,COUNT(NUMPLANTAS) AS VIVIENDAS, SUM(V.METROSSOLAR) AS [TOTAL METROS]
	FROM CASAPARTICULAR CP
	INNER JOIN VIVIENDA V ON V.CALLE=CP.CALLE AND CP.NUMERO= V.NUMERO
	WHERE NUMPLANTAS IN (1,2)
	GROUP BY CP.CALLE
	HAVING SUM(V.METROSSOLAR) > 250
	
-- 61
SELECT Z.NOMBREZONA, Z.DESCRIPCI�N, Z.NUMPARQUES, COUNT(NUMHABITACIONES) AS [NUM PISOS]
	FROM PISO P
	INNER JOIN VIVIENDA V ON P.CALLE = V.CALLE AND P.NUMERO=V.NUMERO
	INNER JOIN ZONAURBANA Z ON V.NOMBREZONA = Z.NOMBREZONA
	WHERE P.NUMHABITACIONES LIKE '[34]'
	GROUP BY Z.NOMBREZONA, Z.DESCRIPCI�N, Z.NUMPARQUES
	ORDER BY NUMPARQUES DESC
	
-- 62 
SELECT DISTINCT(SELECT COUNT(SEXO) FROM PROPIETARIO WHERE SEXO='H') AS HOMBRES,
(SELECT COUNT(SEXO) FROM PROPIETARIO WHERE SEXO='M') AS MUJERES
	FROM PROPIETARIO


SELECT * FROM PROPIETARIO
SELECT SEXO = CASE SEXO 
				WHEN 'H' THEN 'HOMBRES'
				ELSE 'MUJERES'
				END,
		COUNT(*) AS NUMERO 
	FROM PROPIETARIO P INNER JOIN PISO PI ON PI.DNIPROPIETARIO = P.DNI
	GROUP BY SEXO

