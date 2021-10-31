package programmers.level2.skill_tree_49993;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        String s = "";
        for(String skill_tree : skill_trees){
            Boolean flag = true;

            queue.clear();
            for(int i=0; i<skill.length(); i++){
                queue.add(skill.substring(i,i+1));
            }

            for(int i=0; i<skill_tree.length();i++){
                s = skill_tree.substring(i,i+1);
                if(skill.indexOf(s) != -1 && !s.equals(queue.poll())){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer +=1;
            }

        }
        return answer;
    }
}