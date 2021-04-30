package programmers.level1.string_to_int;
// 문자열을 정수로 바꾸기
public class StringToInt {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
    public static void main(String[] args){
        StringToInt sti = new StringToInt();
        int result = sti.solution("100");
        System.out.println(result);
    }
}
