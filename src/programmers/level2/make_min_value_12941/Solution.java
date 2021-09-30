package programmers.level2.make_min_value_12941;

import java.util.Arrays;

public class Solution {
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<B.length; i++){
            answer += A[i] * B[B.length-1-i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 2}, B= {5, 4, 4};
        Solution s = new Solution();
        int result = s.solution(A, B);
        System.out.println(result);
    }
}
