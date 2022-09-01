package programmers.level2.number_block_12923;

/**
 * 숫자블록
 */
public class Solution {
    public int[] solution(long begin, long end) {

        int[] answer = new int[(int)(end - begin + 1)];
        int inx = 0;
        for (int i = (int)begin; i <= end; i++){
            boolean flag = false;
            if(i == 1) {
                answer[inx++] = 0;
                continue;
            }

            for (int j = 2; j * j<= i; j++) {
                if( i % j == 0 && i / j <= 10000000){
                    answer[inx ++] =  i / j;
                    flag = true;
                    break;
                }
            }

            if(!flag) answer[inx ++ ] = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.solution(1, 10);
        for (int item : result) {
            System.out.println("item = " + item);
        }
    }
}
