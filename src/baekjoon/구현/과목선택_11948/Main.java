package baekjoon.구현.과목선택_11948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s1Min = 100;
        int s2Min = 100;
        int sum = 0;
        int tmp;
        for(int i=0; i<6; i++){
            tmp = Integer.parseInt(br.readLine());
            if(i<4 && s1Min > tmp){
                s1Min = tmp;
            }else if(i>=4 && s2Min > tmp){
                s2Min = tmp;
            }
            sum += tmp;
        }
        int result = sum - s1Min - s2Min;
        System.out.println(result);
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
