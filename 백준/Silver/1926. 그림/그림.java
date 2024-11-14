import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0}; // 상, 하, 좌, 우
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static int[][] arr;
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int count = 0; // 그림의 개수
        int maxArea = 0; // 가장 넓은 그림의 넓이

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 1 && !visited[i][j]) { // 새로운 그림 발견
                    count++; // 그림 개수 증가
                    int area = bfs(i, j); // 해당 그림의 넓이 계산
                    maxArea = Math.max(maxArea, area); // 가장 넓은 그림의 넓이 갱신
                }
            }
        }

        System.out.println(count); // 그림의 개수 출력
        System.out.println(maxArea); // 가장 넓은 그림의 넓이 출력
    }

    public static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        int area = 1; // 현재 위치도 그림의 일부이므로 넓이 1로 시작

        while(!queue.isEmpty()) {
            int[] pos = queue.poll();
            int curX = pos[0];
            int curY = pos[1];

            for(int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                // 범위 내에 있고, 방문하지 않았으며 1인 경우
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    area++; // 넓이 증가
                }
            }
        }

        return area; // 그림의 넓이 반환
    }
}
