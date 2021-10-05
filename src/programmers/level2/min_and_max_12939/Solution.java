package programmers.level2.min_and_max_12939;

public class Solution {
    public String solution(String s) {
        String[] sArr = s.split(" ");
        int min = Integer.parseInt(sArr[0]);
        int max = Integer.parseInt(sArr[0]);
        int num;
        for(int i=0; i<sArr.length; i++){
            num = Integer.parseInt(sArr[i]);
            if(num < min) min = num;
            if(num > max) max = num;
        }

        return min+ " " + max;
    }

    public static void main(String[] args) {
        //test case
        //1.
        String t = "1 2 3 4";
        String t2 = "-1 -2 -3 -4";
        String t3 = "-1 -1";

        Solution s = new Solution();
        String result = s.solution(t);
        System.out.println(result);
    }
}