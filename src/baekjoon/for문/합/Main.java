package baekjoon.for문.합;

import java.util.Scanner;

public class Main {
    private void solution(){
        Scanner s = new Scanner(System.in);
        int result =0;
        int cnt = s.nextInt();
        for(int i=1;i<=cnt;i++){
            result += i;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.solution();
    }
}
