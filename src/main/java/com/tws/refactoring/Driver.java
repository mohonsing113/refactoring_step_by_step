package com.tws.refactoring;

public class Driver {
    private int age;

    public int getAge() {
        return age;
    }

    public Driver(int age) {
        this.age = age;
    }

    boolean isAdult(){
        return getAge() >= 18;
    }
}
