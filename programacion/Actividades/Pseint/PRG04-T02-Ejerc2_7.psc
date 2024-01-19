Algoritmo Ejerc2_7
	Escribir "Ingresa un texto:"
    Leer text
	
	A="01000001"
	B="01000010"
	C="01000011"
	D="01000100"
	E="01000101"
	F="01000110"
	G="01000111"
	H="01001000"
	I="01001001"
	J="01001010"
	K="01001011"
	L="01001100"
	M="01001101"
	N="01001110"
	O="0100111"
	P="01010000"
	Q="01010001"
	R="01010010"
	S="01010011"
	T="01010100"
	U="01010101"
	V="01010110"
	W="01010111"
	X="01011000"
	Y="01011001"
	Z="01011010"
	a="01100001"
	b="01100010"
	c="01100011"
	d="01100100"
	e="01100101"
	f="01100110"
	g="01100111"
	h="01101000"
	i="01101001"
	j="01101010"
	k="01101011"
	l="01101100"
	m="01101101"
	n="01101110"
	o="01101111"
	p="01110000"
	q="01110001"
	r="01110010"
	s="01110011"
	t="01110100"
	u="01110101"
	v="01110110"
	w="01110111"
	x="01111000"
	y="01111001"
	z="01111010"
	
	Para cada car�cter en text Hacer
        // Verificar si el car�cter es alfab�tico
        Si EsAlfabetico(car�cter) Entonces
            // Obtener el c�digo ASCII binario correspondiente al car�cter
            codigoBinario = ObtenerCodigoBinario(car�cter)
            
            // Invertir el bit 2 utilizando operaciones de bits
            codigoBinario[2] = NOT codigoBinario[2]
            
            // Mostrar el car�cter original y el car�cter invertido
            Mostrar "Original:", car�cter, " Invertido:", CaracterDesdeCodigoBinario(codigoBinario)
        Fin Si
    Fin Para
	
FinAlgoritmo


Funci�n EsAlfabetico(car�cter)
// Verificar si el car�cter es una letra alfab�tica
Retornar (c�r�cter >= 'A' Y c�r�cter <= 'Z') O (c�r�cter >= 'a' Y c�r�cter <= 'z')
Fin Funci�n

Funci�n ObtenerCodigoBinario(car�cter)
// Devolver el c�digo ASCII en binario correspondiente al car�cter
// (Implementar la l�gica seg�n sea necesario)
// Nota: Puedes usar un diccionario o estructuras de datos similares para almacenar los c�digos
Fin Funci�n

Funci�n CaracterDesdeCodigoBinario(codigoBinario)
// Devolver el car�cter correspondiente al c�digo ASCII en binario
// (Implementar la l�gica seg�n sea necesario)
Fin Funci�n
	
