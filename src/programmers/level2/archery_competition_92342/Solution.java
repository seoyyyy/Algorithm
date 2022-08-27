package programmers.level2.archery_competition_92342;

public class Solution {
    static int[] lion;
    static int[] answer = { -1 };
    static int max = -1000;
    public int[] solution(int n, int[] info) {
        lion = new int[info.length];

        dfs(n, info);

        return answer;
    }


    public void dfs(int cnt, int[] info){
        if(cnt == 0){
            int apeach_score = 0;
            int lion_score = 0;

            for (int i = 0; i <= 10; i++) {
                if(info[i] != 0 || lion[i] != 0) {
                    if (info[i] < lion[i]) {
                        lion_score += 10 - i;
                    } else {
                        apeach_score += 10 - i;
                    }
                }
            }

            if(lion_score > apeach_score && lion_score - apeach_score >= max){
                answer = lion.clone();
                max = lion_score - apeach_score;
            }
            return;
        }

        for (int i = 0; i <= 10 && lion[i] <= info[i]; i++) {
            lion[i] ++;
            dfs(cnt - 1, info);
            lion[i] --;
        }
    }



    public static void main(String[] args) {
        // test
        int n = 5;
        int[] info = {2,1,1,1,0,0,0,0,0,0,0};

        Solution s = new Solution();
        int[] result = s.solution(n, info);
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }
}
