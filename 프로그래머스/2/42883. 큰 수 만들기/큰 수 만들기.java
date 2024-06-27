import java.util.*;
class Solution {
    public String solution(String number, int k) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        
        //peek한 숫자가 그 뒤에 들어올 숫자보다 작으면 pop해서 삭제
        for (char num : number.toCharArray()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() < num) {
                stack.pop();
                k--;
            }
            stack.push(num);
        }
        
        //끝까지 넣었는데 k가 남은 경우 뒤부터 삭제
        while (k > 0) {
            stack.pop();
            k--;
        }
        for(char num : stack){
            answer += num+"";
        }
        return answer;
    }
}