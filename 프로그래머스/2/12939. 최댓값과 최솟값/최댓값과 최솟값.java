import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split(" ");
        int[] iarr = new int[array.length];
        for(int i = 0; i < iarr.length; i++){
            iarr[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(iarr);
        
        answer = iarr[0]+ " " + iarr[array.length-1];
        return answer;
    }
}