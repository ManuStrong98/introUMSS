Algoritmo sumaPorDigito
	num1 = 9999
	num2 = 9999
	
	aux1 = num1
	aux2 = num2
	mul = 1
	resultado = 0
	llevar = 0
	
	mientras aux1 <> 0 o llevar <> 0
		dig1 = aux1 % 10
		dig2 = aux2 % 10
		
		res = dig1 + dig2 + llevar
		
		si res > 9
			res = res % 10
			llevar = 1
		sino
			llevar = 0
		FinSi
		
		aux1 = trunc(aux1 / 10)
		aux2 = trunc(aux2 / 10)
		
		resultado = res * mul + resultado
		mul = mul * 10
	FinMientras
	
	Escribir resultado
FinAlgoritmo
