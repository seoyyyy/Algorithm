package baekjoon.재귀.피보나치수5_10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        int result = fibo(n);

        System.out.println(result);
    }

    public static int fibo(int n){
        if(n < 2){
            return n;
        }

        return fibo(n - 2) + fibo(n - 1);
    }
}
