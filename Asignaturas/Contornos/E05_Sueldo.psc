Algoritmo E05_Sueldo
	Escribir "¿Cuantas horas trabajas al día?"
	Leer horasDia
	
	Escribir "¿Cuanto te pagan por hora?"
	Leer pagoHora
	
	sueldoDia <- pagoHora * horasDia
	
	sueldoSemanal <- sueldoDia *7
	
	Escribir "El sueldo semanal es: ", sueldoSemanal
	
FinAlgoritmo
