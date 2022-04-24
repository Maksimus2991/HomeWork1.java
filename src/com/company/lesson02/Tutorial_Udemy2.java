package com.company.lesson02;

public class Tutorial_Udemy2 {
    public static int sum(int x, int y){
        int summa = x+y;
        System.out.println(summa);
        return summa;
    }
    public static int multy(int x, int y){
        int proizv = x*y;
        System.out.println(proizv);
        return proizv;
    }
    public static void subt(int multy, int sum){
        int rez = multy - sum;
        System.out.println(rez);

    }
    public static int div(int x, int y){
        int rez = x/y;
        System.out.println(rez);
        return rez;
    }
    public static double convert(int eur, double exchangeRate){
        double con = eur * exchangeRate;
        System.out.println(con);
        return con;
    }
    public static double percent(int x){
        double rez = x+(x*0.1);
        System.out.println(rez);
        return rez;
    }
    public static void stringFourTimes(String str){
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
    }

    public static void main(String[] args) {
        int rez1 = sum(45, 60);
        int rez2 = multy(45, 60);
        subt(rez2,rez1);
        int rez3 = div(54, 60);
        double rez4 = convert(34, 1.2);
        double rez5 = percent(5);
        stringFourTimes("Maxim");
    }
}
