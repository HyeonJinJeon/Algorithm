class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String BB = B + B;
        answer = BB.indexOf(A);
        return answer;
    }
}