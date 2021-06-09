package baekjoon.수학.주사위세개_2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer,Integer> map = new HashMap();
        int index;
        while(st.hasMoreTokens()){
            index = Integer.parseInt(st.nextToken());
            map.put(index,map.getOrDefault(index,0)+1);
        }

        int cnt = 1;
        Set s = map.keySet();
        Iterator iterator = s.iterator();
        while(iterator.hasNext()){
            index = (int) iterator.next();
            cnt = map.get(index);

            if(cnt == 3){
                System.out.println(10000 + index * 1000);
                break;
            }else if(cnt == 2){
                System.out.println(1000 + index * 100);
                break;
            }
        }

        Iterator iter = s.iterator();
        int max = 0;
        if(cnt == 1){
            while(iter.hasNext()){
                int tmp = (int)iter.next();
                if(max < tmp){
                    max = tmp;
                }
            }
            System.out.println(max * 100);
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
