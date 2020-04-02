package com.MJZF.x00155619;

public final class IdGenerator {

    private static int counter = 0;

    private IdGenerator(){}

    public static int newId(){
        counter++;
        return counter;
    }
}
