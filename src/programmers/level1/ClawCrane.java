package programmers.level1;

import java.util.ArrayList;

// 크레인 인형뽑기 게임
public class ClawCrane {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> box = new ArrayList();
        for(int move:moves){
            for(int i=0; i<board.length; i++){
                if(board[i][move-1] != 0){
                    if(box.size()==0 || box.get(box.size()-1) != board[i][move-1]) {
                        box.add(board[i][move - 1]);
                    }else {
                        box.remove(box.size()-1);
                        answer += 2;
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main (String[] args){
        ClawCrane clawCrane = new ClawCrane();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        int result = clawCrane.solution(board,moves);
        System.out.println(result);
    }
}
