package programmers.level2.cache_17680;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 캐시 17680
 */
public class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> cacheStore = new LinkedList<>();

        for (String city : cities) {
            String upperCity = city.toUpperCase();
            if(cacheStore.contains(upperCity)){
                answer ++;

                cacheStore.remove(upperCity);
                cacheStore.offer(upperCity);
            }else{
                answer += 5;

                cacheStore.offer(upperCity);
                if(cacheStore.size() > cacheSize){
                    cacheStore.poll();
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        Solution s = new Solution();
        int result = s.solution(cacheSize, cities);
        System.out.println("result = " + result);
    }
}
