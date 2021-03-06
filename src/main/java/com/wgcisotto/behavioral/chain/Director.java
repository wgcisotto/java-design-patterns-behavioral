package com.wgcisotto.behavioral.chain;

public class Director extends Handler {
    @Override
    public String handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE){
            return "Director can approve conferences";
        }else{
            return successor.handleRequest(request);
        }
    }
}
