package programmers.level1.no_numbers_add_86051;

public class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i=0; i< 10; i++){
            answer += i;
        }

        for(int j=0; j < numbers.length; j++){
            answer -= numbers[j];
        }

        return answer;
    }
}