Algoritmo  E02CalculoAreaTerreno2
	Escribir  "Dame el valor de R"
	Leer R
	
	Escribir  "Dame el valor de H"
	Leer H
	
	
	areaSemiCirculo <- PI * R^2 / 2 
	
	areaTriangulo <- R * 2 * raiz(h^2 + r^2)
	
	areaTerreno <- areaSemiCirculo + areaTriangulo
	
	Escribir areaTerreno
	
FinAlgoritmo
	