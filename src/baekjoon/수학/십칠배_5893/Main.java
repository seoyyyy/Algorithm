package baekjoon.수학.십칠배_5893;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n2 = br.readLine();
        BigInteger n10 = new BigInteger(n2, 2);
        BigInteger n17 = new BigInteger(Integer.toBinaryString(17),2);
        String s = n10.multiply(n17).toString(2);
        System.out.println(s);


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
