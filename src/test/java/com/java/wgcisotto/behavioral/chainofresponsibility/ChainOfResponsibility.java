package com.java.wgcisotto.behavioral.chainofresponsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChainOfResponsibility {

    @Test
    public void run(){
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        assertEquals("Director can approve conferences",
                bryan.handleRequest(request));

        request = new Request(RequestType.PURCHASE, 1000);
        assertEquals("VP can approve purchases below 1500",
                bryan.handleRequest(request));

        request = new Request(RequestType.PURCHASE, 2000);
        assertEquals("CEO can approve anything they want",
                bryan.handleRequest(request));

    }

}
