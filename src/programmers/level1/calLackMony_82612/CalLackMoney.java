package programmers.level1.calLackMony_82612;
// 1주차 부족한 금액 계산하기
public class CalLackMoney {
    public long solution(int price, int money, int count) {
        long answer = money;
        for(int i=1; i< count + 1; i++){
            answer -= price * i;
        }


        return answer < 0? -answer : 0;
    }
    public static void main(String[] args) {
        CalLackMoney cm = new CalLackMoney();

        /**
         * price	money	count	result
         * 3	20	4	10
         */

        long result = cm.solution(3, 20, 4);
        System.out.println(result);
    }
}
