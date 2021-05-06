package programmers.level1.reverse_int_arr;

import java.util.Arrays;
import java.util.Collections;

public class ReverseIntArr {
    public int[] solution(long n) {
        String[] s = String.valueOf(n).split("");

        Collections.reverse(Arrays.asList(s));

        return Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
    }

    public static void main(String[] args) {
        ReverseIntArr ria = new ReverseIntArr();
        //test
        long n = 12345;

        int [] result = ria.solution(n);
        for (int item:result) {
            System.out.print(item+" ");
        }
    }
}
