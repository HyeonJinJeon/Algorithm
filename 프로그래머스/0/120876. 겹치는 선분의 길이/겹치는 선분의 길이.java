import java.util.ArrayList;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int left = lines[0][1];
        int right = lines[0][1];
        for(int i = 0; i < lines.length; i++){
            left = Math.min(left, lines[i][0]);
            right = Math.max(right, lines[i][1]);
        }
        for (int i = left; i <= right; i++) {
            int count = 0;
            for (int[] line : lines) {
                if (line[0] <= i && i < line[1]) {
                    count++;
                }
            }
            if (count > 1) {
                answer++;
            }
        }
        return answer;
    }
}