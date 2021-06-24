package baekjoon.구현.파일옮기기_11943;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr1 = new int[2];
        int[] arr2 = new int[2];
        for (int i=0; i<2;i++){
            st = new StringTokenizer(br.readLine());
            int cnt = 0;
            while(st.hasMoreTokens()){
                if(i == 0){
                    arr1[cnt] = Integer.parseInt(st.nextToken());
                }else{
                    arr2[cnt] = Integer.parseInt(st.nextToken());
                }// if
                cnt ++;
            }// while
        }// for

        if (arr1[0]+arr2[1] == 0 || arr1[1] + arr2[0] == 0){
            System.out.println(0);
        }else{
            System.out.println(Math.min(arr1[0]+arr2[1], arr1[1]+arr2[0]));

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
