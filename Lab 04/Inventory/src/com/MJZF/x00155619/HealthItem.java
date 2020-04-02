package com.MJZF.x00155619;

public abstract class HealthItem extends Item{
    protected int reuseTime;
    protected String level;
    protected String type;

    public HealthItem(int reuseTime,String level,String type,String name,int weight,String descripcion){
        super(name,weight,descripcion);
        this.reuseTime=reuseTime;
        this.level=level;
        this.type=type;
    }

    @Override
    public String toString(){
        return "ID: "+ id + "\nNOMBRE DEL ITEM: "+ name +"\nPESO: "+weight+"\nDESCRIPCION: "+description+"\nREUSE TIME: "+reuseTime+"\nNIVEL: "+level+"\nTIPO: "+type;
    }

    public void drink(){}
}
