package programmers.level2.life_boat_42885;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 구명보트 42885
 */
public class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        Deque<Integer> deque = new LinkedList<>();
        for (int person : people) {
            deque.add(person);
        }
        while (!deque.isEmpty()){
            int last = deque.pollLast();
            if(deque.peek() != null && deque.peek() + last <= limit){
                deque.removeFirst();
            }

            answer ++;
        }


//        실패..
//        for (int person : people) {
//            sum += person;
//            if(cnt == 3 || sum >= limit){
//                cnt = 0;
//                answer ++;
//                sum = sum == limit ? 0 : person;
//            }else{
//                cnt ++;
//            }
//        }


        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        int [] people1 = {70,50,80,50};
        int limit1= 100;
        int result1 = s.solution(people1, limit1);

        System.out.println("result1 = " + result1);

        int [] people2 = {70,80,50};
        int limit2 =100;
        int result2 = s.solution(people2, limit2);

        System.out.println("result2 = " + result2);
    }
}