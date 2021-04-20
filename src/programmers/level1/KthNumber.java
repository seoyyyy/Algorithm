package programmers.level1;

import java.util.Arrays;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i=0;

        for(int[] command:commands){
            int[] box = Arrays.copyOfRange(array,command[0]-1,command[1]);
            Arrays.sort(box);
            answer[i]=box[command[2]-1];

            i++;
        }

        return answer;
    }

    public static void main(String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        KthNumber kn = new KthNumber();
        int[] result = kn.solution(array,command);
        for(int item:result){
            System.out.print(item+" ");
        }
    }
}
