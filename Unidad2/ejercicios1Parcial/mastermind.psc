
Algoritmo mastermind
	//Mastermind
	
	definir secreto como entero
	definir tanteo como entero
	
	escribir "Numero secreto"
	leer secreto
	
	mientras aciertos <> 4
		aciertos = 0
		semiaciertos = 0
		
		escribir "Tanteo"
		leer tanteo
		
		auxSecreto = secreto
		auxTanteo = tanteo
		
		contTanteo = 1
		
		mientras auxTanteo <> 0
			digitoTanteo = auxTanteo % 10
			
			contSecreto = 1
			
			aux = auxSecreto
			
			si digitoTanteo = aux % 10
				aciertos = aciertos + 1
			SiNo
				aux = secreto
				
				repetir 
					digito = aux % 10
					
					si digito = digitoTanteo
						tanteos = tanteos + 1
					FinSi
					
					aux = trunc(aux / 10)
				Hasta Que aux = 0 o digitoTanteo = digito
			FinSi
			
			auxSecreto = trunc(auxSecreto / 10)
			auxTanteo = trunc(auxTanteo / 10)
			
		FinMientras
		
		escribir "Aciertos " + ConvertirATexto(aciertos) + " tanteos " + ConvertirATexto(tanteos)
		
		si aciertos < 4
			escribir "Vuelve a intentar"
		FinSi
	FinMientras
	
FinAlgoritmo
