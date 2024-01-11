Algoritmo Ejercicio1_3
	Escribir "Introduce N1"
	Leer N1
	Escribir "Introduce N2"
	Leer N2
	Escribir "Introduce N3"
	Leer N3
	Si (N1==N2 Y N1==N3) Entonces
		Escribir "Los 3 números son iguales"
	SiNo
		mayor <- N1
        Si (N2 > mayor) Entonces
            mayor <- N2
		FinSi
        Si (N3 > mayor) Entonces
            mayor <- N3
		FinSi
	FinSi
	Escribir "El número mayor es: ", mayor
FinAlgoritmo