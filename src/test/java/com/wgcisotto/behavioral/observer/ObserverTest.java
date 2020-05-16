package com.wgcisotto.behavioral.observer;

import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void run(){
        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a new message!");
        tabletClient.addMessage("Another new message!");
    }

}
