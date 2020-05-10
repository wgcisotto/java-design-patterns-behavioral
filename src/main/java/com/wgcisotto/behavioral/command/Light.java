package com.wgcisotto.behavioral.command;

public class Light {

    private boolean isOn = false;

    public boolean isOn(){
        return this.isOn;
    }

    public void toggle(){
        if(isOn){
            off();
        }else{
            on();
        }
    }

    public void on(){
        isOn = true;
        System.out.println("Light switched on.");
    }

    public void off(){
        isOn = false;
        System.out.println("Light switched off.");
    }

}
