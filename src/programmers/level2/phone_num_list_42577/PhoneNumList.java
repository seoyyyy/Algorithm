package programmers.level2.phone_num_list_42577;

import java.util.Arrays;

public class PhoneNumList {
    public boolean solution(String[] phone_book){
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i+1].indexOf(phone_book[i]) == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PhoneNumList pnl = new PhoneNumList();
        //test case
        String[][] phone_books = {{"119", "97674223", "1195524421"}, {"123","456","789"}, {"12","123","1235","567","88"}};
        for (String[] phone_book: phone_books) {
            System.out.println(pnl.solution(phone_book));
        }
    }
}
