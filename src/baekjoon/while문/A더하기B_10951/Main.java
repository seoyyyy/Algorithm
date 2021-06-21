package baekjoon.while문.A더하기B_10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String s;
        int a,b;
        while ((s=br.readLine())!= null){
            st = new StringTokenizer(s);
            try{
               a = Integer.parseInt(st.nextToken());
               b = Integer.parseInt(st.nextToken());
                System.out.println(a+b);
            }catch (Exception e){
                break;
            }

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
