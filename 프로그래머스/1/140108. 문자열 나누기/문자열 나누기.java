import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);
        int firstNum = 1;
        int compare = 0;
        if(s.length() == 1){
            answer = 1;
        }else{
            for(int i = 1; i < s.length(); i++){
                if(s.charAt(i) == first){
                    firstNum++;
                }else {
                    compare++;
                }
                if(i == s.length()-1){
                    answer++;
                }else{
                    if(firstNum == compare && i != s.length()-2){
                        answer++;
                        first = s.charAt(i+1);
                        firstNum = 1;
                        compare = 0;
                        i++;
                    }else if(firstNum == compare && i == s.length()-2){
                        answer++;
                        first = s.charAt(i+1);
                        firstNum = 1;
                        compare = 0;
                    }
                }
            }
        }
        
        return answer;
    }
}