Funcion MostrarMenuIniciado
	Escribir "1. Mis viajes"
	Escribir "2. Crear viaje"
	Escribir "3. Cerrar sesion"
	Escribir "0. SALIR"
	
	Leer OpcionEscogida
	
	Segun OpcionEscogida Hacer
		0:
			Escribir "Programa cerrado"		
		1:
			Escribir "Tus viajes son: "
			MostrarMenuIniciado
		2:
			Escribir "Crear viaje...."
			MostrarMenuIniciado
		3:
			Escribir "sesión cerrada"
			MostrarMenuPrincipal
		De Otro Modo:
			MostrarMenuIniciado
	Fin Segun
	
	
Fin Funcion

Funcion IniciarSesion 
	
	Repetir
		Escribir "Introduce usuario"
		Leer usuario
		Escribir "Introduce contraseña"
		leer contraseña 
	Hasta Que usuario == "admin" y contraseña == "abc123."
	
	
	Escribir "Sesion iniciada"
	MostrarMenuIniciado
	
Fin Funcion

Funcion  MostrarMenuPrincipal
	Escribir "1. Iniciar sesión"
	Escribir "2. Listar Viajes"
	Escribir "0.SALIR"
	
	Leer OpcionEscogida
	
	Segun OpcionEscogida Hacer
		0:
			Escribir "Chao"
		1:
			IniciarSesion
		2:
			Escribir "Viajes:"
			MostrarMenuPrincipal
		De Otro Modo:
			MostrarMenuPrincipal
	Fin Segun
	
Fin Funcion





Algoritmo E20_Menu_SubMenu
	MostrarMenuPrincipal

	
	
	
FinAlgoritmo
