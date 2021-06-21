package baekjoon.수학.숫자의_개수_2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1;
        for(int i=0; i<3; i++){
            n *= Integer.parseInt(br.readLine());
        }
        int cnt;
        char[] ca = String.valueOf(n).toCharArray();
        for(int i=0; i<10; i++){
            cnt =0;
            for(char c:ca){
                if(String.valueOf(i).equals(String.valueOf(c))) {
                    cnt++;
                }
            }
            System.out.println(cnt);
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
