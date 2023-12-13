Algoritmo sin_titulo
	Definir num1 como Numerica
	Definir num2 como Numerica
	Escribir "Introduce un el número 1"
	Leer num1
	Escribir "Introduce un el número 2"
	Leer num2
	Si num1<0 y num2<0
		Escribir "Ninguno es positivo"
	FinSi
	Si num1>0 o num1=0 y num2<0
		Escribir "Uno de ellos es positivo"
	FinSi
	Si num1<0 y num2>0 o num2=0
		Escribir "Uno de ellos es positivo"
	FinSi
	Si num1>0 o num1=0 y num2>0 o num2=0
		Escribir "Los dos son positivos"
	FinSi
FinAlgoritmo
