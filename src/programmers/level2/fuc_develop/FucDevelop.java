package programmers.level2.fuc_develop;

import java.util.Arrays;
import java.util.Stack;

public class FucDevelop {
    public int[] solution(int[] progresses, int[] speeds) {
        int val = 0;
        Stack<Integer> stack = new Stack<>();
        int remain;
        for(int i=0; i<progresses.length; i++){
            remain = (100 - progresses[i])/speeds[i] + ((100 - progresses[i]) % speeds[i] != 0 ? 1:0);
            if (!stack.isEmpty() && val >= remain){
                stack.set(stack.size()-1,stack.peek()+1);
            }else{
                val = remain;
                stack.push(1);
            }
        }
        return stack.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        // test case
        int[] progress1 = {93, 30, 55},
                speeds1 = {1, 30, 5},
              progress2 = {95, 90, 99, 99, 80, 99},
                speeds2 = {1, 1, 1, 1, 1, 1};

        FucDevelop fdl = new FucDevelop();
        System.out.println(Arrays.toString(fdl.solution(progress1,speeds1)));
    }
}
