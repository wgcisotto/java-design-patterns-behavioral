package com.wgcisotto.behavioral.state;

public class Fan {

    State fanOffState;
    State fanLowState;
    State fanMedState;
    State fanHighState;

    State state;


    public Fan(){
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);
        fanHighState = new FanHighState(this);

        state = fanOffState;
    }

    public void pullChain(){
        state.handleRequest();
    }

    @Override
    public String toString() {
        return state.toString();
    }

    // The design was applied with the purpose to remove the if else code

    //    public void pullChain(){
//        if(state == OFF){
//            System.out.println("Turning fan on to low.");
//            state = LOW;
//        } else if (state == LOW){
//            System.out.println( "Turning fan on to med.");
//            state = MED;
//        } else if (state == MED){
//            System.out.println("Turning fan on to off.");
//            state = OFF;
//        }
//    }
//
//    public String toString(){
//        if(state == OFF){
//            return "Fan is off";
//        } else if (state == LOW){
//            return "Fan is on low";
//        } else if (state == MED){
//            return "Fan is on med";
//        }
//        return "Invalid state.";
//    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public void setState(State state) {
        this.state = state;
    }
}
