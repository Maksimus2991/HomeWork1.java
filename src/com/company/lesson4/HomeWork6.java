package com.company.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        checkInterval(Integer.parseInt(reader.readLine()));
    }
    public static void checkInterval(int a){
        if (a>=20 && a<=50){
            System.out.println("Число а содержится в интервале.");
        }else if(a<20){
            System.out.println("Число а не содержится в интервале." );
        }else if (a>50){
            System.out.println("Число а не содержится в интервале." );
        }
    }
}
