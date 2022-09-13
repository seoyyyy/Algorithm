package baekjoon.수학.설탕배달_2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 설탕배달 2839
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        while(N >= 3){
            if(N % 5 == 0){
                N -= 5;
            }else if(N >= 3){
                N -= 3;
            }
            count ++;
        }

        if(N != 0) {
            count = -1;
        }
        System.out.println(count);
    }
}
