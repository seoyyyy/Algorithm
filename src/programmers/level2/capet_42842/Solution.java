package programmers.level2.capet_42842;

/**
 * 카펫 42842
 */
public class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int dimensions = brown + yellow;

        for (int i = 1; i < dimensions; i++) {
            int row = i;
            int col = dimensions / row;

            if(row > col){
                continue;
            }
            if((row - 2) * (col - 2) == yellow){
                answer[0] = col;
                answer[1] = row;
                return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int brown = 10;
        int brown2 = 8;
        int brown3 = 24;
        int yellow = 2;
        int yellow2 = 1;
        int yellow3 = 24;

        Solution s = new Solution();
        int[] result = s.solution(brown, yellow);

        System.out.println("result[0] = " + result[0] + ", " + result[1]);
    }
}
