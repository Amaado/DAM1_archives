Algoritmo Ejerc2_4
	Escribir("Ingrese un n�mero entero positivo: ")
	Leer num
	
	Si num > 1 Entonces
		Escribir "N�meros primos entre 1 y ", num, ":"
		
		Para candidato desde 2 hasta num Hacer
			esPrimo = Verdadero
			
			Para divisor desde 2 hasta candidato/2 Hacer
				Si candidato MOD divisor = 0 Entonces
					esPrimo = Falso
				Fin Si
			Fin Para
			
			Si esPrimo Entonces
				Escribir(candidato)
			Fin Si
		Fin Para
		
	Sino
		Escribir("Ingrese un n�mero entero positivo mayor que 1.")
Fin Si
FinAlgoritmo
