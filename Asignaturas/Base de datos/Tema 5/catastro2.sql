USE CATASTRO;
-- 32. Obtén el nombre y apellidos de las personas que poseen una vivienda unifamiliar.

SELECT NOMBRE, APELLIDO1, APELLIDO2 
	FROM PROPIETARIO P INNER JOIN CASAPARTICULAR CP ON P.DNI = CP.DNIPROPIETARIO

-- 33. Haz una consulta que muestre la zona, número de parques, calle, número y metros de solar de las viviendas que se encuentran en una zona que posea más de un parque .

-- ¿sI QUIERO MOSTRAR NOMBREZONA?

SELECT DISTINCT NUMPARQUES, CALLE, NUMERO , METROSSOLAR FROM VIVIENDA V INNER JOIN ZONAURBANA Z
		ON V.NOMBREZONA = Z.NOMBREZONA
	WHERE Z.NUMPARQUES > 1 

-- 34. Haz una consulta que muestre para cada vivienda unifamiliar 
--la calle, número, plantas, metros del solar y metros construidos.

SELECT C.CALLE , C.NUMERO ,METROSSOLAR 
	FROM VIVIENDA V INNER JOIN CASAPARTICULAR C
	
	ON V.CALLE = C.CALLE AND V.NUMERO = C.NUMERO


-- 35. Obtén el nombre y descripción de las zonas urbanas que tienen más de 
-- 2 parques donde se hayan construido bloques de pisos.

SELECT DISTINCT Z.NOMBREZONA, Z.DESCRIPCIÓN FROM ZONAURBANA Z
	INNER JOIN VIVIENDA V ON Z.NOMBREZONA = V.NOMBREZONA
	
	WHERE NUMPARQUES > 2 AND V.TIPOVIVIENDA = 'BLOQUE'
	
-- 36. Haz una consulta que muestre para cada piso la calle, número, planta, 
--puerta, número de habitaciones, metros útiles, nombre de zona, número de 
--parques existentes en la zona y nombre y apellidos del propietario.

SELECT DISTINCT P.CALLE, P.NUMERO, PLANTA , PUERTA , NUMHABITACIONES , METROSUTILES, 
	Z.NOMBREZONA, NUMPARQUES, NOMBRE, APELLIDO1 , APELLIDO2 
	
	FROM (PISO P INNER JOIN PROPIETARIO PRO ON P.DNIPROPIETARIO = PRO.DNI)
			INNER JOIN VIVIENDA V ON P.CALLE = V.CALLE AND P.NUMERO = V.NUMERO
			INNER JOIN ZONAURBANA Z ON V.NOMBREZONA = Z.NOMBREZONA
			
-- 37. Haz una consulta que muestre el nombre y apellidos de las mujeres que 
		--tienen bodegas de más de 9 metros cuadrados.
SELECT NOMBRE, APELLIDO1, APELLIDO2 FROM PROPIETARIO P
	INNER JOIN HUECO H ON P.DNI = H.DNIPROPIETARIO
	
	WHERE P.SEXO = 'M' AND H.METROS > 9 AND TIPO='BODEGA'
	

--38. Haz una consulta que devuelva DNI, nombre y apellidos de las mujeres que poseen
	-- una vivienda unifamiliar.
	
SELECT DNI , NOMBRE , APELLIDO1, APELLIDO2 FROM PROPIETARIO P 
	INNER JOIN CASAPARTICULAR CP ON P.DNI = CP.DNIPROPIETARIO
	
	WHERE P.SEXO = 'M'

-- 39. Haz una consulta que muestre los pisos (toda la información de la tabla piso) 
	--y el nombre completo de los propietarios que se encuentran en una zona con 
	--dos parques que tienen entre 2 y 4 habitaciones o que se encuentran en la zona 
	--Centro, con ascensor y que tienen más de 70 y menos de 110 metros cuadrados útiles.
	
SELECT P.*, NOMBRE + ' ' + APELLIDO1 + ' ' + APELLIDO2 AS [NOMBRE COMPLETO]  
	FROM PISO P INNER JOIN PROPIETARIO PRO ON P.DNIPROPIETARIO = PRO.DNI
				INNER JOIN VIVIENDA V ON P.CALLE = V.CALLE AND P.NUMERO = V.NUMERO
				INNER JOIN ZONAURBANA ZU ON V.NOMBREZONA = ZU.NOMBREZONA
				INNER JOIN BLOQUEPISOS BP ON BP.CALLE = P.CALLE AND P.CALLE = BP.CALLE
				
	WHERE (ZU.NUMPARQUES > 2 AND P.NUMHABITACIONES BETWEEN 2 AND 4 ) 
		OR(ZU.NOMBREZONA = 'CENTRO' AND BP.ASCENSOR ='S' AND METROSUTILES BETWEEN 70 AND 110)

-- 40. Haz una consulta que muestre el nombre en minúsculas y las viviendas 
	--unifamiliares de una planta, que poseen los hombres de los cuales tenemos teléfono.

-- 41. Haz una consulta que muestre las viviendas (calle, numero y tipovivienda) 
	--y la zona urbana en la que se encuentran (nombrezona y descripción). 

	
	


	



