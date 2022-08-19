package programmers.level2.parking_fee_92341;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 주차요금계산
 */
public class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> inOutTime = new TreeMap<>();
        Map<String, Integer> enterCar = new HashMap<>();
        for (String record : records) {
            String[] infoArr = record.split(" ");

            String[] timeArr = infoArr[0].split(":");
            int time = Integer.parseInt(timeArr[0]) * 60 + Integer.parseInt(timeArr[1]);

            if(infoArr[2].equals("IN")){
                enterCar.put(infoArr[1], time);

            }else{
                inOutTime.put(infoArr[1], inOutTime.getOrDefault(infoArr[1], 0) + time - enterCar.get(infoArr[1]));
                enterCar.remove(infoArr[1]);
            }
        }

        for (String carNum : enterCar.keySet()) {
            int time = 1439 - enterCar.get(carNum);
            inOutTime.put(carNum, inOutTime.getOrDefault(carNum, 0) + time);

        }
        int i = 0;
        int[] answer = new int[inOutTime.size()];
        for (String carNum : inOutTime.keySet()) {
            int fee = inOutTime.get(carNum) > fees[0] ?  fees[1] + ((int)Math.ceil((float)(inOutTime.get(carNum) - fees[0]) / fees[2])) * fees[3] : fees[1];
            answer[i] = fee;
            i ++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] fees1 = {180, 5000, 10, 600};
        int[] fees2 = {120, 0, 60, 591};
        int[] fees3 = {1, 461, 1, 10};

        String[] records1 = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        String[] records2 = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
        String[] records3 = {"00:00 1234 IN"};

        Solution s = new Solution();
        int[] result = s.solution(fees3, records3);
        for (int i : result) {
            System.out.println("i = " + i);
        }

    }
}
