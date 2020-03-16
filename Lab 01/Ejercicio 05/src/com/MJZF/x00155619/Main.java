package com.MJZF.x00155619;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        char cambiar;
        char reemplazo;
        System.out.print("Escriba la cadena de texto a modificar: ");
        cadena = entrada.nextLine();
        System.out.println("Ingrese el caracter que desea reemplazar: ");
        cambiar = entrada.next().charAt(0);
        System.out.println("¿Con que caracter desea reemplazarlo? ");
        reemplazo = entrada.next().charAt(0);
        System.out.println(cadena.replace(cambiar, reemplazo));
    }
}