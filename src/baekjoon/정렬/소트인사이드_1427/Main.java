package baekjoon.정렬.소트인사이드_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 소트인사이드 1427
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split("");

        Arrays.sort(numbers, Comparator.reverseOrder());

        for (String number : numbers) {
            System.out.print(number);
        }
    }
}
