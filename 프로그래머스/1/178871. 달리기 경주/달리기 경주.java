import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        String[] answer = players;
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }
        for(int i = 0; i < callings.length; i++){
            //불린사람 현재 등수를 불러옴
            int findRank = map.get(callings[i]);
            String preRunner = answer[findRank-1];
            answer[findRank-1] = callings[i];
            answer[findRank] = preRunner;
            
            //불린사람 앞으로 변경해주고 앞에사람 뒤로 변경해준다
            map.put(callings[i], findRank-1);
            map.put(preRunner, findRank);
        }
        
        return answer;
    }
}