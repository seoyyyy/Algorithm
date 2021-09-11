package programmers.level1.recommend_job_84325;

import java.util.*;

public class RecommendJob {
    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        Map<String,Integer> score = new HashMap<>();
        for (String jobs:table) {
            String[] job = jobs.split(" ");
            int sum = 0;

            for (int i=0; i<job.length; i++) {
                for (int j=0; j < languages.length; j++){
                    if(job[i].equals(languages[j])){
                        sum += (job.length - i) * preference[j];
                    }

                }
            }
            score.put(job[0], sum);
        }

        int max = Collections.max(score.values());
        for (String key:score.keySet()) {
            if(score.get(key) == max){
                if(answer.isEmpty() || answer.compareTo(key) > 0){
                    answer = key;
                }
                score.put(key, 0);

            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};

        String[] languages = {"PYTHON", "C++", "SQL"};
        String[] languages2 = {"JAVA", "JAVASCRIPT"};
        int[] preference = {7, 5, 5};
        int[] preference2 = {7, 5};

        RecommendJob rj = new RecommendJob();
//        String solution = rj.solution(table, languages, preference);
//        System.out.println(solution);
        String solution2 = rj.solution(table, languages2, preference2);
        System.out.println(solution2);

    }
}
