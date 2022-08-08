package programmers.skill_checks.level2;

public class Fibo_405054 {

    public int solution(int n) {
        int answer = 0;
        if(n == 1 || n == 2){
            return n;
        }

        int first = 1;
        int second = 1;

        for (int i = 3; i <= n; i++) {
            answer = first + second;
            first = second % 1234567;
            second = answer % 1234567;
        }

        return answer % 1234567;

    }

// 시간초과 .. WHY
//    public int fibo(int n){
//        if(n <= 1) return n;
//
//        return fibo(n - 2) + fibo(n - 1);
//    }

    public static void main(String[] args) {
        Fibo_405054 fibo = new Fibo_405054();

        int n = 3;
        int n2 = 5;

        int result = fibo.solution(n2);

        System.out.println("result = " + result);
    }
}
