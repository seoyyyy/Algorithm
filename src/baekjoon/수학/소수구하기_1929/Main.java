package baekjoon.수학.소수구하기_1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(stk.nextToken());
        int N = Integer.parseInt(stk.nextToken());

        StringBuilder sb = new StringBuilder();
        for(int i = M; i <= N; i++){
            if(i < 2) continue;

            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if( i % j == 0){
                    flag = false;
                    break;
                }
            }

            if(flag){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
