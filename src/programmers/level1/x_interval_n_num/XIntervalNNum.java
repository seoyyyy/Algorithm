package programmers.level1.x_interval_n_num;

public class XIntervalNNum {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=0; i<n; i++){
            answer[i] = (long)x * (i+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        //test case
        // 1.
        int x1 = 2;
        int n1 = 5;
        //2.
        int x2= 4;
        int n2 = 3;
        //3.
        int x3 = -4;
        int n3 = 2;

        XIntervalNNum xinn = new XIntervalNNum();
        long[] result = xinn.solution(x1,n1);

        for (long item:result) {
            System.out.print(item+" ");
        }


    }
}
