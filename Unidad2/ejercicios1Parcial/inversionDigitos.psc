Algoritmo inversionDigitos
	n = 1234
	mul = 1
	
	aux = n
	res = 0
	
	mientras aux <> 0
		dig = aux % 10
		res = res * 10 + dig
		aux = trunc(aux / 10)
	FinMientras
	
	Escribir res
	
FinAlgoritmo
