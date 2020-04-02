package com.MJZF.x00155619;

public abstract class Item {
    protected int id;
    protected String name;
    protected int weight;
    protected String description;

    Item(){}

    public Item(String name, int weight, String description){
        this.id = IdGenerator.newId();
        this.name=name;
        this.weight=weight;
        this.description=description;
    }

    public int getId(){
        return id;
    }

    public String toString(){
       return "ID: "+ id + "\nNOMBRE DEL ITEM: "+ name +"\nPESO: "+weight+"\nDESCRIPCION: "+description;
    }

}
