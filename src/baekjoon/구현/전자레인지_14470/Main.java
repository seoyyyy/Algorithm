package baekjoon.구현.전자레인지_14470;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 0: 현재 고기의 온도 a
     * 1: 목표 온도 b
     * 2: 얼어있는 고기를 1도 데우는데 걸리는 시간 c
     * 3: 얼어있는 고기를 해동하는데 걸리는 시간 d
     * 4: 얼어있지 않은 고기를 1도 데우는데 걸리는 시간 e
     */
    public void solution() throws IOException {
        int result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(arr[0]<0){
            result = Math.abs(arr[0]) * arr[2] + arr[3];
            arr[0] = 0;
        }

        result += (arr[1] - arr[0]) * arr[4];

        System.out.println(result);

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
