package com.wgcisotto.behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEverydayExample {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("William", "Ian", "Carol"));

        final Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            iterator.remove();
        }

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println(list.size());

    }

}
