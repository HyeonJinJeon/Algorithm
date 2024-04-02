import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        if(c.length == 1){
            answer = String.valueOf(c[0]);
        }else{
            if(c[0] != c[1]){
                answer = answer +  String.valueOf(c[0]);
            }
            for(int i = 1; i < c.length-1; i ++){
                if(c[i-1] != c[i] && c[i] != c[i+1]){
                    answer += String.valueOf(c[i]);
                }
            }
            if(c[c.length-2] != c[c.length-1]){
                answer += String.valueOf(c[c.length-1]);
            }
        }
        
        return answer;
    }
}