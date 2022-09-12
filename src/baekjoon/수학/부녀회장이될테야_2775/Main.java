package baekjoon.수학.부녀회장이될테야_2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 부녀회장이 될테야 2775
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] apart = new int[15][15];

        for (int i = 0; i < apart[0].length; i++) {
            apart[0][i] = i;
        }

        for (int i = 1; i <= 14; i++) {
            for (int j = 1; j <= 14; j++) {
                apart[i][j] = apart[i][j-1] + apart[i-1][j];
            }
        }

        for (int i = 0; i < N; i++) {
            int floor = Integer.parseInt(br.readLine());
            int ho = Integer.parseInt(br.readLine());

            System.out.println(apart[floor][ho]);
        }
    }
}

