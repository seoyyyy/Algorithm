package baekjoon.입출력과_사칙연산.A더하기B;

import java.util.Scanner;

public class Main {

    public void add(){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a+b);
    }

    public static void main(String[] args){
        Main ab = new Main();
        ab.add();
    }
}
