Algoritmo decimalOctal
	Definir decimal Como Entero
	Definir octal Como Entero
	Definir mul Como Entero
	
	mul = 1
	octal = 0
	
	Escribir "Introduzca un numero en decimal"
	Leer decimal
	
	aux = decimal
	
	Mientras aux <> 0
		digito = aux mod 8
		octal = digito * mul + octal
		mul = mul * 10
		aux = trunc(aux / 8)
	FinMientras
	
	escribir octal
FinAlgoritmo
