package baekjoon.구현.한줄로서기_1138;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String[] strLine = br.readLine().split(" ");
        int[] line = new int[strLine.length];
        for (int i = 0; i < line.length; i++) {
            int num = Integer.parseInt(strLine[i]);
            for (int j = 0; j < cnt; j++) {
                if(num == 0 && line[j]==0){
                        line[j] = i + 1;
                        break;
                }else if(line[j] == 0){
                    num --;
                }
            }

        }
        for (int j = 0; j < cnt; j++) {
            System.out.print(line[j] + " ");

        }
    }
}
