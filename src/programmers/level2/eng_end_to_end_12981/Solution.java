package programmers.level2.eng_end_to_end_12981;

import java.util.HashSet;
import java.util.Set;

/**
 * 영어 끝말잇기 12981
 */
public class Solution {

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> savedWords = new HashSet<>();

        savedWords.add(words[0]);

        int i;
        for (i=1; i < words.length; i ++) {
            String nowWord = words[i];
            String prevWord = words[i-1];

            if(nowWord.length() == 1) break;
            if(savedWords.contains(nowWord)) break;
            if(nowWord.charAt(0) != prevWord.charAt(prevWord.length() - 1)) break;

            savedWords.add(words[i]);
        }

        answer[0] = (i + 1) % n == 0 ? n : (i + 1) % n;
        answer[1] = (int) Math.ceil((double) (i + 1) / n);

        if(i == words.length) answer = new int[]{0,0};

        return answer;
    }


// 3번 테스트케이스에서 실패
//    public int[] solution(int n, String[] words) {
//        int[] answer = {1,1};
//        Set<String> savedWords = new HashSet<>();
//
//        for (int i=0; i < words.length; i ++) {
//            String nowWord = words[i];
//            String prevWord = i > 1 ? words[i-1] : "";
//            if(savedWords.contains(nowWord) || (i > 1 && nowWord.charAt(0) != prevWord.charAt(prevWord.length() - 1))){
//                break;
//            }
//            if(nowWord.length() == 1){
//                answer = new int[]{0,0};
//                break;
//            }
//
//            savedWords.add(words[i]);
//
//            if(answer[0] == n){
//                answer[0] =  1;
//                answer[1] += 1;
//            } else{
//                answer[0] += 1;
//            }
//        }
//
//        if(savedWords.size() == words.length){
//            answer = new int[]{0,0};
//        }
//        return answer;
//    }

    public static void main(String[] args) {
        int n = 3;
        int n2 = 5;
        int n3 = 2;

        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};
        String[] words4 = {"aba", "aba"};

        Solution s = new Solution();
        int[] result = s.solution(n2, words2);

        System.out.println("result = " + result[0] + ", " + result[1]);
    }
}
