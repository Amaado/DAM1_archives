Algoritmo Ejercicio1_6
	Escribir "Cuanta comida diaria se utiliza para alimentar a los animales? (kg): "
	Leer comidaDiaria
	Escribir "Cuantos animales hay en la granja?: "
	Leer numAnimales
	Escribir "Cuanta comida necesita un animal diariamente? (kg): "
	Leer kilosAnimal
	
	excedente <- comidaDiaria - (numAnimales*kilosAnimal)
	
	 Si excedente < 0 Entonces
		 racion <- (comidaDiaria + excedente) / numAnimales
		 Escribir "No existe excedente."
		 Escribir "No llega la comida diaria para alimentar a todos los animales con la comida por animal recomendada."
		 Escribir "La ración máxima para que puedan comer todos los animales por igual sería de ",racion," Kg."
	 SiNo
		 Escribir "El excedente de comida de hoy es ",excedente," Kg."
	 FinSi
FinAlgoritmo