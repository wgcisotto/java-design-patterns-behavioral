package com.wgcisotto.behavioral.mediator;

import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    public void run(){
        Mediator mediator = new Mediator();

        LightMediator bedroom = new LightMediator("Bedroom");
        LightMediator kitchen = new LightMediator("Kitchen");

        mediator.registerLight(bedroom);
        mediator.registerLight(kitchen);

        Command turnOnAllLightsCommand = new TurnOnAllLightsConcreteCommand(mediator);
        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute();

    }

}
