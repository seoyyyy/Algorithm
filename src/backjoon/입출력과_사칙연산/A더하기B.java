package backjoon.입출력과_사칙연산;

import java.util.Scanner;

public class A더하기B {

    public void add(){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a+b);
    }

    public static void main(String[] args){
        A더하기B ab = new A더하기B();
        ab.add();
    }
}
