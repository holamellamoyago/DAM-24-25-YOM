Funcion  mostrarMenu 
	Escribir "1. Iniciar sesion"
	Escribir "2. Listar viajes"
	Escribir "3. Cerrar sesi�n"
	Escribir "Elige una opci�n: "
	
Fin Funcion

Funcion opcionUsuario <- menu 
	
	Repetir
		mostrarMenu
		
		Leer opcionUsuario
	Hasta Que opcionUsuario == 1 o opcionUsuario==2 o opcionUsuario==3
	
	
Fin Funcion

Algoritmo E19_Menu
	

	option = menu
	Escribir "La opci�n elegida es: ", option
	
FinAlgoritmo
