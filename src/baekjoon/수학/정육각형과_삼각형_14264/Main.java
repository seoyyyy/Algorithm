package baekjoon.수학.정육각형과_삼각형_14264;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        Double result = Math.sqrt(3) / 4 * Math.pow(l,2);
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}