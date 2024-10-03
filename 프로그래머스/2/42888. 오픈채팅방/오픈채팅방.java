import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();

        int answerLen = 0;
        
        for(int i = 0; i < record.length; i++){
            String type = record[i].split(" ")[0];
            String uid = record[i].split(" ")[1];
            if(!type.equals("Leave")){
                String nickname = record[i].split(" ")[2];
                map.put(uid, nickname);
            }
            
            if(!type.equals("Change")){
                answerLen++;
            }
        }
        String[] answer = new String[answerLen];
        
        int index = 0;
        
        for(int i = 0; i < record.length; i++){
            String type = record[i].split(" ")[0];
            String uid = record[i].split(" ")[1];
            
            if(type.equals("Enter")){
                answer[index++] = map.get(uid)+"님이 들어왔습니다.";
            }else if(type.equals("Leave")){
                answer[index++] = map.get(uid)+"님이 나갔습니다.";
            }
        }
        return answer;
    }
}