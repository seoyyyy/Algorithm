package baekjoon.while문.A더하기B6;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1=0,num2=0;
        boolean flag = true;
        while(flag){
            StringTokenizer st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){
                num1 = Integer.parseInt(st.nextToken());
                num2 = Integer.parseInt(st.nextToken());
            }
                if (num1 ==0 && num2 ==0){
                    break;
                }
                bw.write((num1 + num2) +"\n");
        }
        bw.flush();
        br.close();
        bw.close();
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
