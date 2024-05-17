import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> result = new Stack<>();
        int answer = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j]);
            }
                System.out.println();
        }
        for(int i = 0; i < moves.length; i++){
            int pick = moves[i]-1;
            for(int j = 0; j < board.length; j++){
                if(board[j][pick] != 0){
                    result.push(board[j][pick]);
                    board[j][pick] = 0;
                    break;
                }
            }
            if(result.size() >=2 && result.get(result.size()-1) == result.get(result.size()-2)){
                result.pop();
                result.pop();
                answer += 2;
            }
        }
        return answer;
    }
}