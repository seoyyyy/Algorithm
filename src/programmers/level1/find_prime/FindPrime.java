package programmers.level1.find_prime;
// 소수 찾기
public class FindPrime {
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++){
            if(isPrime(i)) answer ++;
        }
        return answer;
    }

    public boolean isPrime(int num){
        boolean flag = true;
        for(int j=2; j<=Math.sqrt(num);j++){
            if(num%j == 0){
                flag = false;
                break;
            }
        }
        return flag;

    }
    public static void main(String[] args){
        FindPrime fp = new FindPrime();
        // TEST CASE
        // 1.
        int n1 = 10;
        int n2 = 5;

        int result = fp.solution(n2);
        System.out.println(result);
    }
}
