package org.rosalia.repaso;

import java.util.Scanner;

public class Repaso6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de alumnos y el número de asignaturas
        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = scanner.nextInt();
        System.out.print("Ingrese el número de asignaturas: ");
        int numAsignaturas = scanner.nextInt();

        // Crear un array bidimensional para almacenar las calificaciones de los alumnos
        double[][] calificaciones = new double[numAlumnos][numAsignaturas];

        // Solicitar al usuario ingresar las calificaciones de cada alumno en cada asignatura
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Ingrese las calificaciones para el alumno " + (i + 1) + ":");
            for (int j = 0; j < numAsignaturas; j++) {
                System.out.print("Calificación en asignatura " + (j + 1) + ": ");
                double calificacion = scanner.nextDouble();
                // Verificar que la calificación esté dentro del rango válido (0 - 10)
                while (calificacion < 0 || calificacion > 10) {
                    System.out.println("La calificación debe estar entre 0 y 10. Ingrese nuevamente: ");
                    calificacion = scanner.nextDouble();
                }
                calificaciones[i][j] = calificacion;
            }
        }

        // Imprimir la matriz de calificaciones en formato de filas y columnas
        System.out.println("\n*****************************");
        System.out.println("* MATRIZ DE CALIFICACIONES **");
        System.out.println("*****************************");

        for (int i = 0; i < numAlumnos; i++) {
            for (int j = 0; j < numAsignaturas; j++) {
                System.out.print(calificaciones[i][j] + " "+" ");
            }
            System.out.println();
        }

        // Calcular el promedio de calificaciones de cada alumno y mostrarlo por pantalla
        System.out.println("\nPromedio de calificaciones de cada alumno:");
        for (int i = 0; i < numAlumnos; i++) {
            double sum = 0;
            for (int j = 0; j < numAsignaturas; j++) {
                sum += calificaciones[i][j];
            }
            double promedio = sum / numAsignaturas;
            System.out.println("Alumno " + (i + 1) + ": " + promedio);
        }

        // Calcular el promedio de calificaciones de cada asignatura y mostrarlo por pantalla
        System.out.println("\nPromedio de calificaciones de cada asignatura:");
        for (int j = 0; j < numAsignaturas; j++) {
            double sum = 0;
            for (int i = 0; i < numAlumnos; i++) {
                sum += calificaciones[i][j];
            }
            double promedio = sum / numAlumnos;
            System.out.println("Asignatura " + (j + 1) + ": " + promedio);
        }

        // Mostrar la calificación más alta y la más baja de cada asignatura
        for (int j = 0; j < numAsignaturas; j++) {
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;
            for (int i = 0; i < numAlumnos; i++) {
                if (calificaciones[i][j] > max) {
                    max = calificaciones[i][j];
                }
                if (calificaciones[i][j] < min) {
                    min = calificaciones[i][j];
                }
            }
            System.out.println("\nAsignatura " + (j + 1) + ":");
            System.out.println("Calificación más alta: " + max);
            System.out.println("Calificación más baja: " + min);
        }

        // Mostrar la calificación más alta y la más baja de todos los alumnos en todas las asignaturas
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < numAlumnos; i++) {
            for (int j = 0; j < numAsignaturas; j++) {
                if (calificaciones[i][j] > max) {
                    max = calificaciones[i][j];
                }
                if (calificaciones[i][j] < min) {
                    min = calificaciones[i][j];
                }
            }
        }
        System.out.println("\nCalificación más alta de todos los alumnos: " + max);
        System.out.println("Calificación más baja de todos los alumnos: " + min);

        scanner.close();
    }
}

