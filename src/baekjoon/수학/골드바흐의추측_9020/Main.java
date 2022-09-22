package baekjoon.수학.골드바흐의추측_9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  골드바흐의 추측 9020
 */
public class Main {

    public static boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int a, b;
            int calVal = Integer.MAX_VALUE; // 두 소수의 차를 담을 변수
            int resultA = 0, resultB = 0; // 최종 결과
            for (a = 2; a < N; a++) {
                if(!isPrime(a)) continue;

                b = N - a;

                if(a > b) break;

                if(isPrime(b)){
                    if(b - a < calVal){
                        calVal = b - a;
                        resultA = a;
                        resultB = b;
                    }
                }
            }

            System.out.println(resultA + " " + resultB);
        }

    }
}
