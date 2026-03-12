import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] remain = new int[n];
        for(int i = 0; i < n; i++){
            int a = (100-progresses[i])/speeds[i];
            int b = (100-progresses[i])%speeds[i];
            if(b != 0){
                remain[i] = a + 1;
            }else {
                remain[i] = a;
            }
        }
        List<Integer> list = new ArrayList<>();
        int current = remain[0];
        int count = 0;
        for(int i = 0; i < remain.length; i++){
            if(remain[i]>current){
                list.add(count);
                current = remain[i];
                count = 1;
            }else{
                count++;
            }
            if(i == remain.length-1){
                list.add(count);
            }
        }
        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}