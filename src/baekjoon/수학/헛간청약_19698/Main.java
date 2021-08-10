package baekjoon.수학.헛간청약_19698;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int res = (W / L) * (H / L) ;
        if(N < res){
            System.out.println(N);
        }else{
            System.out.println(res);
        }
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}