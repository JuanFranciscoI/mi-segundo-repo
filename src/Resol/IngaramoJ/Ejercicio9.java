package Resol.IngaramoJ;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de plata: ");
        int plata = scanner.nextInt();;
        int[] billetes = {20000, 10000, 2000, 1000, 500, 200, 100, 50, 20, 10};

        for (int i = 0; i < billetes.length; i++){
            int valorBillete = billetes[i];
            int cantidad = plata / valorBillete;
            plata = plata % valorBillete;
            if (cantidad > 0) {
                System.out.println("Billetes de $" + valorBillete + ": " + cantidad);
            }

        }
    }
}
