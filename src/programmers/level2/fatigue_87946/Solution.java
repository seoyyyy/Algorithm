package programmers.level2.fatigue_87946;

/**
 * 피로도 87946
 */
public class Solution {
    static int[][] DUNGEONS;
    static int answer;
    static boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        answer = -1;
        visited = new boolean[dungeons.length];
        DUNGEONS = dungeons;

        dfs(k, 0, 0);

        return answer;
    }

    public void dfs(int k, int depth,int cnt){

        for (int i = 0; i < DUNGEONS.length; i++) {
            if(!visited[i] && DUNGEONS[i][0] <= k){
                visited[i] = true;
                dfs(k - DUNGEONS[i][1],depth + 1, cnt + 1);
                visited[i] = false;
            }
            answer = Math.max(cnt, answer);
        }
    }




/* 1번째 실패

    public int solution(int k, int[][] dungeons) {
        int answer = -1;

        int tempK = 0;
        for (int i = 0; i < dungeons.length - 1; i++) {
            int cnt = 1;
            tempK = k - dungeons[i][1];

            for (int j = 0; j < dungeons.length; j++) {
                if(i == j) continue;

                if(tempK >= dungeons[j][0] && tempK >= dungeons[j][1]){
                    tempK -= dungeons[j][1];
                    cnt ++;
                }
            }
            if(cnt > answer){
                answer = cnt;
            }
        }

        return answer;
    }
*/

    public static void main(String[] args) {
        Solution s = new Solution();

        // test
        int k = 80;
        int[][] dungeons = {{80,20},{50,40}, {30,10}};

        int result = s.solution(k, dungeons);
        System.out.println("result = " + result);


    }

}
