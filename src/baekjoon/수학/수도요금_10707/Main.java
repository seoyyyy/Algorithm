package baekjoon.수학.수도요금_10707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = arr[0] * arr[4];
        int y = arr[1] + (arr[4] > arr[2] ? (arr[4] - arr[2]) * arr[3] : 0);
        System.out.println(Math.min(x,y));
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
