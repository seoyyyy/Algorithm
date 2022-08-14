package programmers.level2.max_number_42746;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 가장 큰 수 42746
 */
public class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        String[] strNum = new String[numbers.length];

        for (int i = 0; i < strNum.length; i++) {
            strNum[i] = String.valueOf(numbers[i]);
        }

        /**
         *  1. 첫번째자리 숫자가 큰 순서
         *  2. 수가 같을 때에는 숫자크기 순으로
         *    비교해주었는데 틀린답이었다. ㅠㅠ
         */
      /*  Arrays.sort(strNum, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(0) == o2.charAt(0)){
                    return o2.compareTo(o1);
                }
                if(o2.charAt(0) > o2.charAt(0)){
                    return 1;
                }
                return -1;
            }
        });
        */

        Arrays.sort(strNum, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if(strNum[0].startsWith("0")) return "0";

        for (String s : strNum) {
            answer += s;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};

        Solution s = new Solution();
        String result = s.solution(numbers2);
        System.out.println("result = " + result);
    }
}
