package com.java.wgcisotto.behavioral.chainofresponsibility;

public class VP extends Handler {
    @Override
    public String handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE &&
                request.getAmount() < 1500) {
            return "VP can approve purchases below 1500";
        } else {
            return successor.handleRequest(request);
        }
    }
}
