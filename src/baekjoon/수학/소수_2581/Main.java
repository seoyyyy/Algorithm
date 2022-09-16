package baekjoon.수학.소수_2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = N;
        for (int i = M; i <= N; i++) {
            boolean flag = true;

            if(i == 1) flag = false; // 첫 시도에 1을 체크해주지 않아서 틀림

            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                sum += i;
                min = Math.min(min, i);
            }
        }


        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
