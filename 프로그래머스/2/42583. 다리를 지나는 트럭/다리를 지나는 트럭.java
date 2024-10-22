import java.util.*;
public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int total = 0;
        int answer = 0;
        int index = 0;

        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }
        
        while (!bridge.isEmpty()) {
            answer++;
            total -= bridge.poll();
            if (index < truck_weights.length) {
                if (total + truck_weights[index] <= weight) {
                    bridge.add(truck_weights[index]);
                    total += truck_weights[index];
                    index++;
                } else {
                    bridge.add(0);
                }
            }
        }
        return answer;
    }
}