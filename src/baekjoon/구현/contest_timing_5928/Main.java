package baekjoon.구현.contest_timing_5928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] time = new int[3];
        for (int i = 0; i < time.length; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }

        int start = 11 * 24 * 60 + 11 * 60 + 11;
        int end = time[0] * 24 * 60 + time[1] * 60 + time[2];

        int res = end - start;

        if(res < 0){
            System.out.println(-1);
        }else{
            System.out.println(res);
        }

    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}