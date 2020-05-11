package com.wgcisotto.behavioral.iterartor;

import com.wgcisotto.behavioral.iterator.BikeRepository;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteratorTest {

    @Test
    public void run(){

        BikeRepository repo = new BikeRepository();

        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");

        Iterator<String> bikeIterator = repo.iterator();

        while (bikeIterator.hasNext()){
            System.out.println(bikeIterator.next());
        }

        for (String name: repo) {
            System.out.println(name);
        }


    }

}
