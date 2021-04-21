package programmers.level1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Year2016 {
    public String solution(int a, int b){
        Calendar cal = Calendar.getInstance();
        cal.set(2016,a-1,b);
        SimpleDateFormat sdf = new SimpleDateFormat("E");

        return sdf.format(cal.getTime());
    }

    public static void main(String[] args){
        int a = 5;
        int b = 24;
        Year2016 y = new Year2016();
        String result = y.solution(a,b);
        System.out.println(result);
    }
}
