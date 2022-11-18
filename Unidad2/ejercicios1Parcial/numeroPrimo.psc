Algoritmo numeroPrimo
	Definir num Como Entero
	Escribir "Introduzca un numero"
	Leer num
	
	Si num = 1 Entonces
		Escribir "No es primo"
	sino
		contador = 2
		esPrimo = Verdadero
		//raizCuadrada = raiz(num)
		
		//Mientras contador <= raizCuadrada y esPrimo = Verdadero
		Mientras contador * contador <= num y esPrimo = Verdadero
			si num mod contador = 0 Entonces
				esPrimo = Falso
			FinSi
			contador = contador + 1
		FinMientras
		
		Si esPrimo Entonces
			Escribir "Es primo"
		SiNo
			Escribir "No es primo"
		FinSi
	finsi
	
FinAlgoritmo
