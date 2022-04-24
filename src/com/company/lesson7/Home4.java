package com.company.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Home4 {
    public static void main(String[] args) throws IOException {
    int[]array =  initializeArray();
    int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
    public static int max(int[]array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }
}
