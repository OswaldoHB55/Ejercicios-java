package ejerciciosImpares;

//Desarrollar un programa que solicite el número de respuestas correctas,
//incorrectas y vacías del examen de un estudiante y muestre como resultado el
//puntaje obtenido por éste, sabiendo que una respuesta correcta vale 5 puntos,
//una respuesta incorrecta vale -2 puntos y una respuesta vacía vale 0 puntos.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double correctas, incorrectas, vacias, puntaje;

        System.out.println("Ingrese el número de respuestas correctas:");
        correctas = entrada.nextInt();

        System.out.println("Ingrese el número de respuestas incorrectas:");
        incorrectas = entrada.nextInt();

        System.out.println("Ingrese el número de respuestas vacías:");
        vacias = entrada.nextInt();

        puntaje = correctas * 5 + incorrectas * -2 + vacias * 0;

        System.out.println("El puntaje obtenido es: " + puntaje);
    }
}
