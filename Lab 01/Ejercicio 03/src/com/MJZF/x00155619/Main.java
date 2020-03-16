package com.MJZF.x00155619;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.print("Cantidad de letras: ");
        Scanner entrada1 = new Scanner (System.in);
        int longitud = entrada1.nextInt();
        int cont = 0;
        List<Character> vocales = new ArrayList<>();

        char letras[] = new char[longitud];

        for (int i=0; i< letras.length; i++){
            letras[i] = entrada1.next().charAt(0);
        }

        //Almacenando en lista
        for (int i=0; i< letras.length; i++){
            if(letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u' || letras[i] == 'A' || letras[i] == 'E' || letras[i] == 'I' || letras[i] == 'O' || letras[i] == 'U' ){
                vocales.add(letras[i]);
                cont++;}
        }

        System.out.println("LAS SIGUIENTES VOCALES FUERON ALMACENADAS EN UNA LISTA: ");

        for (int i= 0; i < cont; i++ ){
            System.out.println(vocales.get(i));
        }

    }
}
