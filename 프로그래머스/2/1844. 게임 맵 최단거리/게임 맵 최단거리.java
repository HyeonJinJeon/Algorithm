import java.util.*;

class Solution {
    Queue<int[]> queue = new LinkedList<>();
    int answer = 1;

    public int solution(int[][] maps) {
        // 방문 기록 체크
        int[][] visited = new int[maps.length][maps[0].length];
        
        // 방향
        int[] x = {1, -1, 0, 0};
        int[] y = {0, 0, 1, -1};
        
        queue.offer(new int[]{0, 0});
        
        // 시작점 방문 처리
        visited[0][0] = 1;
        
        bfs(maps, visited, x, y);

        // 만약 목표 지점에 도달하지 못한 경우 처리
        if (visited[maps.length - 1][maps[0].length - 1] == 0) {
            return -1;
        }

        return visited[maps.length - 1][maps[0].length - 1];
    }

    public void bfs(int[][] maps, int[][] visited, int[] x, int[] y) {
        while (!queue.isEmpty()) {
            int[] nowPoint = queue.poll();

            for (int i = 0; i < 4; i++) {
                int newX = nowPoint[0] + x[i];
                int newY = nowPoint[1] + y[i];

                // 새로운 좌표가 유효한 범위 내에 있고, 방문하지 않았으며, 이동 가능한 곳인 경우
                if (newX >= 0 && newY >= 0 && newX < maps.length && newY < maps[0].length &&
                    maps[newX][newY] == 1 && visited[newX][newY] == 0) {
                    queue.offer(new int[]{newX, newY});
                    visited[newX][newY] = visited[nowPoint[0]][nowPoint[1]] + 1;

                    // 도착 지점에 도달한 경우 종료
                    if (newX == maps.length - 1 && newY == maps[0].length - 1) {
                        return;
                    }
                }
            }
        }
    }
}
