package programmers.level1.hashad_num;

public class HashadNum {
    public boolean solution(int x) {
        String[] sn = String.valueOf(x).split("");
        int sum = 0;
        for(String s:sn){
            sum += Integer.parseInt(s);
        }

        if(x % sum == 0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        //test case
        //1.
        int num1 = 10;
        //2.
        int num2 = 12;
        //3.
        int num3 = 11;
        //4.
        int num4 = 13;
        HashadNum hn = new HashadNum();
        boolean result = hn.solution(num1);
        System.out.println(result);
    }
}
