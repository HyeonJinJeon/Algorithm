import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        int turn = 0;
        int pNum = 0;
        Map<String, Integer> memory = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            if(memory.get(words[i]) == null){
                memory.put(words[i], 1);
            }else {
                memory.put(words[i], memory.get(words[i]) + 1);
            }
            
            if(memory.get(words[i]) > 1 || words[i].length() == 1 ){
                turn = i / n + 1;
                pNum = i % n + 1;
                break;
            }
            if(i != 0){
                if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                    turn = i / n + 1;
                    pNum = i % n + 1;
                    break;
                }
            }
        }
        answer[0] = pNum;
        answer[1] = turn;

        return answer;
    }
}