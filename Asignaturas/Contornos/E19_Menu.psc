Funcion  mostrarMenu 
	Escribir "1. Iniciar sesion"
	Escribir "2. Listar viajes"
	Escribir "3. Cerrar sesión"
	Escribir "Elige una opción: "
	
Fin Funcion

Funcion opcionUsuario <- menu 
	
	Repetir
		mostrarMenu
		
		Leer opcionUsuario
	Hasta Que opcionUsuario == 1 o opcionUsuario==2 o opcionUsuario==3
	
	
Fin Funcion

Algoritmo E19_Menu
	

	option = menu
	Escribir "La opción elegida es: ", option
	
FinAlgoritmo
