package baekjoon.구현.최소_최대_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 1000000;
        int max =  -1000000;
        int tmp;
        while(st.hasMoreTokens()){
            tmp = Integer.parseInt(st.nextToken());
            if(min>tmp){
                min = tmp;
            }
            if(max < tmp){
                max = tmp;
            }
        }
        System.out.println(min + " " + max);
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
