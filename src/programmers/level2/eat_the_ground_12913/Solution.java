package programmers.level2.eat_the_ground_12913;

public class Solution {
    int solution(int[][] land) {
        int answer = 0;
        for(int i=1; i<land.length; i++){
            for(int j=0; j<land[i].length; j++){
                int max = 0;
                for(int z=0; z<land[i].length; z++){
                    if(j != z && land[i-1][z] > max){
                        max = land[i-1][z];
                    }
                }
                land[i][j] += max;
            }
        }


        for(int i=0; i<land[land.length-1].length; i++){
            if(answer < land[land.length-1][i]){
                answer = land[land.length-1][i];
            }
        }
        return answer;
    }
}
