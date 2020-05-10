package com.wgcisotto.behavioral.chain;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract String handleRequest(Request request);

}
