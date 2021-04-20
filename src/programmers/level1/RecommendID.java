package programmers.level1;

// 신규 아이디 추천
public class RecommendID {
    public String solution(String new_id) {
        // 1단계
        String answer = new_id.toLowerCase();
        // 2단계
        answer = answer.replaceAll("[^a-z\\d\\.\\-\\_]","");

        // 3단계
        answer = answer.replaceAll("\\.{2,}",".");

        // 4단계
        answer = answer.replaceAll("^\\.|\\.$","");

        // 5단계
        answer = answer.replaceAll("^$","a");


        // 6단계
        answer = answer.length()>=16?answer.substring(0,15):answer;

        answer = answer.replaceAll("\\.$","");

        // 7단계
        if(answer.length()<=2){
            while(answer.length()<3){
                answer += answer.substring(answer.length()-1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // test case
        String new_id1 = "...!@BaT#*..y.abcdefghijklm";
        String new_id2 = "z-+.^.";
        String new_id3 = "=.=";
        String new_id4 = "123_.def";
        String new_id5 = "abcdefghijklmn.p";

        RecommendID rId = new RecommendID();

        String result = rId.solution(new_id4);

        System.out.println(result);
    }
}
