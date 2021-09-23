package programmers.level1.bokser_85002;

import java.util.ArrayList;
import java.util.Collections;


public class Solution {
    class Player {
        double winRate;
        int weight;
        int wLarger;
        int index;

        public Player(double winRate, int weight, int wLarger, int index) {
            this.winRate = winRate;
            this.weight = weight;
            this.wLarger = wLarger;
            this.index = index;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "winRate=" + winRate +
                    ", weight=" + weight +
                    ", wLarger=" + wLarger +
                    ", index=" + index +
                    '}';
        }
    }

    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];
        ArrayList<Player> list = new ArrayList();
        for (int i = 0; i < head2head.length; i++) {

            int w_cnt = 0, n_cnt = 0;
            int w_larger = 0;
            for(int j=0; j<head2head[i].length(); j++){
                if(head2head[i].charAt(j) == 'W'){
                    w_cnt ++;
                    if(weights[i] < weights[j]){
                        w_larger ++;
                    }
                }
                if(head2head[i].charAt(j) == 'N'){
                    n_cnt ++;
                }
            }

            int len = head2head[i].length() - n_cnt;
            double win_rate = len != 0 ? (double) w_cnt / len * 100 : 0;
            Player p = new Player(win_rate,weights[i], w_larger, i + 1);
            list.add(p);
        }

        Collections.sort(list, (p1, p2) -> {
            if(p1.winRate > p2.winRate){
                return -1;
            }else if(p1.winRate < p2.winRate){
                return 1;
            }else{
                if(p1.wLarger > p2.wLarger){
                    return -1;
                }else if(p1.wLarger < p2.wLarger){
                    return 1;
                }else{
                    if(p1.weight > p2.weight){
                        return -1;
                    }else if(p1.weight < p2.weight){
                        return 1;
                    }else{
                        if(p1.index > p2.index){
                            return 1;
                        }else if(p1.index < p2.index){
                            return -1;
                        }
                    }
                }
            }
            return 0;
        });

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).index;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] weights = {50,82,75,120};
        String[] head2head = {"NLWL","WNLL","LWNW","WWLN"};

        Solution s = new Solution();
        int[] result = s.solution(weights, head2head);

        for (int item : result) {
            System.out.print(item + " ");
        }

    }
}
