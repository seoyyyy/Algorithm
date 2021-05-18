package programmers.level1.world_124;

public class World124 {
    public String solution(int n){
         StringBuilder sb = new StringBuilder();
         String[] numbers = {"4","1","2"};
         while(n > 0){
             int remain = n % 3;
             n /= 3;
             if( remain == 0){
                 n --;
             }
             sb.insert(0,numbers[remain]);
         }
         return sb.toString();
    }

    public static void main(String[] args) {
        World124 w = new World124();

        // tes case
        for(int i=1; i<=50; i++){
            System.out.println(i+" =  " +w.solution(i));
        }
    }

}
