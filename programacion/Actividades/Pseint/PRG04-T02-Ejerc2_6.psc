Algoritmo Ejerc2_6
	Definir caract Como Caracter
	Escribir "Introducir un carácter: "
	Leer caract
	Escribir "Escribe lo que quieras: (<> para finalizar)"
	Repetir
		Leer sentencia
		Para i<-0 Hasta Longitud(sentencia) HAcer
			Si(SubCadena(sentencia,i,i)=caract)
				contador=contador+1
			FinSi
		FinPara
	Hasta Que sentencia = "<>"
	Escribir "Estribiste el caracter _",caract,"_ un total de ", contador, " veces."

FinAlgoritmo