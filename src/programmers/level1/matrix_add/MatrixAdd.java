package programmers.level1.matrix_add;

public class MatrixAdd {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        MatrixAdd ma = new MatrixAdd();

        // test case
        // 1.
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        // 2.
        int[][] arr3 = {{1},{2}};
        int[][] arr4 = {{3},{4}};
        int[][] result = ma.solution(arr1,arr2);
        for (int[] items:result) {
            for (int item:items) {
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }
}
