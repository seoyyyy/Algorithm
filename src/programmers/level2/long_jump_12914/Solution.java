package programmers.level2.long_jump_12914;

/**
 * 멀리뛰기 12914
 */
public class Solution {
    public long solution(int n) {

        int[] nArr = new int[2001];
        nArr[1] = 1;
        nArr[2] = 2;

        for (int i = 3; i < nArr.length; i++) {
            nArr[i] = (nArr[i - 2] + nArr[i - 1]) % 1234567;
        }

        long answer = nArr[n];
        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        long result = s.solution(4);
        System.out.println("result = " + result);
    }
}
