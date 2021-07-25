package baekjoon.구현.나이계산하기_16199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int[] birth = new int[3];
        int[] select = new int[3];

        for (int i = 0; i < birth.length; i++) {
            birth[i] = Integer.parseInt(st1.nextToken());
            select[i] = Integer.parseInt(st2.nextToken());
        }
        int year_age = select[0] - birth[0];
        int man_age = year_age;
        int count_age = man_age + 1;

        if (birth[1] > select[1] || (birth[1] == select[1] && birth[2] > select[2])) {
            man_age -= 1;
        }

        System.out.println(man_age);
        System.out.println(count_age);
        System.out.println(year_age);
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}