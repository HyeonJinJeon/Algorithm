class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        int compare = 0;
        while(true){
            for(int i = num; i <= n; i++){
                compare += i;
                if(compare == n){
                    answer++;
                    num++;
                    compare = 0;
                    break;
                }else if(compare > n){
                    num++;
                    compare = 0;
                    break;
                }
            }
            if(num == n+1){
                break;
            }
        }
        
        return answer;
    }
}