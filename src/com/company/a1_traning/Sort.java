package com.company.a1_traning;
//сортировка коллекций

import java.util.*;
/*
class Person implements Comparable<Person> {
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override// этот метод возращает значение, которое обозначает объект которое сравнивает с текущим объектом
    public int compareTo(Person p) {
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

public class Sort {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(new Person(3));
        set.add(new Person(6));
        set.add(new Person(4));
        set.add(new Person(2));
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
*/
// когда нет доступа к интерфейсу в данном случае Person
class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
    class ComparePerson implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2){
        return o1.getAge() - o2.getAge();
    }
    }

public class Sort {
    public static void main(String[] args) {
        Set set = new TreeSet(new ComparePerson());
        set.add(new Person(3));
        set.add(new Person(6));
        set.add(new Person(4));
        set.add(new Person(2));
        for (Object o : set) {
            System.out.println(o);
        }
    }
}