package programmers.level1.caesar_cipher;

public class CaesarCipher {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        Character c = ' ';
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            if((c<=90 && (c + n)>90)|| (c >90 && (c + n)>122)) {
                sb.append((char)(c + n -26));
            }else if(c == 32){
                sb.append(" ");
            }else {
                sb.append((char)(c + n));
            }
        }
    return sb.toString();
    }

    public static void main(String[] args){

        //test case
        //1.
            String s1 = "AB";
            int n1 = 1;
        //2.
            String s2 = "z";
            int n2 = 1;
        //3.
            String s3 = "a B z";
            int n3 = 4;

            CaesarCipher cc = new CaesarCipher();
            String result = cc.solution(s1,n1);
            System.out.println(result);

    }

}
