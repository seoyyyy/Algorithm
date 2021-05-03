package programmers.level1.sum_divisor;
// 약수의 합
public class SumDivisor {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n; i++){
            if(n % i == 0) answer+=i;
        }
        return answer;
    }

    public static void main(String[] args){
        int n =12;
        int n2 = 5;
        SumDivisor sd = new SumDivisor();
        int result = sd.solution(n);
        System.out.println(n);
    }
}
