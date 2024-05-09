import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        for(int i = 0; i < completion.length; i++){
            int cnt = map.get(completion[i]);
            map.put(completion[i], cnt-1);
        }
        for(int i = 0; i < participant.length; i++){
            if(map.get(participant[i]) > 0){
                answer = participant[i];
                break;
            }
        }
        return answer;
    }
}