package programmers.level1;

public class PrimeNumber {
    public int solution(int[] nums) {
        int answer = 0;
        int number;
        boolean flag;
        for(int i=0; i< nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1;k<nums.length; k++){
                    number = nums[i] + nums[j] + nums[k];
                    flag = true;
                    for(int z=2; z<number; z++){
                        if(number % z == 0){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        answer ++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        PrimeNumber pn = new PrimeNumber();
        // TestCase
        //1.
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,2,7,6,4};

        int result = pn.solution(nums2);
        System.out.println(result);
    }
}
