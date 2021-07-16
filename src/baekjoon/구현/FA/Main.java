package baekjoon.구현.FA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int x = Integer.parseInt(s.substring(0,1)) * s.length();
        int r = x;
        String result = f(r,String.valueOf(x));
        System.out.println(result);
    }

    public String f(int r, String x){
        try{
            x = String.valueOf(Integer.parseInt(x.substring(0,1)) * x.length());
            if(r == Integer.parseInt(x)){
                return "FA";
            }
            r = Integer.parseInt(x);
            return f(r,x);
        }catch(Exception e){
            return "NFA";
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
