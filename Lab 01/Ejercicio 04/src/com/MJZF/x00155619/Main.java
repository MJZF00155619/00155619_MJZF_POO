package com.MJZF.x00155619;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char [] caracteres;
        int ini, fin = 0;
        boolean palindromo;
        System.out.print("Ingrese la palabra o frase a verificar si es palindromo: ");
        String palabra = entrada.nextLine();
        palabra = palabra.toLowerCase();
        palabra = palabra.replace(" ","");
        caracteres = palabra.toCharArray();
        ini = 0;
        fin = caracteres.length - 1;

        while(ini<fin){
            if(caracteres[ini]==caracteres[fin]){
                ini++;
                fin--;
            }
            else {
                palindromo=false;
                System.out.println(palindromo);
                break;
            }
        }
        if(ini==fin){
            palindromo=true;
            System.out.println(palindromo);
        }

    }
}
