package baekjoon.for문.별찍기1;

import java.io.*;

public class Main {
    private void solution(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int cnt = Integer.parseInt(br.readLine());
            for(int i=1; i<=cnt; i++){
                for (int j=0; j<i; j++){
                    bw.write("*");
                }
                bw.write("\n");
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.solution();
    }
}
