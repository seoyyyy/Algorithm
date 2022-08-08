package programmers.level2.row_col_multiple_12949;

/**
 * 행렬의 곱셈
 * 어릴때 수학과 담을 쌓아서.. 어려웠던 문..제..
 * answer[i][j] ===>  sum += arr1[i][k] * arr2[k][j];
 */
public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i=0; i < arr1.length; i++){
            for(int j=0; j <arr2[0].length; j ++){
                int sum = 0;
                for(int k=0; k < arr1[0].length; k ++){
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        int[][] result1 = s.solution(arr1, arr2);
        for (int[] row : result1) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


        int[][] arr3 = {{2,3,2}, {4,2,4}, {3,1,4}};
        int[][] arr4 = {{5,4,3}, {2,4,1}, {3,1,1}};

        int[][] result2 = s.solution(arr3, arr4);
        for (int[] row : result2) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
