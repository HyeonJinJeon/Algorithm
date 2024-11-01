import java.util.*;

class Solution {
    public long solution(int[] weights) {
        Map<Double, Long> map = new HashMap<>();
        long answer = 0;
        
        for (int weight : weights) {
            double[] ratios = { 1.0, 2.0 / 3.0, 3.0 / 2.0, 2.0 / 4.0, 4.0 / 2.0, 3.0 / 4.0, 4.0 / 3.0 };

            for (double ratio : ratios) {
                double num = weight * ratio;
                answer += map.getOrDefault(num, 0L);
            }
            
            map.put((double) weight, map.getOrDefault((double) weight, 0L) + 1);
        }
        
        return answer;
    }
}
