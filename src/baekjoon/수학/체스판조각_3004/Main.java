package baekjoon.수학.체스판조각_3004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 2;
        int cnt = 2;
        for(int i=1; i<n+1; i++){
            if(i < n){
                answer += cnt;
            }
            if(i % 2 == 0) {
                cnt += 1;
            }
        }
        System.out.println(answer);

    }

    public static void main(String[] args) {
        Main m = new Main();
        try {
            m.solution();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
