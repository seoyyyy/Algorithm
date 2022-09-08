package baekjoon.수학.벌집_2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 벌집 2292
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int turn = 1;
        int cnt = 1;
        while(turn < N){
            turn += 6 * cnt;
            cnt ++;
        }

        System.out.println(cnt);
    }
}
