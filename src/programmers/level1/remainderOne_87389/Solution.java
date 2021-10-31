package programmers.level1.remainderOne_87389;

class Solution {
    public int solution(int n) {
        int answer = 1;
        while(true){
            if(n % answer == 1){
                break;
            }
            answer += 1;
        }
        return answer;
    }
}