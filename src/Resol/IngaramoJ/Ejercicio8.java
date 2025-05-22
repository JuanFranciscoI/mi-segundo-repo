package Resol.IngaramoJ;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese cuantos litros de nafta tiene: ");
        double litros = scanner.nextDouble();
        double kmNormales = kmenrutanormal(litros);
        System.out.println("Puede recorrer " + kmNormales + " km en ruta normal.");

        double kmDesiguales = kmenrutadesigual(litros);
        // %.2f para mostrar solo 2 numeros despues de la ,

        System.out.printf("Puede recorrer %.2f km en ruta desigual.", kmDesiguales);

    }

    public static double kmenrutanormal(double litros) {
        return litros * 12.5;
    }

public static double kmenrutadesigual(double litros) {
    return litros * (12.5 / 1.15);

}
}
