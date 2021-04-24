package programmers.level1;

import java.util.ArrayList;

// 3진법 뒤집
public class SamJinBub {

    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
            list.add(n%3);
            n = n/3;
        }

        for(int i=0; i<list.size(); i++){
            answer += Math.pow(3,(list.size()-i-1)) * list.get(i);
        }
        return answer;
    }

    public static void main(String[] args){
        SamJinBub sjb = new SamJinBub();
        //test case
        //1.
        int n = 45;
        //2.
        int n2 = 125;

        int result = sjb.solution(n2);

        System.out.println(result);
    }
}
