package programmers.level1.keypad;

import java.util.*;

public class KeyPad {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        List<Integer> leftSide = Arrays.asList(new Integer[]{1,4,7,10});
        List<Integer> middleSdie = Arrays.asList(new Integer[]{2,5,8,0});
        List<Integer> rightSide = Arrays.asList(new Integer[]{3,6,9,11});

        List<List<Integer>> keypad = new ArrayList<>();
        keypad.add(leftSide);
        keypad.add(middleSdie);
        keypad.add(rightSide);

        int[] lp = {0,3};
        int[] rp = {2,3};

        for(int num: numbers){
            for(int j=0; j<keypad.size(); j++){
                for(int i=0; i<keypad.get(j).size();i++){
                    if(num == keypad.get(j).get(i)) {
                        switch (j){
                            case 0:
                                answer += "L";
                                break;
                            case 2:
                                answer += "R";

                                break;
                            default:
                                System.out.println(num + "] 거리 계산 = "+(Math.abs(j-lp[0])+Math.abs(i-lp[1]))+"       "+(Math.abs(j-rp[0])+Math.abs(i-rp[1])));
                                if(Math.abs(j-lp[0])+Math.abs(i-lp[1])==Math.abs(j-rp[0])+Math.abs(i-rp[1])) {
                                    answer += hand.equals("right")?"R":"L";
                                }else if(Math.abs(j-lp[0])+Math.abs(i-lp[1])<Math.abs(j-rp[0])+Math.abs(i-rp[1])){
                                    answer += "L";
                                }else {
                                     answer += "R";
                                }
                        }
                        System.out.println(num+" => ij("+i+","+j+") left(" + lp[1]+","+lp[0]+ ")"+keypad.get(lp[0]).get(lp[1])+ " / right(" + rp[1] + "," + rp[0] + ")"+ keypad.get(rp[0]).get(rp[1]) +" / "+answer.charAt(answer.length()-1));

                        if(answer.charAt(answer.length()-1)=='R'){
                            rp = new int[]{j,i};
                        }else {
                            lp = new int[]{j,i};
                        }
                        break;
                    }

                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        KeyPad kp = new KeyPad();

        //test case
        // 1.
        int[] numbers1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand1 = "right";
        String result1 = kp.solution(numbers1,hand1);
        System.out.println(result1);
//         2.
//        int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
//        String hand2 = "left";
//        String result2 = kp.solution(numbers2,hand2);
//        System.out.println(result2);
        // 3.
//        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        String hand3 = "right";
//        String result3 = kp.solution(numbers3,hand3);
//        System.out.println(result3);
    }
}
