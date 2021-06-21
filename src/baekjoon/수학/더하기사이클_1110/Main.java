package baekjoon.수학.더하기사이클_1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class Main {
    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("00");

        String n = df.format(Integer.parseInt(br.readLine()));

        String origin = n;
        String tmp;
        int cnt = 0;
        while (true){
            tmp = String.valueOf(Integer.parseInt(String.valueOf(n.charAt(0)))+Integer.parseInt(String.valueOf(n.charAt(1))));
            n = String.valueOf(n.charAt(1)) + tmp.charAt(tmp.length()-1);
            cnt ++;
            if(origin.equals(n)) {
                break;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Main m = new Main();
        try {
            System.out.println(m.solution());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
