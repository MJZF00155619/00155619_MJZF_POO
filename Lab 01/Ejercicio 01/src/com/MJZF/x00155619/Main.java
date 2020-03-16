package com.MJZF.x00155619;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num=0, anterior=0, pos=1;


        System.out.print("Ingrese cuantos terminos Fibonacci desea: ");
        Scanner ent = new Scanner(System.in);
        int numero = ent.nextInt();

        for(int i=0; i<=numero; i++){

            num= anterior + pos;
            anterior = pos;
            pos = num;

            System.out.println(num);

        }

    }
}



