package baekjoon.입출력과_사칙연산.사칙연산;

import java.util.Scanner;

public class Main {
    public void calculate(){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }

    public static void main(String[] args){
        Main m = new Main();
        m.calculate();
    }
}
