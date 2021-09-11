package programmers.level1.num_str_eng_81301;

import java.util.Arrays;
// 숫자 문자열과 영단어
public class NumStrEng {
    public int solution(String s) {
        int answer = 0;
        String[] snum = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(String num:snum){
            s = s.replaceAll(num, String.valueOf(Arrays.asList(snum).indexOf(num)));
        }
        answer = Integer.parseInt(s);
        return answer;
    }


    public static void main(String[] args) {
        NumStrEng nse = new NumStrEng();
        String[] testCase = {"one4seveneight","23four5six7","2three45sixseven","123"};

        for (String item:testCase) {
            System.out.println(nse.solution(item));


        }

    }
}
