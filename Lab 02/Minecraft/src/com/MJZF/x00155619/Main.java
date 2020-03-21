package com.MJZF.x00155619;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        ArrayList<HerramientasMinecraft> Herramientas = new ArrayList<>();
        String comp;
        String nombre;
        String material;
        byte durabilidad;
        byte attack;
        String tipo;
        byte opc;
        byte usosE=1,usosO=1,usosH=1,usosP=1,usosPic=1;

        HerramientasMinecraft objeto = new HerramientasMinecraft(usosE,usosO,usosH,usosP,usosPic);



        do{
            menu(); opc = in.nextByte(); in.nextLine();

            switch (opc){
                case 1 :
                    System.out.println("Nombre de la herramienta: "); nombre = in.nextLine();
                    System.out.println("Material del que esta hecho: "); material = in.nextLine();
                    System.out.println("Durabilidad de la herramienta: "); durabilidad = in.nextByte(); in.nextLine();
                    System.out.println("Daño que provoca: "); attack = in.nextByte(); in.nextLine();
                    System.out.println("Tipo de herramienta(espada, pala...): "); tipo = in.nextLine();

                    Herramientas.add(new HerramientasMinecraft(nombre, material, durabilidad, attack, tipo));
                    break;
                case 2:
                    for (HerramientasMinecraft e: Herramientas
                         ) {
                        System.out.println(e);
                    }break;
                case 3:
                    System.out.println("¿Que tipo de herramientas desea? "); comp = in.nextLine();
                    for(int i=0; i<Herramientas.size(); i++){
                        String aux = Herramientas.get(i).getTipo();
                        if(comp.equalsIgnoreCase(aux)){
                            System.out.println(Herramientas.get(i).toString());
                        }
                    }break;
                case 4:
                    for (HerramientasMinecraft e: Herramientas
                         ) {
                            e.usar();
                    }
                    break;
                case 5:
                    for (HerramientasMinecraft e: Herramientas
                         ) {
                        e.Sirve();
                    }
                }

        }while(opc!=0);

    }

    static void menu(){
        System.out.println("1. Agregar herramienta: ");
        System.out.println("2. Consultar herramientas: ");
        System.out.println("3. Consultar herramientas de tipo : ");
        System.out.println("4. Usar herramientas: ");
        System.out.println("5. ¿Que hace cada herramienta?");
        System.out.println("Presione 0 para salir");
    }

}
