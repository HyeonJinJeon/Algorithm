class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sumDate = 0;
        for(int i = 0; i < a-1; i++){
            sumDate += date[i];
        }
        sumDate += b;
        int sevenDate = sumDate % 7;
        answer = days[sevenDate];
        return answer;
    }
}