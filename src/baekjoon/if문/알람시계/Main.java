package baekjoon.if문.알람시계;

import java.util.Scanner;

public class Main {
    private void solution(){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if(hour>23 || minute>59 || hour <0 || minute <0) throw new IllegalArgumentException("정확한 시간으로 입력해주세요.");

        if( minute-45 < 0){
            hour =hour!=0?hour-1:23;
            minute += 15;
        }else {
            minute -= 45;
        }
        System.out.println(hour);
        System.out.println(minute);

    }

    public static void main(String[] args){
        Main m = new Main();
        m.solution();

    }
}
