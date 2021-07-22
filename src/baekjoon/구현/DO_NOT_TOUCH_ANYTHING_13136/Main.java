package baekjoon.구현.DO_NOT_TOUCH_ANYTHING_13136;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         int r = Integer.parseInt(st.nextToken());
         int c = Integer.parseInt(st.nextToken());
         int n = Integer.parseInt(st.nextToken());

        System.out.println(r/n * c/n);
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
