Algoritmo serieUnos
	// Unos
	
	Definir acumulador Como Entero
	acumulador = 1
	i = 1
	
	repetir
		operacion = acumulador * 9 + i + 1
		escribir operacion
		i = i + 1
		acumulador = acumulador * 10 + i
	hasta que i = 9
FinAlgoritmo
