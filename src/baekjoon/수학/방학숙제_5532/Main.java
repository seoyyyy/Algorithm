package baekjoon.수학.방학숙제_5532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int korean = arr[1]/arr[3] + (arr[1]%arr[3] == 0 ? 0 : 1);
        int math = arr[2]/arr[4] + (arr[2]%arr[4] == 0 ? 0 : 1);

        System.out.println(arr[0] - Math.max(korean,math));
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
