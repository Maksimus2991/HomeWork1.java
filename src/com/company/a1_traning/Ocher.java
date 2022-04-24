package com.company.a1_traning;

import java.util.*;

public class Ocher {
    public static void main(String[] args) {

        Queue queue2 = new LinkedList();// двуноправленный список
        Queue queue = new PriorityQueue();//отсортированная очередь
        queue.add("1");
        queue.add("2");
        queue.add("3");
        /*
        List list = (List)queue;
        Collection.sort(list);
         */
      while (queue.size()>0){
          System.out.println(queue.poll());
      }
    }
}
