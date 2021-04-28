package programmers.level1.ponketmon;

import java.util.HashSet;

public class Ponketmon {
    public int solution(int[] nums) {
        int canSelect = nums.length/2;

        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(s.size()<canSelect && !s.contains(nums[i])){
                s.add(nums[i]);
            }
        }

        return s.size();
    }

    public static void main(String[] args){
        Ponketmon pkm = new Ponketmon();
        // 테스트 케이스
        //1.
        int[] test1 = {3,1,2,3};
        int[] test2 = {3,3,3,2,2,4};
        int[] test3 = {3,3,3,2,2,2};

        int result = pkm.solution(test2);
        System.out.println(result);
    }
}
