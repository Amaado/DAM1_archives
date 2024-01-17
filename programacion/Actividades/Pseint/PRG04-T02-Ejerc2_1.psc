Algoritmo Ejerc2_1
	Escribir("Ingrese un número entre 0 y 9: ")
	Leer num
	Si num >= 0 Y num <= 9 Entonces
		Escribir "Tabla de multiplicar del ", num, ":"
		Para multiplicador desde 1 hasta 10 Hacer
			resultado = num * multiplicador
			Escribir num, " x ", multiplicador, " = ", resultado
		Fin Para
	Sino
		Escribir("Número fuera del rango permitido.")
	Fin Si
FinAlgoritmo
