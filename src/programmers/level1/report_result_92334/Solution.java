package programmers.level1.report_result_92334;

import java.util.*;

/**
 * 신고 결과 받기 92334
 */
public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        List<String> idList = Arrays.asList(id_list);
        Map<String, Set<String>> reportCnt = new HashMap<>();

        for (String info : report) {
            String[] id = info.split(" ");

            String fromId = id[0], toId = id[1];
            if(!reportCnt.containsKey(toId)){
                reportCnt.put(toId, new HashSet<>());
                reportCnt.get(toId).add(fromId);
            }else{
                if(!reportCnt.get(toId).contains(fromId)){
                    reportCnt.get(toId).add(fromId);
                }
            }
        }

        int[] answer = new int[idList.size()];

        for (String key : reportCnt.keySet()) {
            Set<String> fromId = reportCnt.get(key);
            if(fromId.size() >= k){
                for (String id : fromId) {
                    answer[idList.indexOf(id)] ++;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        Solution s = new Solution();
        int[] result = s.solution(id_list, report, k);
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }
}
