package Resol.IngaramoJ;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su año de nacimiento: ");

        int anio = scanner.nextInt();

        System.out.print("Ingrese su mes de nacimiento: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese su dia de nacimiento: ");
        int dia = scanner.nextInt();

        LocalDate nacimiento = LocalDate.of(anio, mes, dia);

        System.out.println("Naciste el dia " + nacimiento.getDayOfWeek());
        // similar al ejercicio 2, vemos la nueva funcion de obtener el dia de la semana (en ingles)
    }
}