class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        for(int i = 2; i <= n; i++){
            if(n%i == 0){
                if(isPrime(i)){
                    cnt++;
                }
            }
        }
        int[] answer = new int[cnt];
        cnt = 0;
        for(int i = 2; i <= n; i++){
            if(n%i == 0){
                if(isPrime(i)){
                    answer[cnt] = i;
                    cnt++;
                }
            }
        }
        return answer;
    }
    public static boolean isPrime(int k) {
	for (int i = 2; i < k; i++) {
    	if (k % i == 0) {
        	return false;
        }
    }
    return true;
}
}