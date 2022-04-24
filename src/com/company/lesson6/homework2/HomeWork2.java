package com.company.lesson6.homework2;

public class HomeWork2 {
    public static void main(String[] args) {
        Woman woman = new Woman("Maria", 40);
        Cat cat = new Cat("Murzik", 2);
        cat.setOwner(woman.getName());
        Dog dog = new Dog("Sharik", 6);
        dog.setOwner(woman.getName());
        Fish fish = new Fish("Gupi", 1);
        fish.setOwner(woman.getName());
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(fish);

    }
}