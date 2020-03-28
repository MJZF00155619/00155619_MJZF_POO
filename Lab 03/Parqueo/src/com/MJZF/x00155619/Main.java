package com.MJZF.x00155619;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        boolean valor = true;
        String placa = null;
        float horaEntrada = 0;
        float horaSalida = 0;
        float cantHoras = 0;
        double pago = 0;
        byte opc;
        String comp;
        double MontoFinal=0;

        ArrayList<Ticket> tickets = new ArrayList<>();
        ArrayList<Ticket> tickets2 = new ArrayList<>();

        do {
            opc = Byte.parseByte(JOptionPane.showInputDialog("Digite \n 1. Ingresar automovil \n 2. Salida del parqueo \n 3.Mostrar autos parqueados \n 4. Mostrar tickets entregados \n 5.Mostrar monto final \n 0. Salir"));
            switch (opc) {
                case 1:
                    placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo");
                    horaEntrada = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la hora de entrada (En formato de 24 hrs, porfavor utilice .(punto) en lugar de :(dos puntos) Ejemplo: 12.30)"));
                    tickets.add(new Ticket(placa,horaEntrada,horaSalida,cantHoras,pago));
                    break;
                case 2:
                    comp = JOptionPane.showInputDialog("Ingrese la placa del vehiculo");
                    for(int i=0; i<tickets.size(); i++){
                        String aux = tickets.get(i).getPlaca();
                        if(comp.equals(aux)){
                            horaSalida = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la hora de salida (En formato de 24 hrs)"));
                            if(horaSalida>horaEntrada){
                            RegistroTiempo tiempo = new RegistroTiempo(tickets.get(i).getHoraEntrada(),horaSalida);
                            cantHoras = tiempo.calculo();
                            cantHoras = Math.round(cantHoras*100)/100f;
                                if(cantHoras<0.30){
                                    tickets.get(i).setPago(0);
                                }else if(cantHoras<1.00){
                                    tickets.get(i).setPago(0.50);
                                }else if(cantHoras<2.00){
                                    tickets.get(i).setPago(1.00);
                                }else if(cantHoras>=2.00){
                                    tickets.get(i).setPago(5.00);
                                }
                            JOptionPane.showMessageDialog(null, "TICKET DE PARQUEO \n"+"Placa: "+tickets.get(i).getPlaca() + "\n Hora de Entrada: "+ tickets.get(i).getHoraEntrada() + "\n Hora de salida: "+horaSalida +"\n Horas totales: " + cantHoras +"\nDEBE: $"+ tickets.get(i).getPago());
                            tickets2.add(new Ticket(tickets.get(i).getPlaca(),tickets.get(i).getHoraEntrada(),horaSalida,cantHoras,tickets.get(i).getPago()));
                            Moneda moneda = new Moneda(tickets.get(i).getPago());
                            moneda.calculo1();
                            MontoFinal = MontoFinal + tickets.get(i).getPago();
                            String finalPlaca = tickets.get(i).getPlaca();
                            tickets.removeIf(s -> s.getPlaca().equalsIgnoreCase(finalPlaca));
                            } else {
                                JOptionPane.showMessageDialog(null,"DENEGADO: Hora no permitida");
                            }
                        }else{
                             valor = false;
                        }
                    }if(valor==false){
                    JOptionPane.showMessageDialog(null,"El auto fue retirado o no ha ingresado...");
                }break;
                case 3:
                    for (Ticket e: tickets
                         ) {
                        JOptionPane.showMessageDialog(null,e);
                    }break;
                case 4 :
                    for (Ticket i: tickets2
                    ) {
                        JOptionPane.showMessageDialog(null,i);
                    }break;
                case 5:JOptionPane.showMessageDialog(null,MontoFinal);
            }
        }while(opc!=0);

    }

}
