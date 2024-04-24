class Solution {
    public String solution(int[] food) {
        String answer = "";
        int cnt = 0;
        for(int i = 1; i < food.length; i++){
            int n = food[i]/2;
            for(int j = 0; j < n; j++){
                answer += Integer.toString(i);
            }
        }
        StringBuffer sb = new StringBuffer(answer);
        String copy = sb.reverse().toString();
        answer += "0" + copy;
        return answer;
    }
}