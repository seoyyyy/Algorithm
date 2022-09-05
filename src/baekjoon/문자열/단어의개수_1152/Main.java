package baekjoon.문자열.단어의개수_1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> wordList= new ArrayList<>();
        String[] words = br.readLine().toUpperCase().trim().split(" ");
        for (String s :words) {
            if(!s.trim().isEmpty()){
                wordList.add(s);
            }
        }
        System.out.println(wordList.size());
    }
}
