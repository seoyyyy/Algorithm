package baekjoon.수학.수학은_체육과목_입니다_2_17362;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) % 8;
        int result;

        if (n == 2 || n == 0) {
            result = 2;
        }else if(n == 3 || n == 7){
            result = 3;
        }else if(n == 4 || n == 6){
            result = 4;
        }else if(n == 5){
            result = 5;
        }else{
            result = 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Main m = new Main();
        try {
            System.out.println(m.solution());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
