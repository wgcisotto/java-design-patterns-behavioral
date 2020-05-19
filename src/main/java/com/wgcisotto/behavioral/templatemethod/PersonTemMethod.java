package com.wgcisotto.behavioral.templatemethod;

public class PersonTemMethod implements Comparable<PersonTemMethod>{

    private int age;
    private String name;
    private String phoneNumber;

    public PersonTemMethod(){

    }

    public PersonTemMethod(int age, String name, String phoneNumber){
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(PersonTemMethod o) {
        if(this.age > o.getAge()){
            return 1;
        }
        if(this.age < o.getAge()){
            return -1;
        }
        return 0;
    }
}