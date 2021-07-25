package baekjoon.수학.평균_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double [] arr = new double[n];
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(max < arr[i]){
                max = arr[i];
            }
        }

        double sum = 0;
        // 새로운 평균 구하기
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] / max * 100;
        }

        double avg = sum / arr.length;

        System.out.println(avg);
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}