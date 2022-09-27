package baekjoon.재귀.재귀의귀재_25501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int CNT;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            System.out.println(isPalindrome(str) + " " + CNT);
        }
    }

    public static int recursion(String s, int l, int r){
        CNT ++;
        if(l >= r) {
            return 1;
        }else if(s.charAt(l) != s.charAt(r)){
            return 0;
        }else{
            return recursion(s, l+1, r-1);
        }
    }

    public static int isPalindrome(String s){
        CNT = 0;
        return recursion(s, 0, s.length()-1);
    }
}
