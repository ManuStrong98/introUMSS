Algoritmo serie2
    // Serie para valores 987654...
	Definir acumulador Como Entero
	acumulador = 1
	i = 1
	
	repetir
		operacion = acumulador * 8 + i
		escribir operacion
		i = i + 1
		acumulador = acumulador * 10 + i
	hasta que i = 10
FinAlgoritmo
