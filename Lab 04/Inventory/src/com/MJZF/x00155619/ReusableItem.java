package com.MJZF.x00155619;

public abstract class ReusableItem extends Item {
    protected int remainingUses;

    public ReusableItem(int remainingUses,String name, int weight, String description){
        super(name,weight,description);
        this.remainingUses=remainingUses;
    }

    public void reduceUse(){ }
    public boolean use(){
        return true;
    }
    @Override
    public String toString(){
        return "ID: "+ id + "\nNOMBRE DEL ITEM: "+ name +"\nPESO: "+weight+"\nDESCRIPCION: "+description+"\nUSOS RESTANTES: "+remainingUses;
    }

}
