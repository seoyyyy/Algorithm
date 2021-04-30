package programmers.level1.str_desc_sort;


import java.util.Arrays;
import java.util.Collections;
// 문자열 내림차순으로 배치하기
public class StrDescSort {
    public String solution(String s) {
        String answer = "";
        String[] c = s.split("");
        Arrays.sort(c, Collections.reverseOrder());
        for (int i = 0; i < c.length; i++) {
            answer += c[i];
        }
        return answer;
    }

    public static void main(String[] args){
        StrDescSort sds = new StrDescSort();

        String s = "qweASDvv";

        String result = sds.solution(s);
        for (int i = 0; i < result.length(); i++) {
            System.out.print(result.charAt(i)+" ");
        }
    }
}
