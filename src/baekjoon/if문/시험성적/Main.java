package baekjoon.if문.시험성적;

import java.util.Scanner;

public class Main {
    private String solution(){
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(!(score<0 || score>100)){
            switch (score/10){
                case 10:
                case 9:
                    return "A";
                case 8:
                    return "B";
                case 7:
                    return "C";
                case 6:
                    return "D";
                default:
                    return "F";

            }
        }else {
            throw new IllegalArgumentException("0에서 100사이의 숫자를 입력해주세요.");
        }

    }

    public static void main(String[] args){
        Main m = new Main();
        String result = m.solution();
        System.out.println(result);
    }
}
