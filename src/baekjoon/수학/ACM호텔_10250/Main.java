package baekjoon.수학.ACM호텔_10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ACM 호텔 10250
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(stk.nextToken());
            int W = Integer.parseInt(stk.nextToken());
            int N = Integer.parseInt(stk.nextToken());

            if(N % H == 0){
                System.out.println(100 * H + (N / H )); // 100 * H = 층, (N/H) = 호
            }else{
                System.out.println(100 * (N % H) + (N / H + 1));
            }

        }
    }
}
