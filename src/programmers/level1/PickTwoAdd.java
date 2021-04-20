package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

// 두개 뽑아서 더하기
public class PickTwoAdd {

    public int[] solution(int[] numbers) {

        ArrayList<Integer> array = new ArrayList<>();

        for(int i=0; i<numbers.length-1; i++){
            for(int j= i+1; j<(numbers.length); j++){
                int number = numbers[i] + numbers[j];
                if(array.indexOf(number)<0){ //indexOf를 배열에서도 할수 있는지?
                    array.add(number);
                }
            }
        }
        Collections.sort(array);
        int[] answer = new int[array.size()];
        for(int i=0; i<array.size(); i++){
            answer[i] = array.get(i);
        }

        return answer;
    }

    public static void main(String[] args){
        PickTwoAdd pwa = new PickTwoAdd();

        int[] numbers1 ={2,1,3,4,1};
        int[] numbers2 = {5,0,2,7};

        int[] result = pwa.solution(numbers2);
        for(int item:result){
            System.out.print(item+" ");
        }
    }
}
