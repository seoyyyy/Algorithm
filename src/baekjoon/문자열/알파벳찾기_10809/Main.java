package baekjoon.문자열.알파벳찾기_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] c = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < c.length; i++) {
            if(str.contains(c[i])){
                sj.add(String.valueOf(str.indexOf(c[i])));
            }else{
                sj.add("-1");
            }
        }

        System.out.println(sj);
    }
}
