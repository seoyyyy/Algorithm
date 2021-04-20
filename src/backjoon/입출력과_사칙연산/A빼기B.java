package backjoon.입출력과_사칙연산;

import java.util.Scanner;

public class A빼기B {
    public void minus(){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a-b);
    }

    public static void main(String[] args){
        A빼기B ab = new A빼기B();
        ab.minus();
    }
}
