package baekjoon.수학.숫자의합_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        String[] numbers = br.readLine().split("");
        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            int num = Integer.parseInt(numbers[i]);
            sum += num;
        }

        System.out.println(sum);
    }
}
