package baekjoon.수학.소수찾기1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 소수 찾기 1978
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(stk.nextToken());

            if(num > 1){
                boolean flag = true;
                for (int j = 2; j < num; j++) {
                    if(num % j == 0){
                        flag = false;
                    }
                }

                if(flag){
                    cnt ++;
                }
            }
        }
        System.out.println(cnt);
    }
}
