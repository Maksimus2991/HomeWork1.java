package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4 {
    public static void main(String[] args) throws IOException {


    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int m = Integer.parseInt(reader.readLine());
    int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("8");
        }
        System.out.println();
    }
}
}


