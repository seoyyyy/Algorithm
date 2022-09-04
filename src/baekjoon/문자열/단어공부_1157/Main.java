package baekjoon.문자열.단어공부_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /**
     * 단어공부 1157
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> wordCount = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String words = br.readLine().toUpperCase();
        int max = 0;
        for (int i = 0; i < words.length(); i++) {
            char word = words.charAt(i);
            int cnt = wordCount.getOrDefault(word,0) + 1;
            if(max < cnt){
                max = cnt;
            }
            wordCount.put(word, cnt);
        }

        int dupleCnt = 0;
        String answer = "";
        for (Character c : wordCount.keySet()) {
            if(wordCount.get(c) == max){
                if(dupleCnt == 0){
                    dupleCnt += 1;
                    answer = String.valueOf(c);
                }else{
                    answer = "?";
                    break;
                }
            }
        }
        System.out.println(answer);

    }

}
