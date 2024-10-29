Funcion numeroMayor <- MayorQue ( n1, n2 )
	Si n1>=n2 Entonces
		Si n1==n2 Entonces
			numeroMayor = 1
		SiNo
			numeroMayor = 2
		Fin Si
	SiNo
		numeroMayor = 3
	Fin Si
Fin Funcion

Algoritmo E18_MayorQue
	
	Escribir "Inserta dos números"
	Leer n1, n2
	
	respuestaFuncion = MayorQue(n1,n2)
	
	Segun respuestaFuncion Hacer
		1:
			Escribir "Son iguales"
		2:
			Escribir n1," es mayor que ", n2
		3:
			Escribir n2," es mayor que ",  n1
		De Otro Modo:
			Escribir "Eror"
	Fin Segun
	
	
	
	
	

	
FinAlgoritmo
