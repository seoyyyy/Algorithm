package baekjoon.정렬.좌표정렬하기2_11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 좌표정렬하기2 11651
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        StringTokenizer stk;
        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(stk.nextToken()); // x좌표
            arr[i][1] = Integer.parseInt(stk.nextToken()); // y좌표
        }

        Arrays.sort(arr, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);

        for (int[] numbers : arr) {
            System.out.println(numbers[0] + " " + numbers[1]);
        }
    }
}
