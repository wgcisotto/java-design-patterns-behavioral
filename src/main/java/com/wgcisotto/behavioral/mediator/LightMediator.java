package com.wgcisotto.behavioral.mediator;

//receiver
public class LightMediator {

    private boolean isOn = false;

    private String location;

    public LightMediator(){

    }
    public LightMediator(String location){
        this.location = location;
    }

    public boolean isOn(){
        return this.isOn;
    }
    public boolean isOff(){
        return !this.isOn;
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
