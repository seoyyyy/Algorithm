package baekjoon.수학.인공지능_시계_2530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        s += Integer.parseInt(br.readLine());

        if(s >= 60){
            m += s / 60;
            s %= 60;
        }
        if(m >= 60){
            h += m / 60;
            m %= 60;
        }
        if(h >= 24){
            h %= 24;
        }
        System.out.println(h+" "+m+" "+s);
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
