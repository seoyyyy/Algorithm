package baekjoon.수학.Abbey_Courtyard_15610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        Double n2 = Math.sqrt(n);
        System.out.println(n2 * 4);
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}