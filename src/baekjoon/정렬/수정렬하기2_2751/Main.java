package baekjoon.정렬.수정렬하기2_2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            set.add(num);
        }

        StringBuilder sb = new StringBuilder();
        for (Integer num : set) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}
