package programmers.level1.py_num;
// 문자열 내 p와 y의 개수
public class PYnum {
    boolean solution(String s) {
        int pnum =0;
        int ynum =0;
        for(int i=0; i<s.length(); i++){
            switch(s.toLowerCase().charAt(i)){
                case 'p':
                    pnum++;
                    break;
                case 'y':
                    ynum++;
                    break;
            }
        }
        return pnum == ynum;
    }
    public static void main(String[] args){
        PYnum py = new PYnum();
        String s1 = "pPoooyY";
        String s2 = "Pyy";
        boolean result = py.solution(s1);
        System.out.println(result);

    }
}
