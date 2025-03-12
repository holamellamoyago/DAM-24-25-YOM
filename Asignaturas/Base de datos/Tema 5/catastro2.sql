USE CATASTRO;
-- 32. Obt�n el nombre y apellidos de las personas que poseen una vivienda unifamiliar.

SELECT NOMBRE, APELLIDO1, APELLIDO2 
	FROM PROPIETARIO P INNER JOIN CASAPARTICULAR CP ON P.DNI = CP.DNIPROPIETARIO

-- 33. Haz una consulta que muestre la zona, n�mero de parques, calle, n�mero y metros de solar de las viviendas que se encuentran en una zona que posea m�s de un parque .

-- �sI QUIERO MOSTRAR NOMBREZONA?

SELECT DISTINCT NUMPARQUES, CALLE, NUMERO , METROSSOLAR FROM VIVIENDA V INNER JOIN ZONAURBANA Z
		ON V.NOMBREZONA = Z.NOMBREZONA
	WHERE Z.NUMPARQUES > 1 

-- 34. Haz una consulta que muestre para cada vivienda unifamiliar la calle, n�mero, plantas, metros del solar y metros construidos.

SELECT CASAPARTICULAR.CALLE , CASAPARTICULAR.NUMERO, METROSSOLAR FROM VIVIENDA V JOIN CASAPARTICULAR C
	ON V.CALLE = C.CALLE AND V.NUMERO = C.NUMERO
	



