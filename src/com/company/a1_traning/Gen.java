package com.company.a1_traning;

public class Gen {
    public static void main(String[] args) throws Exception{
        Gen m1 = new Gen();
        m1.method(123);
    }
    <T> T method(T type){
        System.out.println(type);
        return type;
        /*
        называют "Обобщенные классы"
        примеры синтаксиса
        может как передавать так и возращать.
        может быть женерик класса
        public class Gen <T>{
        T var;
        public static void main(String[] args) throws Exception{
         Gen<String> m1 = new Gen<>();
         m1.var = "maksim";
         System.out.println(m1.var);
         }
         <T> void method(String s){
        System.out.println(s);
        }
        }
        нет Set и Get
        но можно решить проблему прописав в сигнатуре класса  :
        class Car implements Comparable{
        @override
        public int compareTo(Object o){
        return 0;
        }
        public class Gen <T extends & Comparable & Serializable>{
        ....
        }
        <T>  method(T type){
        type.comparable(new Object());
        System.out.println(type);
        return type;
        }
        можно эксендить любые  классы и имплементировать интерфейсы, ограничен классом Object
        восновном исползуется в коллекциях
        массивы:
        List<String> var
        в женерик удомно хранить данные
         */
    }
}
