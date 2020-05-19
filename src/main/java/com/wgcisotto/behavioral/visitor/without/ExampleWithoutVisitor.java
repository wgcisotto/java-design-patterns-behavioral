package com.wgcisotto.behavioral.visitor.without;

public class ExampleWithoutVisitor {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        System.out.println("Shipping cost: " + order.calculateShipping());

    }

}
