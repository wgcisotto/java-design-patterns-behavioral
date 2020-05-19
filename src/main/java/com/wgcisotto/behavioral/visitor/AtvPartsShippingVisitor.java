package com.wgcisotto.behavioral.visitor;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

    private double shippingAmount = 0;

    @Override
    public void visit(Fender fender) {
        System.out.println("Fender are light and cheap to chip");
        shippingAmount += 3;
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("Oil is hazardous and has fee to ship");
        shippingAmount += 9;
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Wheels are bulky and expensive to ship");
        shippingAmount += 15;
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("If they bought more than 3 we will give them a discount shipping");
        if(partsOrder.getParts().size() > 3){
            shippingAmount -= 5;
        }
        System.out.println("Shipping amount is: " + shippingAmount);
    }

}
