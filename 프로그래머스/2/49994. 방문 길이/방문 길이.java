import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String> set = new HashSet<>();
        
        // 상, 하, 좌, 우 방향
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        
        // 현재 위치 (0, 0)
        int x = 0, y = 0;
        
        for (int i = 0; i < dirs.length(); i++) {
            int nx = x, ny = y;
            
            if (dirs.charAt(i) == 'L') {
                nx = x - 1;
            } else if (dirs.charAt(i) == 'R') {
                nx = x + 1;
            } else if (dirs.charAt(i) == 'U') {
                ny = y + 1;
            } else if (dirs.charAt(i) == 'D') {
                ny = y - 1;
            }
            
            if (nx >= -5 && nx <= 5 && ny >= -5 && ny <= 5) {
                String path1 = x + "," + y + "->" + nx + "," + ny;  // 현재 -> 새로운 좌표
                String path2 = nx + "," + ny + "->" + x + "," + y;  // 새로운 -> 현재 좌표 (역방향)
                
                set.add(path1);  // 이동한 경로를 추가
                set.add(path2);  // 역방향 경로도 추가
                
                x = nx;
                y = ny;
            }
        }
        return set.size() / 2;
    }
}
