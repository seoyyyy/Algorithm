package backjoon.입출력과_사칙연산;

import java.util.Scanner;

public class 곱셈 {
    public void multiply(){
        Scanner s = new Scanner(System.in);

        String a = String.valueOf(s.nextInt());
        String b = String.valueOf(s.nextInt());

        int result = 0;
        for(int i=b.length(); i>0; i--){
            int na = toInt(a);
            int nb = toInt(String.valueOf(b.charAt(i-1)));

            System.out.println(na * nb);
            result += na * nb * (int)Math.pow(10,b.length()-i);
        }
        System.out.println(result);
    }

    public int toInt(String strNum){
        return Integer.parseInt(strNum);
    }

    public static void main(String[] args){
        곱셈 m = new 곱셈();
        m.multiply();
    }
}
