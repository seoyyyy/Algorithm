package programmers.level2.turn_bracket_76502;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 괄호 회전하기 76502
 */
public class Solution {
    public int solution(String s) {
        int answer = 0;
        Map<Character, Character> map = new HashMap<>();
        map.put('[',']');
        map.put('{','}');
        map.put('(',')');


        for (char word1 : s.toCharArray()) {
            Stack<Character> stack = new Stack<>();
            for (char word2 : s.toCharArray()) {
                if(stack.isEmpty() || word2 != map.getOrDefault(stack.peek(),'.')){
                    stack.push(word2);
                }else{
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                answer ++;
            }

            s = s.substring(1) + s.charAt(0);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution("}]()[{");
        System.out.println("result = " + result);
    }
}
