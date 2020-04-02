package com.MJZF.x00155619;

public class Ammo extends ReusableItem{
    private boolean equipped;

    public Ammo(boolean equipped,int remainingUses,String name, int weight, String description) {
        super(remainingUses,name,weight,description);
        this.equipped =equipped;
    }



    public void equip(){}
    @Override
    public String toString(){
        return "ID: "+ id + "\nNOMBRE DEL ITEM: "+ name +"\nPESO: "+weight+"\nDESCRIPCION: "+description+"\nUSOS RESTANTES: "+remainingUses+"\nEQUIPADO: "+equipped;
    }


}
