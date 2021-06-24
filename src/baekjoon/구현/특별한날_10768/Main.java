package baekjoon.구현.특별한날_10768;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        if(month == 2 && day == 18){
            System.out.println("Special");
        }else if(month > 2 || (month == 2 && day > 18)){
            System.out.println("After");
        }else {
            System.out.println("Before");
        }

    }

    public static void main(String[] args) {
        Main m = new Main();
        try {
            m.solution();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
