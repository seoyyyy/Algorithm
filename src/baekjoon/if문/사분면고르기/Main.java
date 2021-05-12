package baekjoon.if문.사분면고르기;

import java.util.Scanner;

public class Main {
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
        Main m = new Main();
        int result = m.solution();
        System.out.println(result);
    }
}
