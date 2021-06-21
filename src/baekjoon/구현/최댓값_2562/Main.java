package baekjoon.구현.최댓값_2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0, temp =0, index =0;
        for(int i=0; i<9; i++){
            temp = Integer.parseInt(br.readLine());
            if(max < temp){
                max = temp;
                index = i + 1;
            }
        }

        System.out.println(max + " \n" + index);
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
