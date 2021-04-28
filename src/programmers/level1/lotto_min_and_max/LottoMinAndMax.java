package programmers.level1.lotto_min_and_max;
//로또의 최고 순위와 최저 순위
public class LottoMinAndMax {

    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt = 0;
        int zeroCnt = 0;
        for(int lotto: lottos){
            if(lotto == 0) {
                zeroCnt ++;
                continue;
            }
            for(int win_num:win_nums){
                if(win_num == lotto){
                    cnt ++;
                    break;
                }
            }
        }
        return new int[]{7-Math.max(cnt+zeroCnt,1),7-Math.max(cnt,1)};
    }


    public static void main(String[] args){
        LottoMinAndMax lmam = new LottoMinAndMax();
        // test case
        // 1.
        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};
        // 2.
        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};
        // 3.
        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] win_nums3 = {20, 9, 3, 45, 4, 35};

        int[] result = lmam.solution(lottos2,win_nums2);
        for (int item:result
             ) {
            System.out.println(item);
        }
    }
}
