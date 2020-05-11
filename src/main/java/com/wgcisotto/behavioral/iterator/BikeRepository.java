package com.wgcisotto.behavioral.iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

    private String[] bikes;
    private int index;

    public BikeRepository(){
        bikes = new String[10];
        index = 0;
    }

    public void addBike(String bike){
        if(index == bikes.length){
            String[] largerArray = new String[index + 5];
            System.arraycopy(bikes, 0, largerArray, 0, bike.length());
            bikes = largerArray;
        }

        bikes[index++] = bike;

    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null ;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
                // TODO: when remove create an algorithm to resize the array.
                throw new UnsupportedOperationException("Not implemented");
            }
        };
        return it;
    }
}
