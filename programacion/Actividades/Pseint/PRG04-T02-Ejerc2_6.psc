Algoritmo Ejerc2_6
	caracterBuscado = NULO
	texto = ""
	contadorOcurrencias = 0
	
	Escribir "Introduce un carácter: "
	Leer caracterBuscado

	Repetir
		Escribir("Escribe lo que quieras (<> para finalizar)")
		Leer linea
		Mientras linea <> "<>"
			
			texto = texto + linea
			
			Para cada caracter en linea Hacer
				Si caracter = caracterBuscado Entonces
					contadorOcurrencias = contadorOcurrencias + 1
				Fin Si
			Fin Para
		FinMientras
	Hasta que linea = "<>"
	
	Escribir "Apariciones de ", caracterBuscado, ": ", contadorOcurrencias
FinAlgoritmo
//ERROR