package baekjoon.문자열.크로아티아알파벳_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] lang = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        for (int i = 0; i < lang.length; i++) {
            if (word.contains(lang[i])) {
                word = word.replaceAll(lang[i], ".");
            }
        }

        System.out.println(word.length());
    }
}
