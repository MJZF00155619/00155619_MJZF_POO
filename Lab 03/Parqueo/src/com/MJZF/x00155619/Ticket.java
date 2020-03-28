package com.MJZF.x00155619;

public class Ticket {
    //atributos
    private String placa;
    private float horaEntrada;
    private float horaSalida;
    private float cantHoras;
    private double pago;

    public Ticket(String placa, float horaEntrada,float horaSalida, float cantHoras,double pago){
        this.placa = placa;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.cantHoras = cantHoras;
        this.pago = pago;

    }
    public Ticket (float horaSalida, float cantHoras) {
        this.horaSalida = horaSalida;
        this.cantHoras = cantHoras;
    }



    public String getPlaca(){
        return placa;
    }

    public float getHoraEntrada(){
        return horaEntrada;
    }

    public float getHoraSalida(){
        return horaSalida;
    }


    public String toString(){
        return "\n PLACA: " + placa + "\n HORA DE ENTRADA: "+ horaEntrada + "\n HORA DE SALIDA: "+ horaSalida + "\n TIEMPO TOTAL:" + cantHoras + "\nHA PAGADO: "+pago;
    }

    public void setPago(double pago){
        this.pago = pago;
    }
    public double getPago(){
        return pago;
    }
}
