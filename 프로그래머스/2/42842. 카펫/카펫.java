class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        for(int i = total; i > 0; i--){
            if(total % i == 0){
                answer[0] = i;
                answer[1] = total/i;
                if((answer[0] - 2) * (answer[1] - 2) == yellow){
                    break;
                }
            }
        }
        return answer;
    }
}