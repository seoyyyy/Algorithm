package baekjoon.수학.소인수분해_11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소인수분해 11653
 */
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= Math.sqrt(N); i++) {
            while(N % i == 0){
                sb.append(i).append("\n");
                N /= i;
            }
        }

        if(N != 1){
            sb.append(N);
        }

        System.out.println(sb);

        /* 2번째
        if(N != 1){
            for (int i = 2; i <= N; i++) {
                while(N % i == 0){
                    System.out.println(i);
                    N /= i;
                }
            }
        }
        */

        /* 1번째
        if(N != 1){
            List<Integer> primes = new ArrayList<>();
            while(N > 1){
                for (int i = 2; i <= N; i++) {
                    if(N % i == 0){
                        N /= i;
                        primes.add(i);
                        break;
                    }
                }
            }

            for (Integer num : primes) {
                System.out.println(num);
            }
        }
        */


    }
}
