package baekjoon.수학.베르트랑공준_4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 베트르랑 공준
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int N = Integer.parseInt(br.readLine());

            if(N == 0) break;

            boolean check[] = new boolean[2 * N + 1];
            check[0] = true;
            check[1] = true;

            for (int i = 2; i <= Math.sqrt(2 *  N + 1); i++) {
                for (int j = i * i; j < 2 * N + 1; j+=i) {
                    check[j] = true;
                }

            }

            int cnt = 0;
            for (int i = N + 1; i < 2 * N + 1; i++) {
                if(!check[i]){
                    cnt ++;
                }
            }
                System.out.println(cnt);
        }
    }
}
