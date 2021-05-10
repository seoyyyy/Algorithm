package programmers.level1.lcm_and_gcd;

public class LcmAndGcd {
    /**
     * 최대공약수는 유클리드 호제법을 사용하여 구하여야 한다.
     * 호제법 : 두 수가 서로 상대방 수를 나누어서 결국 원하는 수를 얻는 알고리즘
     * */
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n,m);
        answer[1] = n * m / answer[0];

        return answer;
    }

    /* 재귀함수... 멋있다. */
    private int gcd(int n,int m){
        System.out.println(n+ " % " + m+" =  " + (m==0?n:n%m)+"    -> ");
        return m==0 ? n : gcd(m,n%m);
    }

    public static void main(String[] args) {
        LcmAndGcd lag = new LcmAndGcd();
        //test case
        //1.
        int n1 = 3;
        int m1 = 12;
        //2.
        int n2 = 2;
        int m2 = 5;

        int[] result = lag.solution(n2,m2);
        for (int item:result){
            System.out.print(item+" ");
        }
    }
}

/*
    실패한 풀이
public int[] solution(int n, int m) {
        int lcm = 1;
        for(int i=2; i<=n; i++){
            if(n % i == 0 && m % i ==0){
                lcm*=i;
                n /= i;
                m /= i;
            }
        }
        return new int []{lcm,lcm*n*m};
}
    */