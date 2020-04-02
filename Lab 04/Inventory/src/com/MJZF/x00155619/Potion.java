package com.MJZF.x00155619;

public class Potion extends HealthItem {
    private int amount;

    public Potion(int amount,int reuseTime,String level,String type,String name,int weight,String description) {
        super(reuseTime,level,type,name,weight,description);
        this.amount = amount;
    }


    public String getType(){
        return type;
    }



    @Override
    public String toString(){
        return "ID: "+ id + "\nNOMBRE DEL ITEM: "+ name +"\nPESO: "+weight+"\nDESCRIPCION: "+description+"\nREUSE TIME: "+reuseTime+"\nNIVEL: "+level+"\nTIPO: "+type+"\nCANTIDAD:"+amount;
    }


    public void drink(){ }
}
