package com.MJZF.x00155619;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> PersonalItems = new ArrayList<>();
        ArrayList<Item> CommonItems = new ArrayList<>();

        String name;
        int weight;
        String description;
        int reuseTime;
        String level;
        String type;
        int amount;
        int time;
        int remainingUses;
        boolean equipped;
        double speed;
        double damage;
        String wieldType;
        int nivel;

        byte opc;
        byte opc2;
        byte opc3;

        int comp;

        do{
            opc= Byte.parseByte(JOptionPane.showInputDialog("DIGITE: \n 1. Agregar Item \n 2. Compartir Item \n 3. Buscar Item por ID \n 4.Buscar Item por tipo \n 5. Borrar Item por ID \n 6. Borrar Item por tipo \n 0. Para salir"));
            switch (opc){
                case 1:  //Case 1 principal
                    opc2= Byte.parseByte(JOptionPane.showInputDialog("¿Que tipo de ITEM desea agregar?\n 1.Articulo de salud\n 2.Articulo Reusable"));
                    switch (opc2){
                        case 1: //Artuculo de salud
                            opc3= Byte.parseByte(JOptionPane.showInputDialog("1. Pocion \n 2.Elixir"));
                            switch (opc3){
                                case 1:
                                    name = JOptionPane.showInputDialog("Ingrese el nombre del ITEM");
                                    weight = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del ITEM"));
                                    description = JOptionPane.showInputDialog("Ingrese una descripcion del ITEM");
                                    reuseTime =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo para reusar"));
                                    level = JOptionPane.showInputDialog("Ingrese el nivel del ITEM");
                                    type = JOptionPane.showInputDialog("Ingrese el tipo de pocion");
                                    amount = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
                                    PersonalItems.add(new Potion(amount,reuseTime,level,type,name,weight,description));
                                    break;
                                case 2:
                                    name = JOptionPane.showInputDialog("Ingrese el nombre del ITEM");
                                    weight = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del ITEM"));
                                    description = JOptionPane.showInputDialog("Ingrese una descripcion del ITEM");
                                    reuseTime =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo para reusar"));
                                    level = JOptionPane.showInputDialog("Ingrese el nivel del ITEM");
                                    type = JOptionPane.showInputDialog("Ingrese el tipo de Elixir");
                                    amount = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
                                    time = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion: "));
                                    PersonalItems.add(new Elixir(amount,time,reuseTime,level,type,name,weight,description));
                                    break;
                                default:JOptionPane.showMessageDialog(null,"La opcion elegida no existe");
                        }break;
                        case 2://Articulo reutilizable
                            opc3=Byte.parseByte(JOptionPane.showInputDialog("1.Municion \n 2.Arma"));
                            switch (opc3){
                                case 1:
                                    name = JOptionPane.showInputDialog("Ingrese el nombre de la municion");
                                    remainingUses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de usos que quedan: "));
                                    if (remainingUses == 0){
                                        equipped = false;
                                    }else{
                                        equipped = true;
                                    }
                                    weight= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de municion"));
                                    description = JOptionPane.showInputDialog("Ingrese una descripcion del ITEM");
                                    PersonalItems.add(new Ammo(equipped,remainingUses,name, weight,description));
                                    break;
                                case 2:
                                    name = JOptionPane.showInputDialog("Ingrese el nombre del Arma");
                                    type = JOptionPane.showInputDialog("Ingrese el tipo de arma");
                                    speed = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad: "));
                                    damage = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el daño que causa"));
                                    wieldType = JOptionPane.showInputDialog("Ingrese el tipo de empuñadura");
                                    nivel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nivel del arma(int)"));
                                    remainingUses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los usos restantes"));
                                    weight = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del arma"));
                                    description = JOptionPane.showInputDialog("Ingrese una descripcion: ");
                                    PersonalItems.add(new Weapon(type,speed,damage,wieldType,nivel,remainingUses,name,weight,description));
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null,"La opcion elegida no existe");
                            }break;
                        default: JOptionPane.showMessageDialog(null,"La opcion elegida no existe");
                    }break;
                case 2:
                    comp = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el ID del ITEM a compartir"));
                    for (Item e: PersonalItems) {
                        int aux = e.getId();
                        if(aux==comp){
                            CommonItems.add(e);
                        }
                    }
                   break;
                case 3:
                    byte opcion;
                    opcion = Byte.parseByte(JOptionPane.showInputDialog("¿En que lista desea buscar?\n1. Personal Items\n2.Common Items"));
                    switch (opcion){
                        case 1:
                            int eq = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del ITEM"));
                            for (Item i: PersonalItems) {
                                if(eq==i.getId()){
                                    JOptionPane.showMessageDialog(null,i);
                                }
                            }
                            break;
                        case 2:
                            int equ = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del ITEM"));
                            for (Item o: CommonItems) {
                                if(equ==o.getId()){
                                    JOptionPane.showMessageDialog(null,o);
                                }
                            }
                            break;
                        default: JOptionPane.showMessageDialog(null,"La opcion elegida no existe");
                    }
                    break;
                case 4:
                    String tip = JOptionPane.showInputDialog("¿Que tipo de Item desea ver? (Pocion,Elixir,Municion,Arma)");
                    byte opc5 = Byte.parseByte(JOptionPane.showInputDialog("¿En que lista desea buscar? \n1.Personal Items \n 2.Common Items"));
                    switch (opc5) {
                        case 1: if (tip.equalsIgnoreCase("Pocion")) {
                            for (Item a : PersonalItems) {
                                if (a instanceof Potion) {
                                    JOptionPane.showMessageDialog(null, a);
                                }
                            }
                        } else if (tip.equalsIgnoreCase("Elixir")) {
                            for (Item a : PersonalItems) {
                                if (a instanceof Elixir) {
                                    JOptionPane.showMessageDialog(null, a);
                                }
                            }
                        } else if (tip.equalsIgnoreCase("Municion")) {
                            for (Item a : PersonalItems) {
                                if (a instanceof Ammo) {
                                    JOptionPane.showMessageDialog(null, a);
                                }
                            }
                        } else if (tip.equalsIgnoreCase("Arma")) {
                            for (Item a : PersonalItems) {
                                if (a instanceof Weapon) {
                                    JOptionPane.showMessageDialog(null, a);
                                }
                            }
                        }break;
                        case 2:
                            if (tip.equalsIgnoreCase("Pocion")) {
                                for (Item a : CommonItems) {
                                    if (a instanceof Potion) {
                                        JOptionPane.showMessageDialog(null, a);
                                    }
                                }
                            } else if (tip.equalsIgnoreCase("Elixir")) {
                                for (Item a : CommonItems) {
                                    if (a instanceof Elixir) {
                                        JOptionPane.showMessageDialog(null, a);
                                    }
                                }
                            } else if (tip.equalsIgnoreCase("Municion")) {
                                for (Item a :CommonItems) {
                                    if (a instanceof Ammo) {
                                        JOptionPane.showMessageDialog(null, a);
                                    }
                                }
                            } else if (tip.equalsIgnoreCase("Arma")) {
                                for (Item a : CommonItems) {
                                    if (a instanceof Weapon) {
                                        JOptionPane.showMessageDialog(null, a);
                                    }
                                }
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;
                    }
                    break;
                case 5:
                    int FinalID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del objeto a eliminar"));
                    byte opc6 = Byte.parseByte(JOptionPane.showInputDialog("¿De que lista desea eliminar el elemento? \n1. Personal Items \n2. Common Items"));
                    if(opc6==1){
                        PersonalItems.removeIf(s->s.getId()==FinalID);
                        JOptionPane.showMessageDialog(null,"Finalizado");
                    }else if(opc6==2){
                        CommonItems.removeIf(s->s.getId()==FinalID);
                        JOptionPane.showMessageDialog(null,"Finalizado");
                    }else{
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                    }
                    break;
                case 6:
                    byte tocase1,tocase2;
                    tocase1=Byte.parseByte(JOptionPane.showInputDialog("¿De donde desea eliminar objetos \n1.Personal Items \n2.Common Items?"));
                    switch (tocase1){
                        case 1:
                            tocase2 = Byte.parseByte(JOptionPane.showInputDialog("¿Que tipo de objeto desea eliminar? \n1.Pocion\n2.Elixir\n3.Municion\n4.Arma"));
                            switch (tocase2){
                                case 1:
                                    PersonalItems.removeIf(s->s instanceof Potion);
                                    JOptionPane.showMessageDialog(null,"Finalizado");
                                    break;
                                case 2:
                                    PersonalItems.removeIf(s->s instanceof Elixir);
                                    JOptionPane.showMessageDialog(null,"Finalizado");
                                    break;
                                case 3:
                                    PersonalItems.removeIf(s->s instanceof Ammo);
                                    JOptionPane.showMessageDialog(null,"Finalizado");
                                    break;
                                case 4:
                                    PersonalItems.removeIf(s->s instanceof Weapon);
                                    JOptionPane.showMessageDialog(null,"Finalizado");
                                    break;
                                default:JOptionPane.showMessageDialog(null,"Opcion invalida");break;
                            }break;
                        case 2:
                            tocase2= Byte.parseByte(JOptionPane.showInputDialog("¿Que tipo de objeto desea eliminar? \n1.Pocion\n2.Elixir\n3.Municion\n4.Arma"));
                            switch (tocase2){
                                case 1:
                                    CommonItems.removeIf(s->s instanceof Potion);
                                    JOptionPane.showMessageDialog(null,"Finalizado");
                                    break;
                                case 2:
                                    CommonItems.removeIf(s->s instanceof Elixir);
                                    JOptionPane.showMessageDialog(null,"Finalizado");
                                    break;
                                case 3:
                                    CommonItems.removeIf(s->s instanceof Ammo);
                                    JOptionPane.showMessageDialog(null,"Finalizado");
                                    break;
                                case 4:
                                    CommonItems.removeIf(s->s instanceof Weapon);
                                    JOptionPane.showMessageDialog(null,"Finalizado");
                                    break;
                                default:JOptionPane.showMessageDialog(null,"Opcion invalida");break;
                            }
                    }
            }
        }while(opc!=0);
    }
}
