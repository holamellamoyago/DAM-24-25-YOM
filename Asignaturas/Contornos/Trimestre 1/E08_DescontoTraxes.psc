Algoritmo E08_DescontoTraxes
	Escribir 'Escribe el precio que te cuesta'
	Leer precio
	Si precio>250 Entonces
		descuento <- precio*15/100
		precioFinal <- precio-descuento
	SiNo
		descuento <- precio*8/100
		precioFinal <- precio-descuento
	FinSi
	Escribir 'El traje tiene un descuento de ', descuento, 'por lo que cuesta', precioFinal
FinAlgoritmo
