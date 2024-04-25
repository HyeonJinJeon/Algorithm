import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                map.put(numbers[i]+numbers[j], 0);
            }
        }
        int[] answer = new int[map.size()];
        int index = 0;
        for(Integer number : map.keySet()){
            answer[index++] = number;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}