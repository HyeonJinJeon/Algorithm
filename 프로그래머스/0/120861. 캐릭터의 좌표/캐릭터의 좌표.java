class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        int x = 0;
        int y = 0;
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("up")){
                if(y == board[1]/2){
                    y = board[1]/2;
                }else {
                    x += dx[0];
                    y += dy[0];
                }
            }else if(keyinput[i].equals("down")){
                if(y == (board[1]/2)-board[1]+1){
                    y = (board[1]/2)-board[1]+1;
                }else{
                    x += dx[1];
                    y += dy[1];
                }
            }else if(keyinput[i].equals("right")){
                if(x == board[0]/2){
                    x = board[0]/2;
                }else{
                    x += dx[2];
                    y += dy[2];
                }
            }else if(keyinput[i].equals("left")){
                if(x == (board[0]/2)-board[0]+1){
                    x = (board[0]/2)-board[0]+1;
                }else{
                    x += dx[3];
                    y += dy[3];
                } 
            }
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}