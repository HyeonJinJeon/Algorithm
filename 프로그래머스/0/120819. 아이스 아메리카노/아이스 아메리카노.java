class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cnt = money / 5500;
        int remain = money % 5500;
        answer[0] = cnt;
        answer[1] = remain;
        return answer;
    }
}