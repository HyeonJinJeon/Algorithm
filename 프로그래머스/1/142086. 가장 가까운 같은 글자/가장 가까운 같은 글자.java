import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<String, Integer> map = new HashMap<>();
        String[] str = s.split(""); 
        for(int i = 0; i < str.length; i++){
            if(map.get(str[i]) == null){
                map.put(str[i], i);
                answer[i] = -1;
            }else {
                answer[i] = i - map.get(str[i]);
                map.put(str[i], i);
            }
        }
        
        return answer;
    }
}