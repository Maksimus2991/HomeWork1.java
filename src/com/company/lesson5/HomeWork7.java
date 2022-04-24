package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true){
            int num = Integer.parseInt(reader.readLine());
            sum += num;
            if(num == -1) {
                break;
            }
        }
        System.out.println(sum);
    }
}



