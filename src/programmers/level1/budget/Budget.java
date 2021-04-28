package programmers.level1.budget;

import java.util.Arrays;

// 예산
public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int item: d){
            if(budget - item < 0) break;
            budget -= item;
            answer ++;
        }

        return answer;
    }
    public static void main(String[] args){
        Budget b = new Budget();
        //test case
        //1.
        int[] d1 = {1,3,2,5,4};
        int budget1 = 9;
        //2.
        int[] d2 = {2,2,3,3};
        int budget2 = 10;

        int result = b.solution(d1,budget1);
        System.out.println(result);
    }
}
