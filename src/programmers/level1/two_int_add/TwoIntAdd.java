package programmers.level1.two_int_add;

// 두 정수 사이의 합
public class TwoIntAdd {
    public long solution(int a, int b) {
        long answer = 0;
        int num1 = a<=b?a:b;
        int num2 = a>=b?a:b;
        for(int i=num1; i<=num2; i++){
            answer += i;
        }
        return answer;
    }
    public static void main(String[] args){
        TwoIntAdd tia = new TwoIntAdd();
        // Test Case
        // 1.
        int a1 = 3;
        int b1 = 5;
        // 2.
        int a2 = 3;
        int b2 = 3;
        // 3.
        int a3 = 5;
        int b3 = 3;
        long result = tia.solution(a1,b1);
        System.out.println(result);
    }
}
