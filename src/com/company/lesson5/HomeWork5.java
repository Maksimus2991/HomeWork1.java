package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String str1 = reader.readLine();
        int n = Integer.parseInt(str1);
        int i = 0;
        while (i < n) {
            System.out.print(str);
            i++;
        }
    }
}
