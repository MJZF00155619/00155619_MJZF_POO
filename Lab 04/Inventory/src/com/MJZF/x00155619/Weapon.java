package com.MJZF.x00155619;

public class Weapon extends ReusableItem {
    private String type;
    private double speed;
    private double damage;
    private String wieldType;
    private int level;

    public Weapon(String type,double speed,double damage,String wieldType,int level,int remainingUses,String name, int weight, String description){
        super(remainingUses,name,weight,description);
        this.type=type;
        this.speed=speed;
        this.damage=damage;
        this.wieldType=wieldType;
        this.level=level;
    }

    public void upgrade(){}
    @Override
    public String toString(){
        return "ID: "+ id + "\nNOMBRE DEL ITEM: "+ name +"\nPESO: "+weight+"\nDESCRIPCION: "+description+"\nUSOS RESTANTES: "+remainingUses+"\n TIPO: "+type+"\nVELOCIDAD: "+speed+"\nDAÑO: "+damage+"\nTIPO DE EMPUÑADURA: "+wieldType+"\nNIVEL: "+level;
    }
}
