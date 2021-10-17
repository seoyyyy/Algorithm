package programmers.level2.nextBigNumber_12911;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=n+1; i <= 1000000; i++){
            if( searchBinCnt(n,'1') == searchBinCnt(i, '1')){
                answer += i;
                break;
            }
        }

        return answer;
    }

    private int searchBinCnt(int num, char findChar){
        String binaryString = Integer.toBinaryString(num);
        int cnt = 0;
        for(int i=0; i < binaryString.length(); i++){
            if(binaryString.charAt(i) == findChar){
                cnt ++;
            }
        }
        return cnt;
    }

}
