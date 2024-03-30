class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] check = new int[n+2][n+2];
        int answer = 0;  
        
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        // int[] d = {{-1, -1, -1, 0, 0, 1, 1, 1},{-1, 0, 1, -1, 1, -1, 0, 1}};
        
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    check[i+1][j+1] = 1;
                    for(int z = 0; z < 8; z++){
                        check[i+1+dx[z]][j+1+dy[z]] = 1;
                    }
                }
                
            }
        }
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < n+1; j++){
                if(check[i][j] == 0){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}