Algoritmo decimalBinario
	Definir decimal Como Entero
	Definir aux, digito Como Entero
	Definir res, digitoCadena Como Cadena
	Escribir "Introduzca una variable en sistema decimal"
	Leer decimal
	
	aux = decimal
	res = ""
	
	Mientras aux > 0
		digito = aux mod 16
		
		Si digito >= 10 Entonces
			Segun digito Hacer
				10:
					digitoCadena = "a"
				11:
					digitoCadena = "b"
				12:
					digitoCadena = "c"
				13:
					digitoCadena = "d"
				14:
					digitoCadena = "e"
				15:
					digitoCadena = "f"
			FinSegun
		SiNo
			digitoCadena = ConvertirATexto(digito)
		FinSi
		
		res = digitoCadena + res
		aux = trunc(aux / 16)
	FinMientras
	
	Escribir res
	
FinAlgoritmo
