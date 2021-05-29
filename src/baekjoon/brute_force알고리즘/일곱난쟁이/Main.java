package baekjoon.brute_force알고리즘.일곱난쟁이;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int tmp;
        for(int i=0; i<9; i++){
            tmp = Integer.parseInt(br.readLine());
            list.add(tmp);
            sum += tmp;
        }

        int a,b;
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                a = list.get(i);
                b = list.get(j);
                if(sum - a - b == 100){
                    list.remove(j);
                    list.remove(i);
                }
            }
        }

        Collections.sort(list);
        for(int item:list){
            System.out.println(item);
        }

    }

    public static void main(String[] args) {
        Main m = new Main();
        try {
            m.solution();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
