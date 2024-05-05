import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int possible = 0;
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        possible = nums.length/2;
        if(set.size() < possible){
            answer = set.size();
        }else {
            answer = possible;
        }
        return answer;
    }
}