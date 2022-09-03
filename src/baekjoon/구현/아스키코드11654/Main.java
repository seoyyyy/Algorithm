package baekjoon.구현.아스키코드11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 아스키코드
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = (char) br.read();
        System.out.println((int) c);
    }
}
