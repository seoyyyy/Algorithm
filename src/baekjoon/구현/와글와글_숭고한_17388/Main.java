package baekjoon.구현.와글와글_숭고한_17388;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        int i = 0;
        int[] contribution = new int[3];
        String[] school = {"Soongsil", "Korea", "Hanyang", "OK"};
        while (st.hasMoreTokens()){
            contribution[i] = Integer.parseInt(st.nextToken());
            sum += contribution[i];
            i++;
        }

        if(sum >= 100){
            System.out.println(school[3]);
        }else{
            int min = 100;
            int min_idx = 0;
            for (i=0; i<contribution.length; i++){
                if (min > contribution[i]){
                    min = contribution[i];
                    min_idx = i;
                }
            }
            System.out.println(school[min_idx]);
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
