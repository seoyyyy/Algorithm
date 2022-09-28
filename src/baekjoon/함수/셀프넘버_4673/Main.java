package baekjoon.함수.셀프넘버_4673;

/**
 * 셀프넘버 4673
 */
public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        boolean[] check = new boolean[10001];
        for (int i = 1; i < 10001; i++) {
            int n = d(i);

            if( n < 10001){
                check[n] = true;
            }
        }

        for (int i = 1; i < 10001; i++) {
            if(!check[i]){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static int d(int n){
        int sum = n;
        while (n != 0){
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
