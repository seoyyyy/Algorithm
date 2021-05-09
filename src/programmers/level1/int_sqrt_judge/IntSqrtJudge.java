package programmers.level1.int_sqrt_judge;

public class IntSqrtJudge {
    public long solution(long n) {
        String[] sn = String.valueOf(Math.sqrt(n)).split("\\.");
        long integer = Long.parseLong(sn[0]);
        long decimal = Long.parseLong(sn[1]);
        if(decimal!=0){
            return -1;
        }
        return (integer+1) * (integer+1);
    }

    public static void main(String[] args) {
        int n1 = 121;
        int n2 = 3;
        IntSqrtJudge isj = new IntSqrtJudge();
        long result = isj.solution(n1);
        System.out.println(n1)  ;
    }

}
