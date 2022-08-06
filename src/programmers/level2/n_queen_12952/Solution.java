package programmers.level2.n_queen_12952;

/**
 * N-Queen 문제
 */
public class Solution {
    static int N;
    static boolean[] visited;
    static int[] pick;
    static int count = 0;

    public int solution(int n) {
        N = n;
        visited = new boolean[n];
        pick = new int[n];

        nQueen(0);

        return count;
    }

    private static void nQueen(int depth){
        if(depth == N){
            count ++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if(!visited[i]){
                visited[i] = true;

                pick[depth] = i;
                if(check(depth)) nQueen(depth + 1);

                visited[i] = false;
            }
        }

    }

    public static boolean check(int depth) {
        for(int i = 0; i < depth; i++) {
            if(pick[i] == pick[depth]) return false; // 같은 행에 퀸 존재
            if(Math.abs(depth - i) == Math.abs(pick[depth] - pick[i])) return false; // 대각선에 퀸 존재
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 4;
        int result = s.solution(n) ;
        System.out.println("result = " + result);
    }
}
