package baekjoon.문자열.문자열반복_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringJoiner sj = new StringJoiner("");
            String[] caseStr = br.readLine().split(" ");
            int cnt = Integer.parseInt(caseStr[0]);
            String str = caseStr[1];
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < cnt; k++) {
                    sj.add(String.valueOf(str.charAt(j)));
                }
            }
            System.out.println(sj);
        }

    }

}
