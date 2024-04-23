class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                answer += " ";
            }else if((s.charAt(i) + n) > 90 && (s.charAt(i) + n) <= 90 + n) {
                answer += (char)(64 + (s.charAt(i) + n - 90));
            }else if((s.charAt(i) + n) > 122 && (s.charAt(i) + n) <= 127 + n) {
                answer += (char)(96 + (s.charAt(i) + n - 122));
            }else {
                answer += (char)(s.charAt(i) + n);
            }
        }
        return answer;
    }
}