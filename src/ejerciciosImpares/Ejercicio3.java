package ejerciciosImpares;

//Desarrollar un programa que solicite la cantidad de puntos que un cliente ha
//obtenido por sus compras en una tienda y en base a esta cantidad muestre
//que tipo de cliente es; sabiendo que, si los puntos son menos de 1000, el
//cliente es Bronce; si los puntos están entre 1000 y 3000 es un cliente Plata y
//si los puntos son más de 3000 es un cliente Oro.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        String puntos = "";

        System.out.println("Ingrese la cantidad de puntos obtenidos");
        num = entrada.nextInt();
        if (num <= 1000)
            puntos = "broce";
        else if (num <= 2000)
            puntos = "plata";
        else if (num <= 3000)
            puntos = "oro";

        System.out.println();
        System.out.println("el tipo de cliente es: " + puntos);
    }
}