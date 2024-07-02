import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new TreeMap<>();
        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }
        for(int i = 0; i <= discount.length-10; i++){
            Map<String, Integer> matchMap = new TreeMap<>();
            for(int j = i; j < i + 10; j++){
                matchMap.put(discount[j], matchMap.getOrDefault(discount[j], 0) + 1);
            }
            if(map.equals(matchMap)){
                answer++;
            }
        }
        
        return answer;
    }
}