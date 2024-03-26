import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = 0;
        int center = array.length / 2;
        answer = array[center];
        return answer;
    }
}