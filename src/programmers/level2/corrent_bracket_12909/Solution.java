package programmers.level2.corrent_bracket_12909;
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else if(s.charAt(i) == ')'){
                if(stack.size() == 0){
                    return false;
                }
                stack.pop();
            }
        }

        if(stack.size() != 0){
            return false;
        }

        return true;
    }
}