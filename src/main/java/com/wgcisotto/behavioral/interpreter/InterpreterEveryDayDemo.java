package com.wgcisotto.behavioral.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEveryDayDemo {


    public static void main(String[] args) {
        String input = "Lions, and tigers, and bears! Oh, my!";

        Pattern p = Pattern.compile("lion|cate|dog|wolf|bear|human|tiger|liger");
        Matcher m = p.matcher(input);

        while (m.find()){
            System.out.println("Found a " + m.group() + ".");
        }

    }




}
