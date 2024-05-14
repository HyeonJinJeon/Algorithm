class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        int cnt = 0;
        int[] dx = {0,1,-1,0};
        int[] dy = {1,0,0,-1};
        for(int i = 0; i < 4; i++){
            int newH = h+dx[i];
            int newW = w+dy[i];
            if(newH!=-1 && newW!=-1 && newH!=board.length && newW!=board.length){
                if(board[h][w].equals(board[newH][newW])){
                    answer++;
                }
            }
        }
        return answer;
    }
}