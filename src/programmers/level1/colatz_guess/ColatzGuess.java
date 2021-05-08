package programmers.level1.colatz_guess;

public class ColatzGuess {
    public int solution(int num) {
        int answer = 0;

        while(num != 1){
            ++answer;
            if(num % 2 == 0) {
                num = num / 2;
            }else if(num % 2 == 1){
                num = num * 3 + 1;
            }

            if(answer == 500) {
                answer = -1;
                break;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        ColatzGuess cg = new ColatzGuess();

        //test case
        int n1 = 6;
        int n2 = 16;
        int n3 =-1;

        int result = cg.solution(n1);
        System.out.println(result);
    }
}
