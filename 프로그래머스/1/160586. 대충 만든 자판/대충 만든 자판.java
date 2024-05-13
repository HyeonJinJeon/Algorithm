import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 각 문자에 해당하는 키의 번호와 순서를 저장하는 맵 생성
        Map<Character, Integer> charMap = new HashMap<>();
        
        // keymap의 문자열 안에서 각 문자가 위치한 인덱스를 배열로 저장하는 코드를 작성해야함....ㅜ
        for(int i = 0; i < keymap.length; i++){
            for(int j = 0; j < keymap[i].length(); j++){
                if(!charMap.containsKey(keymap[i].charAt(j))){
                    charMap.put(keymap[i].charAt(j), keymap[i].indexOf(keymap[i].charAt(j))+1);
                    System.out.println(charMap);
                }else if(charMap.get(keymap[i].charAt(j)) > keymap[i].indexOf(keymap[i].charAt(j))+1){
                    charMap.put(keymap[i].charAt(j), keymap[i].indexOf(keymap[i].charAt(j))+1);
                    System.out.println(charMap);
                }
            }
        }
        // 결과 배열 초기화
        int[] result = new int[targets.length];

        // 각 문자열을 작성하기 위해 필요한 키의 누름 횟수 계산
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int keyPressCount = 0;
            for (int j = 0; j < target.length(); j++) {
                char c = target.charAt(j);
                // 맵에서 해당 문자에 대한 정보 가져오기
                int keyInfo = 0;
                System.out.println(charMap.get(c));
                if(charMap.get(c) != null){
                    keyInfo = charMap.get(c);
                }
                if (keyInfo == 0) {
                    // 해당 문자가 키맵에 없는 경우
                    keyPressCount = -1; // 문자열을 만들 수 없음
                    break;
                } else {
                    // 해당 문자를 만들기 위해 필요한 키의 누름 횟수 추가
                    keyPressCount += keyInfo;
                }
            }
            result[i] = keyPressCount;
        }

        return result;
    }
}
