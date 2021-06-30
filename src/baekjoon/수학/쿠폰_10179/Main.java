package baekjoon.수학.쿠폰_10179;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double m;
        for(int i = 0; i<n; i++){
            m = Double.parseDouble(br.readLine());
            System.out.println(String.format("$%.2f", m * 0.8));
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
