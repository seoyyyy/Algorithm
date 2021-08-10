package baekjoon.수학.Square_pasture_14173;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] xy1 = new int[4]; // 0 : x1, 1: y1, 2: x2, 3: y2
        for (int i = 0; i < xy1.length; i++) {
            xy1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int[] xy2 = new int[4]; // 0 : x3, 1: y3, 2: x4, 3: y4
        for (int i = 0; i < xy2.length; i++) {
            xy2[i] = Integer.parseInt(st.nextToken());
        }

        int X = Math.max(xy1[2],xy2[2]) - Math.min(xy1[0],xy2[0]);
        int Y = Math.max(xy1[3],xy2[3]) - Math.min(xy1[1],xy2[1]);
        int result = (int)Math.pow(Math.max(X,Y),2);
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}