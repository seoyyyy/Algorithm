package programmers.level2.sort_file_name_17686;

import java.util.Arrays;

/**
 * [3차] 파일명 정렬 17686
 */
public class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (o1, o2) -> {
            String haeder1 = o1.split("[0-9]")[0];
            String haeder2 = o2.split("[0-9]")[0];

            int comp = haeder1.toLowerCase().compareTo(haeder2.toLowerCase());
            if(comp == 0){
                int number1 = getNumber(o1.replace(haeder1, ""));
                int number2 = getNumber(o2.replace(haeder2, ""));
                comp = number1 - number2;
            }

            return comp;
        });

        return files;
    }

    public int getNumber(String file){
        String number = "";
        for (int i = 0; i < file.length(); i++) {
            char c = file.charAt(i);
            if(!Character.isDigit(c)) break;
                number += c;
        }
        return Integer.parseInt(number);
    }

    public static void main(String[] args) {
        String[] files ={"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        Solution s = new Solution();
        String[] result = s.solution(files);
        for (String s1 : result) {
            System.out.println("s1 = " + s1);
        }
    }
}
