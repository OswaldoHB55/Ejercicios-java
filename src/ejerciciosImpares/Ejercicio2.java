package ejerciciosImpares;

//Desarrollar un programa que solicite un número entero positivo y como
//resultado muestre todos los números impares entre 0 y el número ingresado.
//Utilizar la estructura repetitiva “While”.


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num, residuo, i = 1;
        System.out.println("Ingrese un numero entero");
        num = entrada.nextDouble();

        System.out.println("Los numero impares asta " + num + "son: ");
        while (i < num){
            System.out.println(i);
            i += 2;
        }
    }
}