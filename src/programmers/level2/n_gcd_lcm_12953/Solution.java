package programmers.level2.n_gcd_lcm_12953;

public class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            answer = answer * arr[i] / gcd(answer, arr[i]);
        }
        return answer;
    }

    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        // test case
        int[] test_arr = {2,6,8,14};
        int[] test_arr2 = {1,2,3};
        Solution s = new Solution();
        int result = s.solution(test_arr);
        System.out.println(result);
    }
}
