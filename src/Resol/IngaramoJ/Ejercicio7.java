package Resol.IngaramoJ;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        int fila = 1;
        // n es el numero que el usuario ingreso
        while (fila <= n) { //incremento
            int asterisco = 1;
            while (asterisco <= fila) {
                System.out.print("*");
                asterisco++;
            }
            System.out.println(); // Salto de línea
            fila++;
        }
    }
}
