package programmers.level2.representation_number_12924;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<n+1; i++){
            int num = 0;
            for(int j=i; j<n+1; j++){
                num += j;
                if(num == n){
                    answer ++;
                    break;
                }else if(num > n){
                    break;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        //test case
        int n = 15;
        Solution s = new Solution();
        int result = s.solution(n);
        System.out.println(result);
    }
}