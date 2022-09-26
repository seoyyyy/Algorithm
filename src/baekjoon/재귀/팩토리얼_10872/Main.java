package baekjoon.재귀.팩토리얼_10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = fact(N);
        System.out.println(result);
    }

    public static int fact(int num){
        if(num <= 1){
            return 1;
        }

        return fact(num - 1) * num;
    }
}
