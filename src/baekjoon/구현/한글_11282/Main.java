package baekjoon.구현.한글_11282;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char result = (char)((int)'가'+Integer.parseInt(br.readLine())-1);
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}
