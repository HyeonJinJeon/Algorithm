import java.util.*;
class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int index = 0;
        for(int i = 0; i < order.length; i++){
            if(i+1 == order[index]){
                index++;
                answer++;
                if(!stack.isEmpty()){
                    while(stack.peek() == order[index]){
                        stack.pop();
                        index++;
                        answer++;
                        if(stack.isEmpty()){
                            break;
                        }
                    }
                }
            }else{
                if(!stack.isEmpty()){
                    while(stack.peek() == order[index]){
                        stack.pop();
                        index++;
                        answer++;
                        if(stack.isEmpty()){
                            break;
                        }
                    }
                    if(stack.peek() != order[index]){
                        stack.push(i+1);
                    }
                }else{
                    stack.push(i+1);
                }
            }
        }
        return answer;
    }
}