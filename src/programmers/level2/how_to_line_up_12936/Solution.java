package programmers.level2.how_to_line_up_12936;

import java.util.ArrayList;

/**
 * 줄 서는 방법 12936
 */
public class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];

        ArrayList<Integer> list = new ArrayList<>();
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            list.add(i);
            factorial *= i;
        }

        int i = 0;
        long remain = k - 1;

        while(i < n){
            factorial = factorial / (n - i);
            long value = remain / factorial;

            answer[i++] = list.get((int)value);
            list.remove((int)value);
            remain = remain % factorial;
        }

        return answer;
    }


    public static void main(String[] args) {
        int n = 3;
        int k =5;

        Solution s = new Solution();
        int[] result = s.solution(3, 5);

        for (int i : result) {
            System.out.println("i = " + i);
        }
    }

}
