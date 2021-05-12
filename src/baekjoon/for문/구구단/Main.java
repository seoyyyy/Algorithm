package baekjoon.for문.구구단;

import java.util.Scanner;

public class Main {
    private void solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=9;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.solution();
    }
}
