package com.MJZF.x00155619;

public class RegistroTiempo {

    //atributos
    float horaEntrada;
    float horaSalida;

    //metodos
    public RegistroTiempo(float horaEntrada, float horaSalida){
        this.horaEntrada= horaEntrada;
        this.horaSalida= horaSalida;
    }

    public float calculo(){
        return horaSalida-horaEntrada;
    }

}
