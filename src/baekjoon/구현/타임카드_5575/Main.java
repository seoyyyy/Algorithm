package baekjoon.구현.타임카드_5575;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] time = new int[6];
        int cnt;
        for(int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine());
            cnt = 0;
            while(st.hasMoreTokens()){
                time[cnt] = Integer.parseInt(st.nextToken());
                cnt ++;
            }

            if(time[5] >= time[2]){
                time[5] -= time[2];
            }else{
                time[5] -= (time[2]-60);
                time[4] -= 1;
            }

            if(time[4] >= time[1]){
                time[4] -= time[1];
            }else{
                time[4] -= (time[1]-60);
                time[3] -= 1;
            }

            if(time[3] >= time[0]){
                time[3] -= time[0];
            }else{
                time[3] -= (time[0]-24);
            }
            System.out.println(time[3]+" "+time[4]+" "+time[5]);
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
