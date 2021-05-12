package baekjoon.for문.별찍기2;

import java.io.*;

public class Main {
    private void solution(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int cnt = Integer.parseInt(br.readLine());
            for(int i=cnt; i>0;i--){
                for(int j=1; j<=cnt;j++){
                    if(i>j){
                        bw.write(" ");
                    }else {
                        bw.write("*");
                    }
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
