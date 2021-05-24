package programmers.level1.num_and_add_divisor;
// 약수의 개수와 덧셈
public class NumAndAddDivisor {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right;i++){
            int temp = 1;
            for (int j=1; j<=i/2;j++){
                if(i%j==0){
                    temp++;
                }
            }
            answer += temp%2 == 0 ? i : -i;
        }
        return answer;
    }
    public static void main(String[] args) {
        // test case
        // 1.
        int left1 = 13;
        int rignt1 = 17;
        // 2.
        int left2 = 24;
        int right2 = 27;
        NumAndAddDivisor naad = new NumAndAddDivisor();
        int result = naad.solution(left1,left2);
        System.out.println(result);
    }
}
