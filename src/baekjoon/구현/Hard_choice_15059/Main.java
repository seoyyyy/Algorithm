package baekjoon.구현.Hard_choice_15059;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int[] a = new int[3];
        int[] b = new int[3];

        for(int i=0; i<a.length; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<b.length; i++){
            b[i] = Integer.parseInt(st2.nextToken());
        }

        int chicken = (a[0] - b[0]) > 0 ? 0  : Math.abs(a[0] - b[0]);
        int beef =  (a[1] - b[1]) > 0 ? 0  : Math.abs(a[1] - b[1]);
        int pasta =  (a[2] - b[2]) > 0 ? 0  : Math.abs(a[2] - b[2]);
        System.out.println(chicken + beef + pasta);

    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}
