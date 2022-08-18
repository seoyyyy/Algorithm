package programmers.level2.stock_price_42584;

/**
 * 주식 가격 42584
 */
public class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;

                if(prices[i] > prices[j]) break;

            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] prices = {1, 2, 3, 2, 3};

        int[] result = s.solution(prices);
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }
}
