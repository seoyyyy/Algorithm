package baekjoon.for문.X보다작은수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int temp;
        while (st2.countTokens()<=cnt && st2.hasMoreTokens()){
            temp = Integer.parseInt(st2.nextToken());
            if(num > temp){
                sb.append(temp+" ");
            }
        }
        System.out.print(sb);
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
