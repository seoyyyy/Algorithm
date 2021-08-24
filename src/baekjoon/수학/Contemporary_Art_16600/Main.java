package baekjoon.수학.Contemporary_Art_16600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        System.out.println(Math.sqrt(n) * 4);

    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}