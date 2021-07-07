package baekjoon.수학.AFC윔블턴_4299;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if( p - m < 0 || (p - m) % 2 != 0){
                System.out.println(-1);
            }else{
                int a = (p + m) / 2;
                int b = p - a;
                System.out.println(a +" "+ b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Main m = new Main();
        m.solution();
    }
}
