package com.MJZF.x00155619;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Ingrese el valor de n: ");
        Scanner entrada = new Scanner(System.in);

        byte n = entrada.nextByte() ; entrada.nextLine();
        int i=1;

        if(i<n) {
            for (i = 1; i < n; i++) {
                System.out.println(i);
            }
        }
        for(i=n; i>0; i--){
            System.out.println(i);
        }
    }


}


