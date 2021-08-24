package baekjoon.수학.even_or_odd_18005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n % 2 == 1){
            System.out.println(0);
        }else if(n / 2 % 2 == 0){
            System.out.println(2);
        }else{
            System.out.println(1);
        }
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}