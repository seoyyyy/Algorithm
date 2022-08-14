package programmers.level2.h_index_42747;

import java.util.Arrays;

public class Solution {
    public int solution(int[] citations){
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int num = citations.length - i;

            if(citations[i] >= num){
                answer = Math.max(answer, num);
                break;
            }
        }

        return answer;
    }

   /* 문제를 이해하기 까지가 너무 어려웠다..
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        int mid = (citations.length / 2) - 1;

        for (int i = 0; i < 3; i++) {
            int temp = mid;
            int result = Arrays.stream(citations).filter(item -> temp <= item ).toArray().length;

            if(temp <= result && temp >= (citations.length - result)){
                if(answer < temp){
                    answer = temp;
                }
            }
        }


        return answer;
    }*/

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] citations = {3,0, 6, 1, 5};

        int result = s.solution(citations);
        System.out.println("result = " + result);
    }
}
