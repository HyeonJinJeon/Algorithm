import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= elements.length; i++){
            for(int j = 0; j < elements.length; j++){
                int sum = 0;
                for(int z = j; z < j+i; z++){
                    sum += elements[z%elements.length];
                }
                set.add(sum);
            }
        }
        answer = set.size();
        return answer;
    }
}