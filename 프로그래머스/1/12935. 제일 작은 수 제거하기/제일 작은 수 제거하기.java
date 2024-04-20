import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length > 1){
            answer = new int[arr.length-1];
        }else {
            answer = new int [1];
        }
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        int min = copy[0];
        int index = 0;
        if(arr.length == 1){
            answer[0] = -1;
        }else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != min){
                answer[index++] = arr[i];
                }
            }
        }
        
        return answer;
    }
}