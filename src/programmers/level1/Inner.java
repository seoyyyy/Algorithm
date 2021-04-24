package programmers.level1;
// 내적
public class Inner {
        public int solution(int[] a, int[] b) {
            int answer = 0;
            for(int i=0; i<a.length; i++){
                answer += (a[i]*b[i]);
            }
            return answer;
        }

    public static void main(String[] args){
        Inner inner = new Inner();
        //test case
        //1.
        int[] a1 = {1,2,3,4};
        int[] b1 = {-3,-1,0,2};

        //2.
        int[] a2 = {-1,0,1};
        int[] b2 = {1,0,-1};

        int result = inner.solution(a2,b2);
        System.out.println(result);
    }
}
