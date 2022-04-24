package com.company.a1_traning;

import java.util.*;

public class Spisok {



    public static void main(String[] args) {// есть несколько реализаций
        List list = new ArrayList();//коллекция, основание которой идут индексы. Работает на основании массивов.Изначально равен 10
        List vector = new Vector();// как Arraylist, но он синхронизирован
        List linkedList = new LinkedList(); //используется для очередей, двусторнний список


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));//как правильно выводить элементы на Al

        }
    }
}
