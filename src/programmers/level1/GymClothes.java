package programmers.level1;
import java.util.Arrays;

// 체육복
public class GymClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i]==reserve[j]){
                    lost[i]=0;
                    reserve[j]=0;
                    answer++;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i]!=0 && reserve[j]!=0){
                    if (reserve[j] + 1 == lost[i] ||reserve[j]- 1 == lost[i]) {
                        reserve[j] = -1;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        // test case
        // 1.
        int n1 = 5;
        int[] lost1 = {2,4};
        int[] reserve1 = {1,3,5};
        // 2.
        int n2 = 5;
        int[] lost2 = {2,4};
        int[] reserve2 = {3};
        // 3.
        int n3 = 3;
        int[] lost3 = {3};
        int[] reserve3 = {1};

        GymClothes gc = new GymClothes();
        int result = gc.solution(n3,lost3,reserve3);
        System.out.println(result);
    }
}
