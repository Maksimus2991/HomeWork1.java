package com.company.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        closeToFive(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
    }
    public static void closeToFive(int a, int b){
       int raz1 = 5-a;
       int raz2 = 5-b;
        if(raz1<raz2){
            System.out.println(a);
        }else if(raz1>raz2){
            System.out.println(b);
        }else if(raz1==raz2){
            System.out.println("equals");
        }
    }
}
