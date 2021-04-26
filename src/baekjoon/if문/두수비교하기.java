package baekjoon.if문;

import java.util.Scanner;

public class 두수비교하기 {
    public String solution(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( a > b ){
            return ">";
        }else if(a < b){
            return "<";
        }else {
            return "==";
        }
    }

    public static void main(String[] args){
        두수비교하기 m = new 두수비교하기();
        String result = m.solution();
        System.out.println(result);
    }
}
