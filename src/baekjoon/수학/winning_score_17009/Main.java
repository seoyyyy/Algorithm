package baekjoon.수학.winning_score_17009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] scores = new int[6];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }
        int apple = scores[0] * 3 + scores[1] * 2 + scores[2] * 1;
        int banana = scores[3] * 3 + scores[4] * 2 + scores[5] * 1;

        if (apple == banana){
            System.out.println("T");
        }else if(banana > apple){
            System.out.println("B");
        }else{
            System.out.println("A");
        }

    }
    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}