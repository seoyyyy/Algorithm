package baekjoon.문자열.그룹단어체커_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean[] check = new boolean[26]; // 알파벳 개수
            boolean isGroup = true;
            for (int j = 0; j < word.length(); j++) {
                int idx = word.charAt(j) - 'a';
                if(check[idx]){
                    if(word.charAt(j) != word.charAt(j - 1)){
                        isGroup = false;
                        break;
                    }
                }else{
                    check[idx] = true;
                }
            }

            if(isGroup) cnt ++;
        }

        System.out.println(cnt);
    }
}
