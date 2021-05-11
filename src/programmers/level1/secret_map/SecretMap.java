package programmers.level1.secret_map;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        for(int i=0; i<arr1.length;i++){
            answer[i] =String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i] | arr2[i])))
                                                 .replaceAll("1","#")
                                                 .replaceAll("0"," ");
        }

        return answer;
    }

    public static void main(String[] args) {
        SecretMap sm = new SecretMap();
        // test case
        //1.
        int n1 = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        //2.
        int n2 = 6;
        int[] arr3 = {46,33,33,22,31,50};
        int[] arr4 = {27,56,19,14,14,10};

        for(String[] i :new String[][] {sm.solution(n1,arr1,arr2),sm.solution(n2,arr3,arr4)}){
            System.out.println("결과 : ");
            for (String j:i) {
                System.out.println(j);
            }
            System.out.println();


        }


    }
}
