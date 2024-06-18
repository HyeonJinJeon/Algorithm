import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        
        list.add(words[0]);
        for(int i = 1; i < words.length; i++){
            String preWord = list.get(i-1);
            int wordLen = preWord.length();
            char lastChar = preWord.charAt(wordLen-1);
            char startChar = words[i].charAt(0);
            
            if(lastChar != startChar){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            
            if(list.contains(words[i])){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            
            list.add(words[i]);
        }
        return answer;
    }
}