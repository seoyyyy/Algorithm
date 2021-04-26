package programmers.level1;
//음양 더하기
public class EumYangAdd {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++){
            answer += signs[i] ? +absolutes[i]: -absolutes[i];
        }

        return answer;
    }

    public static void main(String[] args){
        EumYangAdd aya = new EumYangAdd();

        //test case
        //1.
        int[] absolutes1 = {4,7,12};
        boolean[] signs1 = {true,false,true};
        //2.
        int[] absolutes2 = {1,2,3};
        boolean[] signs2 = {false,false,true};
        int result = aya.solution(absolutes1,signs1);
        System.out.println(result);
    }
}
