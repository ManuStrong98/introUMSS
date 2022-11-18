Algoritmo serieTriangulo
	//Triangulo
	
	tri = 1
	cont = 1
	
	para i = 0 hasta 9
		cont = i
		switch = 0
		para j = 1 hasta i * 2 + 1
			
			si cont >= i * 2 + 1
				switch = 1
			FinSi
			
			si switch = 0
				cont = cont + 1
			sino
				cont = cont - 1
			FinSi
			
			escribir cont % 10 Sin Saltar
		FinPara
		escribir ""
	FinPara
FinAlgoritmo
