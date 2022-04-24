package lesson8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrwork {
    public static void main(String[] args) throws Exception{
        String[]array = initialize();

    }
     public static String[] initialize() throws IOException {
        String[] array = new String[10];
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         for (int i = 0; i < array.length; i++) {
             array[i] = reader.readLine();
         }
        return array;
     }
     public void PrintArrays(String[] array) {
         for (int i = array.length - 1; i >= 0; i--) {
             System.out.println(array[i]);
         }
    }
}
