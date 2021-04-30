package programmers.level1.handling_strings;
// 문자열 다루기 기본
public class HandlingStrings {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.matches("\\d*") && (s.length()==4 || s.length()==6)){
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args){
        HandlingStrings hs = new HandlingStrings();
        // test case
        // 1.
        String s1 = "a234";
        // 2.
        String s2 = "1234";

        boolean flag = hs.solution(s2);
        System.out.println(flag);
    }
}
