package programmers.level2.more_spicy_42626;

import java.util.PriorityQueue;

public class Solution {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int level : scoville) {
            heap.add(level);
        }

        while(heap.peek() <= K){
            if (heap.size() == 1) {
                return -1;
            }

            int a = heap.poll();
            int b =  heap.poll();

            heap.add(a + (b * 2));

            answer ++;

        }

        return answer;
    }



/* 실패
* 원인 : 음식 섞는 계산식이 a + ( b * 2 ) 가 아닌 b의 제곱으로 더해줌.
* 원인2: [모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우 -1을 return 한다] 라는 문구를 읽지 못하고 풀이
* 결론: 문제를 끝까지 잘 읽어보고 풀자..

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int level : scoville) {
            heap.add(level);
        }

        while(true){

            if(heap.peek() < K){
                int a = heap.poll();
                int b =  heap.poll();
                heap.add(a + (int) Math.pow(b,2));

                answer ++;
            }else{
                break;

            }

        }

        return answer;
    }
*/
    public static void main(String[] args) {
        // test case
        int[] scoville = {1,2,3,9,10,12};
        int K = 7;

        Solution s = new Solution();
        int result = s.solution(scoville, 7);

        System.out.println(result);
    }
}