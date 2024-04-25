import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for(int i = 0; i < commands.length; i++){
            int[] subArr = new int[commands[i][1] - (commands[i][0]-1)];
            for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                subArr[index++] = array[j];
            }
            Arrays.sort(subArr);
            answer[i] = subArr[commands[i][2]-1];
            index = 0;
        }
        return answer;
    }
}