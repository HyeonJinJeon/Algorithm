class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] map = new char[m][n];
        
        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }
        
        int totalRemove = 0;
        
        while (true) {
            boolean[][] marked = new boolean[m][n];
            int remove = markBlock(m, n, map, marked);
            
            if (remove == 0){
                break;
            } 
            
            totalRemove += remove;
            dropBlock(m, n, map, marked);
        }
        
        return totalRemove;
    }
    
    private int markBlock(int m, int n, char[][] map, boolean[][] marked) {
        int count = 0;
        
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                char block = map[i][j];
                if (block != ' ' && block == map[i][j + 1] && block == map[i + 1][j] && block == map[i + 1][j + 1]) {
                    marked[i][j] = true;
                    marked[i][j + 1] = true;
                    marked[i + 1][j] = true;
                    marked[i + 1][j + 1] = true;
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (marked[i][j]) {
                    map[i][j] = ' ';
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private void dropBlock(int m, int n, char[][] map, boolean[][] marked) {
        for (int j = 0; j < n; j++) {
            int emptyIndex = m - 1;
            
            for (int i = m - 1; i >= 0; i--) {
                if (map[i][j] != ' ') {
                    char temp = map[i][j];
                    map[i][j] = ' ';
                    map[emptyIndex--][j] = temp;
                }
            }
        }
    }
}