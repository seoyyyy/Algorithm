package programmers.level1.dart_game;

public class DartGame {
    public int solution(String dartResult) {
        int answer = 0;
        String strNum = "";
        char curPoint;
        int[] calArr = new int[3];
        int cnt = -1;
        for(int i=0; i<dartResult.length();i++){
            curPoint = dartResult.charAt(i);
            if (48 <= curPoint && 57 >= curPoint) {
                if(strNum ==""){
                    cnt ++;
                }
                strNum += curPoint;
            } else {
                switch (curPoint) {
                    case 'S':
                        calArr[cnt] = (int) Math.pow(Integer.parseInt(strNum), 1);
                        break;
                    case 'D':
                        calArr[cnt] = (int) Math.pow(Integer.parseInt(strNum), 2);
                        break;
                    case 'T':
                        calArr[cnt] = (int) Math.pow(Integer.parseInt(strNum), 3);
                        break;
                    case '*':
                        calArr[cnt] *= 2;
                        if(cnt>=1){
                            calArr[cnt-1] *=2;
                        }
                        break;
                    case '#':
                        calArr[cnt] *= -1;
                        break;
                }
                strNum = "";
            }
        }

        for (int score:calArr) {
            answer += score;
        }
        return answer;
    }

    public static void main(String[] args) {
        DartGame dg = new DartGame();
        // test case
        String[] dartResult = {"1S2D*3T", "1D2S#10S", "1D2S0T", "1S*2T*3S", "1D#2S*3S", "1T2D3D#", "1D2S3T*"};
        for(String item: dartResult){
            System.out.println("결과 : " + dg.solution(item));
        }
    }
}
