package programmers.level1.failure_rate;

import java.util.*;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        int[] curStatus = new int[N];
        Map<Integer,Double> result = new HashMap<>();

        for(int user:stages){
            if(N >= user){
                curStatus[user-1] += 1;
            }
        }

        int failer;
        for(int i=0; i<N; i++){
            failer =0;
            for (int j=0;j<i;j++){
                failer += curStatus[j];
            }
            Double val = Double.valueOf(curStatus[i])/(stages.length-failer);
            if(Double.isInfinite(val)||Double.isNaN(val)){
                val = 0.0;
            }
            result.put(i+1,val);
        }
        List<Integer> keySet = new ArrayList<>(result.keySet());

        Collections.sort(keySet, (o1, o2)->(result.get(o2).compareTo(result.get(o1))));

        return keySet.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        FailureRate fr = new FailureRate();
        int N1 = 5;
        int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};

        int N2 = 4;
        int[] stages2 = {4,4,4,4,4};

        int[] result = fr.solution(N1,stages1);
        System.out.println(result);
    }
}
