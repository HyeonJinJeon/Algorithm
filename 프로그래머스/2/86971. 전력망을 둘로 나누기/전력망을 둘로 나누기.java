import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n; // 초기 차이를 최대값으로 설정
        
        // 트리를 인접 리스트 형태로 구성
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }
        
        for (int[] wire : wires) {
            tree.get(wire[0]).add(wire[1]);
            tree.get(wire[1]).add(wire[0]);
        }
        
        // 각 전선을 하나씩 끊어보며 네트워크 차이의 최솟값 찾기
        for (int[] wire : wires) {
            int node1 = wire[0];
            int node2 = wire[1];
            
            // 임시로 연결 끊기
            tree.get(node1).remove(Integer.valueOf(node2));
            tree.get(node2).remove(Integer.valueOf(node1));
            
            // 한쪽 네트워크의 송전탑 개수 계산 (DFS 사용)
            boolean[] visited = new boolean[n + 1];
            int count = dfs(tree, visited, node1);
            
            // 두 네트워크의 송전탑 개수 차이 계산
            int difference = Math.abs(n - 2 * count);
            answer = Math.min(answer, difference);
            
            // 끊었던 연결 복구
            tree.get(node1).add(node2);
            tree.get(node2).add(node1);
        }
        
        return answer;
    }
    
    // DFS 함수: 연결된 송전탑의 개수를 반환
    private int dfs(List<List<Integer>> tree, boolean[] visited, int node) {
        visited[node] = true;
        int count = 1; // 현재 노드 포함
        
        for (int neighbor : tree.get(node)) {
            if (!visited[neighbor]) {
                count += dfs(tree, visited, neighbor);
            }
        }
        
        return count;
    }
}
