Algoritmo RaizCuadradaHer�n
    Escribir "Escribe un n�mero (X) del que desees obtener la ra�z cuarada por el m�todo de Her�n"
	Leer X
	Definir R Como Real
	R=Aleatorio(0,X)
	Mientras Abs(R^2-X) >0.0000001
		R=(R+X/R)/2
		Escribir R
	FinMientras
	Escribir "La ra�z cuadrada de ",X," � aproximandamente",R
FinAlgoritmo
