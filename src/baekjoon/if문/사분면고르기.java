package baekjoon.if문;

import java.util.Scanner;

public class 사분면고르기 {
    private int solution(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x>0 && y>0){
            return 1;
        }else if(x<0 && y>0){
            return 2;
        }else if(x<0 && y<0){
            return 3;
        }else{
            return 4;
        }
    }

    public static void main(String[] args){
        사분면고르기 m = new 사분면고르기();
        int result = m.solution();
        System.out.println(result);
    }
}
