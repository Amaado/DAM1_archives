Algoritmo Ejerc2_3
	Escribir("Ingrese un n�mero entero positivo: ")
	Leer num 
	
	Si num > 0 Entonces
		esPrimo = Verdadero
		
		Para divisor desde 2 hasta num/2 Hacer
			Si num MOD divisor = 0 Entonces
				esPrimo = Falso
			Fin Si
		Fin Para
		
		Si esPrimo Entonces
			Escribir num, " es un n�mero primo."
		SiNo
			Escribir num, " no es un n�mero primo."
		Fin Si
		
	Sino
		Escribir("Ingrese un n�mero entero positivo.")
Fin Si
FinAlgoritmo
