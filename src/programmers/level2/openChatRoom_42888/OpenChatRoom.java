package programmers.level2.openChatRoom_42888;


import java.util.*;

public class OpenChatRoom {
    public String[] solution(String[] record){
        List<String> answer = new ArrayList<>();
        Map<String, String> people = new HashMap();
        String[] tmp;
        for (String s : record) {
            tmp = s.split(" ");
            if(!tmp[0].equals("Leave")){
                people.put(tmp[1],tmp[2]);
            }
        }

        for (String s : record) {
            tmp = s.split(" ");
            switch (tmp[0]){
                case "Enter":
                    answer.add(people.get(tmp[1]) + "님이 들어왔습니다.");
                    break;
                case "Leave":
                    answer.add(people.get(tmp[1]) + "님이 나갔습니다.");
                    break;
            }
        }

        return answer.toArray(new String[0]);
    }
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        OpenChatRoom ocr = new OpenChatRoom();
        String[] result = ocr.solution(record);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
