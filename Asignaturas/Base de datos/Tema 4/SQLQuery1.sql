USE Empresa_Clase;

SELECT NOMBRE, Localidad, Sexo FROM EMPLEADO WHERE Localidad = 'vigo' OR Localidad =  'lugo' AND Sexo = 'M';
