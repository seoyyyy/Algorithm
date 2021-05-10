package programmers.level1.hide_phone_number;

import java.text.DecimalFormat;

public class HidePhoneNumber {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);
        for(int i=0; i<sb.length(); i++){
            if(i>=sb.length()-4){
                break;
            }
            sb.replace(i,i+1,"*");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        //test case
        //1.
        String phone_number1 = "01033334444";
        //2.
        String phone_number2 = "027778888";

        HidePhoneNumber hpn = new HidePhoneNumber();
        String result = hpn.solution(phone_number2);
        System.out.println(result);
    }
}
