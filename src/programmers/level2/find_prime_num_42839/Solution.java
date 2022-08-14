package programmers.level2.find_prime_num_42839;

import java.util.HashSet;
import java.util.Set;

/**
 * 소수 찾기 42839
 */
public class Solution {
    static String[] numberArr;
    static boolean[] visited;
    static Set<Integer> store;
    public int solution(String numbers) {
        numberArr = numbers.split("");
        visited = new boolean[numberArr.length];
        store = new HashSet();
        dfs(0, "");

        return store.size();
    }

    public void dfs(int depth, String str){
        if(depth == numberArr.length){
            return;
        }

        for (int i = 0; i < numberArr.length; i++) {
            if(!visited[i]){
                visited[i] = true;
                int number = Integer.parseInt(str + numberArr[i]);

                if(isPrime(number)){
                    store.add(number);
                }
                dfs(depth + 1, str + numberArr[i]);

                visited[i] = false;
            }
        }
    }

    public boolean isPrime(int number){
        if(number <= 1) return false;

        for (int j = 2; j < number; j++) {
            if(j != number && number % j == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String num1 = "17";
        String num2 = "011";
        Solution s = new Solution();
        int result = s.solution(num1);
        System.out.println("result = " + result);
    }
}