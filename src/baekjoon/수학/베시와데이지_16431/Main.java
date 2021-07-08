package baekjoon.수학.베시와데이지_16431;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] mapXY = new int[3][2]; // [0][]: Bassie XY, [1][]: Daisy XY, [2][]: John XY
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            mapXY[i][0] = Integer.parseInt(st.nextToken());
            mapXY[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] bassie_result = {Math.abs(mapXY[2][0] - mapXY[0][0]), Math.abs(mapXY[2][1]- mapXY[0][1])};
        int[] daisy_result = {Math.abs(mapXY[2][0] - mapXY[1][0]), Math.abs(mapXY[2][1] - mapXY[1][1])};

        int B = Math.max(bassie_result[0], bassie_result[1]);
        int D = daisy_result[0] + daisy_result[1];

        if(B == D) {
            System.out.println("tie");
        }else if(B < D){
            System.out.println("bessie");
        }else{
            System.out.println("daisy");
        }

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
