package baekjoon.구현.TelemarketerOrNot_16017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] digits = new int[4];
        int[]  telemarkerNum = {8,9};
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(br.readLine());
        }
        if((digits[0] == 8 || digits[0] == 9) && (digits[1] == digits[2]) &&(digits[3] == 8 || digits[3] == 9)){
            System.out.println("ignore");
        }else{
            System.out.println("answer");
        }
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}