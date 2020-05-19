package com.wgcisotto.behavioral.templatemethod;

import org.junit.jupiter.api.Test;

public class TemplateTests {

    @Test
    public void run(){
        System.out.println("Web order");
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        System.out.println("\nStore order");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }

}
