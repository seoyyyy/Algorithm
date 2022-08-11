package programmers.level2.joystick_42860;

/**
 * 조이스틱 42860
 */
public class Solution {

//    "JEROEN" 테스트케이스가 풀리지 않는다...
//    public int solution(String name) {
//        int answer = 0;
//        for (int i = 0; i < name.length(); i++) {
//
//            int idx = name.charAt(i) - 'A';
//            int reversIdx = 'Z' - name.charAt(i) + 1;
//
//            answer += Math.min(idx, reversIdx);
//
//            if(i < name.length() - 2){
//                answer ++;
//            }
//        }
//
//        return answer;
//    }
//

// 다른사람이 풀이한 문제
//   while(idx < name.length() && name.charAt(idx) == 'A'){
//                idx ++;
//  }
//
//  move = Math.min(move, i * 2 + name.length() - idx);
//  move = Math.min(move, (name.length() - idx) * 2 + i);
//
// 여기부터 왜 이렇게 진행이 되는지 이해가 되지 않는다.

    public int solution(String name) {
        int answer = 0;
        int move = name.length() - 1;

        for (int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            int idx = i + 1;
            while(idx < name.length() && name.charAt(idx) == 'A'){
                idx ++;
            }

            move = Math.min(move, i * 2 + name.length() - idx);
            move = Math.min(move, (name.length() - idx) * 2 + i);

        }

        return answer + move;
    }

    public static void main(String[] args) {
        String name1 = "JEROEN";
        String name2 = "JAN";
        String name3 = "JAZ";

        Solution s = new Solution();
        int result = s.solution(name3);
        System.out.println("result = " + result);
    }
}
