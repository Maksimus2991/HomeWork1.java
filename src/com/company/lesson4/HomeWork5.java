package com.company.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        number(Integer.parseInt(reader.readLine()));
    }
    public static void number(int num){
        if(num>0){
            System.out.println(num*2);
        }else if(num<0){
            System.out.println(num*10);
        }
    }
}
