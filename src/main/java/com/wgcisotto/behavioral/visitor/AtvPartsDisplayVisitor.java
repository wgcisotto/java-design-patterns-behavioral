package com.wgcisotto.behavioral.visitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {

    @Override
    public void visit(Fender fender) {
        System.out.println("We have a fender");
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("We have Oil");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("We have a Wheel");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("We have an Order");
    }
}
