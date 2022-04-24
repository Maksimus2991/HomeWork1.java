package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayWork {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array1 = new String[5];
        int[] array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = reader.readLine();
           // array2[i] = array1[i].length();
           // System.out.println(array2[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i].length();
            System.out.println(array2[i]);
        }
    }
}
