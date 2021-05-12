package baekjoon.for문.A더하기B_3;

import java.util.Scanner;

public class Main {
    private void solution(){
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        for(int i=0;i<cnt;i++){
            System.out.println(s.nextInt()+s.nextInt());
        }
        s.close();
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.solution();
    }
}
