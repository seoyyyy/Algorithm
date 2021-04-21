package programmers.level1;

import java.util.ArrayList;

public class HateSameNum {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList();

        int saveNum = -1;
        for(int i=0; i<arr.length; i++){
            if(saveNum != arr[i]){
                saveNum=arr[i];
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args){
        HateSameNum hsn = new HateSameNum();
        // test case
        // 1.
        int[] test1 = {1,1,3,3,0,1,1};
        int[] test2 = {4,4,4,3,3};
        int[] result = hsn.solution(test1);

        for(int item:result){
            System.out.print(item+",");
        }
    }
}
