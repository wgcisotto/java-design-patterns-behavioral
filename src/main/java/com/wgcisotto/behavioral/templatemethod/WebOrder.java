package com.wgcisotto.behavioral.templatemethod;

public class WebOrder extends OrderTemplate {

    @Override
    public void doCheckout() {
        System.out.println("Getting item from cart, ");
        System.out.println("Setting gift preferences, ");
        System.out.println("Setting delivery address, ");
        System.out.println("Setting billing address. ");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment without Card present");
    }

    @Override
    public void doReceipt() {
        System.out.println("Email receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item to address");
    }

}
