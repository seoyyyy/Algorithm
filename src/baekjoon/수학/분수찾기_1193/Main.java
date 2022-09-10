package baekjoon.수학.분수찾기_1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 분수찾기 1193
 * 다음에 한번 더 풀어보기..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int line = 0;
        int cnt = 0;
        while(cnt < n) {
            line++;
            cnt = line * (line +1 ) / 2;
        }

        if( line % 2 != 0) {
            int top = 1+(cnt-n);
            int bottom = line - (cnt-n);
            System.out.println(top+"/"+bottom);
        }else {
            int top = line - (cnt - n);
            int bottom = 1 + (cnt - n);
            System.out.println(top+"/"+bottom);
        }

    }
}
