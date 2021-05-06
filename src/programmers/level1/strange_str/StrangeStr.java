package programmers.level1.strange_str;

public class StrangeStr {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ",-1);
        for(String item:arr){
                for (int i=0; i<item.length(); i++){
                    if(i % 2 == 0){
                        answer += String.valueOf(item.charAt(i)).toUpperCase();
                    }else{
                        answer += String.valueOf(item.charAt(i)).toLowerCase();
                    }
                }
                answer+=" ";

        }
        return answer.substring(0,answer.length()-1);
    }

    public static void main(String[] args) {
        // test case
        // 1.
        String s = "  try    hello   world ";

        StrangeStr ss = new StrangeStr();
        String result = ss.solution(s);
        System.out.println(result);
    }
}
