package baekjoon.수학.시험점수_5596;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int mingook = 0;
        while(st1.hasMoreTokens()){
            mingook+= Integer.parseInt(st1.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int manse = 0;
        while (st2.hasMoreTokens()){
            manse += Integer.parseInt(st2.nextToken());
        }

        System.out.println(mingook != manse ? Math.max(mingook, manse) : mingook);
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
