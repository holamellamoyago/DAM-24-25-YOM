Algoritmo E09_Maior3
	Escribir "Escribe 3 numeros"
	Leer num1
	Leer num2
	Leer num3
	
	Si num1 > num2 Entonces
		Si num1 > num3 Entonces
			Escribir "El numero" num1 "Es el mayo de todos"
		SiNo
			Si num2 > num3 Entonces
				Escribir"el numero" num2 "es el mayor de todos bb"
			SiNo
				Escribir "El numero" num3 "es el mayor de todos aa"
				
			Fin Si
		Fin Si
	SiNo
		Si num2 > num3 Entonces
			Escribir"el numero" num2 "es el mayor de todos"
		SiNo
			Escribir "El numero" num3 "es el mayor de todos aa"
			
		Fin Si
	Fin Si
	
FinAlgoritmo
