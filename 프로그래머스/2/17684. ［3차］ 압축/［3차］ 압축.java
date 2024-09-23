import java.util.*;

class Solution {
    public int[] solution(String msg) {
        List<Integer> result = new ArrayList<>();
        
        // A~Z 색인 번호 초기화
        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            map.put(String.valueOf((char)(i + 64)), i);
        }
        
        int dictIndex = 27;
        int i = 0;
        
        while (i < msg.length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(msg.charAt(i));
            int j = i + 1;
            
            // 색인번호 등록된 가장 긴 문자열 찾기
            while (j < msg.length() && map.containsKey(sb.toString() + msg.charAt(j))) {
                sb.append(msg.charAt(j));
                j++;
            }
            
            // 현재 문자열에 해당하는 색인 번호를 결과에 추가
            result.add(map.get(sb.toString()));
            
            // 다음 문자까지 포함한 새로운 문자열을 사전에 추가
            if (j < msg.length()) {
                map.put(sb.toString() + msg.charAt(j), dictIndex++);
            }
            
            i = j;
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
