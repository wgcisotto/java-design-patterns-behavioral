package com.wgcisotto.behavioral.chain;

public class CEO extends Handler{
    @Override
    public String handleRequest(Request request) {
        return "CEO can approve anything they want";
    }
}
