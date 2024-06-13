public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toBinaryString(n);
        str = str.replace("0", "");
        answer = str.length();
        return answer;
    }
}