package baekjoon.수학.상근날드_5543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minHbg=2000, minDrk=2000;
        int temp;
        for(int i=0; i<5; i++){
            temp = Integer.parseInt(br.readLine());
            if(i < 3 && minHbg > temp) minHbg = temp;
            else if(i >= 3 && minDrk > temp) minDrk = temp;
        }
        System.out.println(minHbg+minDrk-50);
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
