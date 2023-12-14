Algoritmo RaizCuadradaHerón
    Escribir "Escribe un número (X) del que desees obtener la raíz cuarada por el método de Herón"
	Leer X
	Definir R Como Real
	R=Aleatorio(0,X)
	Mientras Abs(R^2-X) >0.0000001
		R=(R+X/R)/2
		Escribir R
	FinMientras
	Escribir "La raíz cuadrada de ",X," é aproximandamente",R
FinAlgoritmo
