package baekjoon.수학.공백없는A_B_15873;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String a = br.readLine();
            int n, m;
            if(a.length() > 2 && a.charAt(1) == '0'){
                n = Integer.parseInt(a.substring(0,2));
                m = Integer.parseInt(a.substring(2));
            }else{
                n = Integer.parseInt(a.substring(0,1));
                m = Integer.parseInt(a.substring(1));
            }

            System.out.println(n + m);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.solution();
    }
}
