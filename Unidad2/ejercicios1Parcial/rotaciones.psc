Algoritmo ejercicio9
	//Cuadrado magico
	Definir mul, aux, n, rotaciones Como Entero
	
	Escribir "Introduzca un numero"
	Leer n
	
	Escribir "Definir el numero de rotaciones"
	Leer rotaciones
	
	mul = 1
	aux = n
	
	Mientras aux <> 0
		mul = mul * 10
		aux = trunc(aux / 10)
	FinMientras
	
	aux = n
	mul = mul / 10
	
	Para i = 1 Hasta rotaciones
		Escribir aux
		digito = aux % 10
		aux = mul * digito + trunc(aux / 10)
	FinPara
	
FinAlgoritmo
