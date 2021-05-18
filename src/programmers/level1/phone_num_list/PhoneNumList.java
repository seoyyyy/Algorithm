package programmers.level1.phone_num_list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class PhoneNumList {
    public boolean solution(String[] phone_book){
        for(String item:phone_book){
            System.out.println(item+" --> " + item.hashCode() +", "+"119".hashCode());
        }
        for(int i=0; i<phone_book.length; i++){
            for(int j=0;j<phone_book.length; j++){
                if(j!=i){
                    if(phone_book[j].startsWith(phone_book[i])){
                        return false;
                    }
                }else {
                    continue;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PhoneNumList pnl = new PhoneNumList();
        //test case
        String[][] phone_book = {{"119", "97674223", "1195524421"},{"123","456","789"},{"12","123","1235","567","88"}};
        for(String[] item:phone_book){
            System.out.println(pnl.solution(item));

        }

    }
}
