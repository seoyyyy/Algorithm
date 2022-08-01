package programmers.level2.target_number_43165;
/**
 * 타겟넘버
 * n개의 음이 아닌 정수들이 있습니다.
 * 이 정수들을 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다.
 * 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
 *
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 *
 * * 제한사항
 * * * 주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
 * * * 각 숫자는 1 이상 50 이하인 자연수입니다.
 * * * 타겟 넘버는 1 이상 1000 이하인 자연수입니다.
 */
public class Solution {
    int [] numArr;
    int target;
    int cnt = 0;

    public int solution(int[] numbers, int target) {
        this.numArr = numbers;
        this.target = target;

        dfs(0,0);

        return cnt;
    }

    public void dfs(int answer, int depth){
        if(depth == numArr.length){
            if(answer == target){
                cnt ++;
            }
            return;
        }

        dfs(answer + numArr[depth], depth + 1);
        dfs(answer - numArr[depth], depth + 1);
    }


    public static void main(String[] args) {
        Solution s = new Solution();


        // test case 1
        int[] numbers = {1,1,1,1,1};
        int target = 3;

        int result1 = s.solution(numbers, target);
        System.out.println("result1 = " + result1);

//        // test case 2
//        int[] numbers2 = {4,1,2,1};
//        int target2 = 4;
//
//        int result2 = s.solution(numbers2, target2);
//        System.out.println("result2 = " + result2);
    }
}