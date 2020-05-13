package com.wgcisotto.behavioral.mediator;

//concrete command
public class TurnOnAllLightsConcreteCommand implements Command {

    private Mediator mediator;

    public TurnOnAllLightsConcreteCommand(Mediator mediator){
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
