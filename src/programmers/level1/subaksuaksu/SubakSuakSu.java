package programmers.level1.subaksuaksu;
// 수박수박수박수박수박수?
public class SubakSuakSu {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            if (i % 2 == 0){
                sb.append("수");
            }else{
                sb.append("박");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        SubakSuakSu sss = new SubakSuakSu();

        // Test Case
        // 1.
        int n1 = 3;
        int n2 = 4;
        String result = sss.solution(n2);

        System.out.println(result);
    }
}
