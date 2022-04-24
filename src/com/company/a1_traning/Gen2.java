package com.company.a1_traning;

import java.io.*;
import java.util.*;

class Parent{

}
class Child extends Parent{

}//класс может быть женерик, приэтом у него может быть несколько типов,  переменные, методы, параметры - женерик, но проблема в том
//что они в основном используются в коллекциях, не может быть статической сигнатуры, массив женерик не возможно создать.
//главное удобство в один список мы можем записать только один список.

public class Gen2 <T extends Gen2 & Comparable & Serializable> {
    public static void main(String[] args) {
        List<Parent>list= new ArrayList<Parent>();//парраметризованный объект
       list.add(new Parent());
       list.add(new Child());
       Gen2 gen2 = new Gen2();
       gen2.method(list);
        }
        /*
        list2.add("");
        list2.add(new Object());
        list2.add(new File(""));
        for (Object o : list2) {
            File f = (File)o;
            код не будет работать, потому что нет параметров
        }
        */
       void method(List<? extends Parent>list){
           for (Parent parent: list) {
               System.out.println(parent);
           }
          //list.add(new Gen2());

        }

    }

