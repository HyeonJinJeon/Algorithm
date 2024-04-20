import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < 1000; i++){
            if(Arrays.asList(seoul).indexOf("Kim") != -1){
                answer = "김서방은 " + Arrays.asList(seoul).indexOf("Kim") +"에 있다";
            }
        }
        return answer;
    }
}