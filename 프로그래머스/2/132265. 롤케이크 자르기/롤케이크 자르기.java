import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        
        map1.put(topping[0], 1);
        
        for(int i = 1; i < topping.length; i++){
            map2.put(topping[i], map2.getOrDefault(topping[i], 0) + 1);
        }
        
        int index = 1;
        
        while(index < topping.length-1){
            if(map1.size() == map2.size()){
                answer++;
            }
            map1.put(topping[index], map1.getOrDefault(topping[index], 0) + 1);
            if(map2.containsKey(topping[index])){
                map2.put(topping[index], map2.get(topping[index]) - 1);
            }
            if(map2.get(topping[index]) == 0){
                map2.remove(topping[index]);
            }
            index++;
        }
        return answer;
    }
}