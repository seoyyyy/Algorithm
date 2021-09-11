package programmers.level1.mutual_evaluation_83201;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public String solution(int[][] scores) {
        String answer = "";

        for(int i=0; i< scores.length; i++){
            ArrayList<Integer> score = new ArrayList();
            for(int j=0; j< scores.length; j++){
                score.add(scores[j][i]);
            }
            int max = Collections.max(score);
            int min = Collections.min(score);

            if(score.get(i) == max || score.get(i) == min){
                if(Collections.frequency(score, score.get(i)) == 1){
                    score.remove(i);
                }
            }

            int sum =0;
            for(int item: score){
                sum += item;
            }

            double avg = (double)sum / score.size();

            if(avg >= 90){
                answer += "A";
            }else if(avg >= 80){
                answer += "B";
            }else if(avg >= 70){
                answer += "C";
            }else if(avg >= 50){
                answer += "D";
            }else{
                answer += "F";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        //test case
        int[][] example = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
        Solution s = new Solution();
        String solution = s.solution(example);
        System.out.println(solution);
    }
}
