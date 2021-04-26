package baekjoon.입출력과_사칙연산;

import java.util.Scanner;

public class 나머지 {
    public void remainder(){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        s.close();

        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b) % c);
        System.out.println(((a%c) * (b%c))%c);
    }

    public static void main(String[] args){
        나머지 m = new 나머지();
        m.remainder();
    }
}
