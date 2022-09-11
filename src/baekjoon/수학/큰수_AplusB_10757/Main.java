package baekjoon.수학.큰수_AplusB_10757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 큰 수 A + B 10757
 * 큰수연산에는 BigInteger를 사용한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strNumbers = br.readLine().split(" ");
        BigInteger a = new BigInteger(strNumbers[0]);
        BigInteger b = new BigInteger(strNumbers[1]);

        System.out.println(a.add(b));
    }
}
