package programmers.level2.coloring_book_1829;

public class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        return answer;
    }


    public void bfs(int x, int y){

    }

    public static void main(String[] args) {
            int m = 6;
            int n = 4;

            int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};

            Solution s = new Solution();
        int[] result = s.solution(m, n, picture);

        System.out.println(result[0] + " , " + result[1]);
    }
}
