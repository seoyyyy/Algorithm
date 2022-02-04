package programmers.level2.zip_str_60057;

class Solution {
    public int solution(String s) {
        int answer=s.length();


        for(int i = s.length()/2; i >= 1; i--) {
            String result = "";
            int times = s.length()/i;
            int count = 1;
            for(int j = 0; j < times-1; j++) {
                String tmp = s.substring(i*j,i*(j+1));


                if(tmp.equals(s.substring(i*(j+1),i*(j+2)))) {
                    count++;
                }
                else {
                    if(count>1) {
                        result += count+s.substring(i*j,i*(j+1))+"";

                    }
                    else {
                        result += s.substring(i*j,i*(j+1))+"";

                    }
                    count=1;
                }


                if(j==times-2) {
                    if(count > 1) {
                        result = result + count + s.substring(i*(j+1),i*(j+2))+"";
                    }
                    else {
                        result = result + s.substring(i*(j+1),i*(j+2))+"";
                    }
                }
            }
            result = result + s.substring(i*times);

            if(answer>result.length()) {
                answer=result.length();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] testList = {"aabbaccc", "ababcdcdababcdcd", "abcabcdede", "abcabcabcabcdededededede", "xababcdcdababcdcd"};
        for (String s : testList) {
            System.out.println(sol.solution(s));
        }
    }
}