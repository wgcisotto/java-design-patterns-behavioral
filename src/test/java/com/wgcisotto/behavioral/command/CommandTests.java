package com.wgcisotto.behavioral.command;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

//simlute client
public class CommandTests {

    @Test
    public void run(){
        Light light = new Light();

        Switch lightSwitch = new Switch();

        Command onCommand = new ToggleCommand(light);

        lightSwitch.storeAndExecute(onCommand);
        lightSwitch.storeAndExecute(onCommand);
        lightSwitch.storeAndExecute(onCommand);

    }

    @Test
    public void run2(){
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();

        Switch lightSwitch = new Switch();

        Command onCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(onCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
    }

}
