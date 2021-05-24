package programmers.level2.printer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 프린터
public class Printer {
    public int solution(int[] priorities, int location) {
        Queue<Integer> q = new LinkedList();
        Stack<Integer> arr = new Stack<>();

        for(int i=0; i<priorities.length; i++){
            q.offer(priorities[i]);
            arr.push(i);
        }
        int cnt = 0;
        while (!q.isEmpty()){
            if (q.peek() < maxValue(q)){
                q.add(q.poll());
                arr.add(arr.remove(cnt));
            }else{
                cnt++;
                q.poll();
            }
        }
        return arr.indexOf(location)+1;
    }

    public int maxValue(Queue q){
        Queue tmpq = new LinkedList(q);
        int max = 0;
        int val;
        while (!tmpq.isEmpty()){
            val = (int)tmpq.poll();
            if(max<val){
                max = val;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // test case
        // 1.
        int[] priorities1 = {2, 1, 3, 2};
        int location1 = 2;
        // 2.
        int[] priorities2 ={1, 1, 9, 1, 1, 1};
        int location2 = 0;
        Printer p = new Printer();
        int result = p.solution(priorities1,location1);
        System.out.println(result);
    }
}



