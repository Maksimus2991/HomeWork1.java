package com.company.lesson6.Homework3;;

public class Test {
    public static void main(String[] args) {
        Woman woman = new Woman("Maria", 29);
        Man man = new Man("Maxim", 29);
        man.setWife(woman);
        woman.setHusband(man);
    }

}
