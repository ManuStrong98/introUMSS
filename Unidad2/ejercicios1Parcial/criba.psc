Algoritmo ejercicio12Criba
	Escribir "Introduzca un numero"
	Leer num
	
	aux = 2
	
	Definir arreglo Como Entero
	Dimension arreglo[num]
	
	Para indice = 1 Hasta num - 1
		arreglo[indice] = aux
		aux = aux + 1
	FinPara
	
	indice = 1
	switch = 0
	
	//mientras arreglo[contador] <= raiz(num)
	mientras arreglo[indice] * arreglo[indice] <= num
		val = arreglo[indice]
		
		para desp = indice + val hasta num con paso val
			arreglo[desp] = 0
		FinPara
		
		indice = indice + 1
		
		si arreglo[indice] = 0
			mientras arreglo[indice] = 0 y indice <= num
				indice = indice + 1
			FinMientras
		FinSi
		
	FinMientras
	
	para i = 1 hasta num
		si arreglo[i] <> 0
			Escribir arreglo[i]
		FinSi
	FinPara
FinAlgoritmo
