Algoritmo E15_Sumar_N_Numeros
	
	suma <- 0 
	Escribir "Cuantos numeros quieres sumar"
	Leer totalNumeros
	
	
	Para i<-1 Hasta totalNumeros Con Paso 1 Hacer
		Escribir "Numero a sumar: "
		leer numero
		suma <- suma + numero
	Fin Para
	Escribir "La suma total es: " suma
FinAlgoritmo
