package programmers.level2.remove_by_pair_12973;

import java.util.Stack;

/**
 * 짝지어 제거하기 12973
 */
public class Solution {

    public int solution(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }

/*
    //시간초과, 효율성 실패.. 스택을 사용하면 간단하게 풀리는 문제였다..
    public int solution(String s){
        LinkedHashSet<Character> alphabetSet = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            alphabetSet.add(s.charAt(i));
        }

        int depth = 0;
        while(s.length() >= depth){
            for (Character alphabet : alphabetSet) {
                String temp = String.valueOf(alphabet) + alphabet;
                String removeStr = s.replaceAll(temp, "");

                if(s.length() != removeStr.length()){
                    depth = 0;
                    s = removeStr;
                }else{
                    depth ++;
                }
            }
        }

        return s.length() == 0 ? 1 : 0;
    }*/


    public static void main(String[] args) {
        String s = "baabaa";
        String s2 = "cdcd";

        Solution sol = new Solution();
        int result = sol.solution(s);
        System.out.println("result = " + result);
    }
}