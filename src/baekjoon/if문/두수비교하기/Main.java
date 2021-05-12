package baekjoon.if문.두수비교하기;

import java.util.Scanner;

public class Main {
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
        Main m = new Main();
        String result = m.solution();
        System.out.println(result);
    }
}
