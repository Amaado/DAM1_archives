Algoritmo Ejercicio1_4
	Escribir "Resoluci�n de ecuaciones modelo a*x^2 + b*x + c = 0"
	Escribir "Introduce a"
	Leer a
	Escribir "Introduce b"
	Leer b
	Escribir "Introduce c"
	Leer c
	Si (a==0 Y b==0)
		Escribir "No tiene resoluci�n ya que a y b valen 0."
		Escribir "M�tematicamente ",c," = 0 no es una ecuaci�n v�lida porque aparte de ser una incongruencia en s� misma, no existe una inc�gnita que despejar."
	SiNo
		Si a==0 Entonces
			x1= -c/b
			Escribir "Como a=0, la resoluci�n de la ecuaci�n se convierte a primer grado."
			Escribir "La soluci�n es ",x1
		SiNo
			discriminante <- (b^2 - 4 * a * c)
			Si discriminante >= 0 Entonces
				x2 <- (-b + (discriminante)^(1/2)) / (2 * a)
				x3 <- (-b - (discriminante)^(1/2)) / (2 * a)
				Si x2==x3 Entonces
					Escribir "Una �nica soluci�n:"
					Escribir x3
				SiNo
					Escribir "Dos soluciones:"
					Escribir x2
					Escribir x3
				FinSi
				
			SiNo
				Escribir "Error! El discriminante es negativo. No existe la ra�z negativa en los n�meros reales. En 1� de DAM no se dan n�meros imaginarios!"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
	