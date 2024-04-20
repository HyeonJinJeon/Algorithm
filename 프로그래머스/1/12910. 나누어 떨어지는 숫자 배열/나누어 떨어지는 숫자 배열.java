import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        // int cnt = 0;
        // int index = 0;
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] % divisor == 0){
        //         cnt++;
        //     }
        // }
        // int[] answer;
        // if(cnt == 0){
        //     answer = new int[1];
        // } else {
        //     answer = new int[cnt];
        // }
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] % divisor == 0){
        //         answer[index++] += arr[i];
        //     }
        // }
        // if(answer.length == 1){
        //     answer[0] = -1;
        // }
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        if(list.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
            for(int i = 0; i < answer.length; i++){
                answer[i] = list.get(i);
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}