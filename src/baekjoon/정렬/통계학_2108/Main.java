package baekjoon.정렬.통계학_2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Map<Integer,Integer> map = new TreeMap<>();

        int sum = 0;
        int max = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            max = Math.max(max, map.get(arr[i]));
            sum += arr[i];
        }

        Arrays.sort(arr);

        int many = 0;
        int cnt = 0;
        for (Integer key : map.keySet()) {
            if(map.get(key) == max){
                many = key;

                if(cnt >= 1){
                    break;
                }

                cnt ++;
            }
        }

        int avg = (int) Math.round((double) sum / N);
        int mid = arr[N % 2 == 0 ? (N /2) - 1 : N / 2];
        int dis = arr[arr.length-1] - arr[0];

        System.out.println(avg);
        System.out.println(mid);
        System.out.println(many);
        System.out.println(dis);

    }
}
