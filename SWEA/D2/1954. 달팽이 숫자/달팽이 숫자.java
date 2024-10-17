import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수
        
        // 방향: 오른쪽(0), 아래(1), 왼쪽(2), 위(3)
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];

            int x = 0, y = 0, d = 0; // 시작 위치 및 방향 설정
            for (int i = 1; i <= n * n; i++) {
                arr[x][y] = i; // 현재 위치에 숫자 넣기
                
                // 다음 좌표 계산
                int nextX = x + dx[d];
                int nextY = y + dy[d];
                
                // 경계를 벗어나거나 이미 숫자가 있으면 방향 전환
                if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= n || arr[nextX][nextY] != 0) {
                    d = (d + 1) % 4; // 방향 전환
                    nextX = x + dx[d];
                    nextY = y + dy[d];
                }
                
                // 새로운 좌표로 이동
                x = nextX;
                y = nextY;
            }

            // 출력
            System.out.println("#" + test_case);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
