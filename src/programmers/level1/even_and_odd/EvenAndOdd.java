package programmers.level1.even_and_odd;

public class EvenAndOdd {
    public String solution(int num) {
        return num % 2 == 0 ? "Even": "Odd";
    }

    public static void main(String[]args){
        //test case
        // 1.
        int num1 =3;
        int num2 =4;
        EvenAndOdd eao = new EvenAndOdd();
        String result = eao.solution(num1);
        System.out.println(result);
    }
}
