package Resol.IngaramoJ;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el año: ");
                int año = scanner.nextInt();

                System.out.print("Ingrese el mes: ");
                int mes = scanner.nextInt();

                System.out.print("Ingrese el día: ");
                int dia = scanner.nextInt();

                System.out.print("Ingrese la hora: ");
                int hora = scanner.nextInt();

                System.out.print("Ingrese los minutos: ");
                int minutos = scanner.nextInt();

                LocalDateTime fecha1 = LocalDateTime.of(año, mes, dia, hora, minutos);

                System.out.print("Ingrese el año n2: ");
                int año2 = scanner.nextInt();

                System.out.print("Ingrese el mes n2: ");
                int mes2 = scanner.nextInt();

                System.out.print("Ingrese el día n2: ");
                int dia2 = scanner.nextInt();

                System.out.print("Ingrese la hora n2: ");
                int hora2 = scanner.nextInt();

                System.out.print("Ingrese los minutos n2: ");
                int minutos2 = scanner.nextInt();

                LocalDateTime fecha2 = LocalDateTime.of(año2, mes2, dia2, hora2, minutos2);

                if (fecha1.isAfter(fecha2)) {
                    System.out.println("La primera fecha es posterior.");
                } else if (fecha1.isBefore(fecha2)) {
                    System.out.println("La segunda fecha es anterior.");
                } else {
                    System.out.println("Las fechas son iguales.");
                }
    }
}
