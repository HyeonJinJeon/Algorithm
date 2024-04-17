import java.util.*;
class Solution {
    static boolean solution(String s) {
        boolean answer = true;
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push("(");
            }else {
                if(stack.isEmpty() == true){
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }

        return answer && stack.isEmpty();
    }
}