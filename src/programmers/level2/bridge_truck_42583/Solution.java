package programmers.level2.bridge_truck_42583;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 다리를 지나는 트럭
 */
public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int totalWeight = 0;

        Queue<Integer> crossTruck = new LinkedList<>();

        for (int truck_weight : truck_weights) {
            while (true){
                if(crossTruck.isEmpty()){ // 트럭이 비어있을때
                    crossTruck.offer(truck_weight); // 대기 트럭 하나를 보낸다.
                    totalWeight += truck_weight; // 다리 위의 현재 트럭의 중량을 더해준다.
                    answer ++;
                    break;
                }else if(crossTruck.size() == bridge_length){ // 트럭의 수와 다리 허용 수가 같으면
                    totalWeight -= crossTruck.poll(); // 다리위의 트럭 하나를 완전히 보내기
                }else{
                    if(totalWeight + truck_weight > weight){ // 총 중량과 트럭의 무게가 허용 중량보다 높으면
                        crossTruck.offer(0); // 다리위의 트럭 수 계산을 위해 0으로라도 채우기
                        answer ++;
                    }else{
                        crossTruck.offer(truck_weight); // 허용중량에 만족하면 다리위에 트럭 하나 추가
                        totalWeight += truck_weight;
                        answer ++;
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int bridge_length = 2;
        int weight = 10;

        int bridge_length2 = 100;
        int weight2 = 100;

        int[] truckWeights = {7,4,5,6};
        int[] truckWeights2 = {10};
        int[] truckWeights3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};


        int result = s.solution(bridge_length2, weight2, truckWeights3);
        System.out.println("result = " + result);
    }
}
