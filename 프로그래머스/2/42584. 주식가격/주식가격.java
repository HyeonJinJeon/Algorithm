class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i = 0; i < prices.length-1; i++){
            int sec = 0;
            for(int j = i+1; j < prices.length; j++){
                if(prices[i] <= prices[j]){
                    sec++;
                }
                if(prices[i] > prices[j]){
                    answer[i] = ++sec;
                    break;
                }
                if(j == prices.length-1){
                    answer[i] = sec;
                    break;
                }
            }
        }
        return answer;
    }
}