package com.wgcisotto.behavioral.strategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StratergyEverydayExemplo {

    public static void printContents(List<Person> people){
        people.forEach(person -> System.out.println(person.getName()));
    }

    public static void main(String[] args) {
        Person william = new Person(28, "William", "1111");
        Person carol = new Person(38, "Carol", "2222");
        Person ian = new Person(2, "Ian", "3333");

        List<Person> people = Arrays.asList(william, carol, ian);

        System.out.println("Not sorted");
        printContents(people);

        Collections.sort(people, (p1, p2) -> {
           if(p1.getAge() > p2.getAge()){
               return 1;
           }

            if(p1.getAge() < p2.getAge()){
                return -1;
            }

            return 0;
        });


        System.out.println("\nSorted by Age");
        printContents(people);


        Collections.sort(people, (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));

        System.out.println("\nSorted by Name");
        printContents(people);

    }

}
