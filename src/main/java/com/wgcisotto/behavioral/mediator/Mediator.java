package com.wgcisotto.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private List<LightMediator> lights = new ArrayList<>();

    public void registerLight(LightMediator light){
        lights.add(light);
    }

    public void turnOnAllLights(){
        lights.stream()
                .filter(LightMediator::isOff)
                .forEach(LightMediator::toggle);
    }

    public void turnOffAllLights(){
        lights.stream()
                .filter(LightMediator::isOn)
                .forEach(LightMediator::toggle);
    }


}
