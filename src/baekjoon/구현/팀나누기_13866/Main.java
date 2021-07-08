package baekjoon.구현.팀나누기_13866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> d = new ArrayDeque<>();
        while(st.hasMoreTokens()){
            d.add(Integer.parseInt(st.nextToken()));
        }
        int result = Math.abs((d.remove() + d.removeLast()) - (d.remove() + d.removeLast()));
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
