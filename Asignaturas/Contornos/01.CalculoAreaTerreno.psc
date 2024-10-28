Algoritmo CalculoAreaTerreno
	Escribir 'Introduce el lado A de tu terreno'
	Leer ladoA
	Escribir 'Introduce el lado B de tu terreno'
	Leer ladoB
	Escribir 'Introduce el lado C de tu terreno'
	Leer ladoC
	
	
	areaRectangulo <- ladoC*ladoB
	areaTriangulo <- ladoB * (ladoA - ladoC) / 2
	
	areaTerreno <- areaRectangulo + areaTriangulo
	
	Escribir "El área del terreno es: " areaTerreno
	
	
	Escribir AREA
FinAlgoritmo
