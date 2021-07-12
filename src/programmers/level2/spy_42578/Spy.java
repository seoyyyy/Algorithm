package programmers.level2.spy_42578;

import java.util.*;

public class Spy {
    public int solution(String[][] clothes){
        int answer = 1;
        Map<String, ArrayList<String>> m = new HashMap();
        for (String[] item : clothes) {
            if(m.containsKey(item[1])){
                m.get(item[1]).add(item[0]);
            }else{
                m.put(item[1], new ArrayList<>());
                m.get(item[1]).add(item[0]);
            }
        }

        Set<String> keys = m.keySet();
        for (String key : keys) {
            answer *= m.get(key).size() + 1;
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        // test case
        String[][] clothes1 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};

        Spy s = new Spy();
        int result = s.solution(clothes2);
        System.out.println(result);
    }
}
