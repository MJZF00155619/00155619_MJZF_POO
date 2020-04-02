package com.MJZF.x00155619;

public class Elixir extends HealthItem {
    private int amount;
    private int time;

    public Elixir(int amount, int time, int reuseTime,String level,String type,String name,int weight,String description){
        super(reuseTime,level,type,name,weight,description);
        this.amount=amount;
        this.time=time;
    }



    @Override
    public String toString(){
        return "ID: "+ id + "\nNOMBRE DEL ITEM: "+ name +"\nPESO: "+weight+"\nDESCRIPCION: "+description+"\nREUSE TIME: "+reuseTime+"\nNIVEL: "+level+"\nTIPO: "+type+"\nCANTIDAD:"+amount+"\nTIEMPO: "+time;
    }

    public void drink(){ }
}
