class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(int i = 0 ; i < count; i++){
            sum += (price*(i+1)); 
        }
        if(sum > money){
            answer = sum - money;
        }
        return answer;
    }
}