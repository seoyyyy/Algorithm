package programmers.level2.make_large_num_42883;

/**
 * 큰 수 만들기
 */
public class Solution {
    // StringBuilder를 사용해 풀지 않으면 시간초과가 나온다.
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();

        int now = 0;
        for (int i = 0; i < number.length() - k; i++) {
            int max = 0;
            for (int j = now; j <= i + k; j++) {
                if(max < number.charAt(j) - '0'){
                    max = number.charAt(j) - '0';
                    now = j + 1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }
    public static void main(String[] args) {
            Solution s = new Solution();
            String number = "1924";
            String number2 = "1231234";
            String number3 = "4177252841";
            int k = 2;
            int k2 = 3;
            int k3 = 4;

        String result = s.solution(number3, k3);
        System.out.println("result = " + result);
    }
}
