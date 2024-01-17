Algoritmo Ejerc2_5
	mayor = NULO
	menor = NULO
	suma = 0
	
	Repetir
		Escribir "Ingrese un valor numérico (o 00 para salir): "
		Leer valor
		
		Si valor <> "00" Entonces
			numero = ConvertirANumero(valor)
			
			suma = suma + numero
			
			Si mayor = NULO O numero > mayor Entonces
				mayor = numero
			Fin Si
			
			Si menor = NULO O numero < menor Entonces
				menor = numero
			Fin Si
		Fin Si
	Hasta que valor = "00"
	
	Escribir "Suma de los valores: ", suma
	Escribir "Mayor valor ingresado: ", mayor
	Escribir "Menor valor ingresado: ", menor
FinAlgoritmo