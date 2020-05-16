package com.wgcisotto.behavioral.state;

import org.junit.jupiter.api.Test;

public class StateTests {

    @Test
    public void run(){
        Fan fan = new Fan();

        System.out.println(fan.toString());

        fan.pullChain();

        System.out.println(fan.toString());

        fan.pullChain();

        System.out.println(fan.toString());

        fan.pullChain();

        System.out.println(fan.toString());

        fan.pullChain();

        System.out.println(fan.toString());

    }

}
