Algoritmo Ejercicio4
	Escribir "Ingresa un n�mero: "
	Leer numString
	numLongitud = Longitud(numString)
	
	Repetir
		suma= suma + ConvertirANumero(SubCadena(numString,0,numLongitud))
	Hasta Que numLongitud == numLongitud
	
	Escribir suma
	
	//Programa con errores. No funciona!
	
FinAlgoritmo
