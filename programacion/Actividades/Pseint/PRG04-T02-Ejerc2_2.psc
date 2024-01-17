Algoritmo Ejerc2_2
	Escribir("*************************")
	Escribir("* TABLAS DE MULTIPLICAR *")
	Escribir("*************************")
	
	Para multiplicando desde 0 hasta 10 Hacer
		Escribir "--------------"
		Escribir "TABLA DEL ", multiplicando
		Escribir "--------------"
		
		Para multiplicador desde 0 hasta 10 Hacer
			resultado = multiplicando * multiplicador
			Escribir multiplicando, " x ", multiplicador, " = ", resultado
		Fin Para
		
	Fin Para
FinAlgoritmo
