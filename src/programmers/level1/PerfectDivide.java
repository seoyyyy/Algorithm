package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
// 나누어 떨어지는 숫자 배열
public class PerfectDivide {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int item: arr){
            if(item % divisor == 0){
                list.add(item);
            }//end if
        }//end for

        if(list.size()==0) list.add(-1);

        Collections.sort(list);

        return list.stream().mapToInt(i->i).toArray();
    }//solution

    public static void main(String[] args){
        PerfectDivide pd = new PerfectDivide();

        //TestCase
        //1.
        int[] arr1 = {5, 9, 7, 10};
        int divisor1 = 5;
        //2.
        int[] arr2 = {2, 36, 1, 3};
        int divisor2 = 1;
        //3.
        int[] arr3 = {2, 36, 1, 3};
        int divisor3 = 10;

        int[] result = pd.solution(arr2,divisor2);

        for (int item: result) {
            System.out.print(item+" ");
        }//end for
    }//main

}//class
