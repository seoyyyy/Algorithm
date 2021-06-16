package baekjoon.구현.삼각형_외우기_10101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        int sum = 0;
        for(int i=0; i<3; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        if(sum == 180){
            if(arr[0]==60 && arr[1]==60){
                System.out.println("Equilateral");
            }else if(arr[0]==arr[1] || arr[0]==arr[2] || arr[1] == arr[2]){
                System.out.println("Isosceles");
            }else {
                System.out.println("Scalene");
            }
        }else {
            System.out.println("Error");
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
