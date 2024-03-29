import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = 0;
        int result1 = numbers[0] * numbers[1];
        int result2 = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        if(result1 > result2){
            answer = result1;
        } else {
            answer = result2;
        }
        return answer;
    }
}