import java.util.*;
class Solution {
   public static int solution(String[] friends, String[] gifts) {
        int answer = 0;
        //각 인원들의 선물 지수를 Map에 담아야 될듯
        Map<String, Integer> map = new HashMap<>();
        //먼저 선물을 준 만큼 더해준다
        for(String gift : gifts) {
            map.put(gift.split(" ")[0], map.getOrDefault(gift.split(" ")[0], 0) + 1);
        }
        //선물을 받은 만큼 빼준다
        for(String gift : gifts) {
            map.put(gift.split(" ")[1], map.getOrDefault(gift.split(" ")[1], 0) - 1);
        }
//        for(String friend : friends) {
//            System.out.println(map.get(friend));
//        }

        //key는 선물을 주는 사람, value는 선물을 받은 사람과 받은 횟수
        Map<String, Map<String, Integer>> map2 = new HashMap<>();
        //초기 리스트 넣어주기
        for(String friend : friends) {
            map2.put(friend, new HashMap<>());
        }
        for(String gift : gifts){
            //보낸사람 기준으로 받은 사람과 받은 횟수를 Map으로 불러오고 업데이트하여 다시 map2에 넣기
            Map<String, Integer> map3 = map2.get(gift.split(" ")[0]);
            map3.put(gift.split(" ")[1], map3.getOrDefault(gift.split(" ")[1], 0) + 1);
            map2.put(gift.split(" ")[0], map3);
        }
        Map<String, Integer> map4 = new HashMap<>();
        for(int i = 0; i < friends.length; i++){
            for(int j = 0; j < friends.length; j++){
                //내 자신은 건너뛰고 다른 사람이랑만 비교
                if(!friends[i].equals(friends[j])){
                    int fromGift = map2.get(friends[i]).getOrDefault(friends[j], 0);
                    int toGift = map2.get(friends[j]).getOrDefault(friends[i], 0);
                    //내가 더 많이 준 경우  -> 내가 하다 맏받
                    if(fromGift > toGift){
                        map4.put(friends[i], map4.getOrDefault(friends[i], 0) + 1);
                    }
                    //똑같이 준 경우
                    else if(fromGift == toGift){
                        int my = map.getOrDefault(friends[i], 0);
                        int you = map.getOrDefault(friends[j],0);
                        //내 선물지수가 더 높은 경우
                        if(my > you){
                            map4.put(friends[i], map4.getOrDefault(friends[i], 0) + 1);
                        }
                    }
                }
            }
        }
        int max = 0;
        for(Integer cnt : map4.values()){
            System.out.println(cnt);
            if(cnt > max){
                max = cnt;
            }
        }
        answer = max;
        return answer;
    }
}