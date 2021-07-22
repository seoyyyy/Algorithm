package baekjoon.수학.다리우스님한타안함_20499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("/");
        int[] arr = new int[s.length]; // 1: K, 2: D, 3: A
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        if(arr[0] + arr[2] < arr[1] || arr[1] == 0){
            System.out.println("hasu");
        }else{
            System.out.println("gosu");
        }

    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}