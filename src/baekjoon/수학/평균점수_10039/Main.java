package baekjoon.수학.평균점수_10039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        int avrScore = 0;
        int temp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            temp = Integer.parseInt(br.readLine());
            avrScore += temp > 40 ? temp : 40;
        }
        System.out.println(avrScore/5);
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
