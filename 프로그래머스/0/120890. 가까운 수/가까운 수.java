import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 1; i < array.length; i++){
            if(array[i-1] < n && n < array[i]){
                if(array[i]-n > n - array[i-1]){
                    answer = array[i-1];
                }else if(array[i]-n < n - array[i-1]){
                    answer = array[i];
                }else {
                    answer = array[i-1];
                }
                break;
            }else if(n == array[i]) {
                answer = array[i];
                break;
            }
        }
        if(n < array[0]){
            answer = array[0];
        }else if(n > array[array.length-1]){
            answer = array[array.length-1];
        }
        return answer;
    }
}