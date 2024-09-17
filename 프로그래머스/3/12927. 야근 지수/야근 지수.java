import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long answer = 0;
        int sum = 0;
        
        for(int i = 0; i < works.length; i++){
            sum += works[i];
            pq.add(works[i]);
        }
        if(sum > n){
            for(int i = 0; i < n; i++){
                int maxWork = pq.poll();
                maxWork -= 1;
                pq.add(maxWork);
            }
            
            for(int i = 0; i < works.length; i++){
                answer += Math.pow(pq.poll(), 2);
            }
        }
        return answer;
    }
}