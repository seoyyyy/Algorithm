package programmers.level1.get_average;

public class GetAverage {
    public double solution(int[] arr) {
        double answer = 0;
        for(int item:arr){
            answer += item;
        }
        return answer/arr.length;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,5};

        GetAverage ga = new GetAverage();
        double result = ga.solution(arr1);

        System.out.println(result);
    }
}
