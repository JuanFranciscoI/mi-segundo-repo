package Resol.IngaramoJ;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LocalDateTime parcial = LocalDateTime.of(2025, 6, 26, 19, 20);
        LocalDateTime ahoraMismo = LocalDateTime.now();
        int mes = 0;
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        // las || evalúan si al menos una de las condiciones es verdadera
        while (ahoraMismo.plusMonths(1).isBefore(parcial) || ahoraMismo.plusMonths(1).isEqual(parcial)) {
        ahoraMismo = ahoraMismo.plusMonths(1);
        mes++;
        }
        while (ahoraMismo.plusDays(1).isBefore(parcial) || ahoraMismo.plusDays(1).isEqual(parcial)) {
            ahoraMismo = ahoraMismo.plusDays(1);
            dias++;
        }

        while (ahoraMismo.plusHours(1).isBefore(parcial) || ahoraMismo.plusHours(1).isEqual(parcial)) {
        ahoraMismo = ahoraMismo.plusHours(1);
        horas++;
        }

        while (ahoraMismo.plusMinutes(1).isBefore(parcial) || ahoraMismo.plusMinutes(1).isEqual(parcial)) {
        ahoraMismo = ahoraMismo.plusMinutes(1);
        minutos++;
        }

    System.out.println("Para el parcial faltan: " + mes + " mes " + dias + " dias " + horas + " horas " + minutos + " minutos.");

        LocalDateTime ahoraMismo2 = LocalDateTime.now();

        int clases = 0;
        while (ahoraMismo2.isBefore(parcial)) {
            if (ahoraMismo2.getDayOfWeek() == DayOfWeek.THURSDAY) {
                clases++;
            }
        ahoraMismo2 = ahoraMismo2.plusDays(1);
        }
    System.out.println("Faltan " + clases + " clases para el parcial.");

    }
}
