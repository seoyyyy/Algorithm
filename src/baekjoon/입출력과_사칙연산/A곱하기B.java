package baekjoon.입출력과_사칙연산;

import java.util.Scanner;
public class A곱하기B {
        public void multiply(){
            Scanner scan = new Scanner(System.in);

            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println(a*b);
        }

        public static void main(String[] args){
            A곱하기B ab = new A곱하기B();
            ab.multiply();
        }

}
