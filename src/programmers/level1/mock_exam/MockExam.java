package programmers.level1.mock_exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;

public class MockExam {
    public int[] solution(int[] answers){
        int[] answer = {};


        HashMap<Integer, Integer> map = new HashMap<>();


        // 1번 수포자
        int[] student1 = {1,2,3,4,5};
        // 2번 수포자
        int[] student2 = {2,1,2,3,2,4,2,5};
        // 3번 수포자
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};


        map.put(1,checkScore(student1,answers));
        map.put(2,checkScore(student2,answers));
        map.put(3,checkScore(student3,answers));

        int maxValue =  Collections.max(map.values());

        Iterator<Integer> iter = map.keySet().iterator();
        while(iter.hasNext()){
            Integer key = iter.next();
            if(map.get(key)==0||map.get(key)!=maxValue){
                iter.remove();
            }
        }

        answer = map.keySet().stream().mapToInt(i->i).toArray();
        return answer;
    }

    public int checkScore(int[]student, int[]answers){
        int score = 0;
        int cnt = 0;
        for(int i=0; i<answers.length; i++){

            if(answers[i]==student[cnt]){
                score++;
            }
            cnt = cnt<student.length-1?cnt+1:0;

        }
        return score;
    }

    public static void main(String[] args){
        MockExam me = new MockExam();
        // test case
        //1.
        int[] answers1 = {1,2,3,4,5};
        //2.
        int[] answers2 = {1,3,2,4,2};

        int[] result = me.solution(answers2);

        for (int item:result){
            System.out.print(item+" ");
        }

    }

}
