package baekjoon.정렬.좌표압축_18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 좌표압축 18870
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        int[] tempArr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = tempArr[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(tempArr);

        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tempArr.length; i++) {
            if(!map.containsKey(tempArr[i])){
                map.put(tempArr[i],cnt ++);
            }
        }


        for (int i = 0; i < arr.length; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }


        System.out.println(sb);
    }
}
