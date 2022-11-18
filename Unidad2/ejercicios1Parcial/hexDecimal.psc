Algoritmo hexresultado
	
	hex = "1f"
	
	resultado = 0
	mul = 1
	long = longitud(hex)
	
	para i = 0 hasta long - 1
		digit = subcadena(hex, long - i, long - i)
		
		segun digit
			"a":
				resultado = resultado + 10 * mul
			"b":
				resultado = resultado + 11 * mul
			"c":
				resultado = resultado + 12 * mul
			"d":
				resultado = resultado + 13 * mul
			"e":
				resultado = resultado + 14 * mul
			"f":
				resultado = resultado + 15 * mul
			De Otro Modo:
				resultado = resultado + ConvertirANumero(digit) * mul
		FinSegun
		
		mul = mul * 16
		aux = trunc(aux / 10)
	finpara
	
	escribir resultado

FinAlgoritmo
