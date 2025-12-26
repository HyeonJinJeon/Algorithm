import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<> ();
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        if(set.size() > nums.length/2){
            answer = nums.length/2;
        }else {
            answer = set.size();
        }
        return answer;
    }
}