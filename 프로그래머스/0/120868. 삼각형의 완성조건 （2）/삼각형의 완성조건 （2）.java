import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int top = sides[1];
        for(int i =top-sides[0]+1; i <= top; i++){
            answer++;
        }
        for(int i = top+1; i < top + sides[0]; i++){
            answer++;
        }
        return answer;
    }
}