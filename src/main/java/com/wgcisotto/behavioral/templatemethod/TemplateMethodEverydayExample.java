package com.wgcisotto.behavioral.templatemethod;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TemplateMethodEverydayExample {

    public static void main(String[] args) {

        PersonTemMethod william = new PersonTemMethod(28, "William", "1111");
        PersonTemMethod carol = new PersonTemMethod(38, "Carol", "2222");
        PersonTemMethod ian = new PersonTemMethod(2, "Ian", "3333");

        List<PersonTemMethod> people = Arrays.asList(william, carol, ian);

        System.out.println("Not sorted");
        printContents(people);


        System.out.println("\nSorted by Age");
        Collections.sort(people);
        printContents(people);

    }

    private static void printContents(List<PersonTemMethod> people) {
        people.forEach(person -> System.out.println(person.getName()));
    }

}
