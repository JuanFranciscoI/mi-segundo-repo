package Resol.IngaramoJ;

import java.time.LocalTime;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // representa una hora y minutos, sin fecha.
        LocalTime inicio = LocalTime.of(7,0);
        LocalTime fin = LocalTime.of(15,0);
        //pasamos las horas a minutos
    int minutosInicio = inicio.getHour() * 60 + inicio.getMinute();
    int minutosFin = fin.getHour() * 60 + inicio.getMinute();

    int duracionActividad = minutosFin - minutosInicio;

    System.out.println("La actividad dura " + duracionActividad + " minutos.");
    }
}
