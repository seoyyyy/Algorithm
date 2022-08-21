package programmers.level2.queue_equal_value_118667;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 두 큐 합 같게 만들기 18667
 */
public class Solution {
    public int solution(int[] queue1, int[] queue2) {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum1 = 0, sum2 = 0;
        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            sum1 += queue1[i];
            sum2 += queue2[i];
        }

        int tempNum;
        for (int i = 0; i < queue1.length * 3; i++) {
            if(sum1 == sum2) return i;

            if(sum1 > sum2){
                tempNum = q1.poll();

                q2.add(tempNum);
                sum1 -= tempNum;
                sum2 += tempNum;
            }else{
                tempNum = q2.poll();

                q1.add(tempNum);
                sum1 += tempNum;
                sum2 -= tempNum;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] queue1_1 = {3,2,7,2};
        int[] queue1_2 = {1,2,1,2};
        int[] queue1_3 = {1,1};

        int[] queue2_1 = {4,6,5,1};
        int[] queue2_2 = {1,10,1,2};
        int[] queue2_3 = {1,5};


        int result = s.solution(queue1_1, queue2_1);
        System.out.println("result = " + result);
    }
}
