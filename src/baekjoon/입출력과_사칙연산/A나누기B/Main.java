package baekjoon.입출력과_사칙연산.A나누기B;

import java.util.Scanner;

public class Main {
        public void divide(){
            Scanner scan = new Scanner(System.in);

            double a = scan.nextInt();
            double b = scan.nextInt();

            System.out.println(a/b);
        }

        public static void main(String[] args){
            Main ab = new Main();
            ab.divide();
        }
}
