package baekjoon.수학.수찬은_마린보이야_15921;

/**
5
5 10 10 15 20
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer,Integer> map = new HashMap<>();
        if(n == 0){
            System.out.println("divide by zero");
        }else{
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            // 합계 구하기
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
                map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
            }
            // 평균 값
            double avg = sum / (double)n;

            // 기대값
            double exp = 0.00;
            for (int item:map.keySet()) {
                exp += item * map.get(item) / (double)n;
            }
            System.out.printf("%.2f", avg/exp);


        }
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}