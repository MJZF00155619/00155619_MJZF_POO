package com.MJZF.x00155619;

public class HerramientasMinecraft {
    //atributos
        String nombre;
        String material;
        byte durabilidad;
        byte attack;
        String tipo;
        byte usosE,usosO,usosH,usosP,usosPic;


        public HerramientasMinecraft(byte usosE,byte usosO,byte usosH,byte usosP,byte usosPic){
            this.usosE = usosE;
            this.usosO = usosO;
            this.usosH = usosH;
            this.usosP = usosP;
            this.usosPic = usosPic;
        }
    //metodo constructor
        public HerramientasMinecraft(String nombre, String material, byte durabilidad, byte attack, String tipo){
            this.nombre = nombre;
            this.material = material;
           this.durabilidad = durabilidad;
            this.attack = attack;
            this.tipo = tipo;
    }

    //metodos
    public String toString(){
            return "\nNOMBRE: " + nombre + "\n MATERIAL: "+ material + "\n DURABILIDAD: " + durabilidad + "\n DAÑO: "+ attack + "\n TIPO: "+ tipo + "\n";
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre(){
            return nombre;
    }

    public void usar(){
            if(getNombre().equalsIgnoreCase("Espada")) {
                usosE++;
                System.out.println("Se ha utilizado " + getNombre() + " " + usosE + " veces");

            }else if (getNombre().equalsIgnoreCase("Azada")){
                usosO++;
                 System.out.println("Se ha utilizado " + getNombre() +" "+usosO+" veces");

            }else if (getNombre().equalsIgnoreCase("Hacha")){
                usosH++;
                 System.out.println("Se ha utilizado " + getNombre() + " "+usosH+" veces");

            }else if (getNombre().equalsIgnoreCase("Pala")){
                usosP++;
            System.out.println("Se ha utilizado " + getNombre()+ " "+usosP+" veces");

            }else if(getNombre().equalsIgnoreCase("Pico")){
                usosPic++;
                System.out.println("Se ha utilizado " + getNombre() + " "+usosPic+" veces");
            }
        System.out.println(" ");
        }

    public void Sirve(){
        if(getNombre().equalsIgnoreCase("Espada")) {
            System.out.println("La Espada sirve para atacar");

        }else if (getNombre().equalsIgnoreCase("Azada")){
            System.out.println("La Azada sirve para arar la tierra y la hierva");

        }else if (getNombre().equalsIgnoreCase("Hacha")){
            System.out.println("El hacha sirve para talar madera mas rapido");

        }else if (getNombre().equalsIgnoreCase("Pala")){
            System.out.println("La pala sirve para cavar tierra, arena, nieve y grava mas rapido");

        }else if(getNombre().equalsIgnoreCase("Pico")){
            System.out.println("El pico sirve para romper piedra y otroa minerales");

        }
        System.out.println(" ");
    }



}




