import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++){
            pq.add(scoville[i]);
        }
        while(pq.peek() < K && pq.size() >= 2){
            int newSco = pq.poll() + pq.poll()*2;
            pq.add(newSco);
            answer++;
        }
        if(pq.peek() < K){
            answer = -1;
        }
        return answer;
    }
}