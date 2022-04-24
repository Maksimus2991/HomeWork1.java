package com.company.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        compare(Integer.parseInt(reader.readLine()));
    }
public static void  compare(int a){
        if(a<5){
            System.out.println( "Число меньше 5");
        }else if(a>5){
            System.out.println( "Число болдьше 5");
        }else if(a == 5){
            System.out.println( "Число равно 5");
        }
    }
}
