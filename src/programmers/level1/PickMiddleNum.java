package programmers.level1;

public class PickMiddleNum {
    public String solution(String s) {
        String answer = "";

        if(s.length()%2==0) {
            answer=	s.substring(s.length()/2-1,s.length()/2+1);
        }else {
            answer = s.substring(s.charAt(s.length()/2));
        }




        return answer;
    }

    public static void main(String[] args){
        PickMiddleNum pmn = new PickMiddleNum();

        // test case
        //1.
        String s1 = "abcde";
        String s2 = "qwer";

        String result = pmn.solution(s2);
        System.out.println(result);
    }

}
