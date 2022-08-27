package programmers.level1.personality_type_test_118666;

import java.util.HashMap;
import java.util.Map;

/**
 *  성격유형검사하기 118666
 */
public class Solution {
    public String solution(String[] survey, int[] choices) {
        char[] type = {'R','T','C','F','J','M','A','N'};
        int score[] = new int[8];
        Map<Character,Integer> index = new HashMap<>();

        for(int i=0; i<type.length; i++){
            index.put(type[i],i);
        }

        for(int i=0; i<survey.length; i++){
            char[] arr =survey[i].toCharArray();
            //String 값을 char 배열로 전환
            switch (choices[i]){
                case 1 : score[index.get(arr[0])]+=3;
                    break;
                case 2 : score[index.get(arr[0])]+=2;
                    break;
                case 3 : score[index.get(arr[0])]+=1;
                    break;
                case 5 : score[index.get(arr[1])]+=1;
                    break;
                case 6 : score[index.get(arr[1])]+=2;
                    break;
                case 7 : score[index.get(arr[1])]+=3;
                    break;
            }
        }

        StringBuilder answer = new StringBuilder();
        for(int i=0; i<8; i+=2){
            if(score[i]>score[i+1]){
                answer.append(type[i]);
            } else if(score[i]==score[i+1]){
                answer.append(type[i]<type[i+1] ? type[i] : type[i+1]);
            } else{
                answer.append(type[i+1]);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choice = {5, 3, 2, 7, 5};
        Solution s = new Solution();
        String result = s.solution(survey, choice);
        System.out.println("result = " + result);
    }
}
