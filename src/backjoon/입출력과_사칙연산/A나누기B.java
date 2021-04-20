package backjoon.입출력과_사칙연산;

import java.util.Scanner;

public class A나누기B {
        public void divide(){
            Scanner scan = new Scanner(System.in);

            double a = scan.nextInt();
            double b = scan.nextInt();

            System.out.println(a/b);
        }

        public static void main(String[] args){
            A나누기B ab = new A나누기B();
            ab.divide();
        }
}
