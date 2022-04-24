package com.company.a1_traning;

import java.util.*;

public class Nod {
    public static void main(String[] args) {
        Set set = new HashSet();//элемент Collection, в которой нет повторений. HashSet - неупорядоченная
        Set set1 = new LinkedHashSet();// упорядоченная
        Set set2 = new TreeSet();//отсортированная
        set.add("1");
        set.add("2");
        set.add("2");
        set.add("1");
        set.add("1");
        for (Object o : set) {
            System.out.println(o);

        }
    }
}
