package Resol.IngaramoJ;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        String[] nombres = new String[10];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre del alumno: ");
            nombres[i] = scanner.nextLine();
            System.out.print("Ingrese la nota del alumno: ");
            double nota;
            do {
                System.out.print("Ingrese la nota del alumno (0 a 10): ");
                nota = scanner.nextDouble();
                scanner.nextLine();
                if (nota < 0 || nota > 10) {
                    System.out.print("La nota ingresada es inválida. Ingrese valor entre 0 y 10.");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }
        String[] resultados = new String[10];
        for (int i = 0; i < resultados.length; i++) {
            {
                if (notas[i] < 5) {
                    resultados[i] = "suspenso";
                } else if (notas[i] < 7) {
                    resultados[i] = "bien";
                } else if (notas[i] < 9) {
                    resultados[i] = "notable";
                } else {
                    resultados[i] = "sobresaliente";
                }
            }
        }
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " tiene la nota " + notas[i] + " y su resultado es " + resultados[i]);
        }

    }
}
