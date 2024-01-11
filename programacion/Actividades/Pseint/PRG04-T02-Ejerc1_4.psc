Algoritmo Ejercicio1_4
	Escribir "Resolución de ecuaciones modelo a*x^2 + b*x + c = 0"
	Escribir "Introduce a"
	Leer a
	Escribir "Introduce b"
	Leer b
	Escribir "Introduce c"
	Leer c
	Si (a==0 Y b==0)
		Escribir "No tiene resolución ya que a y b valen 0."
		Escribir "Mátematicamente ",c," = 0 no es una ecuación válida porque aparte de ser una incongruencia en sí misma, no existe una incógnita que despejar."
	SiNo
		Si a==0 Entonces
			x1= -c/b
			Escribir "Como a=0, la resolución de la ecuación se convierte a primer grado."
			Escribir "La solución es ",x1
		SiNo
			discriminante <- (b^2 - 4 * a * c)
			Si discriminante >= 0 Entonces
				x2 <- (-b + (discriminante)^(1/2)) / (2 * a)
				x3 <- (-b - (discriminante)^(1/2)) / (2 * a)
				Si x2==x3 Entonces
					Escribir "Una única solución:"
					Escribir x3
				SiNo
					Escribir "Dos soluciones:"
					Escribir x2
					Escribir x3
				FinSi
				
			SiNo
				Escribir "Error! El discriminante es negativo. No existe la raíz negativa en los números reales. En 1º de DAM no se dan números imaginarios!"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
	