package programmers.level1.del_best_small_num;

public class DelBestSmallNum {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }
        int minNum = arr[0];
        for(int item:arr){
            if(item < minNum){
                minNum = item;
            }
        }
        int idx =0;
        int[] answer = new int[arr.length-1];
        for(int item:arr){
            if(item != minNum){
                answer[idx] = item;
                idx ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        DelBestSmallNum bsn = new DelBestSmallNum();
        //test case
        //1.
        int[] arr1 = {4,3,2,1};
        //2.
        int[] arr2 = {10};

        int[] result = bsn.solution(arr1);

        for (int item:result) {
            System.out.print(item+" ");
        }

    }
}
