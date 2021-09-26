package programmers.level2.jaden_case_12951;

import java.util.Locale;

public class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].isEmpty()) continue;
            arr[i] = arr[i].substring(0,1).toUpperCase(Locale.ROOT) + arr[i].substring(1).toLowerCase(Locale.ROOT);
        }
        String answer = String.join(" ", arr);
        if(s.endsWith(" ")) answer += " ";

        return answer;
    }

    public static void main(String[] args) {
        // 테스트 케이스
        String test_str1= "for the last week";
        String test_str2= " 3people unFollowed me ";

        Solution s = new Solution();
        String result = s.solution(test_str2);
        System.out.println(result);
    }
}
