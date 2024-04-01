class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 362800; i++){
            if(n < factory(i)){
                answer = i-1;
                break;
            }else if(n == factory(i)){
                answer = i;
                break;
            }
        }
        return answer;
    }
    public static int factory(int n) {
        if(n == 1){
            return 1;
        }else {
            return n * factory(n-1);
        }
    }
}