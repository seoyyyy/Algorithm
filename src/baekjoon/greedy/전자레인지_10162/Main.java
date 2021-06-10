package baekjoon.greedy.전자레인지_10162;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] score = new int[3];
        int time = Integer.parseInt(br.readLine());
        if(time % 10 == 0){
            while(time > 0){
                if(time >= 300) {
                    time -= 300;
                    score[0]++;
                }else if(time >=60){
                    time -= 60;
                    score[1]++;
                }else{
                    time -= 10;
                    score[2]++;
                }
            }

            for (int i:score) {
                System.out.print(i+" ");
            }
        }else {
            System.out.println(-1);
        }




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
