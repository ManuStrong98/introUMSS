Algoritmo binarioDecimal
	binario = 1011
	decimal = 0
	
	aux = binario
	cont = 0
	
	mientras aux <> 0
		digit = aux mod 10
		decimal = decimal + digit * 2 ^ cont
		cont = cont + 1
		aux = trunc(aux / 10)
	FinMientras
	
	escribir decimal
	
	//Alternativo
	
	decimal = 0
	aux = binario
	mul = 1
	
	mientras aux <> 0
		digit = aux mod 10
		decimal = decimal + digit * mul
		mul = mul * 2
		aux = trunc(aux / 10)
	FinMientras
	
	escribir decimal
FinAlgoritmo
