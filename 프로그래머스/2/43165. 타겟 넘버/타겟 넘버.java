class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }
    // 재귀를 사용하여 DFS
    public void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){
            if(target == sum) {
                answer++;
            }
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]); // 더하는 경우
            dfs(numbers, depth + 1, target, sum - numbers[depth]); // 빼는 경우
        }
    }
}