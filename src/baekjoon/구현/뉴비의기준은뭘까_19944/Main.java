package baekjoon.구현.뉴비의기준은뭘까_19944;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public String solution() throws IOException {
        String answer;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m <= n){
            if(m < 3){
                answer = "NEWBIE!";
            }else {
                answer = "OLDBIE!";
            }
        }else{
            answer = "TLE!";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        try {
            String result = m.solution();
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
