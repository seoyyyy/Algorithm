package backjoon.입출력과_사칙연산;

import java.util.Scanner;

public class 사칙연산 {
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
        사칙연산 m = new 사칙연산();
        m.calculate();
    }
}
