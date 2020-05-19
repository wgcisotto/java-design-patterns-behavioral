package com.wgcisotto.behavioral.strategy;

import org.junit.jupiter.api.Test;

public class StratergyTests {

    @Test
    public void run(){
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("370146195198281");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is Amex valid " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());

        amexCard2.setNumber("370999995198281");
        amexCard2.setDate("04/2020");
        amexCard2.setCvv("123");

        System.out.println("Is Amex valid " + amexCard2.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4532842319962878");
        visaCard.setDate("04/2020");
        visaCard.setCvv("123");

        System.out.println("Is Visa valid " + visaCard.isValid());





    }

}
