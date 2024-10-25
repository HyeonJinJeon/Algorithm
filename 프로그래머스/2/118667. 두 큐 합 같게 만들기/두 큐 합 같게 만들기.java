import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long sum1 = 0L;
        long sum2 = 0L;
        int len = queue1.length;
        
        for(int i = 0; i < len; i++){
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            sum1 += queue1[i];
            sum2 += queue2[i];
        }
        
        while(sum1 != sum2){
            if(answer > (q1.size() + q2.size()) * 2){
                return -1;
            }
                
            if(sum1 > sum2){
                int num = q1.poll();
                q2.add(num);
                sum1 -= num;
                sum2 += num;
                answer++;
            }else{
                int num = q2.poll();
                q1.add(num);
                sum2 -= num;
                sum1 += num;
                answer++;
            }
        }
        return answer;
    }
}