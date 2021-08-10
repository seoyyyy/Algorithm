package baekjoon.수학.Equality_13985;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int a = Integer.parseInt(s.substring(0,s.indexOf('+')).trim());
        int b = Integer.parseInt(s.substring(s.indexOf('+') + 1, s.indexOf('=')).trim());
        int r = Integer.parseInt(s.substring(s.indexOf('=')+1).trim());
        System.out.println(a + b == r ? "YES" : "NO");
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}
