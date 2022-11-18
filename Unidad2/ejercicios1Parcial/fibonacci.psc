Algoritmo ejercicio11
	n = 10
	
	a = 0
	b = 1
	c = 0
	
	cont = 1
	
	mientras cont <= n
		c = a + b
		b = a
		a = c
		
		escribir a
		cont = cont + 1
	FinMientras
FinAlgoritmo
