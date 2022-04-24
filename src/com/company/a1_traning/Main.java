package com.company.a1_traning;

        import java.util.*;
/*
//для MAp
class Book {
    String nameAutor;
    public Book(String nameAutor) {
        this.nameAutor = nameAutor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAutor='" + nameAutor + '\'' +
                '}';
    }
}
*/
public class Main {
    public static void main(String[] args) {
        //Collection collection = new ArrayList();
        //collection.add("1");
        //collection.add("2");
        //collection.add("3");
        //collection.remove("2");
        // List collection = new ArrayList();// беруться по значению на основе индексов;
        //collection.add("1");
        //collection.add("2");
        //collection.set(0,"5");

        // for(Object o : collection){
        //   System.out.println(o);
        //for (int i = 0; i < collection.size(); i++) {
        //  System.out.println(collection.get(i));
       /* Queue collection = new PriorityQueue();//очереди Fifo;
        collection.offer("1");
        collection.offer("2");
        collection.offer("3");
       /* for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.peek());
            System.out.println(collection.poll());
        }

        for (Object o : collection) {
            System.out.println(o);

        }
        System.out.println(collection.size());
           */
       /* Set collection = new HashSet();// коллекции уникальных объектов - значение добаляется только раз
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("3");
        collection.add("3");
        collection.add("3");
        for (Object o : collection) {
            System.out.println(o);
        }*/
            /*
            Map collection = new HashMap();// отдельный интерфейс не входящий в Collection, но относиться к Collection
            collection.put("1", "Tolstoy");
            collection.put("2", new Book("Pushkin"));
            collection.put("3", "Gor'kiy");
            System.out.println(collection.get("2"));
            Set set = collection.entrySet();
            for (Object o : set) {
                System.out.println(o);
            }
            Set set1 = collection.keySet();
            for (Object o : set1) {
                System.out.println(o);

            }

             */
        Collection collection = new HashSet();//неупорядоченная коллекция
        collection.add("3");
        collection.add("2");
        collection.add("1");
        for (Object o : collection) {
            System.out.println(o);
        }
        Collection collection1 = new LinkedHashSet();//упорядоченная коллекция
        collection1.add("3");
        collection1.add("2");
        collection1.add("1");
        for (Object p : collection1) {
            System.out.println(p);
        }
        Collection collection3 = new TreeSet();//отсортированная коллекция
        collection3.add("3");
        collection3.add("2");
        collection3.add("1");
        for (Object d : collection) {
            System.out.println(d);
        }
    }
}




