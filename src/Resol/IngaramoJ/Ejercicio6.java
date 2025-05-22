package Resol.IngaramoJ;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su año de nacimiento: ");
        int año = scanner.nextInt();

        System.out.print("Ingrese su mes de nacimiento: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese su dia de nacimiento: ");
        int dia = scanner.nextInt();
        LocalDate hoy = LocalDate.now();
        LocalDate proxCumple = LocalDate.of(hoy.getYear(), mes, dia);

        if (!proxCumple.isAfter(hoy)) {
            proxCumple = proxCumple.plusYears(1);
        }
        Period diferencia = hoy.until(proxCumple);
        int diasTotales = diferencia.getYears() * 365 + diferencia.getMonths() * 30 + diferencia.getDays();

        System.out.println("Faltan " + diasTotales + " días para tu próximo cumpleaños.");
    }
}
