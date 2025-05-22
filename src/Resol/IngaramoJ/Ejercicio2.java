package Resol.IngaramoJ;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese su año de nacimiento: ");
    int año = scanner.nextInt();

    System.out.print("Ingrese su mes de nacimiento: ");
    int mes = scanner.nextInt();

    System.out.print("Ingrese su dia de nacimiento: ");
    int dia = scanner.nextInt();

        LocalDate nacimiento = LocalDate.of(año, mes, dia);
        LocalDate hoy = LocalDate.now();

        int contador = 0;
        while (nacimiento.isBefore(hoy)) {
        nacimiento = nacimiento.plusDays(1);
        contador++;
        }

    System.out.println("Desde que naciste pasaron " + contador + " días");

    }
}
