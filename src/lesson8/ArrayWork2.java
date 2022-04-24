package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayWork2 {
    public static void main(String[] args) throws IOException {
        int[] bigArray = new int[10];
        int[] smallArray1 = new int[5];
        int[] smallArray2 = new int[5];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }
        smallArray1 = Arrays.copyOfRange(bigArray,0,4);
        smallArray2 = Arrays.copyOfRange(bigArray,5,9);

        for (int i = 0; i < smallArray2.length; i++) {
            System.out.println(smallArray2[i]);
        }
    }
}
