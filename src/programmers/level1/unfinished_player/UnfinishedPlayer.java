package programmers.level1.unfinished_player;

import java.util.HashMap;
import java.util.Iterator;

// 완주하지 못한 선수
public class UnfinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String,Integer> map = new HashMap<>();

        for(String player:participant){
            map.put(player,map.getOrDefault(player,0)+1);
        }


        for(String player:completion){
            if(map.get(player)!=null && map.get(player)>=1){
                map.replace(player,map.get(player)-1);
            }
        }

        Iterator iter = map.keySet().iterator();
        while(iter.hasNext()){
            String name = iter.next().toString();
            if(!map.get(name).equals(0)){
                answer += name;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        UnfinishedPlayer up = new UnfinishedPlayer();

        //test case
        //1.
        String[] participant_1 = {"leo","kiki","eden"};
        String[] completion_1 = {"eden","kiki"};
        //2.
        String[] participant_2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion_2 = {"josipa", "filipa", "marina", "nikola"};
        //3.
        String[] participant_3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion_3 = {"stanko", "ana", "mislav"};

        String result = up.solution(participant_3, completion_3);

        System.out.println(result);
    }
}
