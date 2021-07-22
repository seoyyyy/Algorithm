package baekjoon.수학.감정이입_14623;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long b1 = Long.parseLong(br.readLine(),2);
        long b2 = Long.parseLong(br.readLine(),2);
        System.out.println(Long.toBinaryString(b1*b2));
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}