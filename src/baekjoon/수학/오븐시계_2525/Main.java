package baekjoon.수학.오븐시계_2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(br.readLine());

        hour += (minute + num) / 60;
        minute = (minute + num) % 60;

        if(minute >= 60){
            minute -= 60;
            hour ++;
        }

        if(hour >= 24) {
            hour -= 24;
        }

        System.out.println(hour+" "+ minute);

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
