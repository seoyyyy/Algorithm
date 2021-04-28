package programmers.level1.string_sort;

//문자열 내 마음대로 정렬하기
public class StringSort {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;
        String temp;
        int compareNum = n;
        for(int i=0; i<strings.length-1; i++){
            for(int j=i+1;j<strings.length; j++){
                if(strings[i].charAt(n)==strings[j].charAt(n)&&strings[i].compareTo(strings[j])<0){
                    continue;
                }else if(!isLagerThan(strings[i],strings[j],compareNum)){
                    continue;
                }//end if
                temp = strings[i];
                strings[i] = strings[j];
                strings[j] = temp;
            }
        }
        return answer;
    }

    public boolean isLagerThan(String a, String b,int n){
        if((int)a.charAt(n)<(int)b.charAt(n)){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        StringSort ss = new StringSort();

        // Test Case
        // 1.
        String[] strings1 = {"sun", "bed", "car"};
        int n1 = 1;
        // 2.
        String[] strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;
        String[] result = ss.solution(strings1,1);

        for(String item:result){
            System.out.println(item);
        }
    }
}
