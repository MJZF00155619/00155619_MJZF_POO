package com.MJZF.x00155619;

import javax.swing.*;

public class Moneda {

    //atributos
    private float denominacion=0;
    private double pago;
    private double sumador=0;
    private double vuelto;

    public Moneda(double pago){
        this.pago=pago;
    }
    //Para monedas de 5
    public void calculo1(){
        while(sumador<pago){
            denominacion = Float.parseFloat(JOptionPane.showInputDialog("Ingrese monedas, por cada una ingresada presione ok(las denominaciones pueden ser $0.05,$0.10,$0.25,$1.00) $ "));
            sumador = sumador + denominacion;
            JOptionPane.showMessageDialog(null,sumador);
        }
        if(sumador>pago){
            vuelto = sumador-pago;
            JOptionPane.showMessageDialog(null,"Su cambio es:"+vuelto);
        }else {
            JOptionPane.showMessageDialog(null,"Pago realizado con exito :D");
        }
    }



}
