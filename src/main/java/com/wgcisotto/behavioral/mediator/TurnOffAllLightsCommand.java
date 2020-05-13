package com.wgcisotto.behavioral.mediator;

public class TurnOffAllLightsCommand implements Command {

    private Mediator mediator;

    public TurnOffAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        this.mediator.turnOffAllLights();
    }
}
