package baekjoon.문자열.상수_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        String a = new StringBuilder(stk.nextToken()).reverse().toString();
        String b = new StringBuilder(stk.nextToken()).reverse().toString();

        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);

        System.out.println(numA > numB ? numA : numB);

    }
}
