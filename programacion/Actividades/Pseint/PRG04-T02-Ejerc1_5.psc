Algoritmo Ejercicio1_5
	Escribir("Introduce el número del DNI (8 dígitos): ")
	Leer DNI
	Si longitud(ConvertirATexto(DNI)) = 8 Entonces
		resto <- (DNI % 23)
		Si resto == 0 Entonces
			letra = "T"
		FinSi
		Si resto == 1 Entonces
			letra = "R"
		FinSi
		Si resto == 2 Entonces
			letra = "W"
		FinSi
		Si resto == 3 Entonces
			letra = "A"
		FinSi
		Si resto == 4 Entonces
			letra = "G"
		FinSi
		Si resto == 5 Entonces
			letra = "M"
		FinSi
		Si resto == 6 Entonces
			letra = "Y"
		FinSi
		Si resto == 7 Entonces
			letra = "F"
		FinSi
		Si resto == 8 Entonces
			letra = "P"
		FinSi
		Si resto == 9 Entonces
			letra = "D"
		FinSi
		Si resto == 10 Entonces
			letra = "X"
		FinSi
		Si resto == 11 Entonces
			letra = "B"
		FinSi
		Si resto == 12 Entonces
			letra = "N"
		FinSi
		Si resto == 13 Entonces
			letra = "J"
		FinSi
		Si resto == 14 Entonces
			letra = "Z"
		FinSi
		Si resto == 15 Entonces
			letra = "S"
		FinSi
		Si resto == 16 Entonces
			letra = "Q"
		FinSi
		Si resto == 17 Entonces
			letra = "V"
		FinSi
		Si resto == 18 Entonces
			letra = "H"
		FinSi
		Si resto == 19 Entonces
			letra = "L"
		FinSi
		Si resto == 20 Entonces
			letra = "C"
		FinSi
		Si resto == 21 Entonces
			letra = "K"
		FinSi
		Si resto == 22 Entonces
			letra = "E"
		FinSi
		Escribir "La letra de tu DNI es la ",letra
	SiNo
		Escribir "Hay más de 8 números!"
	FinSi
FinAlgoritmo