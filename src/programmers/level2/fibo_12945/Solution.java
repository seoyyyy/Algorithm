package programmers.level2.fibo_12945;


public class Solution {
    public int solution(int n) {
        int a= 0, b = 1;
        for(int i=0; i<n; i++){
            if(n < 2){
                return n;
            }
            int c = (a + b) % 1234567;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        int test1 = 2;
        int test2 = 5;
        Solution s = new Solution();
        int result = s.solution(test1);
        System.out.println(result);
    }
}
