package programmers.level2.group_photo_1835;

import java.util.HashMap;

/**
 * 단체사진 찍기 1835
 */
public class Solution {
    static HashMap<Character, Integer> friends;
    static String[] data;
    static boolean[] visited;
    static int[] cp;
    static int answer;

    public int solution(int n, String[] data) {
        answer = 0;
        friends = new HashMap<>();
        friends.put('A', 0);
        friends.put('C', 1);
        friends.put('F', 2);
        friends.put('J', 3);
        friends.put('M', 4);
        friends.put('N', 5);
        friends.put('R', 6);
        friends.put('T', 7);

        visited = new boolean[friends.size()];
        cp = new int[friends.size()];

        this.data = data;
        dfs(0);
        return answer;
    }


    public void dfs(int depth){
        if(depth == friends.size()){
            if(check()) answer ++;

            return;
        }

        for (int i = 0; i < friends.size(); i++) {
            if(visited[i]) continue;

            visited[i] = true;
            cp[depth] = i;
            dfs(depth + 1);
            visited[i] = false;
        }
    }

    public boolean check(){
        boolean flag = true;
        for (String row : data) {
            int position1 = cp[friends.get(row.charAt(0))];
            int position2 = cp[friends.get(row.charAt(2))];
            char operate = row.charAt(3); // 계산식 [=, <, >]
            int res = row.charAt(4) - '0'; // 결과값
            int cal = Math.abs(position1 - position2) - 1;

            switch (operate){
                case '=':
                    if(cal != res) flag = false;
                    break;
                case '>':
                    if(cal <= res) flag = false;
                    break;
                case '<':
                    if(cal >= res) flag = false;
                    break;
            }
        }
        return flag;
    }


/*  틀린코드
    // String 으로 풀이 시 시간초과 에러 발생 -> friends의 인덱스를 담은 int 배열로 처리
    // index 처리를 위해 friends를 String[] friends => HashMap<String, Index> friends 로 변경
    public void dfs(String members){
        if(members.length() == friends.size()){
            if(check(members)) answer ++;
            return;
        }

        for (int i = 0; i < friends.size(); i++) {
            if(visited[i]) continue;

            visited[i] = true;
            dfs( members + friends[i]);
            visited[i] = false;
        }
    }


        public boolean check(String members){
        boolean flag = true;
        for (String row : data) {
            int position1 = members.indexOf(row.charAt(0));
            int position2 = members.indexOf(row.charAt(2));
            char operate = row.charAt(3); // 계산식 [=, <, >]
            int res = row.charAt(4) - '0'; // 결과값
            int cal = Math.abs(position1 - position2) - 1;

             switch (operate){
                case '=':
                    if(cal != res) flag = false;
                    break;
                case '>':
                    if(cal <= res) flag = false;
                    break;
                case '<':
                    if(cal >= res) flag = false;
                    break;
            }
        }
        return flag;
    }



 */

    public static void main(String[] args) {
        // test case 1
        int n = 2;
        String[] data = {"N~F=0", "R~T>2"};
        // test case 2
        int n2 = 2;
        String[] data2 = {"M~C<2", "C~M>1"};

        Solution s = new Solution();
        int answer = s.solution(n, data);
        System.out.println("answer = " + answer);
    }
}