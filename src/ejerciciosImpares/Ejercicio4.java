package ejerciciosImpares;

//Desarrollar un programa que permita almacenar 10 nombres de mascotas en
//una matriz unidimensional llamada “mascotas”, posteriormente el programa
//deberá mostrar el contenido de la matriz mostrando sólo aquellos elementos
//que se encuentren en las casillas con índices pares de la matriz.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] mascotas = new String[10];

        System.out.println("Vamos a almacenar 10 nombres de mascotas");
        for (int i = 0; i < 10; i++){
            System.out.println("Escriba el nombre de una mascota [" + i + "]");
            mascotas[i] = entrada.next();
        }

        System.out.println();
        System.out.println("El contenido de la matriz es: ");
        for (int i = 0; i < 10; i+=2){
            System.out.print("Elemento[" + i + "]: " + mascotas[i] + ", ");
        }
    }
}