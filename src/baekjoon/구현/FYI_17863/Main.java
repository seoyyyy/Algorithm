package baekjoon.구현.FYI_17863;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.readLine().startsWith("555")) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}