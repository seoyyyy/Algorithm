package baekjoon.문자열.다이얼_5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 다이얼 5622
 */
public class Main {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if('A' <= c && c <= 'C'){
                sum += 3;
            }else if( 'D' <= c && c <= 'F'){
                sum += 4;
            }else if('G' <= c && c <= 'I'){
                sum += 5;
            }else if('J' <= c && c <= 'L'){
                sum += 6;
            }else if('M' <= c && c <= 'O'){
                sum += 7;
            }else if('P' <= c && c <= 'S'){
                sum += 8;
            }else if('T' <= c && c <= 'V'){
                sum += 9;
            }else if('W' <= c && c <= 'Z'){
                sum += 10;
            }
        }

        System.out.println(sum);
    }
}
