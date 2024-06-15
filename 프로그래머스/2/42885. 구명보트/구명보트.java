import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int together = people.length-1;
        for(int i = 0; i < people.length; i++){
            if(i > together){
                break;
            }else if(i == together){
                answer++;
                break;
            }
            if(people[i] + people[together] > limit){
                i--;
            }
            together--;
            answer++;
        }
        return answer;
    }
}