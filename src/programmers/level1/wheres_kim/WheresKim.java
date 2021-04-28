package programmers.level1.wheres_kim;
//서울에서 김서방 찾기
public class WheresKim {
    public String solution(String[] seoul) {
        String answer = "";

        for(int i=0; i<seoul.length; i++){
            if(seoul[i] .equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
            }
        }

        return answer;
    }

    public static void main(String[] args){
        // TEST CASE
        String[] seoul = {"Jane", "Kim"};

        WheresKim wk = new WheresKim();
        String result = wk.solution(seoul);

        System.out.println(result);
    }
}
