package baekjoon.if문;

import java.util.Scanner;

public class 윤년 {
    private int solution(){
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if( (score%4==0 && score % 100 != 0) || (score % 400 == 0)){
            return 1;
        }

        return 0;
    }

    public static void main(String[] args){
        윤년 m = new 윤년();
        int result = m.solution();
        System.out.println(result);
    }
}
